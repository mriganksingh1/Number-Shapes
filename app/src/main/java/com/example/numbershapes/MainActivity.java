package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextTextPersonName);
    }

    public void checknumber(View view)
    {
        int num = Integer.parseInt(editText.getText().toString());
        boolean a = check_square(num);
        boolean b = check_triangular(num);
        String message = "";
        if(a==true && b==true)
        {
            message="The number is both triangular and square";
        }
        else if(a==true)
        {
            message="The number is square";
        }
        else if(b==true)
        {
            message="The number is triangular";
        }
        else
        {
            message="The number is neither triangular nor square";
        }
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }

    public boolean check_square(int num)
    {
        double a = Math.sqrt(num);
        int b = (int) Math.sqrt(num);
        if(a==b)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean check_triangular(int num)
    {
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            sum=sum+i;
            if(sum==num) {
                return true;
            }
        }
        return false;
    }
}