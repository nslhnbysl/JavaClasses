package com.class14;

public class Recap {

	public static void main(String[] args) {

//		String str=new String("Hello");
//		String str1=new String("Hello");
//		System.out.println(str==str1); //its gonna be false because its compare an objects 
//		
//       String s1="welcome";
//       String s2="welcome";
//       System.out.println(s1==s2); //true 
       
       //REPLACE
       
       String str="your Syntax Technologies";
       System.out.println(str.replace('y', 'i'));        //iour Sintax Technologies
		
       System.out.println(str.replace("your", "My")); //My Syntax Technologies

       //REPLACEALL
       
       String str1="@#$^##@2synt234664%%^a893x&^";
       System.out.println(str1.replaceAll("[^a-zA-Z]","")); //syntax
       System.out.println(str1.replaceAll("[a-zA-Z]", "")); //@#$^##@2234664%%^893&^ replace all letters 
       
       
       String str2="Videos provides a powerful way to help you prove your point when you click online video,"
       		+ "you can paste in the embed";
       
       System.out.println(str2.replaceAll("way(.*)", ""));  //videos provides a powerful its replace after way to " " 
       
       System.out.println(str2.replace("video", "audio"));//Videos provides a powerful way to help you prove your point when you click online audio
                                                          //first video didnt change because 
       System.out.println(str2.toLowerCase().replaceAll("video", "audio")); //audios provides a powerful way to help you prove your point when you click online audio,
                                                                            //it changed for toLowerCase
       
       
		
		
		
		
	}

}
