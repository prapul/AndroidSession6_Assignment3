package prapul;

public class BankAccount{
	 private double balance;
	 public BankAccount(double bal) { 
		 balance = bal; 
		 }
	 
	 public BankAccount(){
		 }
	 
	 synchronized public void deposit(double amt) 
	 { 
		 double temp = balance;
	     temp = temp + amt;
	     try{
		 Thread.sleep(300); // simulate production time
	     }
	     catch(Exception e){
	     }
		 System.out.println("after deposition, balance = " + temp);
		 balance = temp;
	 }
	 
	 synchronized public void withdraw(double amt)
	 { 
		 if (balance < amt) {
		    System.out.println("Insufficient funds!");
			return;
			}
		    double temp = balance;
			temp = temp - amt;
			try{
			Thread.sleep(200); // simulate consumption time
			}
			catch(Exception e){
			}
			System.out.println("after withdrawl balance = $" + temp);
			balance = temp;
	 }
	
	 public double getBalance() 
	 { 
		 System.out.println("Final Balance: " + balance);
		 return balance; 
		 }
}
