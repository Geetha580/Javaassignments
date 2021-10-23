
package lab4;

public class SavingsAccount extends Account{
	final double minBal1=2500;
	public SavingsAccount(Person accHolder) {
		super(accHolder);
		// TODO Auto-generated constructor stub
	}

	
	final double minBal=500;

	@Override
	boolean withDraw(double d) {
		
		if(d>=minBal1) {
			return true;
		}
		else {
			return true;
		}
	}
	 
	 

}
