package com.example.xylophone;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageView img1, img2, img3, img4, img5, img6, img7;

    private SoundPool soundPool;
    private int mCSoundId1;
    private int mCSoundId2;
    private int mCSoundId3;
    private int mCSoundId4;
    private int mCSoundId5;
    private int mCSoundId6;
    private int mCSoundId7;

    //

    private final int sim_sound = 7;
    private final float laft_vol = 1.0f;
    private final float rgt_vol = 1.0f;
    private final int loop = 0;
    private  final  int prty = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });



        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);

        soundPool = new SoundPool(sim_sound, AudioManager.STREAM_MUSIC, 0);

        mCSoundId1 = soundPool.load(getApplicationContext(), R.raw.note1_c, 1);
        mCSoundId2 = soundPool.load(getApplicationContext(), R.raw.note2_d, 1);
        mCSoundId3 = soundPool.load(getApplicationContext(), R.raw.note3_e, 1);
        mCSoundId4 = soundPool.load(getApplicationContext(), R.raw.note4_f, 1);
        mCSoundId5 = soundPool.load(getApplicationContext(), R.raw.note5_g, 1);
        mCSoundId6 = soundPool.load(getApplicationContext(), R.raw.note6_a, 1);
        mCSoundId7 = soundPool.load(getApplicationContext(), R.raw.note7_b, 1);

        img1.setOnClickListener(v -> {
            soundPool.play(mCSoundId1, laft_vol, rgt_vol, prty, loop, NORMAL_PLAY_RATE);
        });

        img2.setOnClickListener(v -> {
            soundPool.play(mCSoundId2, laft_vol, rgt_vol, prty, loop, NORMAL_PLAY_RATE);
        });

        img3.setOnClickListener(v -> {
            soundPool.play(mCSoundId3, laft_vol, rgt_vol, prty, loop, NORMAL_PLAY_RATE);
        });

        img4.setOnClickListener(v -> {
            soundPool.play(mCSoundId4, laft_vol, rgt_vol, prty, loop, NORMAL_PLAY_RATE);
        });

        img5.setOnClickListener(v -> {
            soundPool.play(mCSoundId5, laft_vol, rgt_vol, prty, loop, NORMAL_PLAY_RATE);
        });

        img6.setOnClickListener(v -> {
            soundPool.play(mCSoundId6, laft_vol, rgt_vol, prty, loop, NORMAL_PLAY_RATE);
        });

        img7.setOnClickListener(v -> {
            soundPool.play(mCSoundId7, laft_vol, rgt_vol, prty, loop, NORMAL_PLAY_RATE);
        });

    }
}