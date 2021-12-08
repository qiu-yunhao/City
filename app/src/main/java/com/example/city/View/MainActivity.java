package com.example.city.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.city.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView;
    //后续要实现对相应的地域设置跳转的组件，可能要自定义
    private TextView textView;
    //后续要换成对应的时间轴，需要自定义

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        imageView = (ImageView)findViewById(R.id.main_imageView);
        textView = (TextView) findViewById(R.id.main_time);
        imageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.main_imageView:
                //后续添加参数进行相对应页面数据的跳转
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);
                break;
        }
    }
}