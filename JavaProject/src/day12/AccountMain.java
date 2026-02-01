package day12;

public class AccountMain {

	public static void main(String[] args) {
		
		Account act=new Account();
		
		act.setAccno(101);
		act.setName("Aravind");
		act.setAmount(56000);
		
		System.out.println(act.getAccno());
		System.out.println(act.getName());
		System.out.println(act.getAmount());
		}

}
