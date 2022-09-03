
	 
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

public class launch_screen_2__activity extends Activity {

	
	private View __bg__launch_screen_2__ek2;
	private ImageView union_ek3;
	private ImageView union_ek4;
	private ImageView saly_39_ek1;
	private ImageView vector;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private ImageView vector_ek4;
	private ImageView vector_ek5;
	private ImageView vector_ek6;
	private ImageView vector_ek7;
	private ImageView vector_ek8;
	private ImageView vector_ek9;
	private ImageView vector_ek10;
	private ImageView vector_ek11;
	private ImageView vector_ek12;
	private ImageView subtract_ek1;
	private View ellipse_3_ek1;
	private View ellipse_4_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.launch_screen_2_);

		
		__bg__launch_screen_2__ek2 = (View) findViewById(R.id.__bg__launch_screen_2__ek2);
		union_ek3 = (ImageView) findViewById(R.id.union_ek3);
		union_ek4 = (ImageView) findViewById(R.id.union_ek4);
		saly_39_ek1 = (ImageView) findViewById(R.id.saly_39_ek1);
		vector = (ImageView) findViewById(R.id.vector);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
		vector_ek3 = (ImageView) findViewById(R.id.vector_ek3);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
		vector_ek6 = (ImageView) findViewById(R.id.vector_ek6);
		vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);
		vector_ek8 = (ImageView) findViewById(R.id.vector_ek8);
		vector_ek9 = (ImageView) findViewById(R.id.vector_ek9);
		vector_ek10 = (ImageView) findViewById(R.id.vector_ek10);
		vector_ek11 = (ImageView) findViewById(R.id.vector_ek11);
		vector_ek12 = (ImageView) findViewById(R.id.vector_ek12);
		subtract_ek1 = (ImageView) findViewById(R.id.subtract_ek1);
		ellipse_3_ek1 = (View) findViewById(R.id.ellipse_3_ek1);
		ellipse_4_ek1 = (View) findViewById(R.id.ellipse_4_ek1);
	
		
		__bg__launch_screen_2__ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), opening_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	