package variableTypes;

public class HR {

	public static void main(String[] args) {
		Employee Rohit = new Employee();// TODO Auto-generated method stub
        
		Rohit.empName="Rohit Sharma";
		Rohit.empId=45;
		Rohit.empGender='M';
		Rohit.empSalary=45000;
		
Employee Surya = new Employee();// TODO Auto-generated method stub
        
		Surya.empName="Surya sakhare";
	    Surya.empId=45;
		Surya.empGender='M';
		Surya.empSalary=5000;
		
		Rohit.empInfo();
		Surya.empInfo();
	}

}
