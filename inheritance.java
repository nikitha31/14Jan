class Employee
{
    int CompCode=100;
    String CompName="epam";
    int EmpID;
    String EmpName; 
    
}
class FTEmp extends Employee
{
    int Salary= 6;
    String type="FT";
    FTEmp(int id,String name)
    {
        EmpID=id;
        EmpName=name;
    }
}
class Intern extends Employee
{
    int Salary= 2;
    String type="INTERN";
    Intern(int id,String name)
    {
        EmpID=id;
        EmpName=name;
    }
    
}
public class Main{
    public static void main(String args[])
    {
        FTEmp obj = new FTEmp(1,"nikitha");
	    System.out.println("comapany code is "+obj.CompCode);
	    System.out.println("company name is "+obj.CompName);
	    System.out.println("employee id "+obj.EmpID);
	    System.out.println("employee name "+obj.EmpName);
	    System.out.println("employee type "+obj.type);
	    System.out.println("salary is "+obj.Salary);
	    Intern obj1 = new Intern(2,"xyz");
	    System.out.println("comapany code is "+obj1.CompCode);
	    System.out.println("company name is "+obj1.CompName);
	    System.out.println("employee id "+obj1.EmpID);
	    System.out.println("employee name "+obj1.EmpName);
	    System.out.println("employee type "+obj1.type);
	    System.out.println("salary is "+obj1.Salary);
    }
}
