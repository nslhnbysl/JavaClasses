package com.class19;

public class MethodWithReturnValue {

	public static void main(String[] args) {
/*declare a sTRINg and if string has more than 10 characters-->string is large
 * otherwise-->string is small
 */
	String str="Welcome home";
	
	str.length();
	int numOfChars=str.length(); //string returns to int
	if(numOfChars>10) {
		System.out.println("String is large");
	}else {
		System.out.println("String is small");
	}
		
	char character=str.charAt(4); //string return to char	
		Recap obj=new Recap();
	obj.sum(4, 5);
	//int num=obj.sum(3,6); compiler error saying change return type
	
	MethodWithReturnValue obj1=new MethodWithReturnValue();
	int sum=obj1.sum(3, 12);
	System.out.println(sum);
	int large=obj1.findLargest(50, 30);
	System.out.println("Largest num without void= "+large);


}
	//return type,method name(list of parameters)
 int sum(int num1,int num2) {
	int c=num1+num2;
	return c;
 }
	
	int findLargest(int num1,int num2) {
		int largest;
		if(num1>num2) {
			largest=num1;
		}else {
			largest=num2;
		}
		return largest;
	}
	
	
	
	
	
	
	
}
