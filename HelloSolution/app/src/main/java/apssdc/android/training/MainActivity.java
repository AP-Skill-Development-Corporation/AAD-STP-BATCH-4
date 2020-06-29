package apssdc.android.training;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button decrement,increment;
TextView tv;
int c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        increment=findViewById(R.id.count_plus);
        decrement=findViewById(R.id.count_neg);

        tv=findViewById(R.id.text_view);
        if(savedInstanceState!=null && savedInstanceState.containsKey("COUNT"))
        {
            c = savedInstanceState.getInt("COUNT");
            tv.setText(""+c);
        }
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c++;
                tv.setText(""+c);
                Log.i("msg",""+tv);
            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c--;
                tv.setText(""+c);
                Log.i("msg",""+tv);

            }
        });
    }


    public void toast(View view) {
        Toast.makeText(this,"Value is:  "+c,Toast.LENGTH_SHORT).show();
    }

    /*This method will save all the values that you want to save
    * for the new activity that arrives after the configuration change
    * (Orientation change) of the Activity*/
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("COUNT",c);
    }
}