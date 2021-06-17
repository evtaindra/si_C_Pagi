package com.evta.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter{

	public FragmentPagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int index) {
		  switch (index) {
	        case 0:
	            // Top Rated fragment activity
	            return new TopRatedFragment();
	        case 1:
	            // Games fragment activity
	            return new GamesFragment();
	        case 2:
	            // Movies fragment activity
	            return new MoviesFragment();
	        }	 
	        return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}
}
