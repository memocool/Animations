package com.example.memo.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {





    public void fade (View view) {

        ImageView gon = (ImageView) findViewById(R.id.gon);
        ImageView kur = (ImageView) findViewById(R.id.kur);
        //   gon.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

        gon.animate().alpha(0f).setDuration(2000);
        kur.animate().alpha(1f).setDuration(2000);


    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      


    }
}
