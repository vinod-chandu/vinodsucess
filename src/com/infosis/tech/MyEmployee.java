package com.infosis.tech;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="MyEmployee_Table")
public class MyEmployee {

	public MyEmployee() {

	}

	@Id
	private Integer empId;

	private String emp_Name;

	private Double sal;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmp_Name() {
		return emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "MyEmployee [empId=" + empId + ", emp_Name=" + emp_Name + ", sal=" + sal + ", getEmpId()=" + getEmpId()
				+ ", getEmp_Name()=" + getEmp_Name() + ", getSal()=" + getSal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
