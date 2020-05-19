public class Employee {
	private int  empNo;
	private String empName;
	private String joinDate;
	private DesignationCode designationCode;
	private String department;
	private int basic;
	private int HRA;
	private int IT;
	
	public Employee(int empNo, String empName, String joinDate, DesignationCode designationCode, String department, int basic,
			int hRA, int iT) {
		this.empNo = empNo;
		this.empName = empName;
		this.joinDate = joinDate;
		this.designationCode = designationCode;
		this.department = department;
		this.basic = basic;
		HRA = hRA;
		IT = iT;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public DesignationCode getDesignationCode() {
		return designationCode;
	}

	public void setDesignationCode(DesignationCode designationCode) {
		this.designationCode = designationCode;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getHRA() {
		return HRA;
	}

	public void setHRA(int hRA) {
		HRA = hRA;
	}

	public int getIT() {
		return IT;
	}

	public void setIT(int iT) {
		IT = iT;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", joinDate=" + joinDate + ", designationCode="
				+ designationCode + ", department=" + department + ", basic=" + basic + ", HRA=" + HRA + ", IT=" + IT
				+ "]";
	}
	
	

}
