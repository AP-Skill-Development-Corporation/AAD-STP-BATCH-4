package apssdc.android.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
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
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
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
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            onerow_img=itemView.findViewById(R.id.image_view);
            onerow_text=itemView.findViewById(R.id.tex_view);
        }
    }
}
