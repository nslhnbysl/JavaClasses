package com.class21;

public class Forest {
		
	

	public static void main(String[] args) {

		//Create four classes: Forest, Wolf, Fox, Bear
	    //Class wolf has: color, age, numberOfWolves
	    //Class fox has: color, speed, numberOfFoxes
	    //Class bear has: type, weight, numberOfBears
	    
	    //Forest has main method
	    //Create different objects/instances of different classes
	    //At the end, print the total for each animal.
	
	Wolf wolf1=new Wolf();
	Wolf wolf2=new Wolf();
	
	wolf1.color="brown";
	wolf1.age=1;
	wolf2.color="yellow";
	wolf2.age=5;
	wolf1.numberOfWolves++;
	
	wolf1.display();
	wolf2.numberOfWolves++;
    wolf1.display();
    
    Fox fox1=new Fox();
    Fox fox2=new Fox();
    Fox fox3=new Fox();
    
    fox1.numberOfFoxes++;
    fox2.numberOfFoxes++;
    fox3.speed=50;
    fox3.color="brown";
    fox3.numberOfFoxes+=5;//pregnant fox:)
    fox3.displayFox();
    
    Bear bear1=new Bear();
    bear1.type="white";
    bear1.numberOfBears++;
    bear1.displayBear();
}
}