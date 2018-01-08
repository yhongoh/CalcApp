package jp.techacademy.hongou.yuka.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }

    /*onClickで入力値（値1、値2、ボタンID)を渡して次画面に遷移
    button1:+
    button2:-
    button3:×
    button4:÷
    */

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        float value1 = Float.valueOf(editText1.getText().toString());
        intent.putExtra("VALUE1", value1);

        EditText editText2 = (EditText) findViewById(R.id.editText2);
        float value2 = Float.valueOf(editText2.getText().toString());
        intent.putExtra("VALUE2", value2);

        if (v.getId() == R.id.button1) {
            intent.putExtra("VALUE3", 1);
        } else if (v.getId() == R.id.button2) {
            intent.putExtra("VALUE3", 2);
        } else if (v.getId() == R.id.button3) {
            intent.putExtra("VALUE3", 3);
        } else if (v.getId() == R.id.button4) {
            intent.putExtra("VALUE3", 4);
        }

        startActivity(intent);
    }
}