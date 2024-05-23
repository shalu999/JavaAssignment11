package OppsConcept;

public class TaskEmployee {

		 int id; //global variable for id
		 String firstName,lastName; //variable declaration for firstname and lastname 
		 int salary; //variable declaration for salary
		 TaskEmployee(){
			 id=0;
			 firstName="";
			 lastName="";
			 salary=0;
			 
		 }
		
		 //Parameterized constructor with class name
		TaskEmployee(int id1,String FirstName,String LastName,int Salary){
			id=id1;
			firstName=FirstName;
			lastName=LastName;
			salary=Salary;
		}
		//Creating getter methods for the given attributes 
		
		public void setid(int id1) {
			id=id1;
		}
		public int getid() {
			return id;
		}
		public void setfirstName(String fname) {
			firstName=fname;
		}
		public String getfirstName() {
			return firstName;
		}
		public void setlastName(String lname) {
			lastName=lname;
		}
		public String getlastName() {
			return lastName;
		}
		public String getName() {
			return firstName + " " + lastName;
		}
		public int getsalary() {
			return salary;
		}
		public void setsalary(int Salary) {
			salary=Salary;
		}
		//Annual salary= monthly salary *12
		 public int getAnnualsalary() {
			 return salary*12;
		 }
		 //raise salary method creation
		 public int raiseSalary(int percent) {
			 
		 int newSalary=salary*percent/100;
		 salary+=newSalary;
		 return salary;
		 }
		  public String toString() {
			  return "Employee ID :" + id +"\n "+"Name :"+ getName() +"\n "+ "AnnualSalary :"+getAnnualsalary()+"\n"+"Salary raise per month :"+salary;
		  }
		  
	
	public static void main(String[] args) {
		TaskEmployee emp=new TaskEmployee();
		emp.setid(001);
		emp.setsalary(6000);
		emp.setfirstName("Josh");
		emp.setlastName("Migi");
		emp.getName();
		emp.raiseSalary(10);
		System.out.println(emp);
		
		//object for parameterized constructor
		TaskEmployee employee=new TaskEmployee(002,"Shalu","Edna",60000);
		employee.raiseSalary(20);
		System.out.println(employee);
		
		//object for parameterized constructor with different parameters
		TaskEmployee employee1=new TaskEmployee(003,"nini","kiran",100000);
		employee.raiseSalary(30);
		System.out.println(employee1);


	}

	}
