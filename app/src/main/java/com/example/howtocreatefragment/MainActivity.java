package com.example.howtocreatefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.howtocreatefragment.Fragment.ChatFragment;
import com.example.howtocreatefragment.Fragment.StatusFragment;
import com.example.howtocreatefragment.Fragment.StudentFragment;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3;
    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.buttion1);
        btn2=findViewById(R.id.buttion2);
        btn3=findViewById(R.id.buttion3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.master,new ChatFragment()).commit();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.master,new StudentFragment()).commit();

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.master,new StatusFragment()).commit();
            }
        });
    }
}