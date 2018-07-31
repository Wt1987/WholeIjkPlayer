package com.study.ijkvideoplayer;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.study.ijkvideoplayer.util.DefaultVideoPlayerListener;
import com.study.ijkvideoplayer.util.VideoUtil;
import com.study.ijkvideoplayer.view.VideoPlayerIJK;

/**
 * author : taowang
 * date :2018/7/30
 * description:
 **/
public class TestActivity extends AppCompatActivity {

    VideoPlayerIJK ijkPlayer;
    String path;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        try{
            VideoUtil.initIjkPlayer();
        }catch (Exception e){
            e.printStackTrace();
            finish();
        }
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        initView();
        permissionCheck();
    }


    private void initView(){

        ijkPlayer = findViewById(R.id.ijk_player);
        findViewById(R.id.floating_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("*/*");
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                startActivityForResult(intent, 1);
            }
        });
        ijkPlayer.setListener(new DefaultVideoPlayerListener());

    }


    private void permissionCheck(){
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.READ_EXTERNAL_STORAGE,
                            Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    1);
        }
    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == Activity.RESULT_OK) {
            Uri uri = data.getData();
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                path = uri.getPath();
                Toast.makeText(this, path + "11111", Toast.LENGTH_SHORT).show();
                return;
            }
            if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
                path = VideoUtil.getPath(this, uri);
                Toast.makeText(this, path, Toast.LENGTH_SHORT).show();
                VideoUtil.loadVideo(ijkPlayer,path);
            } else {
                path = VideoUtil.getRealPathFromURI(this,uri);
                Toast.makeText(TestActivity.this, path + " ", Toast.LENGTH_SHORT).show();
                VideoUtil.loadVideo(ijkPlayer,path);
            }
        }
    }





    @Override
    protected void onStop() {
        super.onStop();
        ijkPlayer.stop();
        VideoUtil.stopPlayer();
    }




}
