package com.tts.vehicle;

public class Car {
	
	//if you don't provide a constructor for a class in Java
	//a default zero argument constructore is added by the compiler
	//that does nothing... When the class is instantiated....
	//all the properties will be set to "default" values.
	//For numbers that will be 0, for reference values that will
	//be null
	
	//as soon as I provide a constructor for Car, the compiler will
	//no longer provide the automatic one
	
	
	
	//Let's now define the 
	//properties and methods of
	//Car
	
	//Let's start with the properties.
	//-----------------------------------
	//Cars have colors...
	private String color; //this is going to
	              //hold the color 
	              //of a car.
	//^^^^ THis variable is not defined
	//inside a method. That means that
	//it is a property of the class it 
	//is defined in.
	
	 private int numberOfDoors; //Holds the number
	                    //of doors.
	 
	
	 private int speed; 
	 private int currentRPM;
		 
	 private double gearRatio;
	 
	 
	 public String getColor() {
		 return color;
	 }
	 
	 public void setColor(String color) {
		 this.color = color;
	 }
	 
	 public int getNumberOfDoors() {
		 return numberOfDoors;		 
	 }
	 
	 public void setNumberOfDoors(int doors) {
		 numberOfDoors = doors;
	 }
	 
	 public int getCurrentRPM() {
		 return currentRPM;
	 }
	 
	 public void setCurrentRPM(int rpm) {
		 currentRPM = rpm;
	 }
	 
	 public int getSpeed() {
		 return speed;
	 }
	 
	 public void setSpeed(int speed) {
		 //And we run into a problem currentRpm is related 
		 //so when we change our speed we also want to change our rpm
		 this.speed = speed;
		 setCurrentRPM(calculateRPM(speed));
	 }
	 
	 private int calculateRPM(int speed) {		 
		 int rpm = (int)(speed * gearRatio);
		 return rpm;
	 }
	 
	 public double getGearRatio() {
		 return gearRatio;
	 }
	 
	 //Now let's add constructors.
	 //no-arg constructor.
	 //a constructor looks like a method that has the same
	 //name as the class.....and which does not return a value.
	 
	 Car() {
		 color = "white";
		 numberOfDoors = 2;		 
	 }
	 
	 //Constructor with arguments.
	 Car(String color, int doors) {
		 this.color = color;
		 numberOfDoors = doors;
	 }
	 
	 //IT is possible to declare multiple constructors as long 
	 //as they have different arguments.
	 
	 Car(String color) {
		 this.color = color;
		 numberOfDoors = 4;
	 }
	 
	 Car(int doors) {
		 color = "white";
		 numberOfDoors = doors;
	 }
	 
	 	
	 //Now let's create the methods.
	 //----------------------------------
	 void start() {
		 System.out.println("Car starting");
	 }
	 
	 void stop() {
		 System.out.println("Car stopping");
	 }
	 
	 void drive() {
		 System.out.println("Car driving");
	 }
	 
	 void drive(int miles) {
		 System.out.println("Driving for "+miles + " miles.");			
	 }

 	 
	 void drive(int miles, int speed) {
		 System.out.println("Driving "+speed+"mph for " +miles + " miles.");		 
	 }
	 
	 void drive(String destination) {
		 System.out.println("Driving to "+destination);
	 }
	 
	 
	 
	 
}
