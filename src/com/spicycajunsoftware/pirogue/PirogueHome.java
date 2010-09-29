package com.spicycajunsoftware.pirogue;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Bundle;

public class PirogueHome extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
//        UiModeManager modeManager = (UiModeManager) getSystemService(Context.UI_MODE_SERVICE);
//        modeManager.enableCarMode(0);
    }
}