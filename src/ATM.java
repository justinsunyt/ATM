import java.util.HashMap;

public class ATM {
	HashMap<String, Double> accounts = new HashMap<String, Double>();
	
	public void deposit(String id, double amount) {
		if (amount < 0)
		{
			System.out.println ("Can't deposit a negative amount");
			return;
		}
		if (this.accounts.get(id) == null) {
			this.accounts.put(id, amount);
		} else {
			this.accounts.put(id, this.accounts.get(id) + amount);
		}
	}
	public void withdraw (String id, double amount)
	{
		if (amount < 0)
		{
			System.out.println ("Can't withdraw a negative amount");
			return;
		}
		if (this.accounts.get(id) == null) {
			System.out.println ("Must have bank account to withdraw");
			return;
		} else {
			double newBalance = this.accounts.get(id) - amount;
			if (newBalance < 0)
			{
				System.out.println ("You can't withdraw more than what is in your account");
			}
			else
			{
				this.accounts.put(id, newBalance);
			}
		}
	}
	public String checkBalance(String id)
	{
		if (this.accounts.get(id) == null)
		{
			return "This bank account doesn't exist";
		}
		return ("" + this.accounts.get(id));
	}
	public static void main (String [] args)
	{
		ATM a = new ATM ();
		a.deposit("Winfrey", 25159684372.43);
		a.deposit("Bezos", 193495330293.43);
		a.deposit("Bezos", 20394353.35);
		a.withdraw("Bezos", 3593293.66);
		a.deposit("MrTheiss",64033.55);
		a.withdraw("MrTheiss", 443964.46);
		System.out.println(a.checkBalance("Bezos"));
		System.out.println(a.checkBalance("Winfrey"));
		System.out.println(a.checkBalance("YoMama"));
		System.out.println(a.checkBalance("MrTheiss"));
	}
}
