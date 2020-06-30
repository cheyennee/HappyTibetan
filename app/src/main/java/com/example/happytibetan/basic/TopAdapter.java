package com.example.happytibetan.basic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.happytibetan.R;

public class TopAdapter extends RecyclerView.Adapter<TopAdapter.TopAdapterViewHolder> {
    private Context mContext;
    public TopAdapter(Context context){
        this.mContext = context;
    }
    @NonNull
    @Override
    public TopAdapter.TopAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TopAdapterViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_basicgrid_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull TopAdapter.TopAdapterViewHolder holder, int position) {
        //holder.textView.setText("top");
        switch (position){
            case 0:
                holder.imageView.setImageResource(R.drawable.ngav);
                holder.textView.setText("ngav");
                break;
            case 1:
                holder.imageView.setImageResource(R.drawable.lav);
                holder.textView.setText("lav");
                break;
            case 2:
                holder.imageView.setImageResource(R.drawable.saf);
                holder.textView.setText("saf");
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    class TopAdapterViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView;
        public TopAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv);
            textView = itemView.findViewById(R.id.tv);
        }
    }
}
