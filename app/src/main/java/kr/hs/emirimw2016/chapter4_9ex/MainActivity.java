package kr.hs.emirimw2016.chapter4_9ex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgv;
    int angel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRotate = findViewById(R.id.brn_rotate);
        imgv = findViewById(R.id.imgv);

        btnRotate.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            angel += 10;
            imgv.setRotation(angel);
        }
    };
}