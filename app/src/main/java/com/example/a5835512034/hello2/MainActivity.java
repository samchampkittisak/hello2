package com.example.a5835512034.hello2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        Button btnB1 = new Button(this);
        btnB1.setText("Click Me");
        btnB1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
            }
        });
        layout.addView(btnB1);
        setContentView(layout);


    }
}
