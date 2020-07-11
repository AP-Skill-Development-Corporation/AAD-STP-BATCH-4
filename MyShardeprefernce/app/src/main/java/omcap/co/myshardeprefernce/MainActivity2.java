package omcap.co.myshardeprefernce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
EditText et_name,et_password;
Button login;
SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et_name=findViewById(R.id.use);
        et_password=findViewById(R.id.password);
        login=findViewById(R.id.signIN);
        preferences=getSharedPreferences("apssdc",MODE_PRIVATE);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_given_name=et_name.getText().toString();
                String user_given_password=et_password.getText().toString();
                String reg_given_name=preferences.getString("name","");
                String reg_given_password=preferences.getString("password","");
                if (user_given_name.equals(reg_given_name) && user_given_password.equals(reg_given_password)){
                    Toast.makeText(MainActivity2.this, "Use login Sucessfull", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity2.this, "wrong user name or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}