package com.example.ziyi.holloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "LIFTCYCLE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "(1) onCreate()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "(5) onStop()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "(3) onResume()");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "(2) onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "(4) onRestart()");
    }
}
