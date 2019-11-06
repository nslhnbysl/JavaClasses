package com.class12;

public class FindDuplicateInArray {

	public static void main(String[] args) {

		
	int[]array= {2,5,4,7,2,5};
	for (int i = 0; i < array.length; i++) {
		for(int j=i+1;j<array.length;j++) { //we must write=i+1 because for loop take 0 index(2) and we dont need to compare 
			                                //same index!! we need to compare next index for index[0] so its must be index[1] 
			                                //because of this reason we must add 1 to for loop variable j=i+1
			if(array[i]==array[j]) {
				System.out.println(array[j]);
			}
	
				int[] array2 = { 56, 42, 98, 43, 67 };
				int huge = 0;
				for (int a = 0; a < array2.length; a++) {
					if (array2[a] >= huge) {
						array2[a] = huge;
					}
					System.out.println(huge);
				}
			
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
