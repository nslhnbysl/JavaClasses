package com.class26;


	class BankTest{
		public static void main(String[] args) {
			Bank bank=new Bank();
			System.out.println(bank.a);
			bank.money=900;
			double fee=bank.chargeFee();
			System.out.println("Bank fee="+fee);
			
			PNC pnc=new PNC();
			pnc.money=800;
			double pncFee=pnc.chargeFee();
			System.out.println("PNC fee="+pncFee);
			
			
		}
	}

