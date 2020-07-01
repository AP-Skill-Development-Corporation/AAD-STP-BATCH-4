package apssdc.android.menuandpickers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.row,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.setting:
                Toast.makeText(this, "Your select Setting option", Toast.LENGTH_SHORT).show();
                break;
            case R.id.about:
                Toast.makeText(this, "Your select about option", Toast.LENGTH_SHORT).show();
                break;
            case R.id.help:
                Toast.makeText(this, "Your select help option", Toast.LENGTH_SHORT).show();
                break;
            case R.id.info:
                Toast.makeText(this, "Your select info option", Toast.LENGTH_SHORT).show();
                break;
            case R.id.status:
                Toast.makeText(this, "Your select statu option", Toast.LENGTH_SHORT).show();
                break;
            case R.id.logout:
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setTitle("Do You want exit the Game");
                builder.setMessage("Are you sure.......!!!!!!!!!!!!");
                builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(99);
                    }

                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface apssdc, int which) {
                        apssdc.dismiss();
                    }
                });

                builder.show();




        }

        return super.onOptionsItemSelected(item);
    }
}