package com.example.student.a20180303_02imageofvolley;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.imageView);

        Picasso.with(MainActivity.this).load("http://www.hesseducation.com/img/Branch-Taipei.png").into(img);

//        RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
//        ImageRequest request = new ImageRequest("http://www.hesseducation.com/img/Branch-Taipei.png",
//                new Response.Listener<Bitmap>() {
//                    @Override
//                    public void onResponse(Bitmap response) {
//                        img.setImageBitmap(response);
//                    }
//                }, 0, 0, ImageView.ScaleType.CENTER_INSIDE, Bitmap.Config.RGB_565, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//
//            }
//        });
//        queue.add(request);
//        queue.start();

    }
}
