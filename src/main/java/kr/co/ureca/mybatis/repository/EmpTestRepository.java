package kr.co.ureca.mybatis.repository;

import java.util.ArrayList;
import java.util.List;

import kr.co.ureca.mybatis.dto.EmpDTO;
import kr.co.ureca.mybatis.dto.EmpSearchDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class EmpTestRepository {

    @Autowired
    private SqlSession sqlSession;

    public List<EmpDTO> empSelectAll() {
        List<EmpDTO> list = sqlSession.selectList("EmpTestMapper.empSelectAll");
        return list;
    }

    public EmpDTO empSelectByEname(String ename) {
        EmpDTO dto = sqlSession.selectOne("EmpTestMapper.empSelectByEname", ename);
        return dto;
    }

    public int empInsert(EmpDTO dto) {
        int successCnt = sqlSession.insert("EmpTestMapper.empInsert", dto);
        System.out.println( "empInsert-reposiory-selectKey : " + dto.getEmpno() );
        return successCnt;
    }

    public int empInsertList(ArrayList<EmpDTO> insList) {
        return sqlSession.insert("EmpTestMapper.empInsertList", insList);
    }

    public int empUpdate(EmpDTO dto) {
        return sqlSession.update("EmpTestMapper.empUpdate", dto);
    }

    public List<EmpDTO> selectIn(ArrayList<String> enameList) {
        return sqlSession.selectList("EmpTestMapper.selectIn", enameList);
    }

    public List<EmpDTO> selectSearch(EmpSearchDTO dto) {
        return sqlSession.selectList("EmpTestMapper.selectSearch", dto);
    }

}
