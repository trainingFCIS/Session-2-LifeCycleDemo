package com.mahmoud.mohammed.lifecycletest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showCustomToast("OnCreate");

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        showCustomToast("OnDestroy");


    }

    @Override
    protected void onStart() {
        super.onStart();
        showCustomToast("OnStart");


    }

    @Override
    protected void onStop() {
        super.onStop();
        showCustomToast("OnStop");

    }

    @Override
    protected void onResume() {
        super.onResume();
        showCustomToast("OnResume");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showCustomToast("OnRestart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        showCustomToast("OnPause");

    }
    private void showCustomToast(String Message){

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast,
                (ViewGroup) findViewById(R.id.toast_layout_root));
        TextView text = (TextView) layout.findViewById(R.id.text);

        text.setText(Message);
        text.setTextColor(Color.BLUE);
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

    }



}
