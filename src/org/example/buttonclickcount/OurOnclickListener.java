package org.example.buttonclickcount;

import android.view.View;
import android.view.View.OnClickListener;

public class OurOnclickListener implements OnClickListener {
	
	MainActivity caller;
	private int count;
	
	public OurOnclickListener(MainActivity activity) {
		this.caller = activity;
		this.count = 0;
	}
	
	public void onClick(View view) {
		count = count + 1;
		String outputString = "The button has been clicked " + count + " Time";
		if(count != 1) {
			outputString += "s";
		} 
		//String tempResult = Integer.toString(count);
		caller.theTextView.setText(outputString);
	}
}
