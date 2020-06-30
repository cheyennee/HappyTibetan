package com.example.happytibetan.word;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.happytibetan.MainActivity;
import com.example.happytibetan.R;
import com.example.happytibetan.Util.ToastUtil;

public class WordActivity extends AppCompatActivity{

    private RecyclerView list;
    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);
        list = findViewById(R.id.list);
        list.setAdapter(new WordApater(WordActivity.this, new WordApater.OnItemClickListener() {
            @Override
            public void getPos(int pos) {
                ToastUtil.showMsg(WordActivity.this,"pos:"+pos);
            }
        }));
        list.setLayoutManager(new LinearLayoutManager(WordActivity.this));
        list.addItemDecoration(new MyDecoration());
        back = findViewById(R.id.btn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WordActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state){
            super.getItemOffsets(outRect,view,parent,state);
            int height = getResources().getDimensionPixelOffset(R.dimen.dividerconsonant);
            outRect.set(height,0,height,height);
        }
    }

}
