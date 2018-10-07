
public class SodaMachine {

	State soldOutState;
	State noDollarState;
	State hasDollarState;
	State soldState;
	
	State state;
	int count = 0;
	
	public SodaMachine(int numberSodas) {
		soldOutState = new SoldOutState(this);
		noDollarState = new NoDollarState(this);
		hasDollarState = new HasDollarState(this);
		soldState = new SoldState(this);
		
		this.count = numberSodas;
		if (numberSodas > 0) {
			state = noDollarState;
		} else {
			state = soldOutState;
		}
	}
	
	public void insertDollar() {
		state.insertDollar();
	}
	
	public void ejectDollar() {
		state.ejectDollar();
	}
	
	public void chooseDrink() {
		state.chooseDrink();
		state.dispense();
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	void releaseSoda() {
		System.out.println("A soda falls from the machine.\n");
		if (count != 0) {
			count = count - 1;
		}
	}
	
	public int getCount() {
		return count;
	}
}
