package week3.Day1;

import java.util.ArrayList;
import java.util.List;

public class Amazon extends CanaraBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Amazon bank = new Amazon();
		bank.cashOnDelivery();
		bank.upiPayments();
		bank.cardPayments();
		bank.internetBanking();
		bank.recordPaymentDetails();
				
	}

	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		
		System.out.println("Cash on delivery done");
		
		
		
	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("upi Payments done");
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("card Payments done");
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("internet Payment done");
	}

	@Override
	public void recordPaymentDetails() {
		// TODO Auto-generated method stub
		System.out.println("record Payment details");
	}

}
