package com.taboret.zdjecie1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity2 extends AppCompatActivity {
    int redv, grenv, bluev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ImageView imag = (ImageView) findViewById(R.id.imag);
        CheckBox rcb = (CheckBox) findViewById(R.id.redCheckBox);
        CheckBox gcb = (CheckBox) findViewById(R.id.greenCheckBox);
        CheckBox bcb = (CheckBox) findViewById(R.id.blueCheckBox);
        SeekBar sb1 = (SeekBar) findViewById(R.id.seekbar1);
        SeekBar sbR = (SeekBar) findViewById(R.id.redSeekBar);
        SeekBar sbG = (SeekBar) findViewById(R.id.greenSeekBar);
        SeekBar sbB = (SeekBar) findViewById(R.id.blueSeekBar);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {}
            public void onStartTrackingTouch(SeekBar seekBar) {}
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int alfa = sb1.getProgress();
                if(rcb.isChecked()){ redv = sbR.getProgress(); }else{ redv=255; }
                if(gcb.isChecked()){ grenv = sbG.getProgress(); }else{ grenv=255; }
                if(bcb.isChecked()){ bluev = sbB.getProgress(); }else{ bluev=255; }
                imag.setColorFilter(Color.rgb(redv, grenv, bluev), PorterDuff.Mode.MULTIPLY);
                imag.setImageAlpha(alfa);
            }
        };
        sb1.setOnSeekBarChangeListener(onSeekBarChangeListener);
        sbR.setOnSeekBarChangeListener(onSeekBarChangeListener);
        sbG.setOnSeekBarChangeListener(onSeekBarChangeListener);
        sbB.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }
}