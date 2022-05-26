package com.example.githubpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        int bob = 0;
        for(int i=0; i<5; i++){
            bob += 2;
            i--;
        }


        System.out.println("ahhhhh");
        for(int i=0; i<2; i++){
            i+=2;
            int x= 4;
        }


        System.out.println("rigeeufbwefoiwoe");
    }
}