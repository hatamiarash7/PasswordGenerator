package ir.hatamiarash.passwordgenerator.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ir.hatamiarash.passwordgenerator.tutorial.TutorialActivity;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * @author Karola Marky
 * @version 20161022
 */

public class SplashActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Intent mainIntent = new Intent(SplashActivity.this, TutorialActivity.class);
		SplashActivity.this.startActivity(mainIntent);
		SplashActivity.this.finish();
		
	}
	
	@Override
	protected void attachBaseContext(Context newBase) {
		super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
	}
}
