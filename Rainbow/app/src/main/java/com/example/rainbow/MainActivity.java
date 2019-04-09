/* RAINBOW APP
 *
 * This app changes the background color of the app by user buttons
 *
 * @author Ian Jarvis
 * @version 1.0 4/08/2019
 */

package com.example.rainbow;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.graphics.*;

public class MainActivity extends Activity 
{
	// Create background and buttons
	
	LinearLayout background;
	
	Button       redButton;
	Button       orangeButton;
	Button       yellowButton;
	Button       greenButton;
	Button       blueButton;
	Button       purpleButton;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		// Attach xml to background and buttons
		
		background   = findViewById(R.id.layout_background);
		
		redButton    = findViewById(R.id.red_button);
		orangeButton = findViewById(R.id.orange_button);
		yellowButton = findViewById(R.id.yellow_button);
		greenButton  = findViewById(R.id.green_button);
		blueButton   = findViewById(R.id.blue_button);
		purpleButton = findViewById(R.id.purple_button);
		
		// Set background color red
		redButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v)
			{
				background.setBackgroundColor(Color.RED); // red
			}
		});

		// Set background color orange
		orangeButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v)
			{
				background.setBackgroundColor(Color.argb(255,255,140,0)); // orange
			}
		});

		// Set background color yellow
		yellowButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v)
			{
				background.setBackgroundColor(Color.YELLOW); // yellow
			}
		});

		// Set background color green
		greenButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v)
			{
				background.setBackgroundColor(Color.GREEN); // green
			}
		});

		// Set background color blue
		blueButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v)
			{
				background.setBackgroundColor(Color.BLUE); // blue
			}
		});
			
		// Set background color purple
		purpleButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v)
			{
				background.setBackgroundColor(Color.MAGENTA); // purple
			}
		});
    }
}
