package kr.co.ureca.mybatis.mapper;

import java.util.List;

import kr.co.ureca.mybatis.dto.EmpDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface MybatisInterface1 {

	@Select("SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno"
			+ " FROM emp"
			+ " ORDER BY ename")
	public List<EmpDTO> getAllEmp1();

	@Select("SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno"
			+ " FROM emp"
			+ " WHERE ename = #{enameParam}")
	public EmpDTO getEmpByEname1( @Param("enameParam") String ename );
	// @Param이 여러개 필요할 경우 : ( @Param("enameParam") String ename, @Param("salParam") String sal, ... )

	@Insert("INSERT INTO emp (ename, job, mgr, hiredate, sal, comm, deptno)"
			+ " VALUES ( #{param.ename}, #{param.job}, #{param.mgr}"
			+ ", now(), #{param.sal}, #{param.comm}, #{param.deptno} )")
	public int insEmp1( @Param("param") EmpDTO dto );

} // interface
