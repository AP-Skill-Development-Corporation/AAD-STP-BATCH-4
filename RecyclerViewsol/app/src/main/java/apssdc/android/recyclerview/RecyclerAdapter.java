package apssdc.android.recyclerview;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
MainActivity context;
int img[];
String name[];
    public RecyclerAdapter(MainActivity mainActivity, int[] image, String[] data) {
        this.context=mainActivity;
        this.img=image;
        this.name=data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(context).inflate(R.layout.onerow,parent,
                false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
      holder.onerow_img.setImageResource(img[position]);
      holder.onerow_text.setText(name[position]);
    }
    @Override
    public int getItemCount() {
        return img.length;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView onerow_img;
        TextView onerow_text;
        CardView cd;

        public MyViewHolder(@NonNull final View itemView) {
            super(itemView);
            onerow_img=itemView.findViewById(R.id.image_view);
            onerow_text=itemView.findViewById(R.id.tex_view);
            cd=itemView.findViewById(R.id.card_view);
            cd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String s=name[getAdapterPosition()];
                    Intent intent=new Intent(context,MainActivity2.class);
                    intent.putExtra("key",s);
                    Log.i("java",s);
                    context.startActivity(intent);
                }
            });
        }
    }
}
