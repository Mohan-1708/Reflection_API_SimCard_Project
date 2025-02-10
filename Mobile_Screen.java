import java.util.*;
public class Mobile_Screen {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		Mobile b1 = new Mobile();
		
//		String simName = sc.next();
//		
//		Class cls = Class.forName(simName);
//		Object obj = cls.newInstance();
//		
		
		try {
			System.out.print("Inser Sim");
			b1.InsertSim(sc.next());
			System.out.println("Sim activated");
			
			while(true) {
				System.out.println("Choose your Option");
				
				System.out.println("1.Recharge");
				System.out.println("2. Current Balance");
				System.out.println("3. Call");
				System.out.println("4. sms");
				System.out.println("5. close");
				
				int option = sc.nextInt();
				
				switch (option) {
				case 1: 
					System.out.println("Enter amount to Recharge : ");
					b1.recharge(sc.nextDouble());
					
					break;
				case 2:
					System.out.print("Your balance is : ");
					b1.currentbalance();
					break;
				case 3:
					System.out.print("Enter nuumber to call :");
					System.out.println(b1.call(sc.nextLong()));
					break;
				case 4:
					System.out.print("Enter number and msg : ");
					b1.sms(sc.nextLong(), sc.next());
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + option);
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
