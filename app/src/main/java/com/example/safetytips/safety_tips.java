//package com.example.safetytips;
//
//import android.net.Uri;
//import android.os.Bundle;
//import android.widget.MediaController;
//import android.widget.VideoView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class safety_tips extends AppCompatActivity {
//    private VideoView v;
//    @Override
//    protected void onCreate(Bundle savedIntanceState) {
//
//        super.onCreate(savedIntanceState);
//        setContentView(R.layout.safety_tips);
//
//        v = (VideoView) findViewById(R.id.vedio1);
//
//        Uri uri = Uri.parse("android resource://"+getPackageName()+"/"+R.raw.videoplayback);
//        v.setVideoURI(uri);
//        MediaController m = new MediaController(this);
//        v.setMediaController(m);
//        v.start();
//    }
//}
