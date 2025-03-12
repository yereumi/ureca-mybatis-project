package kr.co.ureca.mybatis.repository;

import java.util.List;
import kr.co.ureca.mybatis.dto.EmpDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpTestRepository {

    @Autowired
    private SqlSession sqlSession;

    public List<EmpDto> empSelectAll() {
        return sqlSession.selectList("EmpTestMapper.empSelectAll");
    }

    public EmpDto empSelectByEname(String ename) {
        return sqlSession.selectOne("EmpTestMapper.empSelectByEname", ename);
    }

    public void empInsert() {

    }

    public void empUpdate() {

    }

    public void empDelete() {

    }
}
