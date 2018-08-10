package com.example.ekint.emerson;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toolbar;

public class MainActivity extends BaseActivity {

    private FloatingActionButton myFAB;
    private EditText etOrderNumber;
    private static int orderNumber;

//    private final String APP_NAME = getString(R.string.app_name);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activateToolbar(false, getString(R.string.app_name));

        myFAB = (FloatingActionButton) findViewById(R.id.fabMain);
        etOrderNumber = (EditText) findViewById(R.id.etOrderNumber);

        View.OnClickListener fabListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    orderNumber = Integer.parseInt(etOrderNumber.getText().toString());
                } catch (NumberFormatException e){ }

                Intent intent = new Intent(MainActivity.this, TaskOneActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.enter, R.anim.exit);
            }
        };

        myFAB.setOnClickListener(fabListener);
    }
}
