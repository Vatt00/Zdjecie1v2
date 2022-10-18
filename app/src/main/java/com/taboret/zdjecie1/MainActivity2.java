package com.taboret.zdjecie1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        SeekBar seekbar1 = (SeekBar) findViewById(R.id.seekbar1);
        int seekBarValue= seekbar1.getProgress();

    }
}