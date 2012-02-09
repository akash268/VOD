package com.infy.cablevision.vod;

import com.infy.cablevision.vod.R.id;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ToggleButton;

public class MainMenu extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu);
		findViewById(R.id.toggle).setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				ToggleButton t = (ToggleButton) v;
				if (!t.isChecked()) {
					findViewById(R.id.linearLayout1).setVisibility(View.GONE);
				} else {
					findViewById(R.id.linearLayout1)
							.setVisibility(View.VISIBLE);
				}

			}
		});
	}
}
