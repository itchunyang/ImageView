package com.itchunyang.imageview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView iv;
    private Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.iv);
        bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.meinv);
    }

    public void scale(View view) {
        startActivity(new Intent(this,ImageScaleActivity.class));
    }

    public void matrix(View view) {
        Matrix matrix = new Matrix();
        matrix.postScale(0.5f,0.4f);
        matrix.postTranslate(20,20);

        //必须设置 否则matrix不起作用
        iv.setScaleType(ImageView.ScaleType.MATRIX);
        iv.setImageMatrix(matrix);
        iv.setAlpha(1.0f);
        iv.setImageBitmap(bitmap);
    }

    public void alpha(View view) {
        iv.setAlpha(0.6f);
        iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        iv.setImageBitmap(bitmap);
    }
}
