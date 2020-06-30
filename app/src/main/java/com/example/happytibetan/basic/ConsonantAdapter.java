package com.example.happytibetan.basic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.happytibetan.R;

public class ConsonantAdapter extends RecyclerView.Adapter<ConsonantAdapter.GridViewHolder> {

    private Context mcontext;
    private OnItemClickListener mListener;

    public ConsonantAdapter(Context context,OnItemClickListener listener){
        this.mListener = listener;
        this.mcontext = context;
    }
    @NonNull
    @Override
    public ConsonantAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GridViewHolder(LayoutInflater.from(mcontext).inflate(R.layout.layout_basicgrid_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ConsonantAdapter.GridViewHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClick(position);
            }
        });
        switch(position){
            case 0:
                holder.imageView.setImageResource(R.drawable.gaf);
                holder.textView.setText("gaf");
                break;
            case 1:
                holder.imageView.setImageResource(R.drawable.kaf);
                holder.textView.setText("kaf");
                break;
            case 2:
                holder.imageView.setImageResource(R.drawable.kav);
                holder.textView.setText("kav");
                break;
            case 3:
                holder.imageView.setImageResource(R.drawable.ngav);
                holder.textView.setText("ngav");
                break;
            case 4:
                holder.imageView.setImageResource(R.drawable.jaf);
                holder.textView.setText("jaf");
                break;
            case 5:
                holder.imageView.setImageResource(R.drawable.qaf);
                holder.textView.setText("qaf");
                break;
            case 6:
                holder.imageView.setImageResource(R.drawable.qav);
                holder.textView.setText("qav");
                break;
            case 7:
                holder.imageView.setImageResource(R.drawable.nyav);
                holder.textView.setText("nyav");
                break;
            case 8:
                holder.imageView.setImageResource(R.drawable.daf);
                holder.textView.setText("daf");
                break;
            case 9:
                holder.imageView.setImageResource(R.drawable.taf);
                holder.textView.setText("taf");
                break;
            case 10:
                holder.imageView.setImageResource(R.drawable.tav);
                holder.textView.setText("tav");
                break;
            case 11:
                holder.imageView.setImageResource(R.drawable.nav);
                holder.textView.setText("nav");
                break;
            case 12:
                holder.imageView.setImageResource(R.drawable.baf);
                holder.textView.setText("baf");
                break;
            case 13:
                holder.imageView.setImageResource(R.drawable.paf);
                holder.textView.setText("paf");
                break;
            case 14:
                holder.imageView.setImageResource(R.drawable.pav);
                holder.textView.setText("pav");
                break;
            case 15:
                holder.imageView.setImageResource(R.drawable.mav);
                holder.textView.setText("mav");
                break;
            case 16:
                holder.imageView.setImageResource(R.drawable.zaf);
                holder.textView.setText("zaf");
                break;
            case 17:
                holder.imageView.setImageResource(R.drawable.caf);
                holder.textView.setText("caf");
                break;
            case 18:
                holder.imageView.setImageResource(R.drawable.cav);
                holder.textView.setText("cav");
                break;
            case 19:
                holder.imageView.setImageResource(R.drawable.wav);
                holder.textView.setText("wav");
                break;
            case 20:
                holder.imageView.setImageResource(R.drawable.xav);
                holder.textView.setText("xav");
                break;
            case 21:
                holder.imageView.setImageResource(R.drawable.sav);
                holder.textView.setText("sav");
                break;
            case 22:
                holder.imageView.setImageResource(R.drawable.av);
                holder.textView.setText("av");
                break;
            case 23:
                holder.imageView.setImageResource(R.drawable.yav);
                holder.textView.setText("yav");
                break;
            case 24:
                holder.imageView.setImageResource(R.drawable.rav);
                holder.textView.setText("rav");
                break;
            case 25:
                holder.imageView.setImageResource(R.drawable.lav);
                holder.textView.setText("lav");
                break;
            case 26:
                holder.imageView.setImageResource(R.drawable.xaf);
                holder.textView.setText("xaf");
                break;
            case 27:
                holder.imageView.setImageResource(R.drawable.saf);
                holder.textView.setText("saf");
                break;
            case 28:
                holder.imageView.setImageResource(R.drawable.haf);
                holder.textView.setText("haf");
                break;
            case 29:
                holder.imageView.setImageResource(R.drawable.af);
                holder.textView.setText("af");
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class GridViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv);
            textView = itemView.findViewById(R.id.tv);
        }
    }

    public interface OnItemClickListener{
        void onClick(int pos);
    }
}
