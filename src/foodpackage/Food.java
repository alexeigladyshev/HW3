package foodpackage;

public class Food {

	public String name;
	public int calories;
	public final int weight = 30; 
	
	//this is a constructor, to give our Food objects initial values
	public Food(String name, int calories){
		
		this.calories = calories;
		this.name = name;	
	}
	
	public void printCalories(){
		
		System.out.println("This food has " + calories + " calories"); 
	}
	public void printName(){
		
		System.out.println("This is a " + name);
	}
	
	public static void testStaticMethod(){
		
		System.out.println("This is a static method");
		
	}
	
	
	
}
