package com.scudoctor.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scudoctor.R;
//患者可以发表文章
public class CategoryFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View v=LayoutInflater.from(getActivity()).inflate(R.layout.category_f,null);
        initView();
        return v;
    }

    public void initView(){
        //do something
    }
}
