package com.example.ekint.emerson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class TaskOneActivity extends BaseActivity {

    private static double estimatedQty;
    private static double actualQty;
    private EditText etEstimatedQty;
    private EditText etActualQty;
    private CheckBox checkBoxOne;
    private Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_one);

        activateToolbar(true, getString(R.string.app_name));

        etEstimatedQty = (EditText) findViewById(R.id.etEstimatedQtyOne);
        etActualQty = (EditText) findViewById(R.id.etActualQtyOne);
        nextButton = (Button) findViewById(R.id.buttonNextOne);
        checkBoxOne = (CheckBox) findViewById(R.id.cbCheckboxOne);

        View.OnClickListener nextClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    estimatedQty = Double.parseDouble(etEstimatedQty.getText().toString());
                    actualQty = Double.parseDouble(etActualQty.getText().toString());
                } catch (NumberFormatException e){ }

                Intent intentOne = new Intent(TaskOneActivity.this, TaskTwoActivity.class);
                if(checkBoxOne.isChecked()){
                    startActivity(intentOne);
                    overridePendingTransition(R.anim.enter, R.anim.exit);
                } else {
                    Toast.makeText(TaskOneActivity.this, "Click checkbox to confirm completion", Toast.LENGTH_LONG).show();
                }
            }
        };

        nextButton.setOnClickListener(nextClickListener);
    }
}
