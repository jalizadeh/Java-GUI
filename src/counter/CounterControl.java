package counter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterControl implements ActionListener{
	
	private CounterView view;
	private CounterModel model;
	
	public CounterControl(CounterModel m, CounterView v) {
		model = m;
		view = v;
		
		/**
		 * sol #1
		 * then I have to define {@link actionPerformed(ActionEvent e)}
		 * for each button
	 	 *
		view.increment.addActionListener(this);
		view.decrement.addActionListener(this);
		*/
		
		//sol #2
		view.increment.addActionListener( action -> doIncrement());
		view.decrement.addActionListener( action -> doDecrement());
	}
	
	public void doIncrement() {
		model.increment();
		view.update();
	}
	
	public void doDecrement() {
		model.decrement();
		view.update();
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("Event: " + e);
		
		//sol #1
		/*
		String cmd = e.getActionCommand();
		
		if(cmd.equals("Increment")) {
			doIncrement();
		}
		
		if(cmd.equals("Decrement")) {
			doDecrement();
		}
		*/
	}
	
}
