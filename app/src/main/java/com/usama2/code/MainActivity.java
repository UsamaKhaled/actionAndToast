package com.usama2.code;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener{

    private int counter = 0;
    private RadioGroup count;
    private Button num;
    private TextView text;
    private TextView txtF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.txt);
        text.setText("");

        txtF = findViewById(R.id.txtFinale);


        num = findViewById(R.id.btn_num);
        num.setOnClickListener(this);

        count = findViewById(R.id.count);
        count.setOnCheckedChangeListener(this);



    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_num){
            if(text.getText() == "+"){
                counter++;
                Toast.makeText(this, "mlae",Toast.LENGTH_SHORT).show();
            }else{
                counter--;
                Toast t = new Toast(this);
                t.setGravity(Gravity.CENTER, 0, 0);
                View v2 = getLayoutInflater().from(this).inflate(R.layout.toast_custom_design, null, false);
                TextView message = v2.findViewById(R.id.message);
                message.setText("hhhhhhhhhhh");
                t.setView(v2);
                t.show();
            }
            txtF.setText(""+counter);
        }


    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        if(group.getId() == R.id.count){

            if(group.getId() == R.id.count){
                if(checkedId == R.id.inc){
                    text = findViewById(R.id.txt);
                    text.setText("+");
                }else{
                    text = findViewById(R.id.txt);
                    text.setText("-");
                }
            }
        }

    }
}
