package counter;

import java.util.LinkedList;
import java.util.List;

public class CounterModel {
	private int value;
	
	public void increment() {
		value++;
		notifyChange();
	}
	
	public void decrement() {
		//it can prevent decreasing more than 0 [optional]
		if(value == 0) return;
		
		value--;
		notifyChange();
	}
	
	public int getValue() {
		return value;
	}
	
	
	List<counterObserver> observers = new LinkedList<>();
	public void addObserver(counterObserver obs) {
		observers.add(obs);
	}
	
	public void notifyChange() {
		observers.forEach(obs -> obs.valueChanged(this));
	}
	
	public interface counterObserver {
		void valueChanged(CounterModel source);
	}
}
