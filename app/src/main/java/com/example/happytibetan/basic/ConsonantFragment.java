package com.example.happytibetan.basic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.happytibetan.R;
import com.example.happytibetan.write.ConsonantWriteFragment;
import com.example.happytibetan.write.StudyActivity;

public class ConsonantFragment extends Fragment {

    private RecyclerView mGrid;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_consonant_fragment,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mGrid = view.findViewById(R.id.rg_basic_grid);
        mGrid.setLayoutManager(new GridLayoutManager(getActivity(),4));
        mGrid.addItemDecoration(new MyDecoration());
        mGrid.setAdapter(new ConsonantAdapter(getActivity(), new ConsonantAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Intent intent = new Intent(getActivity(),StudyActivity.class);
                intent.putExtra("pos",pos);
                startActivity(intent);
            }
        }));
    }

    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state){
            super.getItemOffsets(outRect,view,parent,state);
            int dimen = getResources().getDimensionPixelOffset(R.dimen.dividerconsonant);
            outRect.set(dimen,dimen,dimen,dimen);
        }
    }

}
