package kr.co.ureca.mybatis.service;


import java.util.ArrayList;
import java.util.List;
import kr.co.ureca.mybatis.dto.EmpDTO;
import kr.co.ureca.mybatis.dto.EmpSearchDTO;
import kr.co.ureca.mybatis.repository.EmpTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpTestService {


    @Autowired
    private EmpTestRepository empTestRepository;

    public List<EmpDTO> empSelectAll() {
        List<EmpDTO> list = empTestRepository.empSelectAll();
        return list;
    } // empSelectAll

    public EmpDTO empSelectByEname(String ename) {
        EmpDTO dto = empTestRepository.empSelectByEname(ename);
        return dto;
    } // empSelectByEname

    public int empInsert(EmpDTO dto) {
        int successCnt = empTestRepository.empInsert(dto);
        return successCnt;
    } // empInsert

    public int empInsertList(ArrayList<EmpDTO> insList) {
        int successCnt = empTestRepository.empInsertList(insList);
        return successCnt;
    } // empInsertList

    public int empUpdate(EmpDTO dto) {
        int successCnt = empTestRepository.empUpdate(dto);
        return successCnt;
    } // empUpdate

    public List<EmpDTO> selectIn(ArrayList<String> enameList) {
        List<EmpDTO> list = empTestRepository.selectIn(enameList);
        return list;
    } // selectIn

    public List<EmpDTO> selectSearch(EmpSearchDTO dto) {
        List<EmpDTO> list = empTestRepository.selectSearch(dto);
        return list;
    } // selectSearch

}
