package counter;

public class CounterControl {
	
	private CounterView view;
	private CounterModel model;
	
	public CounterControl(CounterModel m, CounterView v) {
		model = m;
		view = v;
	}
	
	public void doIncrement() {
		model.increment();
	}
	
	public void doDecrement() {
		model.decrement();
	}
	
}
