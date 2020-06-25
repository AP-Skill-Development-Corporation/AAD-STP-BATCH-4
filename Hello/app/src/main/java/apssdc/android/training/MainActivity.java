package apssdc.android.training;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button count;
TextView tv;
int c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count=findViewById(R.id.count_button);
        tv=findViewById(R.id.text_view);
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c++;
                tv.setText(""+c);
                Log.i("msg",""+tv);
            }
        });
    }


    public void toast(View view) {
        Toast.makeText(this,"Value is:  "+c,Toast.LENGTH_SHORT).show();
    }
}