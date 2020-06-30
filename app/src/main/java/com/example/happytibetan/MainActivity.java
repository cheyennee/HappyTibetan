package com.example.happytibetan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.happytibetan.Util.ToastUtil;
import com.example.happytibetan.basic.BasicActivity;
import com.example.happytibetan.word.WordActivity;

public class MainActivity extends AppCompatActivity {

    private Button mbtnbasic,mbtnelementary,mbtntop;
    private long exitTime = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtnbasic = findViewById(R.id.btn_basic);
        mbtnelementary = findViewById(R.id.btn_elementary);
        mbtntop = findViewById(R.id.btn_top);
        setListener();
    }

    private void setListener(){
        OnClick onClick = new OnClick();
        mbtnbasic.setOnClickListener(onClick);
        mbtnelementary.setOnClickListener(onClick);
        mbtntop.setOnClickListener(onClick);
    }
    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_basic:
                    intent = new Intent(MainActivity.this, BasicActivity.class);
                    break;
                case R.id.btn_elementary:
                    intent = new Intent(MainActivity.this, WordActivity.class);
                    break;
                case R.id.btn_top:
                    break;
            }
            startActivity(intent);
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            exit();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void exit(){
        if((System.currentTimeMillis() - exitTime) > 2000){
            ToastUtil.showMsg(MainActivity.this,"再按一次退出程序");
            exitTime = System.currentTimeMillis();
        }else{
            finish();
            System.exit(0);
        }
    }
}
