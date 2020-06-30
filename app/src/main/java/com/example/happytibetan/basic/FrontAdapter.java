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

public class FrontAdapter extends RecyclerView.Adapter<FrontAdapter.FrontAdapterViewHolder> {

    private Context mContext;
    public FrontAdapter(Context context){
        this.mContext = context;
    }
    @NonNull
    @Override
    public FrontAdapter.FrontAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FrontAdapterViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_basicgrid_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FrontAdapter.FrontAdapterViewHolder holder, int position) {
        //holder.textView.setText("front");
        switch (position){
            case 0:
                holder.imageView.setImageResource(R.drawable.kav);
                holder.textView.setText("kav");
                break;
            case 1:
                holder.imageView.setImageResource(R.drawable.tav);
                holder.textView.setText("tav");
                break;
            case 3:
                holder.imageView.setImageResource(R.drawable.pav);
                holder.textView.setText("pav");
                break;
            case 4:
                holder.imageView.setImageResource(R.drawable.av);
                holder.textView.setText("av");
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    class FrontAdapterViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView;
        public FrontAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv);
            textView = itemView.findViewById(R.id.tv);
        }
    }
}
