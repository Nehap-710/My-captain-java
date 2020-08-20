package employee;

class EmployeeInfo {
	private String name, address;
	private int year;
	
	void setData(String name, int year , String address) {
		
		this.name = name;
		this.year = year;
		this.address = address;
	}
	
	void getData() {
		System.out.println(name+ "\t" +year+ "\t" +address);
	}
}

public class Employee {

	public static void main(String[] args) {
		
		System.out.println("Name\tYear of joining\tAddress");
		
		EmployeeInfo e1 = new EmployeeInfo();
		EmployeeInfo e2 = new EmployeeInfo();
		EmployeeInfo e3 = new EmployeeInfo();
		
		e1.setData("Robert",1994,"64C-WallsStreet");
		e1.getData();
		e2.setData("Sam",2000,"68D-WallsStreet");
		e2.getData();
		e3.setData("John",1999,"26B-WallsStreet");
		e3.getData();
		
	}

}
