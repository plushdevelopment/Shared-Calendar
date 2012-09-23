package com.jaywalker.sharedcalender.model;

import java.util.Date;

import android.graphics.Color;
import android.location.Location;
import android.text.Editable;

public class Event {
	public Date from;
	public Date to;
	public  String title;
	public Color code;
	public String description;
	public Boolean allDay;
	public Location location;
    
	public Event() {
		// TODO Auto-generated constructor stub
	}

}
