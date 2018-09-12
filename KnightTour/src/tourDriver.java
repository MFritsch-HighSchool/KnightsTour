import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class tourDriver {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		List<String> optionList = new ArrayList<String>();
		optionList.add("Beginner");
		optionList.add("Intermediate");
		optionList.add("Advanced");
		Object[] options = optionList.toArray();
		Object value = JOptionPane.showInputDialog(null, "How hard would you like your game?", "input box", 0, null, options, 0);
		if(value.equals("Beginner")){
			x = 6;
			y = 6;
		}
		else if(value.equals("Intermediate")){
			x = 8;
			y = 8;	
		}
		else if(value.equals("Advanced")){
			x = 12;
			y = 12;
		}
		new KnightTour(x, y).show();
	}
}
