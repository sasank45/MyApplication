package com.example.sasankchaganti.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toast_message(View view){
       Toast myToast = Toast.makeText(this,"hello world!",Toast.LENGTH_SHORT);
       myToast.show();
    }

    public void counter(View view) {
        TextView showCountTextView = findViewById(R.id.textView);
        String counter_value = showCountTextView.getText().toString();
        Integer counterr = Integer.parseInt(counter_value);
        counterr++;
        showCountTextView.setText(counterr.toString());
    }
    private static final String TOTAL_COUNT​ = "total_count";

    public void Random_one(View view){
    Intent randomIntent = new Intent(this, Random.class);
    TextView showCountTextView = (TextView) findViewById(R.id.textView);
    String counter_value = showCountTextView.getText().toString();
    Integer counterr = Integer.parseInt(counter_value);
    randomIntent.putExtra(TOTAL_COUNT​, counterr);
    startActivity(randomIntent);
    }
}
