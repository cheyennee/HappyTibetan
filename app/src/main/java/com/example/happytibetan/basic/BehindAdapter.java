package com.example.happytibetan.basic;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.happytibetan.R;

public class BehindAdapter extends RecyclerView.Adapter<BehindAdapter.BehindAdapterViewHolder> {

    private Context mContext;
    public BehindAdapter(Context context){
        this.mContext = context;
    }
    @NonNull
    @Override
    public BehindAdapter.BehindAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BehindAdapterViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_basicgrid_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull BehindAdapter.BehindAdapterViewHolder holder, int position) {
        //holder.textView.setText("behind");
        switch (position){
            case 0:
                holder.imageView.setImageResource(R.drawable.kav);
                holder.textView.setText("kav");
                break;
            case 1:
                holder.imageView.setImageResource(R.drawable.ngav);
                holder.textView.setText("ngav");
                break;
            case 2:
                holder.imageView.setImageResource(R.drawable.tav);
                holder.textView.setText("tav");
                break;
            case 3:
                holder.imageView.setImageResource(R.drawable.nav);
                holder.textView.setText("nav");
                break;
            case 4:
                holder.imageView.setImageResource(R.drawable.pav);
                holder.textView.setText("pav");
                break;
            case 5:
                holder.imageView.setImageResource(R.drawable.mav);
                holder.textView.setText("mav");
                break;
            case 6:
                holder.imageView.setImageResource(R.drawable.av);
                holder.textView.setText("av");
                break;
            case 7:
                holder.imageView.setImageResource(R.drawable.rav);
                holder.textView.setText("rav");
                break;
            case 8:
                holder.imageView.setImageResource(R.drawable.lav);
                holder.textView.setText("lav");
                break;
            case 9:
                holder.imageView.setImageResource(R.drawable.saf);
                holder.textView.setText("saf");
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class BehindAdapterViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView;
        public BehindAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv);
            textView = itemView.findViewById(R.id.tv);
        }
    }
}
