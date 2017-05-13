package com.example.androidfragmentsexample;

import android.os.Bundle;
import android.view.View;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
	 


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    @SuppressLint("NewApi") 
    public void selectFragment(View view) {
    
    	Fragment fragment;
    
    	if(view == findViewById(R.id.btn_Second)) {
    
    		fragment = new FragmentSecond();
    
    	}else {
    
    		fragment = new FragmentFirst();
    }
    
    FragmentManager fm = getFragmentManager();
    FragmentTransaction fragmentTransaction = fm.beginTransaction();
    fragmentTransaction.replace(R.id.fragment, fragment);
    fragmentTransaction.commit();
    
    }
    
}
