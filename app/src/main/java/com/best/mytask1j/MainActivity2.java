package com.best.mytask1j;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {
    String TAG = MainActivity2.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getData();
    }

    void getData() {

        TextView txtbtn = findViewById(R.id.txtBtn2);
        String user = getIntent().getStringExtra("name");
        Log.d(TAG, user);
        txtbtn.setText(user);
    }
}