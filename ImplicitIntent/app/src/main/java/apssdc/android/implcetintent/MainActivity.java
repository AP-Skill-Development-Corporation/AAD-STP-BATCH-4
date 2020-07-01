package apssdc.android.implcetintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText et;
Button dail,shasre,whats;
String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.et_text);
        dail=findViewById(R.id.bt_dail);
        shasre=findViewById(R.id.bt_share);
        whats=findViewById(R.id.bt_whatsapp);
        whats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=getPackageManager().
                        getLaunchIntentForPackage("com.whatsapp");
                startActivity(i);

            }
        });
        shasre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=et.getText().toString();
                ShareCompat.IntentBuilder.from(MainActivity.this)
                        .setType("text/plain")// type of data
                        .setChooserTitle("choose any one of this apps")
                        // chooser title
                        .setText(s)// set the text from edittext
                        .startChooser();
            }
        });
        dail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_DIAL);
                s=et.getText().toString();
                i.setData(Uri.parse("tel:"+s));
                //Toast.makeText(MainActivity.this, ""+s, Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}