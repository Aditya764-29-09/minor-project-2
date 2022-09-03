
	 
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
import android.widget.TextView;

public class menu_activity extends Activity {

	
	private View __bg__menu_ek2;
	private ImageView union_ek7;
	private ImageView union_ek8;
	private ImageView union_ek9;
	private ImageView subtract_ek3;
	private View ellipse_3_ek3;
	private View ellipse_4_ek3;
	private View rectangle_14;
	private TextView faqs_ek1;
	private View rectangle_17;
	private TextView mr_x_ek1;
	private View rectangle_18;
	private TextView your_safe_space_ek1;
	private View rectangle_16;
	private TextView the_brains_ek1;
	private View rectangle_15;
	private TextView talent_hub;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);

		
		__bg__menu_ek2 = (View) findViewById(R.id.__bg__menu_ek2);
		union_ek7 = (ImageView) findViewById(R.id.union_ek7);
		union_ek8 = (ImageView) findViewById(R.id.union_ek8);
		union_ek9 = (ImageView) findViewById(R.id.union_ek9);
		subtract_ek3 = (ImageView) findViewById(R.id.subtract_ek3);
		ellipse_3_ek3 = (View) findViewById(R.id.ellipse_3_ek3);
		ellipse_4_ek3 = (View) findViewById(R.id.ellipse_4_ek3);
		rectangle_14 = (View) findViewById(R.id.rectangle_14);
		faqs_ek1 = (TextView) findViewById(R.id.faqs_ek1);
		rectangle_17 = (View) findViewById(R.id.rectangle_17);
		mr_x_ek1 = (TextView) findViewById(R.id.mr_x_ek1);
		rectangle_18 = (View) findViewById(R.id.rectangle_18);
		your_safe_space_ek1 = (TextView) findViewById(R.id.your_safe_space_ek1);
		rectangle_16 = (View) findViewById(R.id.rectangle_16);
		the_brains_ek1 = (TextView) findViewById(R.id.the_brains_ek1);
		rectangle_15 = (View) findViewById(R.id.rectangle_15);
		talent_hub = (TextView) findViewById(R.id.talent_hub);
	
		
		__bg__menu_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), mr_x_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	