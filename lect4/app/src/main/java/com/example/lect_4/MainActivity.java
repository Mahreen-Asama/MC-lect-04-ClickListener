package com.example.lect_4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b,b2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int v=12;
        b2.setId(v);
        b2.setText("aoa");
        b2.setWidth(30);
        b2.setHeight(50);

        b=findViewById(R.id.button4);
        tv=findViewById(R.id.textView);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(R.string.hello);
            }
        });
    }

    public void writeText(View view) {
        tv.setText("aoa");
    }
}
