package com.example.gcdandlcmcalci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    int i, gcd, val_01, val_02, GCD, LCM;
    String str_01, str_02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.calc);
        final EditText et1  = findViewById(R.id.editText1);
        final EditText et2  = findViewById(R.id.editText2);
        final TextView tv1  = findViewById(R.id.textView4);
        final TextView tv2  = findViewById(R.id.textView6);



        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                str_01 = et1.getText().toString();
                str_02 = et2.getText().toString();
                val_01 = Integer.parseInt(str_01);
                val_02 = Integer.parseInt(str_02);
                GCD = GCD(val_01, val_02);
                LCM = (val_01 * val_02)/GCD;
                tv1.setText(GCD+"");
                tv2.setText(LCM+"");

            }
        });
    }

    public int GCD(int a, int b)
    {
        Log.i("GCD Method", ":");
        for(i=1; i <= a && i <= b; ++i)
        {
            // Checks if i is factor of both integers
            if(a%i == 0 && b%i == 0)
                gcd = i;
        }
        Log.i("GCD is: ","");
        return gcd;
    }


}
