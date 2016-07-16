package com.example.maverick.hanumanchalisa;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ViewFlipper;

public class MainActivity extends Activity implements OnClickListener {

    MediaPlayer ourSong;
    ViewFlipper flippy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ourSong=MediaPlayer.create(MainActivity.this, R.raw.hanumanchalisa);
        ourSong.start();
        flippy=(ViewFlipper) findViewById (R.id.viewFlipper1);
        flippy.setOnClickListener(this);
        flippy.setFlipInterval(5000);
        flippy.startFlipping();

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        flippy.showNext();

    }




}
