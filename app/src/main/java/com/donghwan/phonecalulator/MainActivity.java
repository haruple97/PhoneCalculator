package com.donghwan.phonecalulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdView;

public class MainActivity extends AppCompatActivity {

    private Button button2;
    private Button button3;
    private Button button4;

    private PublisherAdView mPublisherAdView; //광고 부분



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPublisherAdView = findViewById(R.id.publisherAdView); //광고부분
        PublisherAdRequest adRequest = new PublisherAdRequest.Builder().build();//광고부분
        mPublisherAdView.loadAd(adRequest); //광고부분



        button2 = findViewById(R.id.button2); //Support_Fund 화면으로 전환하는 구문 시작
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Support_Fund.class);
                startActivity(intent); //액티비티 이동
            }
        }); //Support_Fund 화면으로 전환하는 구문 끝

        button3 = findViewById(R.id.button3); //Optional_Agreement 화면으로 전환하는 구문 시작
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Optional_Agreement.class);
                startActivity(intent); //액티비티 이동
            }
        }); //Optional_Agreement 화면으로 전환하는 구문 끝

        button4 = findViewById(R.id.button4); //Used 화면으로 전환하는 구문 시작
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Used.class);
                startActivity(intent); //액티비티 이동
            }
        }); //Used 화면으로 전환하는 구문 끝

    }



    public void onButton1Clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.naver.com/PostView.nhn?blogId=haruple97&Redirect=View&logNo=221849305704&categoryNo=10&isAfterWrite=true&isMrblogPost=false&isHappyBeanLeverage=true&contentLength=27409"));
        startActivity(intent);
    }

    public void onButton2Clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.naver.com/PostView.nhn?blogId=haruple97&Redirect=View&logNo=221849326659&categoryNo=10&isAfterWrite=true&isMrblogPost=false&isHappyBeanLeverage=true&contentLength=26639"));
        startActivity(intent);
    }

}