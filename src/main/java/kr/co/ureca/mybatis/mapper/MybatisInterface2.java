package kr.co.ureca.mybatis.mapper;


import java.util.List;
import kr.co.ureca.mybatis.dto.EmpDTO;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MybatisInterface2 {

	public List<EmpDTO> getAllEmp2();

}
/* interface와 xml을 결합한 방식
 * mapper의 namespace는 interface의 이름.
 * mapper의 id는 interface의 메소드 이름.
<mapper namespace="kr.co.ureca.mapper.MybatisInterface2">
	<select id="getAllEmp2" resultType="kr.co.ureca.dto.EmpDTO" >
		SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno
		FROM emp
		ORDER BY ename
	</select>
</mapper>
*/