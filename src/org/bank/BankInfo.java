package org.bank;

public class BankInfo extends AxisBank{
	public void saving() {
		System.out.println("Savings Account");

	}

	public void fixed() {
		System.out.println("Fixed Account");

	}
	
	public static void main(String[] args) {
		BankInfo b = new BankInfo();
		b.saving();
		b.fixed();
		b.deposit();
	}
}
