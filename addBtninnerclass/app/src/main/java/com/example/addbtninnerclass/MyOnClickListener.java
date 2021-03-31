package com.example.addbtninnerclass;

import android.view.View;

public class MyOnClickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClickListener(MainActivity mainActivity) {
      this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View view) {
   mainActivity.mButton1.setOnClickListener("you Clicked button 1");
    }
}
