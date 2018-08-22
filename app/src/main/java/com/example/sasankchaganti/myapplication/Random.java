package com.example.sasankchaganti.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Random extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        showRandomnumber();
    }
    private static final String TOTAL_COUNT​ = "total_count";
    public void showRandomnumber(){
        TextView randomView = (TextView) findViewById(R.id.textView);

        TextView headingView = findViewById(R.id.textView_head);

        int count = getIntent().getIntExtra(TOTAL_COUNT​, 0);

        Random random =  new  ​Random();
        int randomInt = 0;
        if ​(count>0){
            randomInt =  random.nextInt(count);
        }

        randomView.setText(Integer.toString(randomInt));

        headingView.setText(getString(R.string.random_heading​, count));
    }

    private int nextInt(int count) {

        return count;
    }
}
