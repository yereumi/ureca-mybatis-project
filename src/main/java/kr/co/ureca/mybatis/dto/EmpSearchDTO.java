package kr.co.ureca.mybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmpSearchDTO {

	private String ename;
	private String job;
	private String deptno;

}
