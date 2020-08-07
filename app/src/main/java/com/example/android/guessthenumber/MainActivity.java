package com.example.android.guessthenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    static int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random r = new Random();
        result = r.nextInt(20-1) + 1;
    }

    public void makeToast(String toast){
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }

    public void checkNumber(View view){
        EditText editText = (EditText) findViewById(R.id.number);
        int temp = Integer.parseInt(editText.getText().toString());

        if(result==temp){
            makeToast("You Guessed it correctly! Try again!");
            Random r = new Random();
            result = r.nextInt(20-1) + 1;
        }
        else if(result>temp){
            makeToast("Higher!");
        }
        else
        {
            makeToast("Lower!");
        }


    }
}
