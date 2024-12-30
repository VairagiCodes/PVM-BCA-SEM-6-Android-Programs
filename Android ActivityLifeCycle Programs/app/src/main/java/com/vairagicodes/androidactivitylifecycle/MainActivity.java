package com.vairagicodes.androidactivitylifecycle;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Log.d("Activity LifeCycle","This is one create");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity LifeCycle","This is one start");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity LifeCycle","This is one Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity LifeCycle","This is one Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity LifeCycle","This is one stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity LifeCycle","This is one Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity LifeCycle","This is one Destroy");
    }
}