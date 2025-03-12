package kr.co.ureca.mybatis.service;

import java.util.List;
import kr.co.ureca.mybatis.dto.EmpDto;
import kr.co.ureca.mybatis.repository.EmpTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpTestService {

    @Autowired
    private EmpTestRepository empTestRepository;

    public List<EmpDto> empSelectAll() {
        return empTestRepository.empSelectAll();
    }

    public EmpDto empSelectByEname(String ename) {
        return empTestRepository.empSelectByEname(ename);
    }

    public void empInsert() {

    }

    public void empUpdate() {

    }

    public void empDelete() {

    }
}
