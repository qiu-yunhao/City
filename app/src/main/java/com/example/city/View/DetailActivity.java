package com.example.city.View;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.city.R;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView_txt;
    private TextView textView_image;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        init();
    }

    public void init(){
        imageView = (ImageView) findViewById(R.id.detail_pic);
        textView_image = (TextView) findViewById(R.id.detail_text_image);
        textView_txt = (TextView) findViewById(R.id.detail_text_txt);
        textView_image.setOnClickListener(this);
        textView_txt.setOnClickListener(this);
        textView_txt.performClick();
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Fragment fragment = null;
        switch (v.getId()){
            case R.id.detail_text_image:
                fragment = new DetailFragment_image();
                break;
            case R.id.detail_text_txt:
                fragment = new DetailFragment_text();
                break;
            default:
                Log.d("DetailFragment","change the Fragment FALSE !!!");
                break;
        }
        if(fragment != null){
            ft.replace(R.id.frame_detail,fragment);
            ft.commit();
        }
    }
}
