package apssdc.android.covidapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends AppCompatActivity {
TextView text;
ProgressBar pg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.text_view);
        pg=findViewById(R.id.profress);
        Retrofit retrofit=new Retrofit.Builder().baseUrl("https://api.covid19api.com/")
                .addConverterFactory(ScalarsConverterFactory.create()).build();
        Covid19Interface service=retrofit.create(Covid19Interface.class);
        Call<String> data=service.getData();
        data.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Toast.makeText(MainActivity.this, ""+response.body(), Toast.LENGTH_SHORT).show();
                pg.setVisibility(View.GONE);
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Toast.makeText(MainActivity.this, "No data in this URL", Toast.LENGTH_SHORT).show();

            }
        });

    }
}