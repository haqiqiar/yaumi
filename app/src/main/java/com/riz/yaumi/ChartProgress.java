package com.riz.yaumi;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class ChartProgress extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_progress);

        if(findViewById(R.id.frameFragmentContainer) != null){
            if(savedInstanceState != null)
                return;
            ChartProgressFragment newChart = new ChartProgressFragment();

            getSupportFragmentManager().beginTransaction().add(R.id.frameFragmentContainer,newChart).commit();
        }
    }

}
