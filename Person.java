class Person {
  String name;
  int age;
  String gender;
  Address address;
  
  Person(String name, int age, String gender, Address address){
	  this.name = name;
	  this.age = age;
	  this.gender = gender;
	  this.address = address;
  }
}

class Address{
  String city;
  String state;
	
  Address(String city, String state){
	this.city = city;
	this.state = state;
  }	
}

class ExamplesPerson {
  ExamplesPerson() {}
	
  Address one = new Address("Boston", "MA");
  Address two = new Address("Warwick", "RI");
  Address three = new Address("Nashua", "NH");
	
  Person a = new Person("Tim", 20, "M", two);
  Person b = new Person("Pat", 19, "F", one);
  Person c = new Person("Kim", 17, "F", one);
  Person d = new Person("Dan", 22, "M", three);
}