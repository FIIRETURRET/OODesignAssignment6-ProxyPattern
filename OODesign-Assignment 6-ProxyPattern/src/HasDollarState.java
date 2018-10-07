
public class HasDollarState implements State{

	SodaMachine sodaMachine;
	
	public HasDollarState(SodaMachine sodaMachine) {
		this.sodaMachine = sodaMachine;
	}
	public void insertDollar() {
		// TODO Auto-generated method stub
		System.out.println("You fool!!!\nThere was already"
				+ " a dollar in the machine!!!"
				+ ", but i'll gladly take your money.\n");
	}

	@Override
	public void ejectDollar() {
		// TODO Auto-generated method stub
		System.out.println("Nice try buddy, this dollar is mine!\n");
	}

	@Override
	public void chooseDrink() {
		// TODO Auto-generated method stub
		System.out.println("Pffft... nice choice.\n");
		sodaMachine.setState(sodaMachine.soldState);
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("No soda dispensed.\n");
	}

}
