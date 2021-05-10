package sg.edu.rp.c346.id20014518.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb;
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb = findViewById(R.id.checkBoxDiscount);
        btn = findViewById(R.id.buttonCheck);
        tv = findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MainActivity", "Inside onClick");
                Toast.makeText(MainActivity.this,
                        "Button Click",
                        Toast.LENGTH_LONG).show();
                if(cb.isChecked()){
                    double pay = calcPay(100, 20);
                    tv.setText("The discount is given. You need to pay $" + pay);
                }
                else{
                    double pay = calcPay(100, 0);
                    tv.setText("The discount is not given. You need to pay $" + pay);
                }
            }
        });
    }
    private double calcPay(double price, double discount){
        double pay = price * (1 -discount/100);
        return pay;
    }
}