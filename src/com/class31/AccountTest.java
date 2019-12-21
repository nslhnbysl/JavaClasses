package com.class31;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account();
//acc.accountNumber=98290328; -->we cannot access private variables to directly
//acc.balance=-19292;
		acc.setAccountNumber(7383); // its gonna 0 because we added if condition inside method our numbers must be
									// length of 9
		long accountNum = acc.getAccountNumber();
		System.out.println(accountNum);

		acc.setBalance(2000);
		double myBalance = acc.getBalance();
		System.out.println(myBalance);

		Account acc2 = new Account();
		acc2.setAccountNumber(123456789);
		long accountNo = acc2.getAccountNumber(); // now we can get a numbers because our given number length==9
		System.out.println(accountNo);

		int num = 123;
		String.valueOf(num);// -->simply convert whatever value gonna give

	}

}
