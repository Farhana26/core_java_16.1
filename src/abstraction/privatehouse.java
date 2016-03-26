package abstraction;

public abstract class privatehouse implements house{
	
public void land(){
		
		int landsize = 10;
		System.out.println("the land size:" +" " + 10);
}
public void design(){
	System.out.println("Designs need to be done.");
}
	public void structure(){
		System.out.println("structure needs to be done.");
	}
	public void interior(){
		System.out.println("interior needs to be done!");
	}
	public void exterior(){
		System.out.println("exterior needs to be done");
		
	}
	
	public abstract void furniture();
	
	
	
}

