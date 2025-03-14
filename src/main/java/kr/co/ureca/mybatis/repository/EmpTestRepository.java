package kr.co.ureca.mybatis.repository;

import java.util.ArrayList;
import java.util.List;

import kr.co.ureca.mybatis.dto.EmpDTO;
import kr.co.ureca.mybatis.dto.EmpSearchDTO;
import kr.co.ureca.mybatis.mapper.MybatisInterface1;
import kr.co.ureca.mybatis.mapper.MybatisInterface2;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class EmpTestRepository {

    @Autowired
    private SqlSession sqlSession;

    @Autowired
    private MybatisInterface1 interface1;

    @Autowired
    private MybatisInterface2 interface2;

    public List<EmpDTO> empSelectAll() {
        // 0. xml을 사용한 Mapper
//		List<EmpDTO> list = sqlSession.selectList("EmpTestMapper.empSelectAll");

        // 1. interface를 사용한 Mapper
//		List<EmpDTO> list = interface1.getAllEmp1();

        // 2. interface와 xml을 결합한 방식.
        List<EmpDTO> list = interface2.getAllEmp2();

        return list;
    } // empSelectAll

    public EmpDTO empSelectByEname(String ename) {
        // 0. xml을 사용한 Mapper
//		EmpDTO dto = sqlSession.selectOne("EmpTestMapper.empSelectByEname", ename);

        // 1. interface를 사용한 Mapper
        EmpDTO dto = interface1.getEmpByEname1(ename);

        return dto;
    } // empSelectByEname

    public int empInsert(EmpDTO dto) {
        // 0. xml을 사용한 Mapper
//		int successCnt = sqlSession.insert("EmpTestMapper.empInsert", dto);

        // 1. interface를 사용한 Mapper
        int successCnt = interface1.insEmp1(dto);

        System.out.println( "empInsert-reposiory-selectKey : " + dto.getEmpno() );
        return successCnt;
    } // empInsert

    public int empInsertList(ArrayList<EmpDTO> insList) {
        int successCnt = sqlSession.insert("EmpTestMapper.empInsertList", insList);
        return successCnt;
    } // empInsertList

    public int empUpdate(EmpDTO dto) {
        int successCnt = sqlSession.update("EmpTestMapper.empUpdate", dto);
        return successCnt;
    } // empUpdate

    public List<EmpDTO> selectIn(ArrayList<String> enameList) {
        List<EmpDTO> list = sqlSession.selectList("EmpTestMapper.selectIn", enameList);
        return list;
    } // selectIn

    public List<EmpDTO> selectSearch(EmpSearchDTO dto) {
        List<EmpDTO> list = sqlSession.selectList("EmpTestMapper.selectSearch", dto);
        return list;
    } // selectSearch

}
