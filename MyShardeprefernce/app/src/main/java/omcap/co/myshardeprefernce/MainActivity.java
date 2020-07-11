package omcap.co.myshardeprefernce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_name, et_email, et_password;
    Button bt_reg, bt_log;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name = findViewById(R.id.user_name);
        et_email = findViewById(R.id.user_eamil);
        et_password = findViewById(R.id.user_password);
        bt_reg = findViewById(R.id.reg);
        bt_log = findViewById(R.id.login);
        bt_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
        preferences = getSharedPreferences("apssdc", MODE_PRIVATE);
        bt_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u_name = et_name.getText().toString();
                String u_password = et_password.getText().toString();
                SharedPreferences.Editor editor = preferences.edit();
                if (u_name.equals("")){
                    Toast.makeText(MainActivity.this, "please enter user name", Toast.LENGTH_SHORT).show();
                }
                else if (u_password.equals("")){
                    Toast.makeText(MainActivity.this, "please enter password", Toast.LENGTH_SHORT).show();
                }
                else {
                    editor.putString("name", u_name);
                    editor.putString("password", u_password);
                    editor.apply();
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(i);
                }

            }
        });
    }
}