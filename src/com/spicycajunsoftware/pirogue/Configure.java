package com.spicycajunsoftware.pirogue;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Configure extends Activity {
	private static final int Exit_ID = Menu.FIRST;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	
	    setContentView(R.layout.configure);
	}
	
	 @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        super.onCreateOptionsMenu(menu);
	        MenuItem exit = menu.add(0, Exit_ID,0, R.string.menu_exit);
	        exit.setIcon(R.drawable.exit);
	        return true;
	    }

	    @Override
	    public boolean onMenuItemSelected(int featureId, MenuItem item) {
	        switch(item.getItemId()) {
	        case Exit_ID:
	        	finish();
	            return true;
	        }
	        
	        return super.onMenuItemSelected(featureId, item);
	    }
}
