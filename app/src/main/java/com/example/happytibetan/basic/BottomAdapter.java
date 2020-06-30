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

public class BottomAdapter extends RecyclerView.Adapter<BottomAdapter.BottomAdapterViewHolder> {
    private Context mContext;
    public BottomAdapter(Context context){
        this.mContext = context;
    }
    @NonNull
    @Override
    public BottomAdapter.BottomAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BottomAdapterViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_basicgrid_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull BottomAdapter.BottomAdapterViewHolder holder, int position) {
        //holder.textView.setText("bottom");
        switch (position){
            case 0:
                holder.imageView.setImageResource(R.drawable.yav);
                holder.textView.setText("yav");
                break;
            case 1:
                holder.imageView.setImageResource(R.drawable.rav);
                holder.textView.setText("rav");
                break;
            case 2:
                holder.imageView.setImageResource(R.drawable.lav);
                holder.textView.setText("lav");
                break;
            case 3:
                holder.imageView.setImageResource(R.drawable.wav);
                holder.textView.setText("wav");
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    class BottomAdapterViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView;
        public BottomAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv);
            textView = itemView.findViewById(R.id.tv);
        }
    }
}
