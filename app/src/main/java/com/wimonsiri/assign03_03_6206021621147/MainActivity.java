package com.wimonsiri.assign03_03_6206021621147;
//วิมลศิริ คำแดงใส 6206021621147

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText textPrefix , textName,  textAge , textBirthday ;
    private Button btnOk ;
    private RadioButton radioMan , radioWoman ;
    private CheckBox checkDraw , checkMusic , checkSwim , checkBook;
    private TextView result ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textPrefix = (EditText) findViewById(R.id.textPrefix);
        textName = (EditText) findViewById(R.id.textName);
        textAge = (EditText) findViewById(R.id.textAge);
        textBirthday = (EditText) findViewById(R.id.textBirthday);

        radioMan = (RadioButton) findViewById(R.id.radioMan);
        radioWoman = (RadioButton) findViewById(R.id.radioWoman);

        btnOk = (Button) findViewById(R.id.btnOk);
        btnOk.setOnClickListener(this);

        checkDraw = (CheckBox) findViewById(R.id.checkDraw);
        checkMusic = (CheckBox) findViewById(R.id.checkMusic);
        checkBook = (CheckBox) findViewById(R.id.checkBook);
        checkSwim = (CheckBox) findViewById(R.id.checkSwim);

        result = (TextView) findViewById(R.id.result);

    }

    @Override
    public void  onClick(View view){

        String message = "";
        message += textPrefix.getText().toString() + textName.getText().toString();
        message += "\nเพศ : " + (radioWoman.isChecked() ? "หญิง" : "") + (radioMan.isChecked() ? "ชาย" : "");
        message += "\n อายุ : " + textAge.getText().toString();
        message += "\n วันเดือนปีเกิด : " + textBirthday.getText().toString();
        message += "\n งานอดิเรก : " + (checkDraw.isChecked() ? "วาดรูป  " : "") + (checkMusic.isChecked() ? "เล่นดนตรี  " : "") +
                (checkSwim.isChecked() ? "ว่ายน้ำ  " : "") + (checkBook.isChecked() ? "อ่านหนังสือ  " : "");

        result.setText(message);



    }
}