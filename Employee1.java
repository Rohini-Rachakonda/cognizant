class Employee1
{
// Data members
	public int empId;
	public String empName;
	int empSalary; 
	Employee1()
	{
	empId=11;
	empName="asdf";
	empSalary=123445;
	}
	void setEmployee(int empId,String empName,int empSalary)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	void getEmployee()
	{
		System.out.println(" "+empId+" "+empName+" "+empSalary);
	}
	
}
