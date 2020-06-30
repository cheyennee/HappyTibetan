package com.example.happytibetan.basic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.example.happytibetan.MainActivity;
import com.example.happytibetan.R;

public class BasicActivity extends AppCompatActivity {

    private RadioButton mBack,mConsonant,mVowel,mTop,mBottom,mBehind,mFront;
    private ConsonantFragment consonantFragment ;
    private VowelFragment vowelFragment ;
    private BottomFragment bottomFragment;
    private TopFragment topFragment;
    private FrontFragment frontFragment;
    private BehindFragment behindFragment;

    private void initDefultView(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        consonantFragment = new ConsonantFragment();
        fragmentTransaction.add(R.id.basic_container,consonantFragment);
        fragmentTransaction.commit();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        initDefultView();
        mBack = findViewById(R.id.rg_basic_rb_back);
        mConsonant = findViewById(R.id.rg_basic_rb_consonant);
        mVowel = findViewById(R.id.rg_basic_rb_vowel);
        mTop = findViewById(R.id.rg_basic_rb_top);
        mBottom = findViewById(R.id.rg_basic_rb_bottom);
        mBehind = findViewById(R.id.rg_basic_rb_behind);
        mFront = findViewById(R.id.rg_basic_rb_front);
        setListener();
    }

    public void setListener(){
        OnClick onClick = new OnClick();
        mFront.setOnClickListener(onClick);
        mBehind.setOnClickListener(onClick);
        mVowel.setOnClickListener(onClick);
        mTop.setOnClickListener(onClick);
        mBottom.setOnClickListener(onClick);
        mConsonant.setOnClickListener(onClick);
        mBack.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            hideFragment(fragmentTransaction);
            Intent intent = null;
            switch (v.getId()){
                case R.id.rg_basic_rb_back:
                    intent = new Intent(BasicActivity.this,MainActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    break;
                case R.id.rg_basic_rb_consonant:
                    if(consonantFragment == null){
                        consonantFragment = new ConsonantFragment();
                        fragmentTransaction.add(R.id.basic_container,consonantFragment);
                    }else {
                        fragmentTransaction.show(consonantFragment);
                    }
                    break;
                case R.id.rg_basic_rb_vowel:
                    if(vowelFragment == null) {
                        vowelFragment = new VowelFragment();
                        fragmentTransaction.add(R.id.basic_container, vowelFragment);
                    }else{
                        fragmentTransaction.show(vowelFragment);
                    }
                    break;
                case R.id.rg_basic_rb_behind:
                    if(behindFragment == null){
                        behindFragment = new BehindFragment();
                        fragmentTransaction.add(R.id.basic_container,behindFragment);
                    }else{
                        fragmentTransaction.show(behindFragment);
                    }
                    break;
                case R.id.rg_basic_rb_front:
                    if(frontFragment == null){
                        frontFragment = new FrontFragment();
                        fragmentTransaction.add(R.id.basic_container,frontFragment);
                    }else{
                        fragmentTransaction.show(frontFragment);
                    }
                    break;
                case R.id.rg_basic_rb_top:
                    if(topFragment == null){
                        topFragment = new TopFragment();
                        fragmentTransaction.add(R.id.basic_container,topFragment);
                    }else{
                        fragmentTransaction.show(topFragment);
                    }
                    break;
                case R.id.rg_basic_rb_bottom:
                    if(bottomFragment == null){
                        bottomFragment = new BottomFragment();
                        fragmentTransaction.add(R.id.basic_container,bottomFragment);
                    }else{
                        fragmentTransaction.show(bottomFragment);
                    }
                    break;
            }
           fragmentTransaction.commit();
        }

        public void hideFragment(FragmentTransaction fragmentTransaction){
            if(consonantFragment != null){
                fragmentTransaction.hide(consonantFragment);
            }
            if(vowelFragment != null){
                fragmentTransaction.hide(vowelFragment);
            }
            if(bottomFragment != null){
                fragmentTransaction.hide(bottomFragment);
            }
            if(topFragment != null){
                fragmentTransaction.hide(topFragment);
            }
            if(frontFragment != null){
                fragmentTransaction.hide(frontFragment);
            }
            if(behindFragment != null){
                fragmentTransaction.hide(behindFragment);
            }
        }
    }

}
