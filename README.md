## 스마트폰 요금 계산기 (PhoneCalculator)



<img src = "https://user-images.githubusercontent.com/73948775/114272606-cbf82d80-9a51-11eb-8ecf-da131ace0688.jpg" width="300px">

### 기능
- 폰 구매 기본지식
- 공시지원금 계산기
- 선택약정 계산기
- 중고 폰 계산기

  
  
```sh
스마트폰 시장은 불법보조금 및 요금제 사기 문제가 지속되고 있습니다.
그동안 지인들의 스마트폰 사기방지를 위해 많은 도움을 주었으며,  
지인 뿐만 아니라 많은 분들이 해당 앱을 사용함으로 인해 사기를 방지할 수 있기를 기대합니다.
```

<br/>
<br/>


<img src = "https://user-images.githubusercontent.com/73948775/114269313-5e440580-9a41-11eb-9bc0-fdf88b9c60bf.jpg" width="600px">

<br/>

### 메인
<img src = "https://user-images.githubusercontent.com/73948775/104124451-561df080-5394-11eb-97ec-e3f13050496a.jpg" width="300px">
<br/>

### 공시지원금 계산기
<img src = "https://user-images.githubusercontent.com/73948775/104124356-d859e500-5393-11eb-9bd0-15b7b050e955.jpg" width="300px">

##### 입력란에 스마트폰 기종 선택, 요금제, 공시지원금 금액 등을 입력하면 기기값, 할부이자, 총 납입금액, 한달 요금을 계산해줍니다.
##### 스피너를 사용하여 기기를 선택, 요금제를 계산할 수 있도록 하였습니다.

<br/>

##### 스마트폰 신규기종 추가 및 금액 변경은 setOnItemSelectedListener 에서 작업합니다.
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

### 21.04.10 기준 1000명 이상 다운로드 수를 기록하였습니다.
<img src = "https://user-images.githubusercontent.com/73948775/114270668-aa467880-9a48-11eb-8a29-64bcc87040dd.jpg" width="600px">

주기적인 업데이트를 통해 신규 스마트폰 추가, 레이아웃 교체를 진행하겠습니다.



<br/>

### 문의

  - 메일 : haruple97@naver.com
  - 카카오톡 : 946837
  - 블로그 : https://haruple.tistory.com/
  - 유튜브 : https://www.youtube.com/channel/UCI9vrgDbeFdsrQEk-4RWoiA
