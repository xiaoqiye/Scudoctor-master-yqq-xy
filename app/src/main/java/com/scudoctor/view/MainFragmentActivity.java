package com.scudoctor.view;

import android.support.v4.app.FragmentTransaction;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageView;

import com.scudoctor.R;

/**
 * Created by Perfume on 2016/9/25.
 */
public class MainFragmentActivity extends FragmentActivity implements View.OnClickListener{

    private ImageView[] bt_menu=new ImageView[5];
    private int[] bt_id={R.id.iv_menu_0,R.id.iv_menu_1,R.id.iv_menu_2};
    private int[] select_on={R.drawable.guide_home_on,R.drawable.guide_category_on,R.drawable.guide_account_on};
    private int[] select_off={R.drawable.guide_home_nm,R.drawable.guide_category_nm,R.drawable.guide_account_nm};

    //Home View
    private HomeFragment home_f;
    //Discover View
    //private DiscoverFragment discover_f;
    //Category View
    private CategoryFragment category_f;
    //Cart View
    //private CartFragment cart_f;
    //Account View
    private AccountFragment account_f;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_fa);
        initView();
    }
    public void initView(){
        // 找到底部菜单的按钮并设置监听
        for(int i=0;i<3;i++){
            bt_menu[i]=(ImageView)findViewById(bt_id[i]);
            bt_menu[i].setOnClickListener(this);
        }
        // 初始化默认显示的界面
        if(home_f==null){
            home_f=new HomeFragment();
            addFragment(home_f);
            showFragment(home_f);
        }
        else{
            showFragment(home_f);
        }
        // 设置默认首页为点击时的图片
        bt_menu[0].setImageResource(select_on[0]);
    }

    public void addFragment(Fragment fragment){
        FragmentTransaction ft=this.getSupportFragmentManager().beginTransaction();
        ft.add(R.id.show_layout,fragment);
        ft.commit();
    }

    public void removeFragment(Fragment fragment){
        FragmentTransaction ft=this.getSupportFragmentManager().beginTransaction();
        ft.remove(fragment);
        ft.commit();
    }

    public void showFragment(Fragment fragment){
        FragmentTransaction ft=this.getSupportFragmentManager().beginTransaction();
        //set animation.....start
        //set animation.....end
        if(home_f!=null){
            ft.hide(home_f);
        }
        /*if(discover_f!=null){
            ft.hide(discover_f);
        }*/
        if(category_f!=null){
            ft.hide(category_f);
        }
        /*if(cart_f!=null){
            ft.hide(cart_f);
        }*/
        if(account_f!=null){
            ft.hide(account_f);
        }
        ft.show(fragment);
        ft.commitAllowingStateLoss();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_menu_0:
                if(home_f==null){
                    home_f=new HomeFragment();
                    addFragment(home_f);
                    showFragment(home_f);
                }
                else if(home_f.isHidden()){
                    showFragment(home_f);
                }
                break;
            /*case  R.id.iv_menu_1:
                if(discover_f==null){
                    discover_f=new DiscoverFragment();
                    if(!discover_f.isHidden()){
                        addFragment(discover_f);
                        showFragment(discover_f);
                    }
                }
                else{
                    showFragment(discover_f);
                }
                break;*/
            case R.id.iv_menu_1:
                if(category_f==null){
                    category_f=new CategoryFragment();
                    if(!category_f.isHidden()){
                        addFragment(category_f);
                        showFragment(category_f);
                    }
                }
                else if(category_f.isHidden()){
                    showFragment(category_f);
                }
                break;
            /*case R.id.iv_menu_3:
                if(cart_f==null){
                    cart_f=new CartFragment();
                    addFragment(cart_f);
                    showFragment(cart_f);
                }
                else if(cart_f.isHidden()){
                    showFragment(cart_f);
                }
                break;*/
            case R.id.iv_menu_2:
                if(account_f==null){
                    account_f=new AccountFragment();
                    addFragment(account_f);
                    showFragment(account_f);
                }
                else if(account_f.isHidden()){
                    showFragment(account_f);
                }
                break;
        }
        for(int i=0;i<bt_id.length;i++){
            if(bt_id[i]==v.getId()){
                bt_menu[i].setImageResource(select_on[i]);
            }
            else{
                bt_menu[i].setImageResource(select_off[i]);
            }
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
