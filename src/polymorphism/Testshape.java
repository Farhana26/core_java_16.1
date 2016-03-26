package polymorphism;

public class Testshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s1 = new shape();
		int resultarea = s1.areaOfarea(10, 8, 10);
		System.out.println(resultarea);
		
		modernshape s2 = new modernshape();
		int resultmodern = s2.areaOfarea(10, 8, 10);
		System.out.println(resultmodern);

	}

}
