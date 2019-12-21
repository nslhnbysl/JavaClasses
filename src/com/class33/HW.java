package com.class33;

import java.util.ArrayList;

public class HW {
	//1.Create  a  class  Insurance  that  will  have  an attribute as insuranceName and unimplemented 
	//behaviour  as  getQuote  and  cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has 
	//it’s own attribute as carModel and Class Pet has petType  attribute.  Create  3  objects  of  the  sub 
	//classes  and  store  them  in  ArrayList.  Using  for loop/advanced  for  loop/  iterator  access  all methods of the class. 
	
//	2-Create a Card class that will have implemented and unimplemented methods and a constructor 
//	that  will  initializes  credit  card  type.    Create  3 subclasses  of  a  Card  card.  Create  3  objects  of 
//	different  card  and  store  them  into  LinkedList.Using  for  loop/advanced  for  loop/  iterator access all methods of the class.
	
public static void main(String[] args) {
	ArrayList<String>list=new ArrayList<String>();
    list.add("hi");
    list.add("yo");
    list.add("sup");
    list.add("yolo");
    list.add("boop");
    
    list.remove(4); //we need to remove start bigger number 
    list.remove(2);
    list.remove(0);
    System.out.println(list);
    
   for(int i=0;i<list.size();i++){
    System.out.println(list.get(i));
   }
    

	}

}
