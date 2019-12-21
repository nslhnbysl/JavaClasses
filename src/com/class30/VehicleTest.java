package com.class30;

public class VehicleTest {

	public static void main(String[] args) {
     BMW bmw=new BMW("345","Sedan","BMW","X5"); //when we create bmw objects the constructor first call super refers and then jump to the car class 
                                                //and after that it goes inside the car class constructor and see super and it refers vehicle class 
                                                //and the compiler will jump vehicle class and call the constructors and then after that goes back car and back bmw class 
     BMW.displayTotal();                                         //and finally constructors calling finish 
     System.out.println("_________");
    
     Car car=new BMW("345","Sedan","BMW","X5");//we cannot create an objects for abstract class directly
     Car.displayTotal();
     System.out.println("____________");
     Vehicle vehicle=new BMW("345","Sedan","BMW","X5");//but we can create undirectly to use %100 complete class(we dont have any unimplemented method) so BMW class 
     
     
     bmw.display();
     Vehicle.displayTotal();
     
     System.out.println("__________");
     new BMW("345","Sedan","BMW","X5"); 
     new BMW("345","Sedan","BMW","X5");
     new BMW("345","Sedan","BMW","X5");//gonna be 6 because compiler also create an object and it will inceremt the total
     Vehicle.displayTotal();
     
	}

}
