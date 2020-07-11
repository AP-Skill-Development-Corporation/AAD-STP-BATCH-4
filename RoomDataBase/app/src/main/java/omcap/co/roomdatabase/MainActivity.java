package omcap.co.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
EditText name,emai;
Button button_inset;
TextView tv;
StudentDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.use_name);
        emai=findViewById(R.id.use_email);
        button_inset=findViewById(R.id.inset);
        tv=findViewById(R.id.text_view);
        db= Room.databaseBuilder(this,StudentDatabase.class,"apssdc")
                .allowMainThreadQueries().build();
        button_inset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sname=name.getText().toString();
                String semai=emai.getText().toString();
                StudentEntity sEntity=new StudentEntity(sname,semai);
                db.studentDao().InsetData(sEntity);
                Toast.makeText(MainActivity.this, "Inset Data", Toast.LENGTH_SHORT).show();
                getData();
            }
        });

    }
    private void getData(){
        List<StudentEntity> studentEntities=db.studentDao().getAll();
        for (int i=0;i<studentEntities.size();i++){
            tv.append(" "+studentEntities.get(i).getId());
            tv.append("   "+studentEntities.get(i).getName());
            tv.append("   "+studentEntities.get(i).getEmail());
            tv.append("\n");
        }

    }
}