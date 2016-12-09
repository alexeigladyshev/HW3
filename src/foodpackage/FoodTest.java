package foodpackage;

import java.util.Random;

public class FoodTest {
	
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		Food[] foodArray = new Food[6];
		
		foodArray[0] = new Food("Cucumber", r.nextInt(5) );
		foodArray[1] = new Food("Hamburger", r.nextInt(200) );
		foodArray[2] = new Food("Apple", r.nextInt(50) );
		foodArray[3] = new Food("Peach", r.nextInt(65) );
		foodArray[4] = new Food("Hot dog", r.nextInt(75) );
		foodArray[5] = new Food("Coffee", r.nextInt(90) );
		
		for (int i = 0; i < foodArray.length; i++)  {
			
			foodArray[i].printName();
			foodArray[i].printCalories();
		}
		
		//You create an array when you want to make lots of objects of the same type
		
		//Food c = new Food("Cucumber", r.nextInt(5) );
		//Food h = new Food("Hamburger", r.nextInt(200) );
		
		Food.testStaticMethod();
		
	}

}
