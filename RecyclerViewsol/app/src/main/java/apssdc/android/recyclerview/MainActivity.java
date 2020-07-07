package apssdc.android.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView rc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rc=findViewById(R.id.recycler_view);
        int image[]={R.drawable.alpha,R.drawable.beta,R.drawable.cupcake,R.drawable.donut,
                     R.drawable.eclair,R.drawable.froyo,R.drawable.gingerbread,R.drawable.honeycomb,
                     R.drawable.icecreamsandwich,R.drawable.jellybean,R.drawable.kitkat,
                     R.drawable.lollipop,R.drawable.marshmallow,R.drawable.nougat,
                     R.drawable.oreo,R.drawable.pie, R.drawable.q,R.drawable.r};

        String data[]={"Alpha","Beta","Cupcake","Dount","Eclair","Froyo","Gingerbread",
                        "Honeycomb","Icereamsandwich","JellyBean","KitKat","LOllipop","Marshmallow",
                        "Nougate","Oreo","Pie","Q","R"};
        RecyclerAdapter adapter=new RecyclerAdapter(this,image,data);
        rc.setAdapter(adapter);

        rc.setLayoutManager(new LinearLayoutManager(this));

    }
}