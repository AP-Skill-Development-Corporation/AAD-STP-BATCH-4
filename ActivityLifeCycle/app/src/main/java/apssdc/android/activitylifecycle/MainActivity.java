package apssdc.android.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*1. The following message on log will be displayed on the
        * info section of the android studio's logcat.
        * 2. The following message gets displayed only when the onCreate()
        * method is invoked.*/
        Log.i("MainActivity", "onCreate() method is executed");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity", "onStart() method is executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity", "onResume() method is executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity", "onPause() method is executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", "onStop() method is executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity", "onDestroy() method is executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity", "onRestart() method is executed");
    }
}