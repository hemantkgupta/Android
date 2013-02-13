package com.hkg.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class TestListViewActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ListView listView = (ListView) findViewById(R.id.mylist);
        String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
            	"Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
            	"Linux", "OS/2" };
        
        listView.setOnItemClickListener(new OnItemClickListener() {
        	
        	public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        		Toast.makeText(getApplicationContext(), "Click ListItem Number " + position, Toast.LENGTH_LONG).show();
        	}
        });
        
        MySimpleArrayAdapter adapter = new MySimpleArrayAdapter(this, values);
        listView.setAdapter(adapter);
    }
}