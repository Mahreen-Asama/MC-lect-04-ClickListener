package com.example.lect4_clicklinstener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;
    TextView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=findViewById(R.id.button);
        v=findViewById(R.id.textView1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v.setText(R.string.hello);
            }
        });
    }
}