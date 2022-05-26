package com.example.githubpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Once upon a time, there lived a bear.");

        int bob = 0;
        for(int i=0; i<5; i++){
            bob += 2;
        }
        System.out.println(bob);

        System.out.println("ahhhhh");
        for(int i=0; i<2; i++){
            i++;
        }


        System.out.println("rigeeufbwefoiwoe");
    }
}