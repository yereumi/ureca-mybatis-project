package kr.co.ureca.mybatis.controller;

import java.util.ArrayList;
import java.util.List;

import kr.co.ureca.mybatis.dto.EmpDTO;
import kr.co.ureca.mybatis.dto.EmpSearchDTO;
import kr.co.ureca.mybatis.service.EmpTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class EmpTestController {

    @Autowired
    private EmpTestService empTestService;

    @RequestMapping(value = "/empAll", method = RequestMethod.GET)
    public String empSelectAll() {
        List<EmpDTO> list = empTestService.empSelectAll();
        System.out.println( list );
        return "hello";
    } // empSelectAll

    @RequestMapping(value = "/empByName", method = RequestMethod.GET)
    public String empSelectByEname() {
        EmpDTO dto = empTestService.empSelectByEname("ADAMS");
        System.out.println( dto );
        return "hello";
    } // empSelectByEname

    @RequestMapping(value = "/empIns", method = RequestMethod.GET)
//	@RequestMapping(value = "/empIns", method = RequestMethod.POST)
    public String empInsert() {
        EmpDTO dto = new EmpDTO(null, "JACKSON", "CLERK", null, null, "1000", "200", "40");
        int successCnt = empTestService.empInsert(dto);
        System.out.println("empInsert-controller-successCnt : " + successCnt);
        System.out.println("empInsert-controller-selectKey : " + dto.getEmpno());
        return "hello";
    } // empInsert

    @RequestMapping(value = "/empInsList", method = RequestMethod.GET)
    public String empInsertList() {
        EmpDTO dto1 = new EmpDTO(null, "YAN", "CLERK", null, null, "1000", "200", "40");
        EmpDTO dto2 = new EmpDTO(null, "YUL", "CLERK", null, null, "1000", "200", "40");
        EmpDTO dto3 = new EmpDTO(null, "YOL", "CLERK", null, null, "1000", "200", "40");
        ArrayList<EmpDTO> insList = new ArrayList<>();
        insList.add(dto1);	insList.add(dto2);	insList.add(dto3);
        int successCnt = empTestService.empInsertList(insList);
        System.out.println("empInsertList-controller-successCnt : " + successCnt);
        return "hello";
    } // empInsertList

    @RequestMapping(value = "/empUp", method = RequestMethod.GET)
//	@RequestMapping(value = "/empUp", method = RequestMethod.POST)
    public String empUpdate() {
        EmpDTO dto = new EmpDTO("7935", "YULLIAN", "MANAGER", null, null, "3000", null, null);
        int successCnt = empTestService.empUpdate(dto);
        System.out.println("empUpdate-controller-successCnt : " + successCnt);
        return "hello";
    } // empUpdate

    @RequestMapping(value = "/selectIn", method = RequestMethod.GET)
    public String selectIn() {
        ArrayList<String> enameList = new ArrayList<>();
        enameList.add("MILLER");enameList.add("ADAMS");enameList.add("JAMES");

        List<EmpDTO> list = empTestService.selectIn(enameList);
        System.out.println("selectIn-controller : " + list);

        return "hello";
    } // selectIn

    @RequestMapping(value = "/selectSearch", method = RequestMethod.GET)
    public String selectSearch() {
        EmpSearchDTO dto1 = new EmpSearchDTO("SMITH", null, null);
        List<EmpDTO> list1 = empTestService.selectSearch(dto1);
        System.out.println("selectSearch-controller-list1 : " + list1);

        EmpSearchDTO dto2 = new EmpSearchDTO(null, "MANAGER", null);
        List<EmpDTO> list2 = empTestService.selectSearch(dto2);
        System.out.println("selectSearch-controller-list2 : " + list2);

        EmpSearchDTO dto3 = new EmpSearchDTO(null, null, "10");
        List<EmpDTO> list3 = empTestService.selectSearch(dto3);
        System.out.println("selectSearch-controller-list3 : " + list3);

        return "hello";
    } // selectSearch

}






