
public class SoldOutState implements State {

	SodaMachine sodaMachine;
	
	public SoldOutState(SodaMachine sodaMachine) {
		this.sodaMachine = sodaMachine;
	}
	
	@Override
	public void insertDollar() {
		// TODO Auto-generated method stub
		System.out.println("Thanks for the dollar, now beat it! Were sold out.\n");
	}

	@Override
	public void ejectDollar() {
		// TODO Auto-generated method stub
		System.out.println("What do I look like? A charity? Scram!\n");
	}

	@Override
	public void chooseDrink() {
		// TODO Auto-generated method stub
		System.out.println("That ain't how the world works kid.\n");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("No soda comes out\n");
	}

}
