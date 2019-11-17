package com.class19;

public class student {
    char getGrade(int score) {
    	char grade;
    	if(score>=90 && score==100) {
    		grade='A';
    	}else if(score>=80 && score<90) {
    		grade='B';
    		
    	}else if(score>=70 && score<80) {
    		grade='C';
    		
    	}else if(score>=50 && score<70) {
    		grade='D';
    	}else {
    		grade='F';
    	}
    	return grade;
    	
    }
    public static void main(String[] args) {
		student obj=new student();
		
		char gradeResult=obj.getGrade(67);
		System.out.println(gradeResult);
	}
}
