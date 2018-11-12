package com.example.user.emergencyapp;

import android.support.v4.app.FragmentActivity;
import com.example.user.emergencyapp.demos.DaumMapActivity;


public class DemoListItem {
	public final int titleId;
	public final int descriptionId;
	public final Class<? extends FragmentActivity> activity;

	public DemoListItem(int titleId, int descriptionId,
			Class<? extends FragmentActivity> activity) {
		this.titleId = titleId;
		this.descriptionId = descriptionId;
		this.activity = activity;
	}

	public static final DemoListItem[] DEMO_LIST_ITEMS = {
			new DemoListItem(R.string.location_demo_title,
					R.string.location_demo_desc, DaumMapActivity.class),
	};
}
