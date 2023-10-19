package pl.zabrze.zs10.timepickerdatepicker4p;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
DatePicker datePickert;
TimePicker timePicker;
Button button;
Button buttonDialog;
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
        buttonDialog = findViewById(R.id.buttonKal);
        buttonDialog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Calendar calendar = Calendar.getInstance();
                        DatePickerDialog datePicker2 =
                        new DatePickerDialog(
                                MainActivity.this,
                                new DatePickerDialog.OnDateSetListener() {
                                    @Override
                                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                                        calendar.set(Calendar.DAY_OF_MONTH,i2);
                                        calendar.set(Calendar.MONTH,i1);
                                        calendar.set(Calendar.YEAR,i);
                                textView.setText(String.valueOf(calendar.get(Calendar.YEAR)));
                                    }
                                },2023,10,20

                        );
                        datePicker2.show();
                    }
                }
        );
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
        datePickert.setOnDateChangedListener(
                new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                        Toast.makeText(MainActivity.this, String.valueOf(i)+" "+String.valueOf(i1)+" "+String.valueOf(i2), Toast.LENGTH_SHORT).show();
                    }
                }
        );
        timePicker.setOnTimeChangedListener(
                new TimePicker.OnTimeChangedListener() {
                    @Override
                    public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                        Toast.makeText(MainActivity.this, String.valueOf(i)+" "+String.valueOf(i1), Toast.LENGTH_SHORT).show();
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