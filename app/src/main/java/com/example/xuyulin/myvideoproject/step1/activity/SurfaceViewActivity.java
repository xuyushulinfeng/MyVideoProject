package com.example.xuyulin.myvideoproject.step1.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.xuyulin.myvideoproject.R;
import com.example.xuyulin.myvideoproject.step1.view.MSurfaceView;

/**
 * 作者： xuyulin on 2018/5/15.
 * 邮箱： xuyulin@yixia.com
 * 描述： Bitmap绘图的两种方式，第二种，自定义view
 */

public class SurfaceViewActivity extends AppCompatActivity {

    private MSurfaceView myimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surface_view);
        myimage = findViewById(R.id.myimage);
    }
}
