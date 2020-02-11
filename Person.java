public class Person {

	// Fields
private String name;  			/* Data protection - 
* 					Private objects are only accessable to 
* 					the object to which it belongs.
*/
private int age;

	// Methods
		
		// Constructor method
			// No-arg constructor Method		
public Person() {
	name = "noname";
	age = 1;
}

			// Parameterized constructor method
public Person(String name) {
	this.name = name;
	age = 1;
}
			
			//Parameterized constructor for name and age
public Person(String name, int age) {
	this.name = name;
	this.age = age;
}


		// Setter methods
public void setName(String name) 
{
	this.name = name;					
	/*
	* Sets the private object 
	* 'name' to the value 
	* given to the local 'name'
	*/
}
public void setAge(int age) 
{
	this.age = age;					
	/*
	* Sets the private object 
	* 'age' to the value given 
	* to the local int variable 'age'
	*/
}

		// Getter methods
public String getName() 
{
	return name;
}
public int getAge()
{
	return age;
}
 

 public void SayName(){ 
	 System.out.println("My name is " + name + " and my age is " + age);
	 }
 
 public void HaveBirthday() { 
	 age++;
	 }
}