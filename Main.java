class Employee{
	int empid,did;
	String empname,doj;
	float sal;
	Employee(int empid,int did,String empname,String doj,float sal){
		this.empid=empid;
		this.did=did;
		this.empname=empname;
		this.doj=doj;
		this.sal=sal;
	}
	void show() {
		System.out.println("Employe id is:"+empid);
		System.out.println("Employe name is:"+empname);
		System.out.println("Employe department is:"+did);
		System.out.println("Employe Salary:"+empid);
	}
}
class Department extends Employee{
	int noofemp;
	String Dname;
	Department(int noofemp,String Dname,int empid,int did,String empname,String doj,float sal){
		super(empid,did,empname,doj,sal);
		this.noofemp=noofemp;
		this.Dname=Dname;
	}
	void showDeptDetails() {
		System.out.println("The department is:"+Dname);
		System.out.println("The No of employees inh the department is:"+noofemp);
	}
}
public class Main{

	public static void main(String[] args) {
		Department D1=new Department(10,"CSBS",23,99,"Anand","2ndOctober2023",21);
		D1.show();

	}

}
