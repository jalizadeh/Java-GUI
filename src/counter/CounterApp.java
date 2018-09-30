package counter;

import javax.swing.JFrame;

public class CounterApp {

	public static void main(String[] args) {
		/*
		//Solution #1: define the view here
		JFrame  f = new JFrame("Counter");
		
		f.setSize(300, 300); //pixel
		
		//note if press X on the frame (window), it just hides the frame, not close it
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		f.setVisible(true);
		*/
		
		
		CounterModel model = new CounterModel();
		//OR
		//Solution #2: define the View class
		CounterView view = new CounterView();
		
		CounterControl control = new CounterControl(model, view);
	}

}
