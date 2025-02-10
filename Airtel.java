
public class Airtel  implements Sim{
	private double balance;
	@Override
	public void recharge(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Airtel recharge successful");
		balance += amt;
	}
	
	@Override
	public void currentBaal() {
		// TODO Auto-generated method stub
		System.out.println(balance);
	}
	
	@Override
	public String call(long num) {
		// TODO Auto-generated method stub
		return "you are trying call number is busy" ;
	}
	
	@Override
	public String sms(long num, String msg) {
		// TODO Auto-generated method stub
		return "Airtel : sms sent " ;
	}

}
