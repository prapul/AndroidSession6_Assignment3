package prapul;

public class BankThread extends Thread{
	BankAccount a = new BankAccount(10000);
	public static void main(String args[]){
		BankThread t1 = new BankThread();
		t1.start();
	}
	public void run() {
		a.deposit(5000);
		try {
			a.withdraw(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.getBalance();
	}

}
