package apssdc.android.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_data;
    Button next_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_data=findViewById(R.id.user_et_text);
        next_button=findViewById(R.id.bt_next);
        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String s=et_data.getText().toString();
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("android",s);
                startActivity(i);
            }
        });
    }
}