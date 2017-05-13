package com.example.androidfragmentsexample;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint("NewApi") 
public class FragmentFirst extends Fragment{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		//Inflate the layout for this fragment
		return inflater.inflate(
		R.layout.fragment_first, container, false);
		   
	}

}
