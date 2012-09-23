package com.jaywalker.sharedcalender.activities;

import com.jaywalker.sharedcalender.R;
import com.jaywalker.sharedcalender.model.Event;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;

public class NewEventActivity extends Activity {
	
	Event event = new Event();
	
	EditText titleEditText;
	EditText fromDateEditText;
	EditText toDateEditText;
	EditText descriptionEditText;
	CheckBox allDayCheckBox;
	EditText locationEditText;
	Button saveButton;

	/* (non-Javadoc)
	 Goto Source->Override/Implement methods menu up top to add this to other activities
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// Calling super Calls "Activity"'s onCreate method
		super.onCreate(savedInstanceState);
		// This method just associates the activity_new_event.xml file with NewEventActivity
		this.setContentView(R.layout.activity_new_event);
		
		// The (EditText) word is in parentheses because we have to
		//  "Type Cast" the View the findViewById gives us
		this.titleEditText = (EditText)this.findViewById(R.id.titleEditText);
		this.fromDateEditText = (EditText)this.findViewById(R.id.fromDateEditText);
		this.toDateEditText = (EditText)this.findViewById(R.id.toDateEditText);
		this.descriptionEditText = (EditText)this.findViewById(R.id.descriptionEditText);
		this.allDayCheckBox = (CheckBox)this.findViewById(R.id.allDayCheckBox);
		this.allDayCheckBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				event.allDay = isChecked;	
			}
		});
		
		this.locationEditText = (EditText)this.findViewById(R.id.locationEditText);
		this.saveButton = (Button)this.findViewById(R.id.saveButton);
		this.saveButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			saveEvent();	
			}
		});
	}

	public void saveEvent() {
		this.event.title = titleEditText.getText().toString();
		//this.event.from = fromDateEditText.getText().to
		//this.event.to = toDateEditText.getText().toString();
		
		this.event.description = descriptionEditText.getText().toString();
	}
	
}


