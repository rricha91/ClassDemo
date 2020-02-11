import java.util.Scanner;

public class ClassDemo {
 public static void main(String[] args) {
 
	 Person a = new Person();  
	
//a.name = "Bob"; 
	 
	
	 a.setName("Bob"); /*
	  					* // Set private object Name in the
	  					* Person file to "Bob"
	  					*/
	 
System.out.println(a.getName());	/*
									* // Print private object 'Name'
									* from Person file 
									*/
	 
//a.age = 25;  
a.setAge(35);
	 
System.out.println(a.getAge());

	//create object named b with name Kim
Person b = new Person("Kim");
System.out.println(b.getName());
System.out.println(b.getAge());

	// Create person c
	
Scanner input = new Scanner(System.in);

	// Ask for the user to input a name and age
System.out.println("Please enter a name: ");
String name = input.nextLine();

System.out.println("Please enter their age: ");
int age = input.nextInt();

Person c = new Person(name, age);
System.out.println(c.getName());
System.out.println(c.getAge());

	
//See how objects are different from variables
int num = 10;
System.out.println(num); 		// Put the int variable into a String reader
System.out.println(c);			// Put the String object into an int reader

c = new Person("Kim", 4);
System.out.println(c.getName());
System.out.println(c.getAge());


input.close();

 }
}