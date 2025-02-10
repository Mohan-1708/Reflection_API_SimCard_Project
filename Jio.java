
public class Jio implements Sim {
	
	double balance;
	
	@Override
	public void recharge(double amt) {
		// TODO Auto-generated method stub
		System.out.println(" Jio recharge  successful " + amt );
		balance += amt;
		
	}
	
	@Override
	public void currentBaal() {
		// TODO Auto-generated method stub
		System.out.println(balance);
	}
	
	@Override
	public String call(long num) {
		
		return "your trying to call number is busy " ;
	}
	
	@Override
	public String sms(long num, String msg) {
		// TODO Auto-generated method stub
		return "your sms sent" ;
	}
}
