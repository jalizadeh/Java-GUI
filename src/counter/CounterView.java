package counter;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * solution #2
 * {@link CounterApp.main}
 */
public class CounterView extends JFrame {
	JButton increment;
	JButton decrement;
	JLabel value;
	CounterModel model;
	
	public CounterView(CounterModel model) {
		//View has connection with Model
		this.model = model;
		
		//no need to define JFrame object
		setTitle("Counter");
		setSize(300, 300); //pixels
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		increment = new JButton("Increment");
		decrement = new JButton("Decrement");
		value = new JLabel("?");
		//it is needed for sol #2
		value.setHorizontalAlignment(JLabel.CENTER);
		
		/*
		 * sol #1
		 * this solution is responsive to frame`s size
		 * and the order of items is important
		 * 
		//this is necessary for showing items
		setLayout(new FlowLayout());
		
		add(increment);
		add(decrement);
		add(value);
		*/
		
		/*
		 * sol #2
		 * this solution is order-free
		 * and is based on the location we define
		 */
		//this is necessary for showing items
		setLayout(new BorderLayout());
				
		add(increment, BorderLayout.NORTH);
		add(decrement, BorderLayout.SOUTH);
		add(value, BorderLayout.CENTER);
				
		//value.setText(String.valueOf(model.getValue()));
		//but it happens every time user interacts, so let`s put it in a method
		update();
		
		setVisible(true);
		
	}
	
	
	void update() {
		value.setText(String.valueOf(model.getValue()));
	}
	
}
