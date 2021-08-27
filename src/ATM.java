import java.util.HashMap;

public class ATM {
	HashMap<String, Double> accounts = new HashMap<String, Double>();
	
	public void deposit(String id, double amount) {
		if (this.accounts.get(id) == null) {
			this.accounts.put(id, amount);
		} else {
			this.accounts.put(id, this.accounts.get(id) + amount);
		}
	}
}
