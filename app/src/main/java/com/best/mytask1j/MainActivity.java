package com.best.mytask1j;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getOpen();
            }
        });
    }

    void getOpen() {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("Name", "Alisher 27");
        startActivity(intent);
    }
}