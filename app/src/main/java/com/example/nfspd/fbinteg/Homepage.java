package com.example.nfspd.fbinteg;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class Homepage extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        ImageView backgroundImg = (ImageView) findViewById(R.id.img);
        if(getIntent().getStringExtra("back").equals("back3"))
        backgroundImg.setImageResource(R.drawable.back3);
        else
        backgroundImg.setImageResource(R.drawable.back);


        String username = getIntent().getStringExtra("username");
        TextView uname =(TextView)findViewById(R.id.T1);
        uname.setText(username);
        String email = getIntent().getStringExtra("email");
        TextView textView =(TextView)findViewById(R.id.T2);
        textView.setText(email);
        String pic = getIntent().getStringExtra("pic");
        CircleImageView circleImageView=findViewById(R.id.profile_pic);
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.dontAnimate();
        Glide.with(getApplicationContext()).load(pic).into(circleImageView);

    }
}
