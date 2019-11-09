package com.class15;

import java.util.Arrays;

public class IQ2 {

	public static void main(String[] args) {

		
	//find the largest second largest and minimum number in array
		
		int []array= {100,-90,8787,898,0,1,-90};
		
     //first easiest way 
		
		Arrays.sort(array); //-->this method for to sort array value from lowest to largest
		
		int min=array[0];
		int max=array[array.length-1];
		System.out.println(min);
		System.out.println(max);
		
	 //secondway 
		int []myArray= {100,-90,8787,898,0,1,-90};
		
		int largest=myArray[0];
		int smallest=myArray[0];
		
		
		for(int i=0;i<myArray.length;i++) {
			if(myArray[i]>largest) {
				largest=myArray[i];
			}if(myArray[i]<smallest) {
				smallest=myArray[i];
			}
		}
		
		System.out.println("The smallest value in array is "+smallest);
		System.out.println("The largest value in array is "+largest);
		
		
		int []nums= {100,-90,8787,898,0,1,-90};
		
		int large=nums[0];
		int secondLarge=nums[0];
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>large) {
				secondLarge=large;//buyuk nums surekli degisecek ama esitlemeden once bir onceki buyuk numarayi eger seconda esitlersek ikinciyi bulabiliriz
				large=nums[i];
			}if(nums[i]>secondLarge && nums[i]<large) {//largest numberin onceki degeriyle esitledigimiz icin burada o degeri digerleriyle compare edecegiz 
				secondLarge=nums[i];
			}
		}
		System.out.println(large);
		
		System.out.println(secondLarge);
		
		
		
		
		
	}

}
