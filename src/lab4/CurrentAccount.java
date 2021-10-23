package lab4;

public class CurrentAccount extends Account{
	double overDtaft=2000;
	public CurrentAccount(Person p) {
		super(p );
		// TODO Auto-generated constructor stub
	}

	
	@Override
	boolean withDraw(double d) {
		
		if(d>overDtaft){
			return true;
		}
		else {
			return false;
		}
	}
	
	

}
