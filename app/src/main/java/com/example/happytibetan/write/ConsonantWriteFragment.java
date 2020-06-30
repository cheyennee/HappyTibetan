package com.example.happytibetan.write;

import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.happytibetan.R;
import com.example.happytibetan.basic.ConsonantFragment;

import java.io.IOException;

public class ConsonantWriteFragment extends Fragment{

    private ImageView iv_write,iv_read;
    private TextView tv_read,tv_example,tv_example1;
    int pos;
    public ConsonantWriteFragment(int position){
        this.pos = position;
    }

    public ConsonantWriteFragment(){}
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_write_fragment,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        iv_write = view.findViewById(R.id.iv_write);
        iv_read = view.findViewById(R.id.iv_read);
        tv_read = view.findViewById(R.id.tv_read);
        tv_example = view.findViewById(R.id.tv_example);
        tv_example1 = view.findViewById(R.id.tv_example1);
        switch (pos){
            case 0:
                iv_write.setImageResource(R.drawable.write_gaf);
                tv_read.setText("发音：gaf");
                tv_example.setText("ཀུང་ཧྲེ");
                tv_example1.setText("公社");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                       MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.gaf);
                       player.start();
                    }
                });
                break;
            case 1:
                iv_write.setImageResource(R.drawable.write_kaf);
                tv_read.setText("发音：kaf");
                tv_example.setText("ཁ");
                tv_example1.setText("嘴，口");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.kaf);
                        player.start();
                    }
                });
                break;
            case 2:
                iv_write.setImageResource(R.drawable.write_kav);
                tv_read.setText("发音：kav");
                tv_example.setText("ཅི་ཞིག");
                tv_example1.setText("什么");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.kav);
                        player.start();
                    }
                });
                break;
            case 3:
                iv_write.setImageResource(R.drawable.write_ngav);
                tv_read.setText("发音：ngav");
                tv_example.setText("ང");
                tv_example1.setText("我");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.ngav);
                        player.start();
                    }
                });
                break;
            case 4:
                iv_write.setImageResource(R.drawable.write_jaf);
                tv_read.setText("发音：jaf");
                tv_example.setText("སུམ་ཅུ");
                tv_example1.setText("三十");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.jaf);
                        player.start();
                    }
                });
                break;
            case 5:
                iv_write.setImageResource(R.drawable.write_qaf);
                tv_read.setText("发音：qaf");
                tv_example.setText("ཆ");
                tv_example1.setText("双，对");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.qaf);
                        player.start();
                    }
                });
                break;
            case 6:
                iv_write.setImageResource(R.drawable.write_qav);
                tv_read.setText("发音：qav");
                tv_example.setText("ཇ");
                tv_example1.setText("茶");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.qav);
                        player.start();
                    }
                });
                break;
            case 7:
                iv_write.setImageResource(R.drawable.write_nyav);
                tv_read.setText("发音：nyav");
                tv_example.setText("ཉ");
                tv_example1.setText("鱼");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.nyav);
                        player.start();
                    }
                });
                break;
            case 8:
                iv_write.setImageResource(R.drawable.write_daf);
                tv_read.setText("发音：daf");
                tv_example.setText("ཡོན་ཏན");
                tv_example1.setText("学问");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.daf);
                        player.start();
                    }
                });
                break;
            case 9:
                iv_write.setImageResource(R.drawable.write_taf);
                tv_read.setText("发音：taf");
                tv_example.setText("བར་ཐག");
                tv_example1.setText("距离");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.taf);
                        player.start();
                    }
                });
                break;
            case 10:
                iv_write.setImageResource(R.drawable.write_tav);
                tv_read.setText("发音：tav");
                tv_example.setText("ད");
                tv_example1.setText("现在");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.tav);
                        player.start();
                    }
                });
                break;
            case 11:
                iv_write.setImageResource(R.drawable.write_nav);
                tv_read.setText("发音：nav");
                tv_example.setText("ན");
                tv_example1.setText("病，疼<动>");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.nav);
                        player.start();
                    }
                });
                break;
            case 12:
                iv_write.setImageResource(R.drawable.write_baf);
                tv_read.setText("发音：baf");
                tv_example.setText("ཆད་པ");
                tv_example1.setText("刑罚，处分");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.baf);
                        player.start();
                    }
                });
                break;
            case 13:
                iv_write.setImageResource(R.drawable.write_paf);
                tv_read.setText("发音：paf");
                tv_example.setText("ཕུལ་བ");
                tv_example1.setText("献、给<谦>");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.paf);
                        player.start();
                    }
                });
                break;
            case 14:
                iv_write.setImageResource(R.drawable.write_pav);
                tv_read.setText("发音：pav");
                tv_example.setText("རེ་བ་།");
                tv_example1.setText("希望");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.pav);
                        player.start();
                    }
                });
                break;
            case 15:
                iv_write.setImageResource(R.drawable.write_mav);
                tv_read.setText("发音：mav");
                tv_example.setText("ཨ་མ");
                tv_example1.setText("妈妈");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.mav);
                        player.start();
                    }
                });
                break;
            case 16:
                iv_write.setImageResource(R.drawable.write_zaf);
                tv_read.setText("发音：zaf");
                tv_example.setText("ངལ་རྩོལ");
                tv_example1.setText("劳动<名>");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.saf);
                        player.start();
                    }
                });
                break;
            case 17:
                iv_write.setImageResource(R.drawable.write_caf);
                tv_read.setText("发音：caf");
                tv_example.setText("ཚ");
                tv_example1.setText("疼<刺疼><动>");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.caf);
                        player.start();
                    }
                });
                break;
            case 18:
                iv_write.setImageResource(R.drawable.write_cav);
                tv_read.setText("发音：cav");
                tv_example.setText("རྫོགས");
                tv_example1.setText("完，尽<动>");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.cav);
                        player.start();
                    }
                });
                break;
            case 19:
                iv_write.setImageResource(R.drawable.write_wav);
                tv_read.setText("发音：wav");
                tv_example.setText("ཝ་མོ");
                tv_example1.setText("狐狸");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.wav);
                        player.start();
                    }
                });
                break;
            case 20:
                iv_write.setImageResource(R.drawable.write_xav);
                tv_read.setText("发音：xav");
                tv_example.setText("ཞིང་པ");
                tv_example1.setText("农民");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.xav);
                        player.start();
                    }
                });
                break;
            case 21:
                iv_write.setImageResource(R.drawable.write_sav);
                tv_read.setText("发音：sav");
                tv_example.setText("ཟ");
                tv_example1.setText("吃<现、未>");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.sav);
                        player.start();
                    }
                });
                break;
            case 22:
                iv_write.setImageResource(R.drawable.write_av);
                tv_read.setText("发音：av");
                tv_example.setText("ངའི");
                tv_example1.setText("我的");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.av);
                        player.start();
                    }
                });
                break;
            case 23:
                iv_write.setImageResource(R.drawable.write_yav);
                tv_read.setText("发音：yav");
                tv_example.setText("ཡ");
                tv_example1.setText("单的");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.yav);
                        player.start();
                    }
                });
                break;
            case 24:
                iv_write.setImageResource(R.drawable.write_rav);
                tv_read.setText("发音：rav");
                tv_example.setText("ར");
                tv_example1.setText("山羊");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.rav);
                        player.start();
                    }
                });
                break;
            case 25:
                iv_write.setImageResource(R.drawable.write_lav);
                tv_read.setText("发音：lav");
                tv_example.setText("ལ");
                tv_example1.setText("山(有路的山)");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.lav);
                        player.start();
                    }
                });
                break;
            case 26:
                iv_write.setImageResource(R.drawable.write_xaf);
                tv_read.setText("发音：xaf");
                tv_example.setText("ཤ");
                tv_example1.setText("肉");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.xaf);
                        player.start();
                    }
                });
                break;
            case 27:
                iv_write.setImageResource(R.drawable.write_saf);
                tv_read.setText("发音：saf");
                tv_example.setText("ས");
                tv_example1.setText("地、土");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.saf);
                        player.start();
                    }
                });
                break;
            case 28:
                iv_write.setImageResource(R.drawable.write_haf);
                tv_read.setText("发音：haf");
                tv_example.setText("ལྷ་ས");
                tv_example1.setText("拉萨");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.haf);
                        player.start();
                    }
                });
                break;
            case 29:
                iv_write.setImageResource(R.drawable.write_af);
                tv_read.setText("发音：af");
                tv_example.setText("ཀྲོའུ་ཨེན་ལའེ");
                tv_example1.setText("周恩来");
                iv_read.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iv_read.setImageResource(R.drawable.speak_animation);
                        AnimationDrawable animationDrawable = (AnimationDrawable)((ImageView)iv_read).getDrawable();
                        animationDrawable.start();
                        MediaPlayer player = MediaPlayer.create(getActivity(),R.raw.af);
                        player.start();
                    }
                });
                break;
        }
    }

}
