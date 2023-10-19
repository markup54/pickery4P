package pl.zabrze.zs10.timepickerdatepicker4p;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
DatePicker datePickert;
TimePicker timePicker;
Button button;
TextView textView;
TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePickert = findViewById(R.id.datePicker);
        timePicker = findViewById(R.id.timePicker);
        button = findViewById(R.id.buttonDatePicker);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int dzien = datePickert.getDayOfMonth();
                        int miesiac = datePickert.getMonth() +1;
                        int rok = datePickert.getYear();
                        textView.setText("Dzień: "+dzien+" miesiąc "+miesiac+"rok: "+rok);
                        int minuty = timePicker.getMinute();
                        int godziny = timePicker.getHour();
                        textView2.setText(String.format("%d:%02d",godziny,minuty));
                    }
                }
        );
    }

    /*
RadioButton radioButtonCzerwony;
RadioButton radioButtonZielony;
Button buttonKlikany;
Button buttonKolor;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioButtonCzerwony = findViewById(R.id.radioButton);
        radioButtonZielony = findViewById(R.id.radioButton2);
        buttonKlikany = findViewById(R.id.button2);
        buttonKolor = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        buttonKlikany.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(radioButtonCzerwony.isChecked()){
                            buttonKolor.setBackgroundColor(getColor(R.color.czerwony));
                            textView.setBackgroundColor(Color.RED);
                        }
                    }
                }
        );
    }*/
}