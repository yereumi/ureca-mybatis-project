package kr.co.ureca.mybatis.controller;

import kr.co.ureca.mybatis.dto.EmpDto;
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
        System.out.println(empTestService.empSelectAll());
        return "hello";
    }

    @RequestMapping(value = "/empByEname", method = RequestMethod.GET)
    public String empSelectByEname() {
        EmpDto dto = empTestService.empSelectByEname("ADAMS");
        System.out.println(dto);
        return "hello";
    }

    @RequestMapping(value = "/empIns", method = RequestMethod.POST)
    public void empInsert() {

    }

    @RequestMapping(value = "/empUpd", method = RequestMethod.POST)
    public void empUpdate() {

    }

    @RequestMapping(value = "/empDel", method = RequestMethod.GET)
    public void empDelete() {

    }
}
