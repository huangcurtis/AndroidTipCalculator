package com.example.androidtipcalculator;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        findViewById(R.id.btn10).setOnClickListener(new OnClickListener(){
            public void onClick(View arg0) {
            	EditText et = (EditText) findViewById(R.id.editText1);
            	TextView tv = (TextView) findViewById(R.id.textView1);
            	tv.setText(calculateTip(et.getText().toString(), 0.1f));
    	    }
        });
        
        findViewById(R.id.btn15).setOnClickListener(new OnClickListener(){
            public void onClick(View arg0) {
            	EditText et = (EditText) findViewById(R.id.editText1);
            	TextView tv = (TextView) findViewById(R.id.textView1);
            	tv.setText(calculateTip(et.getText().toString(), 0.15f));
    	    }
        });
        
        findViewById(R.id.btn20).setOnClickListener(new OnClickListener(){
            public void onClick(View arg0) {
            	EditText et = (EditText) findViewById(R.id.editText1);
            	TextView tv = (TextView) findViewById(R.id.textView1);
            	tv.setText(calculateTip(et.getText().toString(), 0.2f));
    	    }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @SuppressLint("DefaultLocale") private String calculateTip(String input, float percentage) {
    	try {
    		float value = Float.valueOf(input);
    		return String.format("Tip is: $%.2f", value * percentage);
    	} catch (NumberFormatException e) {
    		return String.format("Invalid input amount: %s", input);
    	}
    }
}
