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

public class VowelAdapter extends RecyclerView.Adapter<VowelAdapter.VowelAdapterViewHolder> {

    private Context mContext;
    public VowelAdapter(Context context){
        this.mContext = context;
    }
    @NonNull
    @Override
    public VowelAdapter.VowelAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VowelAdapterViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_basicgrid_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull VowelAdapter.VowelAdapterViewHolder holder, int position) {
        //holder.textView.setText("vowel");
        switch (position){
            case 0:
                holder.imageView.setImageResource(R.drawable.voweli);
                holder.textView.setText("i");
                break;
            case 1:
                holder.imageView.setImageResource(R.drawable.vowelu);
                holder.textView.setText("u");
                break;
            case 2:
                holder.imageView.setImageResource(R.drawable.vowele);
                holder.textView.setText("e");
                break;
            case 3:
                holder.imageView.setImageResource(R.drawable.vowelo);
                holder.textView.setText("o");
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    class VowelAdapterViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView ;
        private TextView textView ;
        public VowelAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv);
            textView = itemView.findViewById(R.id.tv);
        }
    }
}
