package variable;

public class FinalPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone samsung = new Phone();
		System.out.println("the price of samsung is:" + " " + samsung.getPhonePrice() );
		
		Phone iphone = new Phone();
		System.out.println("the price of iphone is :" + " " + iphone.getPhonePrice());
		iphone.setPhonePrice(3000);
		
		System.out.println("the price of iphone is :" + " " + iphone.getPhonePrice());

		System.out.println("the price of samsung is:" + " " + samsung.getPhonePrice());
		
		memory lgmem = new memory();
		int a = lgmem.phonememory();
		System.out.println("memory" + " " + a);
		
	     memory lgmem1 = new memory();
		int b = lgmem1.phonememory();
		System.out.println("memory" + " " + b);
		
		
		
	}

}
