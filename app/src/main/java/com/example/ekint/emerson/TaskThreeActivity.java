package com.example.ekint.emerson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class TaskThreeActivity extends BaseActivity {

    private static double estimatedQty;
    private static double actualQty;
    private EditText etEstimatedQty;
    private EditText etActualQty;
    private CheckBox checkBoxThree;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_three);

        activateToolbar(true, getString(R.string.app_name));

        etEstimatedQty = (EditText) findViewById(R.id.etEstimatedQtyThree);
        etActualQty = (EditText) findViewById(R.id.etActualQtyThree);
        nextButton = (Button) findViewById(R.id.buttonNextThree);
        checkBoxThree = (CheckBox) findViewById(R.id.cbCheckboxThree);

        View.OnClickListener nextClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    estimatedQty = Double.parseDouble(etEstimatedQty.getText().toString());
                    actualQty = Double.parseDouble(etActualQty.getText().toString());
                } catch (NumberFormatException e){ }

                Intent intentThree = new Intent(TaskThreeActivity.this, CompleteActivity.class);
                if(checkBoxThree.isChecked()){
                    startActivity(intentThree);
                    overridePendingTransition(R.anim.enter, R.anim.exit);
                } else {
                    Toast.makeText(TaskThreeActivity.this, "Click checkbox to confirm completion", Toast.LENGTH_LONG).show();
                }
            }
        };

        nextButton.setOnClickListener(nextClickListener);
    }
}
