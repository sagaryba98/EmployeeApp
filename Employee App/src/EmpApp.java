public class EmpApp {
	static Employee[] emp = new Employee[7];
	
	public static void main(String[] args) {
		addEmp();
		print(1006);
		printall();//just extra
		
		
		
	}
	
	public static void addEmp() {
		
		DesignationCode e=new DesignationCode('e',"Engineer",20000);
		DesignationCode c=new DesignationCode('c',"Consultant",32000);
		DesignationCode k=new DesignationCode('k',"Clerk",12000);
		DesignationCode r=new DesignationCode('r',"Receptionist",15000);
		DesignationCode m=new DesignationCode('m',"Manager",40000);
		
		Employee e1001= new Employee(1001,"Ashish","01/04/2009",e,"R&D",2000,8000,3000);
		Employee e1002= new Employee(1002,"Sushma","23/08/2012",c,"PM",30000,12000,9000);
		Employee e1003= new Employee(1003,"Rahul","12/11/2008",k,"Acct",10000,8000,1000);
		Employee e1004= new Employee(1004,"Chahat","29/01/2013",r,"Front Desk",12000,6000,2000);
		Employee e1005= new Employee(1005,"Ranjan","16/07/2005",m,"Engg",50000,20000,20000);
		Employee e1006= new Employee(1006,"Suman","01/01/2000",e,"Manufacturing",23000,9000,4400);
		Employee e1007= new Employee(1007,"Tanmay","12/06/2006",c,"PM",29000,12000,10000);
		
		
		emp[0]=e1001;
		emp[1]=e1002;
		emp[2]=e1003;
		emp[3]=e1004;
		emp[4]=e1005;
		emp[5]=e1006;
		emp[6]=e1007;
		
		
		
	}
	public static void printEmp(Employee e) {
		System.out.println("Emp No.\t\tEmp Name\t\tDepartment\t\tDesignation\t\tSalary");
		System.out.println(e.getEmpNo()+"\t\t"+e.getEmpName()+"\t\t\t"+e.getDepartment()+"\t\t"+e.getDesignationCode().getDesignation()+
				"\t\t"+calculateSalary(e));
	}
	
	
	public static double calculateSalary(Employee e) {
		return e.getBasic()+e.getHRA()+e.getDesignationCode().getDA()-e.getIT();
	}
	
	public static void print(int id) {
		for(Employee e: emp) {
			if(e.getEmpNo()==id) {
				printEmp(e);
			}
			else {
				
			}
		}
		
	}
	
	//extra method to print all employee
	public static void printall()
	{
		System.out.println("\n\nThe list of all Employees are as below:\n");
		System.out.println("Emp No.\t\tEmp Name\t\tDepartment\t\tDesignation\t\tSalary");
		for(Employee e: emp) {
			
			if(e.getEmpNo()==1004||e.getEmpNo()==1006) {
				System.out.println(e.getEmpNo()+"\t\t"+e.getEmpName()+"\t\t\t"+e.getDepartment()+"\t\t"+e.getDesignationCode().getDesignation()+
						"\t\t"+calculateSalary(e));
			}
			else if(e.getEmpNo()==1003||e.getEmpNo()==1005) {
				System.out.println(e.getEmpNo()+"\t\t"+e.getEmpName()+"\t\t\t"+e.getDepartment()+"\t\t\t"+e.getDesignationCode().getDesignation()+
						"\t\t\t"+calculateSalary(e));
			}
			else {
				System.out.println(e.getEmpNo()+"\t\t"+e.getEmpName()+"\t\t\t"+e.getDepartment()+"\t\t\t"+e.getDesignationCode().getDesignation()+
						"\t\t"+calculateSalary(e));
			}
		}
	}
	
	
}
