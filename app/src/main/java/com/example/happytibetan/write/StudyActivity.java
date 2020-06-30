package com.example.happytibetan.write;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.happytibetan.R;
import com.example.happytibetan.basic.BasicActivity;
import com.example.happytibetan.basic.ConsonantFragment;

import java.util.UUID;

public class StudyActivity extends AppCompatActivity  {

    private Button back;
    private TextView tv;
    int pos;
    private ConsonantWriteFragment consonantWriteFragment = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);
        Intent intent = getIntent();
        this.pos = intent.getIntExtra("pos",0);
        consonantWriteFragment = new ConsonantWriteFragment(pos);
        getSupportFragmentManager().beginTransaction().add(R.id.write_container,consonantWriteFragment).commitAllowingStateLoss();
        back = findViewById(R.id.btn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudyActivity.this, BasicActivity.class);
                startActivity(intent);
            }
        });
        tv = findViewById(R.id.tv);
        switch (pos){
            case 0:
                tv.setText("辅音：ཀ");
                break;
            case 1:
                tv.setText("辅音：ཁ");
                break;
            case 2:
                tv.setText("辅音：ག");
                break;
            case 3:
                tv.setText("辅音：ང");
                break;
            case 4:
                tv.setText("辅音：ཅ");
                break;
            case 5:
                tv.setText("辅音：ཆ");
                break;
            case 6:
                tv.setText("辅音：ཇ");
                break;
            case 7:
                tv.setText("辅音：ཉ");
                break;
            case 8:
                tv.setText("辅音：ཏ");
                break;
            case 9:
                tv.setText("辅音：ཐ");
                break;
            case 10:
                tv.setText("辅音：ད");
                break;
            case 11:
                tv.setText("辅音：ན");
                break;
            case 12:
                tv.setText("辅音：པ");
                break;
            case 13:
                tv.setText("辅音：ཕ");
                break;
            case 14:
                tv.setText("辅音：བ");
                break;
            case 15:
                tv.setText("辅音：མ");
                break;
            case 16:
                tv.setText("辅音：ཙ");
                break;
            case 17:
                tv.setText("辅音：ཚ");
                break;
            case 18:
                tv.setText("辅音：ཛ");
                break;
            case 19:
                tv.setText("辅音：ཝ");
                break;
            case 20:
                tv.setText("辅音：ཞ");
                break;
            case 21:
                tv.setText("辅音：ཟ");
                break;
            case 22:
                tv.setText("辅音：འ");
                break;
            case 23:
                tv.setText("辅音：ཡ");
                break;
            case 24:
                tv.setText("辅音：ར");
                break;
            case 25:
                tv.setText("辅音：ལ");
                break;
            case 26:
                tv.setText("辅音：ཤ");
                break;
            case 27:
                tv.setText("辅音：ས");
                break;
            case 28:
                tv.setText("辅音：ཧ");
                break;
            case 29:
                tv.setText("辅音：ཨ");
                break;
        }
    }

}
