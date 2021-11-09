class Bike{
	void run(){System.out.println("Vehicle is running");}  
	
}

 class Vehicle extends Bike {
	 

  
	
	  public static void main(String args[]){  
	  //creating an instance of child class  
	  Bike obj = new Bike();  
	  //calling the method with child class instance  
	  obj.run();  
	  }  
	}  