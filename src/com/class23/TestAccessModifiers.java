package com.class23;

import com.class22.AccessModifiers;

public class TestAccessModifiers {

	public static void main(String[] args) {

		AccessModifiers.hello();
		System.out.println(AccessModifiers.language);
		
		//AccessModifiers.hello1();-->we cannot access because its protected
		//AccessModifiers.hello2();-->we cannot access because its default 
		
	}

}
