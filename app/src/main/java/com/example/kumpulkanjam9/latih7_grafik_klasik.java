package com.example.kumpulkanjam9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

import javax.microedition.khronos.opengles.GL10;

public class latih7_grafik_klasik extends AppCompatActivity {
    private Button tekan;
    private GLSurfaceView grafik1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latih7_grafik_klasik);
        tekan=(Button)findViewById(R.id.button1);
        grafik1 = new HelloESSurfaceView(this);
        setContentView(grafik1);
    }

    @Override
    protected void onPause() {
        super.onPause();
        grafik1.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        grafik1.onResume();
    }

    class HelloESSurfaceView extends GLSurfaceView{
        public HelloESSurfaceView(Context context){
            super(context);
            setRenderer(new segitiga() {
                @Override
                public void onSurfaceChanged(GL10 gl, int width, int height) {

                }
            });
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_latih7_grafik_klasik,menu);
        return true;
    }
}
