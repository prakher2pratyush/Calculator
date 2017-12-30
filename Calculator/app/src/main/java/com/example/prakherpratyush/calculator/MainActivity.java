package com.example.prakherpratyush.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button Add;
    Button Sub;
    Button Mul;
    Button Div;
    Button Equal;
    Button One;
    Button Two;
    Button Three;
    Button Four;
    Button Five;
    Button Six;
    Button Seven;
    Button Eight;
    Button Nine;
    Button Zero;
    Button Clear;
    EditText Text;
    int a;
    int T0;
    int T1;
    int T2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Text =  (EditText)findViewById(R.id.Text);
        Text.setText("0");
        Clear = (Button)findViewById(R.id.Clear);
        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T0 = Integer.parseInt(Text.getText().toString());
                T0 = T0/10;
                Text.setText(""+T0);
            }
        });

        One = (Button)findViewById(R.id.One);
        One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T0 = Integer.parseInt(Text.getText().toString());
                T0 = T0*10+1;
                Text.setText(""+T0);
            }
        });

        Two = (Button)findViewById(R.id.Two);
        Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T0 = Integer.parseInt(Text.getText().toString());
                T0 = T0*10+2;
                Text.setText(""+T0);
            }
        });

        Three = (Button)findViewById(R.id.Three);
        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T0 = Integer.parseInt(Text.getText().toString());
                T0 = T0*10+3;
                Text.setText(""+T0);
            }
        });

        Four = (Button)findViewById(R.id.Four);
        Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T0 = Integer.parseInt(Text.getText().toString());
                T0 = T0*10+4;
                Text.setText(""+T0);
            }
        });

        Five = (Button)findViewById(R.id.Five);
        Five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T0 = Integer.parseInt(Text.getText().toString());
                T0 = T0*10+5;
                Text.setText(""+T0);
            }
        });

        Six = (Button)findViewById(R.id.Six);
        Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T0 = Integer.parseInt(Text.getText().toString());
                T0 = T0*10+6;
                Text.setText(""+T0);
            }
        });

        Seven = (Button)findViewById(R.id.Seven);
        Seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T0 = Integer.parseInt(Text.getText().toString());
                T0 = T0*10+7;
                Text.setText(""+T0);
            }
        });

        Eight = (Button)findViewById(R.id.Eight);
        Eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T0 = Integer.parseInt(Text.getText().toString());
                T0 = T0*10+8;
                Text.setText(""+T0);
            }
        });

        Nine = (Button)findViewById(R.id.Nine);
        Nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T0 = Integer.parseInt(Text.getText().toString());
                T0 = T0*10+9;
                Text.setText(""+T0);
            }
        });

        Zero = (Button)findViewById(R.id.Zero);
        Zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T0 = Integer.parseInt(Text.getText().toString());
                T0 = T0*10;
                Text.setText(""+T0);
            }
        });


        Add = (Button)findViewById(R.id.Add);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T1 = Integer.parseInt(Text.getText().toString());
                a = 1;
                Text.setText("0");
            }
        });

        Sub = (Button)findViewById(R.id.Sub);
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T1 = Integer.parseInt(Text.getText().toString());
                a = 2;
                Text.setText("0");
            }
        });

        Mul = (Button)findViewById(R.id.Mul);
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T1 = Integer.parseInt(Text.getText().toString());
                a = 3;
                Text.setText("0");
            }
        });

        Div = (Button)findViewById(R.id.Div);
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T1 = Integer.parseInt(Text.getText().toString());
                a = 4;
                Text.setText("0");
            }
        });

        Equal = (Button)findViewById(R.id.Equal);
        Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T2 = Integer.parseInt(Text.getText().toString());
                if(a==1){
                    T1 = T1+T2;
                }
                if(a==2){
                    T1 = T1-T2;
                }
                if(a==3){
                    T1 = T1*T2;
                }
                if(a==4){
                    T1 = T1/T2;
                }
                Text.setText(T1+"");
            }
        });
    }
}
