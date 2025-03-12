package kr.co.ureca.mybatis.controller;

import java.util.List;
import kr.co.ureca.mybatis.dto.EmpDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    private SqlSession sqlSession;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {

        List<EmpDto> list = sqlSession.selectList("MybatisSample.SampleEmp");
        System.out.println(list);
        return "hello";
    }
}
