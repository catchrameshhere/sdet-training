package basic;

public class JavaExample {

	public void beforeTest() {
		System.out.println("**********before test method**********");
	}

	public void afterTest() {
		System.out.println("**********from after test method**********");
	}

	public void tc1() {
		System.out.println("from tc-1");
	}

	public void tc2() {
		System.out.println("from tc-1");
	}

	public static void main(String[] args) {
		JavaExample obj = new JavaExample();
		obj.tc1();

		obj.beforeTest();
		obj.tc1();
		obj.afterTest();
		System.out.println("*************************************");
		obj.beforeTest();
		obj.tc2();
		obj.afterTest();

	}

}
