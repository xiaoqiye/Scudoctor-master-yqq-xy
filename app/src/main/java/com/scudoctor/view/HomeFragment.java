package com.scudoctor.view;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.scudoctor.R;
//首页视图（资讯）
public class HomeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View v=LayoutInflater.from(getActivity()).inflate(R.layout.home_f,null);
        initView();
        return v;
    }
    public void initView(){
        //initialize view in home_f.xml
    }
}
