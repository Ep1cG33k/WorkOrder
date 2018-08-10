package com.example.ekint.emerson;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

/**
 * BaseActivity is the main java parent class of all activities.
 * It contains the fields and methods that are common to all child activities.
 * @author ekint
 * @version 1.0
 */
public class BaseActivity extends AppCompatActivity {

    /**
     * Initializes top app bar for activity.
     * @param enableHome boolean value to enable back button on top toolbar
     * @see android.support.v7.widget.Toolbar
     */
    void activateToolbar(boolean enableHome, String text){
        ActionBar ab = getSupportActionBar();
        if(ab == null){
            android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.my_toolbar);

            if(toolbar != null){
                setSupportActionBar(toolbar);
                ab = getSupportActionBar();
                ab.setDisplayShowCustomEnabled(true);
                ab.setTitle(text);
            }

        }

        if(ab != null){
            ab.setDisplayHomeAsUpEnabled(enableHome);
            ab.setHomeButtonEnabled(enableHome);
        }
    }
}
