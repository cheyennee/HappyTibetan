package com.example.happytibetan.word;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.happytibetan.Database.DatabaseHelper;
import com.example.happytibetan.R;
import com.example.happytibetan.Util.ToastUtil;

import static android.content.Context.CLIPBOARD_SERVICE;
import static androidx.core.content.ContextCompat.getSystemService;

public class WordApater extends RecyclerView.Adapter<WordApater.WordApaterViewHolder> {

    private Context mcontext;
    private ClipboardManager cm;
    private ClipData mclipdata;
    private OnItemClickListener mlistener;
    public WordApater(Context context,OnItemClickListener listener){
        this.mcontext = context;
        this.mlistener = listener;
    }
    @NonNull
    @Override
    public WordApater.WordApaterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new WordApaterViewHolder(LayoutInflater.from(mcontext).inflate(R.layout.layout_word_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull final WordApater.WordApaterViewHolder holder,final int position) {

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mlistener.getPos(position);
            }
        });
        switch (position){
            case 0:
                holder.tv1.setText("བཀྲ་ཤིས་བདེ་ལེགས།");
                holder.tv2.setText("扎西德勒");
                break;
            case 1:
                holder.tv1.setText("བོད་སྐད་།");
                holder.tv2.setText("藏话");
                break;
            case 2:
                holder.tv1.setText("འོ་ན་།");
                holder.tv2.setText("那么");
                break;
            case 3:
                holder.tv1.setText("རོགས་རམ་།");
                holder.tv2.setText("帮忙");
                break;
            case 4:
                holder.tv1.setText("བཟང་གི");
                holder.tv2.setText("好");
                break;
            case 5:
                holder.tv1.setText("བདེ་མོ།");
                holder.tv2.setText("再见");
                break;
            case 6:
                holder.tv1.setText("ཞོགས་པ།");
                holder.tv2.setText("早上");
                break;
            case 7:
                holder.tv1.setText("ཉིན་གུང་།");
                holder.tv2.setText("中午");
                break;
            case 8:
                holder.tv1.setText("དགོང་མོ།");
                holder.tv2.setText("晚上");
                break;
            case 9:
                holder.tv1.setText("ཁྱེད་རང་།");
                holder.tv2.setText("您");
                break;
            case 10:
                holder.tv1.setText("མིང་།");
                holder.tv2.setText("姓名");
                break;
            case 11:
                holder.tv1.setText("ངའི་།");
                holder.tv2.setText("我的");
                break;
            case 12:
                holder.tv1.setText("སློབ་མ།");
                holder.tv2.setText("学生");
                break;
            case 13:
                holder.tv1.setText("ཅི་ཞིག");
                holder.tv2.setText("什么");
                break;
            case 14:
                holder.tv1.setText("ངའི་མིང་ལ");
                holder.tv2.setText("我叫");
                break;
            case 15:
                holder.tv1.setText("ཅོག་ཙེ།");
                holder.tv2.setText("桌子");
                break;
            case 16:
                holder.tv1.setText("རྐུབ་སྟེགས།");
                holder.tv2.setText("凳子");
                break;
            case 17:
                holder.tv1.setText("སྒོ་།");
                holder.tv2.setText("门");
                break;
            case 18:
                holder.tv1.setText("ནག་པང་།");
                holder.tv2.setText("黑板");
                break;
            case 19:
                holder.tv1.setText("སྒེའུ་ཁུང་།");
                holder.tv2.setText("窗户");
                break;
            case 20:
                holder.tv1.setText("ཤེལ་སྒོ།");
                holder.tv2.setText("玻璃");
                break;
            case 21:
                holder.tv1.setText("སྒོ་ལྕགས");
                holder.tv2.setText("锁");
                break;
            case 22:
                holder.tv1.setText("སྨྱུ་གུ");
                holder.tv2.setText("笔");
                break;
            case 23:
                holder.tv1.setText("གློག");
                holder.tv2.setText("电");
                break;
            case 24:
                holder.tv1.setText("སློབ་ཁང་།");
                holder.tv2.setText("教室");
                break;
            case 25:
                holder.tv1.setText("སློབ་དེབ།");
                holder.tv2.setText("课本");
                break;
            case 26:
                holder.tv1.setText("རེད་དམ།");
                holder.tv2.setText("是吗");
                break;
            case 27:
                holder.tv1.setText("མ་རེད།");
                holder.tv2.setText("不是");
                break;
            case 28:
                holder.tv1.setText("གྱང་།");
                holder.tv2.setText("墙");
                break;
            case 29:
                holder.tv1.setText("ཕག");
                holder.tv2.setText("猪");
                break;
        }
        holder.iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.iv1.setImageResource(R.drawable.speak_animation);
                AnimationDrawable animationDrawable = (AnimationDrawable) holder.iv1.getDrawable();
                animationDrawable.start();
            }
        });
        holder.iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cm = (ClipboardManager)mcontext.getSystemService(CLIPBOARD_SERVICE);
                mclipdata = ClipData.newPlainText("Label",holder.tv1.getText());
                cm.setPrimaryClip(mclipdata);
                ToastUtil.showMsg(mcontext,"复制成功！");
            }
        });
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class WordApaterViewHolder extends RecyclerView.ViewHolder {

        private TextView tv1,tv2;
        private ImageView iv1,iv2;
        public WordApaterViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.tv_1);
            tv2 = itemView.findViewById(R.id.tv_2);
            iv1 = itemView.findViewById(R.id.iv_1);
            iv2 = itemView.findViewById(R.id.iv_2);
        }
    }

    public interface OnItemClickListener{
        void getPos(int pos);
    }
}
