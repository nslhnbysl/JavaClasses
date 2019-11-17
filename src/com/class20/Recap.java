package com.class20;

public class Recap {

	public static void main(String[] args) {

		MySonMath son1=new MySonMath();
		son1.name="Ensar";
		
		int result=son1.add1();
		System.out.println(result);
		//int result2=son1.add2(1, 9);
		if(result==10) {
			System.out.println("Good Job!");
		}else {
			System.out.println("You are not good enough but its ok");
		}
		//System.out.println(result2);
		
		String name=son1.name1("Ensar ", "Karakelle ",12);
		
		System.out.println(name);
		
		
	}

}
