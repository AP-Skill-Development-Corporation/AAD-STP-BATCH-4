package apssdc.android.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
TextView tv;
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=findViewById(R.id.text_view);
        String s=getIntent().getStringExtra("Welcome "+"android");
        tv.setText(s);
        bt=findViewById(R.id.bt_next);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Back to First activity
                Intent i=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
/*
    *//*If you ever want to override the default functionality of the
    * backButton 
    * (To get the top activity to the foreground from the activity stack)*//*
    *//* Step-1 Override a Method called onBackPressed()*//*

    @Override
    public void onBackPressed() {
       *//* super.onBackPressed();*//*
        Toast.makeText(this, "You cannot go back ;-)", Toast.LENGTH_SHORT).show();
    }*/
}