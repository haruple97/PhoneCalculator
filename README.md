# 스마트폰 요금 계산기 (PhoneCalculator)


## 서비스 소개
> 스마트폰 사기 방지를 위한 스마트폰 요금 계산기 안드로이드 앱

스마트폰 시장은 불법보조금 및 요금제 사기 문제가 지속되고 있습니다.<br/>
개인적으로 전자제품에 관심이 많아 그동안 지인들이 스마트폰을 구매할 때 많은 도움을 주었습니다.  
이를 자동화 하며 지인 뿐만 아니라 많은 분들이 해당 앱을 사용함으로 인해 사기를 방지할 수 있기를 기대합니다.<br/>


## 서비스 스크린샷
<img src = "https://user-images.githubusercontent.com/73948775/114272606-cbf82d80-9a51-11eb-8ecf-da131ace0688.jpg" width="300px">

<img src = "https://user-images.githubusercontent.com/73948775/126855372-5c8643d9-5231-479f-97a0-c9f875107312.jpg" width="300px"> <img src = "https://user-images.githubusercontent.com/73948775/126855398-fe40328f-b310-4052-a999-be2c9e8fbacf.jpg" width="300px"> <img src = "https://user-images.githubusercontent.com/73948775/126855394-3c94be91-87f3-412b-a83b-ed04ec4230c8.jpg" width="300px"> <img src = "https://user-images.githubusercontent.com/73948775/126855414-43c86d04-0f4f-4183-95de-f3da26522802.jpg" width="300px"> <img src = "https://user-images.githubusercontent.com/73948775/126855420-9a98b59b-d49d-45b3-8631-d4d9bbd875db.jpg" width="300px"> 


<br/>





## 신규기종 추가 방법

스마트폰 신규기종 추가 및 금액 변경은 setOnItemSelectedListener 에서 작업합니다.
```sh
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {


                String spinner1_value = (String) s.getSelectedItem();
                if(spinner1_value.equals("갤럭시폴드")){
                    result1 = 1500400;
                    tvResult.setText(String.valueOf(result1));
                }
                else if (spinner1_value.equals("갤럭시폴드2")){
                    result1 = 2398000;
                    tvResult.setText(String.valueOf(result1));
                }
```
<br/>

## 출시
<img src = "https://user-images.githubusercontent.com/73948775/114270668-aa467880-9a48-11eb-8a29-64bcc87040dd.jpg" width="600px">
21.04.10 기준 1000명 이상 다운로드 수를 기록하였습니다.<br/>
주기적인 업데이트를 통해 신규 스마트폰 추가, 레이아웃 교체를 진행하겠습니다.



<br/>

### 문의

  - 메일 : haruple97@naver.com
  - 카카오톡 : 946837
  - 블로그 : https://haruple.tistory.com/
  - 유튜브 : https://www.youtube.com/channel/UCI9vrgDbeFdsrQEk-4RWoiA
