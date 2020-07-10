package apssdc.android.broadcastrx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    PowerReceiver powerReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the Power Receiver


        imageView = findViewById(R.id.imageView);

        powerReceiver = new PowerReceiver(imageView);

        // Create an IntentFilter Object to tell the broadcast receiver
        // about for which particular broadcasts we are waiting.
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Intent.ACTION_POWER_CONNECTED);
        intentFilter.addAction(Intent.ACTION_POWER_DISCONNECTED);

        //Register your broadcast
        this.registerReceiver(powerReceiver,intentFilter);

    }

    /*
    * - Registering your receiver (Whichever the component that waits for the Broadcast)
    *     - Static Way (Using AndroidManifest.xml)
    *     - Dynamically registering your broadcast (JAVA CODE)*/
}