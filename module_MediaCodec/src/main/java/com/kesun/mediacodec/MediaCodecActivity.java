package com.kesun.mediacodec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by Administrator on 2018/2/13 0013.
 * http://lib.csdn.net/article/liveplay/40882
 */
@Route(path = "/media/mian")
public class MediaCodecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediacodec);
    }
}
