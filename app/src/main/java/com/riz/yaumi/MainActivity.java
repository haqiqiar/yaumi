package com.riz.yaumi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonView = (Button)findViewById(R.id.button);
        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ChartProgress.class);
                startActivity(intent);
            }
        });

    }

//    public void start(View view){
//        Intent intent = new Intent(this,ChartProgress1.class);
//        startActivity(intent);
//    }
}
