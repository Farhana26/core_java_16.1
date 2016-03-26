package polymphsm;

public class SalaryFinal extends EmployeeBasicInfo {
	public int finalsalary(int firstmonthsalary, int lastmonthsalary){
		int avg = ((firstmonthsalary + lastmonthsalary)/2 -2);
		return avg;
	}

}
