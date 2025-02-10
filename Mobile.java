
public class Mobile {
	
	private Sim sim;
	
	public void InsertSim(String simName) throws Exception {
		try {
			Class cls = Class.forName(simName);
			Object obj = cls.newInstance();
			
			if(obj instanceof Sim s1) {
				this.sim = s1;
			}else {
				throw new Exception(sim + "Sim is not valid");
			}
		}catch(ClassNotFoundException | InstantiationException | IllegalAccessException  e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void recharge(double amt) {
		sim.recharge(amt);
	}
	
	public void currentbalance() {
		sim.currentBaal();
	}
	
	public String call(long num) {
		return sim.call(num);
	}
	
	public String sms(long mn , String msg) {
		return sim.sms(mn, msg);
		
	}

}
