package com.example.timepicker2;

import com.android.datetimepicker.time.TimePickerDialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View;
import android.app.DialogFragment;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
    }
    public void onButtonClicked(View v){
    	TimePickerDialog newFragment = new TimePickerDialog();
    	 newFragment.show(getFragmentManager(),"TimePicker");
    	}
}
