
public class NoDollarState implements State {

	SodaMachine sodaMachine;
	
	public NoDollarState(SodaMachine sodaMachine) {
		this.sodaMachine = sodaMachine;
	}
	
	@Override
	public void insertDollar() {
		// TODO Auto-generated method stub
		System.out.println("Thanks for the money!\n");
		sodaMachine.setState(sodaMachine.hasDollarState);
	}

	@Override
	public void ejectDollar() {
		// TODO Auto-generated method stub
		System.out.println("Hey! What are you trying to pull here?"
				+ " You didn't put any money in the machine pal.\n");
	}

	@Override
	public void chooseDrink() {
		// TODO Auto-generated method stub
		System.out.println("Hey wise-guy, you can't pick a drink because you didn't"
				+ " pay for a drink!\n");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("Are you trying to steal from me?\n");
	}

}
