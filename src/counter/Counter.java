package counter;

public class Counter {
	private int value;
	
	public void increment() {
		value++;
	}
	
	public void decrement() {
		//it can prevent decreasing more than 0 [optional]
		//if(value == 0) return;
		
		value--;
	}
	
	public int getValue() {
		return value;
	}
}
