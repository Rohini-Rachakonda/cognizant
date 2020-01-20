class Employee
{
// Data members
	public int empId;
	public String empName;
	int empSalary; 
	void setEmployee(int id,String name,int salary)
	{
		empId=id;
		empName=name;
		empSalary=salary;
	}
	void getEmployee()
	{
		System.out.println(" "+empId+" "+empName+" "+empSalary);
	}
}
