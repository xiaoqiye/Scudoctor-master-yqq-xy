package com.scudoctor.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.scudoctor.R;
//分类视图
public class DiscoverFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View v=LayoutInflater.from(getActivity()).inflate(R.layout.discover_f,null);
        initView();
        return v;
    }

    public void initView(){

    }
}
