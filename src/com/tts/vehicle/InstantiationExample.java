package com.tts.vehicle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tts.people.Person;

public class InstantiationExample {

	public static void main(String[] args) {
		
		//If you want to make an object
		//from a class template, 
		//you declare a variable of that type....
		
		Scanner input;  //Declares a variable
		                //that will hold a reference to a Scanner object
		
		//And if we want to create a Scanner object in memory,
		//we use the new keyword.
		
		input = new Scanner(System.in);  //This creates an INSTANCE of a 
		                                 //a Scanner.
		                                 //and calls a special method of the 
		                                 //class known as a constructor.
		
		//To create a person, we do the same thing.
		Person person1;
		person1 = new Person(); //This creates an INSTANCE
		                        //of the class Person.
		
		String value = new String("Hello");
		Integer x = new Integer(7); //This is legal (but old school Java)
		//int y = int(7); //You don't instantiate create primitive types
		
		//Once you have an object, let's say "input" which is a Scanner type,
		//we can access the members of input (which are the properties and
		//the methods) via dot notation.
		
		//input.nextLine(); //This is calling the method nextLine() defined 
		                  //in the Scanner class.
		
		List<String> theList = new ArrayList<>();
		//These are methods of the List type.
		theList.add("First");
		theList.add("Second");
		theList.size();
		
		Car myCar = new Car(); //Where's the constructor?
		myCar.setColor("Green");
		myCar.setNumberOfDoors(7);
		myCar.start();
		myCar.stop();
		myCar.drive();
		
		Car myOtherCar = new Car();
		myOtherCar.setColor("Red");
		myOtherCar.setNumberOfDoors(2);
		System.out.println(myCar.getNumberOfDoors());
		
		Car thirdCar = new Car();
		System.out.println(thirdCar.getColor());
		System.out.println(thirdCar.getNumberOfDoors());
	
		Car fourthCar = new Car("yellow", 3);
		System.out.println(fourthCar.getColor());
		System.out.println(fourthCar.getNumberOfDoors());
		
		Car fifthCar = new Car("purple");
		System.out.println(fifthCar.getColor());
		System.out.println(fifthCar.getNumberOfDoors());
		
		Car sixthCar = new Car(8);
		System.out.println(sixthCar.getColor());
		System.out.println(sixthCar.getNumberOfDoors());
		
		myCar.drive();
		myCar.drive(5);
		myCar.drive(5, 60);
		myCar.drive("Aruba");
	
		List<String> myStrings = new ArrayList<>();
		myStrings.add("Reka");
		myStrings.add(0, "Mikal");
		
		Integer.bitCount(7); //Example of a call to a static method
		//if we he have a method that isn't static....
		//we have to call it on an instance.
		Integer y=5;
		y.byteValue(); //Non static method
		
		
		
		
		
		
	}
}
