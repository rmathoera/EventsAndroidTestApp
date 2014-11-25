package com.serendipity.page.events;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

@SuppressWarnings("unused")
public class EventsFromFacebookPage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Epic 1 : open start page
		SD_open_start_page();
		// Epic 2 : events page
		SD_events_page();
		// Epic 3 : event planner information
		SD_event_planner_information();
		// Epic 4 : disclaimer
		SD_disclaimer();

		// refreshFormFeed(); // trigger will fill object first time, when
		// starting
		// application
	}

	private void SD_events_page() {
		setContentView(R.layout.activity_events_from_facebook_page);
	}

	private void SD_open_start_page() {
		// setContentView(R.layout.eventpage02);
		setContentView(R.layout.eventpage02);
	}

	private void SD_event_planner_information() {
		// TODO Auto-generated method stub
		setContentView(R.layout.event_planner_information);
	}

	private void SD_disclaimer() {
		// TODO Auto-generated method stub   
		setContentView(R.layout.disclaimer);
	}

	// when refresh of screens takes places the following (sub)actions need to
	// take place
	protected void onRefresh() {
		refreshFormFeed(); // get refreshed / new data (UPDATE)
	}

	// read tags from xml or rss feed and fill pre-defined fields in.
	private void refreshFormFeed() {
	}

	// if user swipes to left what will happen ???
	// if event page is open then get next upcoming event
	private void onSwipeLeft() {
	}
	// if user swipes to right what will happen ???
	// if event page is open then get previous upcoming event, 1] don't show older events than today
	private void onSwipeRight() {
	}

	private void getInformationFromFacebookEvent() {
	
	}
}
