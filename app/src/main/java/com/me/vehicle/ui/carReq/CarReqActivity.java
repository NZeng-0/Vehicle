package com.me.vehicle.ui.carReq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.me.vehicle.R;

public class CarReqActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_req);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, CarReqFragment.newInstance())
                    .commitNow();
        }
    }
}