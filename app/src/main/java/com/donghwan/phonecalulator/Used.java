package com.donghwan.phonecalulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdView;


public class Used extends AppCompatActivity {

    private PublisherAdView mPublisherAdView; //광고 부분

    public void onButton2Clicked(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.naver.com/PostView.nhn?blogId=haruple97&Redirect=View&logNo=221849326659&categoryNo=10&isAfterWrite=true&isMrblogPost=false&isHappyBeanLeverage=true&contentLength=26639"));
        startActivity(intent);
    }





    private
    TextView tvResult;
    TextView set2;
    TextView set3;
    TextView set4;
    TextView set5;
    TextView set6;

    EditText money2;
    EditText money3;



    ImageButton result_btn;

    int result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_used);

        mPublisherAdView = findViewById(R.id.publisherAdView); //광고부분
        PublisherAdRequest adRequest = new PublisherAdRequest.Builder().build();//광고부분
        mPublisherAdView.loadAd(adRequest); //광고부분


//스피너 작동되는거
        //https://machine-woong.tistory.com/50?category=697585
        //giveHelpLocation 대신 s
        //locationValue 대신 spinner1_value
        //giveHelpSpinner 대신 spinner1
        //

        final Spinner s = (Spinner)findViewById(R.id.spinner1);

        //계산결과 부분을 위한 변수 선언했던거 불러오기
        tvResult = findViewById(R.id.result1);
        set3 = findViewById(R.id.result3);
        set5 = findViewById(R.id.later_money);
        set6 = findViewById(R.id.result5); //실 요금제


        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {


                String spinner1_value = (String) s.getSelectedItem();
                if(spinner1_value.equals("갤럭시 폴드")){
                    result1 = 1998000;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("갤럭시 Z플립")){
                    result1 = 1650000;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("갤럭시 S20 울트라")){
                    result1 = 1595000;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("갤럭시 S20 플러스")){
                    result1 = 1353000;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("갤럭시 S20")){
                    result1 = 1248500;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("갤럭시 노트10+ (512GB)")){
                    result1 = 1496000;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("갤럭시 노트10+ (256GB)")){
                    result1 = 1397000;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("갤럭시 노트10")){
                    result1 = 1248500;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("갤럭시 S10 5G (512GB)")){
                    result1 = 1281500;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("갤럭시 S10 5G (256GB)")){
                    result1 = 1248500;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("갤럭시 S10+ (512GB)")){
                    result1 = 1397000;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("갤럭시 S10+ (128GB)")){
                    result1 = 1155000;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("갤럭시 S10 (512GB)")){
                    result1 = 998800;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("갤럭시 S10 (128GB)")){
                    result1 = 899800;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("갤럭시 S10e")){
                    result1 = 899800;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("아이폰 11 pro max(512GB)")){
                    result1 = 1991000;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("아이폰 11 pro max(256GB)")){
                    result1 = 1738000;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("아이폰 11 pro max(64GB)")){
                    result1 = 1529000;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("아이폰 11 pro (512GB)")){
                    result1 = 1837000;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("아이폰 11 pro (256GB)")){
                    result1 = 1584000;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("아이폰 11 pro (64GB)")){
                    result1 = 1375000;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("아이폰 11 (256GB)")){
                    result1 = 1188000;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("아이폰 11 (128GB)")){
                    result1 = 1056000;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("아이폰 11 (64GB)")){
                    result1 = 990000;
                    tvResult.setText(String.valueOf(result1));
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
        //스피너 끝


        money2 = (EditText) findViewById(R.id.money2);//요금제
        money3 = (EditText) findViewById(R.id.money3);//중고 기기 가격


        result_btn = (ImageButton) findViewById(R.id.result_btn);

        result_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {





                //아무것도 입력안할때 팝업 띄우기 시작(이게있어야 공백시 오류가 안난다... 필수!!!)

                String getmoney2_pop = money2.getText().toString();
                if (getmoney2_pop.getBytes().length <= 0 ) {
                    Toast.makeText(getApplicationContext(),"값을 입력하세요",Toast.LENGTH_LONG).show();
                    return;
                }

                String getmoney3_pop = money3.getText().toString();
                if (getmoney3_pop.getBytes().length <= 0 ) {
                    Toast.makeText(getApplicationContext(),"값을 입력하세요",Toast.LENGTH_LONG).show();
                    return;
                }


                //아무것도 입력안할때 팝업 띄우기 끝




                //spinner1 값 가져와야함 일단 뒤에부터 하자
                String str2 = money2.getText().toString();
                String str3 = money3.getText().toString();




                // 이 좆같은거 때문에 오류 계속 나타났다 시벌거 (스트링을 int형으로 변환)
                int num2 = Integer.parseInt(str2);//요금제
                int num3 = Integer.parseInt(str3);//중고 기기 가격



                //실제 한달 요금
                int later_money = (num2);
                String strlater_money = Integer.toString(later_money);
                set5.setText(strlater_money + '원');

                //총 납입 금액(2년) 기기값+(요금제*24)
                int totalpay = num3 + (num2*24);
                String strtotalpay = Integer.toString(totalpay);
                set6.setText(strtotalpay + '원');


                //기기값 포함 월 요금, 요금제+(num3/24)
                int plus_pay = num2+(num3/24);
                String strplus_pay = Integer.toString(plus_pay);
                set3.setText(strplus_pay + '원');

            }
        });
    }
}
