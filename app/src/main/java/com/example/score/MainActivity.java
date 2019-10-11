package com.example.score;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(this);

        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);

        Button btn4 = findViewById(R.id.btn4);
        btn3.setOnClickListener(this);

        TextView text1 = findViewById(R.id.textView1);
        TextView text2 = findViewById(R.id.textView2);

    }

    @Override
    public void onClick(View view) {
        TextView textView2 = findViewById(R.id.textView2);
        String str = textView2.getText()+"";
        int num = Integer.parseInt(str);
        switch (view.getId())
        {
            case R.id.btn1:
                num = num +3;
                textView2.setText(num+"");
                break;
            case R.id.btn2:
                num = num +2;
                textView2.setText(num+"");
                break;
            case R.id.btn3:
                num = num +1;
                textView2.setText(num+"");
                break;
            case R.id.btn4:
                num = 0;
                textView2.setText(num+"");
                break;
            default:
                break;
        }
    }
}
