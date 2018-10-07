
public class SoldState implements State{

	SodaMachine sodaMachine;
	
	public SoldState(SodaMachine sodaMachine) {
		this.sodaMachine = sodaMachine;
	}
	
	public void insertDollar() {
		// TODO Auto-generated method stub
		System.out.println("I mean your already getting your soda"
				+ ", but i'll take this dollar too!\n");
	}

	@Override
	public void ejectDollar() {
		// TODO Auto-generated method stub
		System.out.println("It's too late for that pal.\n");
	}

	@Override
	public void chooseDrink() {
		// TODO Auto-generated method stub
		System.out.println("What are you trying to pull? Your only gonna get one drink.\n");
		sodaMachine.setState(sodaMachine.soldState);
	}

	@Override
	public void dispense() {
		sodaMachine.releaseSoda();
		if(sodaMachine.getCount() > 0) {
			sodaMachine.setState(sodaMachine.noDollarState);
		} else {
			sodaMachine.setState(sodaMachine.soldOutState);
		}
	}

}
