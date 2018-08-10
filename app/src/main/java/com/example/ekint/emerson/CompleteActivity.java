package com.example.ekint.emerson;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CompleteActivity extends BaseActivity {

    private FloatingActionButton myHomeFAB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete);

        activateToolbar(true, getString(R.string.app_name));

        myHomeFAB = (FloatingActionButton) findViewById(R.id.fabHome);
        View.OnClickListener fabHomeListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CompleteActivity.this, MainActivity.class);
                startActivity(intent);
            }
        };

        myHomeFAB.setOnClickListener(fabHomeListener);

    }
}
