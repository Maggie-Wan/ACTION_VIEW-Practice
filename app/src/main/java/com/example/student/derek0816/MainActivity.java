package com.example.student.derek0816;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    Button cal,tayo,cam,paint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cal=(Button)findViewById(R.id.cal);
        tayo=(Button)findViewById(R.id.tayo);
        cam=(Button)findViewById(R.id.cam);
        paint=(Button)findViewById(R.id.paint);
    }
    public void cal(View v){
        Uri tel=Uri.parse("tel:123456789");//填入要撥的號碼
        Intent in=new Intent(Intent.ACTION_DIAL,tel);
        startActivity(in);
    }
    public void tayo(View v){
        Uri url=Uri.parse("https://www.youtube.com/user/Tayo/videos");
        Intent in=new Intent(Intent.ACTION_VIEW,url);
        startActivity(in);
    }
    public void cam(View v){
        Intent in=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(in);
    }
    public void paint(View v){
        Intent in=new Intent();
        in.addCategory(Intent.CATEGORY_LAUNCHER);
        PackageManager pm=getPackageManager();
        in=pm.getLaunchIntentForPackage("com.energysh.drawshow");
        startActivity(in);
    }
}
