
public class DesignationCode {
	private char designationCode;
	private String designation;
	private int DA;
	public DesignationCode(char designationCode, String designation, int dA) {
		
		this.designationCode = designationCode;
		this.designation = designation;
		DA = dA;
	}
	public char getDesignationCode() {
		return designationCode;
	}
	public void setDesignationCode(char designationCode) {
		this.designationCode = designationCode;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getDA() {
		return DA;
	}
	public void setDA(int dA) {
		DA = dA;
	}
	@Override
	public String toString() {
		return "DesignationCode [designationCode=" + designationCode + ", designation=" + designation + ", DA=" + DA
				+ "]";
	};
	
	
	

}
