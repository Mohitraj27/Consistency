public class Day_185{
	
	static String Employee_name;
	static float Employee_salary;

	static void set(String n, float p) {
		Employee_name = n;
		Employee_salary = p;
	}

	static void get() {
		System.out.println("Employee name is: " +Employee_name );
		System.out.println("Employee CTC is: " + Employee_salary);
	}

	public static void main(String args[]) {
		Day_185.set("Rathod Avinash", 10000.0f);
		Day_185.get();
	}
}
