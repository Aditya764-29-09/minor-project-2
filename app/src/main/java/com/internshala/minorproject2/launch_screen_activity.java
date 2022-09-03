
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		launch_screen
	 *	@date 		Saturday 03rd of September 2022 02:54:17 PM
	 *	@title 		Design
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.internshala.minorproject2;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.content.Intent;
import android.widget.ImageView;

public class launch_screen_activity extends Activity {

	
	private View __bg__launch_screen_ek2;
	private ImageView union;
	private ImageView union_ek2;
	private ImageView subtract;
	private View ellipse_3;
	private View ellipse_4;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.launch_screen);

		
		__bg__launch_screen_ek2 = (View) findViewById(R.id.__bg__launch_screen_ek2);
		union = (ImageView) findViewById(R.id.union);
		union_ek2 = (ImageView) findViewById(R.id.union_ek2);
		subtract = (ImageView) findViewById(R.id.subtract);
		ellipse_3 = (View) findViewById(R.id.ellipse_3);
		ellipse_4 = (View) findViewById(R.id.ellipse_4);
	
		
		__bg__launch_screen_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), launch_screen_2__activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	