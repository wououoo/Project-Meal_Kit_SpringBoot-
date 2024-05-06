# 스프링부트를 이용한, 밀키트 제조업체를 위한 웹 솔루션 개발
![image](https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/71fc3003-6628-40fd-a6d9-76919a0e7438)

<br>

## 📌 목차
1. [🖥️ 프로젝트 개요](#-프로젝트-개요)
2. [📕 주요기능](#-주요기능)
3. [🔧 아키텍처](#-아키텍처)
4. [🏗️ ERD](#-ERD)
5. [⚠️ 트러블 슈팅](#-트러블-슈팅)
6. [📽️ 작동 영상](#-작동-영상)
7. [🗃️ 발표자료](#-발표자료)

   <br><br>

## 🖥️ 프로젝트 개요
### ⏲️ 프로젝트 개발 기간
  - 2024.01.29 ~ 2024.03.19
    ![image](https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/6004bb2e-135e-492c-ba36-67674976b6a0)

### 🔖프로젝트 주제
  - 대상: 밀키트 제조업을 경영하는 가상의 기업 선정
  - 용도: 구매 → 생산 → 판매 프로세스를 효율적, 체계적으로 관리할 수 있는 시스템
  - 개발: JSP로 만든 코드를 SpringBoot(Maven Project)로 수정하여 웹 솔루션 개발
### 📁프로젝트 구현 내용
  - 제조 회사의 구성원 별 권한 제한 및 프로세스 별 데이터의 CRUD 기능 구현
### ⚙️ 개발환경 및 도구
  - `JAVA 17`
  - `JDK 17.0.2`
  - **IDE**: IntelliJ
  - **Framework**: Springboot(3.1.10)
  - **DataBase**: Oracle DB(ojdbc8)
  - **ORM**: Mybatis
  - **DevOps**: Maven, Git, GitHub
  - **Tools**: Discord, GoogleDrive, StarUML
### 🧑‍🤝‍🧑 멤버 구성
|팀원명|프로필|담당업무|
|---|---|---|
|[김영범<br>(팀장)](https://github.com/blanchit)|<p align="center"><img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/1c2ddcb9-00a5-4f01-adbf-70476726e1c1" width="100"></p>|판매관리 - 프로젝트 구성 및 개발 범위 기획<br>판매 주문서 CRUD|
|[조다혜<br>(팀원)](https://github.com/ChoDaHye)|<p align="center"><img src="https://avatars.githubusercontent.com/u/151722511?v=4" width="100"></p>|메인메뉴, 공지사항 CRUD<br>인사관리 - 로그인 화면, 마이페이지(비밀번호 변경)|
|[우경주<br>(팀원)](https://github.com/wououoo)|<p align="center"><img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/2bdb07d5-ae47-44f5-89dd-6335d7030ca3" width="100"></p>|구매 시스템 설계<br>구매관리 - 공급업체 및 원자재 데이터 베이스 작성<br>사원관리|
|[정수하<br>(팀원)](https://github.com/heyJSH)|<p align="center"><img src="https://avatars.githubusercontent.com/u/150403977?v=4" width="100"></p>|공유 드라이브/깃허브 관리<br>테이블 설계 및 ERD 작성<br>제조관리 - BOM CRUD|
|[진재원<br>(팀원)](https://github.com/jinjw98?tab=overview&from=2024-04-01&to=2024-04-30)|<p align="center"><img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/11e3b565-bdbc-413d-97a4-89b32a34a785" width="100"></p>|제조 시스템 설계<br>제조관리 - 제조 지시서 CRUD, 제조 수행 CRUD|

<br><br>


## 📕 주요기능
밀키트를 생산/제조하는 업체에서 자원관리를 위해 사용하는 프로그램을 제공한다.
<details>
  <summary><b>1. 로그인 & 접근제한 [조다혜]</b> (👈 Click)</summary>
  <br>
  <div markdown="1">
     <h3>로그인 & 접근제한</h3>
    <ul>
      <li>직원 번호가 데이터에 있으면 로그인이 가능하다.</li>
      <li>부서별 접근 가능한 페이지가 다르다.
        <ol>
          <li>
            ex1) 생산팀은 로그인 시 `재고현황`, `제조관리`만 보여준다. <br>
            <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/83eb1444-d06f-4b7c-a750-cfb08b1dee16" alt="생산팀 접근가능한 메뉴">
          </li>
          <li>
            ex2) 관리팀은 모든 페이지에 접근할 수 있다. <br>
            <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/2c487107-703d-44df-b55d-2712ea79ae70" alt="관리팀 접근가능한 메뉴">
          </li>
        </ol>
      </li>
    </ul>
  </div>
</details>

<details>
  <summary><b>2. 마이페이지 [조다혜]</b> (👈 Click)</summary>
   <br>
  <div markdown="1">
     <h3>마이페이지</h3>
    <ul>
      <li>'직원이름'과 '직원아이디'는 수정할 수 없다.</li>
      <li>'비밀번호', '전화번호'는 수정할 수 있다.
        <ol>
          <li>
            비밀번호, 전화번호 수정 시 포맷을 맞추도록 했다. <br>
            <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/7449c4dd-4328-4408-9483-82ddf8c29686" alt="직원정보수정">
          </li>
        </ol>
      </li>
    </ul>
  </div>
</details>

<details>
  <summary><b>3. 공지사항 [조다혜]</b> (👈 Click)</summary>
   <br>
  <div markdown="1">
     <h3>공지사항</h3>
    <ul>
      <li>'공지사항'에서 제목을 검색할 수 있다.</li>
      <li>title을 누르면 해당 글을 수정할 수 있다.</li>
    </ul>
    <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/151722511/8aa1c6e0-36c0-4665-b32f-3835c3501ef6" alt="공지사항 이미지">
  </div>
</details>

<details>
  <summary><b>4. 사원관리 [우경주]</b> (👈 Click)</summary>
   <br>
  <div markdown="1">
     <h3>사원관리</h3>
    <ul>
       <li>신입 사원을 위한 정보를 입력한 후, [완료] 버튼을 누르면 사원 테이블에 DB가 추가된다.</li>
       <li>모든 입력란을 입력해야 [완료] 버튼이 활성화된다.</li>
       <li>사원번호는 사원 테이블의 시퀀스로 입력된다.</li>
       <li>비밀번호는 1234 고정이다.</li>
       <li>부서명은 부서번호 입력 시 그에 알맞는 부서명으로 입력된다.</li>
       <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/ca2f1df1-71f8-42cc-b36d-cb7ed9132dbd" alt="사원관리1">
       <br>
       <li>없는 부서의 번호를 입력하면 경고가 뜬다.</li>
       <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/694d2e71-3329-4aea-a470-a015fd9b9ab1" alt="사원관리2">
       <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/4c1deb96-689f-4bf5-aac0-f172b58198e9" alt="사원관리3">
       <br>
    </ul>
  </div>
</details>

<details>
  <summary><b>5. 구매관리 [우경주]</b> (👈 Click)</summary>
   <br>
  <div markdown="1">
     <h3>구매관리 - 재고현황</h3>
    <ul>
       <li>완제품과 재료의 현황을 출력한다.</li>
       <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/7f50345e-bfb0-4a0b-af07-8a65cbf0c7da" alt="재고현황1">
       <br>
       <li>원자재 재고에서 [삭제] 버튼을 누르면 경고 후, [확인] 버튼을 누르면 삭제된다.</li>
       <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/3fbe538d-5d0e-486c-9116-8e0a84d987bc" alt="재고현황2">
       <br>
       <li>원자재 재고에서 [추가] 버튼을 누르면 모달창이 뜨고, 데이터를 입력 후, [추가] 버튼을 누르면 DB에 저장된다.</li>
       <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/96deeeeb-525a-4c49-b1d8-325cd2bcc5f1" alt="재고현황3">
       <br>
       <li>원자재 재고에서 [재료정보 수정] 버튼을 누르면 모달창이 뜨고, 원자재를 선택하면 해당 내용의 데이터가 출력된다.</li>
       <li>데이터를 수정한 후, [수정] 버튼을 누르면 수정된 데이터가 DB에 저장된다.</li>
       <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/7357edd3-c893-4240-80a9-13f89625b82a" alt="재고현황4">
       <br>
    </ul>
  </div>
</details>

<details>
  <summary><b>6. 제조관리 - BOM 관리 [정수하]</b> (👈 Click)</summary>
   <br>
  <div markdown="1">
     <h3>제조관리 - BOM 현황</h3>
    <ul>
       <li>
          <b>BOM 현황에서 [BOM 검색 및 조회], [BOM 수정], [BOM 삭제]를 할 수 있다.</b>
       </li>
       <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/3004b0db-c451-4554-989a-df53172963e1" alt="BOM 현황">
       <li>
          <b>BOM 현황 - BOM 검색 및 조회</b>
       </li>
       <ol>
          <li>select box의 option을 선택 → 검색 버튼을 누르면 해당하는 목록을 조회할 수 있다.</li>
          <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/bce88b20-6bc8-48d5-a64e-6b3112e43f63" alt="BOM 검색 및 조회">
       </ol>
       <li>
          <b>BOM 현황 - BOM 수정</b>
       </li>
       <ol>
          <li>원하는 행의 [수정] 버튼을 누르면 동적인 Form에서 수정할 수 있다.</li>
          <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/c4bb8b4b-b134-4b02-ba7a-5504034e18e8" alt="BOM 수정">
       </ol>
       <li>
          <b>BOM 현황 - BOM 삭제</b>
       </li>
       <ol>
          <li>원하는 행을 선택 후, [삭제] 버튼을 누르면 삭제할 수 있다.</li>
          <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/cbb799ab-51d8-4c3b-8092-e90e217d2a01" alt="BOM 삭제">
       </ol>
    </ul>
     <h3>제조관리 - BOM 등록</h3>
     <ul>
        <li>
           <b>Step 1. 제품 등록</b>
        </li>
        <ol>
           <li>빈 값이나, 형식에 맞지 않으면 alert()로 안내한다.</li>
           <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/fdc7c8da-a9f3-489e-83fe-25e30b182e9f" alt="BOM 제품등록">
        </ol>
        <li>
           <b>Step 2. 재료 등록</b>
        </li>
        <ol>
           <li>1단계에서 등록한 [제품 정보]를 조회하면서 재료를 등록할 수 있다.</li>
           <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/5601411d-bddc-4e61-aa92-3620c335cb8a" alt="BOM 재료등록1">
           <br>
           <li>[재료 추가] 버튼을 누르면 모달 창이 뜨고, [확인] 버튼을 누르면 등록한 목록을 볼 수 있다.</li>
           <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/6087617e-31d7-476e-bd26-ac6ce8448463" alt="BOM 재료등록2">
           <br>
           <li>'ea'로 입력하면 'EA'로 자동 변환하고, 'g'로 입력하면 'kg'로 자동 변환한다.</li>
           <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/c642d9a6-6f1e-47e4-9245-9b1aefe434c7" alt="BOM 재료등록3">
           <br>
           <li>재료를 중복으로 추가하지 않도록 방지한다.</li>
           <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/5b1d7fdc-fde3-456f-a9e0-bd6ea4007429" alt="BOM 재료등록4">
           <br>
        </ol>
        <li><b>Step 3. 공급 업체 등록</b></li>
        <ol>
           <li>2단계에서 등록한 [재료 정보]를 조회하면서 공급 업체를 등록할 수 있다.</li>
           <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/545e5367-9c1c-40a2-a430-8624df5dec01" alt="공급업체 등록">
        </ol>
        <li><b>Step 4. 등록 확인</b></li>
        <ol>
           <li>최종적으로 BOM 등록을 할 것인지 선택한 후, [Submit] 버튼을 누르면 등록이 된다.</li>
           <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/8498bf76-8e8e-4082-bfc3-fc6c2487e326" alt="등록 확인">
        </ol>
     </ul>
  </div>
</details>

<details>
  <summary><b>7. 제조관리 - 제조지시 및 제조수행 [진재원]</b> (👈 Click)</summary>
   <br>
  <div markdown="1">
    <h3>제조관리 - 제조지시 및 제조수행</h3>
     <ul>
        <li><b>제조지시</b></li>
        <ol>
           <li>제조 지시서를 위한 정보를 입력하고 [제출] 버튼을 누르면 저장된다.</li>
           <li>모든 입력란을 입력해야 [제출] 버튼이 활성화된다.</li>
           <li>제출을 하면 지시 테이블과 수행 테이블에 추가되어 갱신된 지시 테이블의 표를 출력한다.</li>
           <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/aca8db24-1aa6-4fa0-8a60-9359fd9f8d67" alt="제조지시1">
           <br>
           <li>판매중인 상품의 현황을 출력한다.</li>
           <li>지시서 작성을 위한 제품번호를 표시한다.</li>
           <li>지시를 수행하면 수량이 증가한다.</li>
           <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/391bd9e9-0d68-46a9-99ed-9fd5c0d68df7" alt="제조지시2">
           <br>
           <li>직원 테이블에 존재하지 않는 지시자 ID를 입력하면 경고가 뜬다.</li>
           <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/e4d95189-5141-4d02-9487-f06dfe860e4d" alt="제조지시3">
           <br>
           <li>완제품 테이블에 존재하지 않는 제품번호를 입력하면 경고가 뜬다.</li>
           <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/71345bc3-7972-4096-a779-b7b68199f12a" alt="제조지시4">
           <br>
           <li>천 단위가 아닌 Lot Size를 입력하면 경고가 뜬다.</li>
           <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/75c109be-fe0d-468d-b819-257be1e87b9c" alt="제조지시5">
           <br>
           <li>당일보다 전 날을 지시일로 입력하면 경고가 뜬다.</li>
           <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/6b1bbcfb-779f-482b-8c42-4e22353ac34f" alt="제조지시6">
           <br>
        </ol>
     </ul>
     <ul>
        <li><b>제조수행</b></li>
        <ol>
           <li>수행한 정보를 제조 수행서에 입력하여 [완료] 버튼을 누르면 저장된다.</li>
           <li>모든 입력란을 입력해야 [완료] 버튼이 활성화된다.</li>
           <li>수행을 완료하면 수행 테이블에서 제거되어 갱신된 표를 출력하고 지시 테이블을 업데이트한다.</li>
           <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/c7b55100-4697-4f01-a697-c45fe648f6ed" alt="제조수행1">
           <br>
           <li>판매중인 상품의 현황을 출력한다.</li>
           <li>지시를 수행하면 완제품의 수량이 증가한다.</li>
           <li>새로고침 하지 않아도 바로 적용된다.</li>
           <li>[더보기]를 눌러 BOM에 필요한 재료들을 옆에 출력한다.</li>
           <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/cc9c3ae2-2830-4729-a5f1-eb4ab967714d" alt="제조수행2">
           <br>
           <li>상품을 만들기 위한 재료의 현황과 기본 표준량과 비교하여, 제조가능여부를 판별한다.<br>이 때, 제조가능여부가 가능이어도 LOT Size에 따라 불가능할 수도 있다.</li>
           <li>지시를 수행하면 재료의 수량이 감소한다.</li>
           <li>새로고침 하지 않아도 바로 적용된다.</li>
           <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/90330601-5bd9-4bb0-a911-9ec8ad1fee8b" alt="제조수행3">
        </ol>
     </ul>
  </div>
</details>

<details>
  <summary><b>8. 판매관리 [김영범]</b> (👈 Click)</summary>
   <br>
  <div markdown="1">
    <h3>판매관리</h3>
     <ul>
        <li><b>판매관리 화면</b></li>
        <ol>
           <li>고객으로부터 받은 주문 내용을 입력하여 DB에 저장하고 조회, 수정, 삭제를 할 수 있는 기본적인 기능에 충실하여 개발했다.</li>
           <li>Sales Order Main 화면에서 입력, 수정, 조회 화면으로 링크되어 변경사항은 DB에 직접 반영된다.</li>
           <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/54c35835-e645-45ba-b6ce-f2268e4ec157" alt="판매관리">
        </ol>
     </ul>
  </div>
</details>
<br><br>

## 🔧 아키텍처
####  * 서버 배포를 진행하지 않았음
![image](https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/48ce3678-66f3-4da3-8036-2610a6e69194)

<br><br>

## 🏗️ ERD
DB와 ERD <br>
![image](https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/bcbfa9be-686b-4970-81d5-977aa1d2e7b5)
<br><br>

## ⚠️ 트러블 슈팅
<details>
   <summary>트러블슈팅1: <b>BOM 테이블 - BOM ID의 PK 불가능</b> (👈 Click)</summary>
   <br>
   <div markdown="1">
      <h3>문제점</h3>
      <b>1. BOM 테이블 - BOM ID의 PK 여부:</b>
      <ul>
         <li>BOM은 일종의 '레시피'라고 생각하면 된다.</li>
         <li>동일한 BOM ID에 '1개의 제품ID', '여러개의 재료ID'가 저장될 수 있어야 한다.</li>
         <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/d3e1e60c-1a5b-4779-a673-66a407b3f500" alt="BOM ID1">
      </ul>
      <br>
      <h3>해결방안</h3>
      <b>1. BOM 테이블 - BOM ID의 PK 삭제:</b>
      <li>위의 문제로 인해, BOM ID는 PK가 불가능하여 DB 조건을 수정해 주었다.</li>
      <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/dc3af4c7-d1e3-4493-b4a6-0a31f249623b" alt="BOM ID2">
   </div>
</details>

<details>
   <summary>트러블슈팅2: <b>BOM 등록 시, DB 저장 로직</b> (👈 Click)</summary>
   <br>
   <div markdown="1">
      <h3>문제점</h3>
      <b>1. DB 저장 로직:</b>
      <ul>
         <li>사용자가 입력한 '제품' 혹은 '재료'의 정보가 기존의 DB에 존재하는지에 따라 Skip을 하거나, Insert 해야 한다.</li>
         <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/38f80d76-b662-4888-af34-a43d5b50ec3b" alt="BOM 등록 - DB 저장 로직1">
         <li>사용자가 입력한 '제품' 정보에 해당하는 'LOT ID'가 기존의 DB에 존재하는지에 따라 Skip을 하거나, Insert 해야 한다.</li>
         <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/ecfef36d-39bc-4f5d-9cce-339bb4b3958b" alt="BOM 등록 - DB 저장 로직2">
         <li>사용자가 입력한 '제품' 정보에 해당하는 'BOM ID'가 기존의 DB에 존재하는지에 따라 해당 ID로 Insert 하거나, 새로운 ID(시퀀스)로 Insert 해야 한다.</li>
         <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/0e3db293-937d-4bc2-a135-e0c32cef3d5e" alt="BOM 등록 - DB 저장 로직3">
      </ul>
      <br>
      <h3>해결방안</h3>
      <b>1. 트랜잭션 사용:</b>
      <ul>
         <li>조건을 확인한 후, DB에 값을 저장할 수 있도록 트랜잭션을 사용했다.</li>
         <li>'제품', '재료' DB 저장을 위한 코드는 아래와 같다.</li>
         <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/7bd7f876-a994-4e98-93bf-e082456cf824" alt="DB 저장 코드1">
         <li>'LOT ID' DB 저장을 위한 코드는 아래와 같다.</li>
         <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/16bba334-b07a-465d-94df-fe8a03051aa1" alt="DB 저장 코드2">
         <li>'BOM ID' DB 저장을 위한 코드는 아래와 같다.</li>
         <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/8d0da5b3-22b2-4717-82b8-84c53bf62dca" alt="DB 저장 코드3">
         <li>BOM 등록을 위한 Controller 코드는 아래와 같다.</li>
         <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/d70188e8-d656-4cdf-a9cf-ea6b3e1f9d2e" alt="DB 저장 코드4">
      </ul>
   </div>
</details>

<details>
   <summary>트러블슈팅3: <b>BOM 현황 및 등록 시, 사용자 편의성</b> (👈 Click)</summary>
   <br>
   <div markdown="1">
      <h3>문제점</h3>
      <b>1. BOM 삭제 시, 사용자 편의를 위한 고민:</b>
      <ul>
         <li>BOM 삭제 시, 한 번에 여러 개를 선택하여 삭제하는 것이 사용자 입장에서 편하다고 생각했다.</li>
      </ul>
      <b>2. BOM 등록 시, 사용자 편의를 위한 고민:</b>
      <ul>
         <li>BOM 등록 시, 한 번에 여러 재료를 등록하는 것이 사용자 입장에서 편하다고 생각했다.</li>
      </ul>
      <br>
      <h3>해결방안</h3>
      <b>1. 체크박스 구현:</b>
      <ul>
         <li>BOM 삭제 시, 체크박스를 선택하여 한 번에 여러 개를 선택하여 삭제할 수 있도록 했다.</li>
         <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/5a2c1db0-f8a3-44ed-bbcd-2e1bc91e4a29" alt="BOM 삭제">
      </ul>
      <b>2. Multi-Step-Form 구현:</b>
      <ul>
         <li>BOM 등록 시, Multi-Step-Form으로 사용자가 한 번에 여러 개의 재료를 등록할 수 있도록 했다.</li>
         <li>이 때, 사용자가 입력했던 정보를 목록으로 보면서 입력할 수 있도록 했다.</li>
         <ul>
            <li>1단계에서 등록한 [제품 정보]를 조회하면서 '재료'를 등록할 수 있다.</li>
            <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/9eeeee58-c12d-4627-8017-84b282d2cfa9" alt="BOM 등록1">
            <li>등록한 [재료 정보]를 보면서 다른 '재료'를 등록할 수 있다.</li>
            <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/d3f99fe6-961d-4ac4-bea8-a08959e768f4" alt="BOM 등록2">
            <li>2단계에서 등록한 [재료 정보]를 조회하면서 '공급 업체'를 등록할 수 있다.</li>
            <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/c3e14fe2-b968-4d98-beb6-cdd6ad282b0a" alt="BOM 등록3">
         </ul>
      </ul>
   </div>
</details>

<br><br>

## 📽️ 작동 영상
[[📹 작동 영상]](https://drive.google.com/file/d/12LwcEgv2JtFC25zAbUwQ4FCezuiNiI1k/view?usp=sharing)

<br><br>

## 🗃️ 발표자료
[[📁 발표자료]](https://docs.google.com/presentation/d/1QjsvlfchS8P3VC5L9bs7ub28Z7tHrE2s/edit?usp=sharing&ouid=106247567413866015973&rtpof=true&sd=true)

<br><br>

## 🗨️ 자체 평가 의견
### [좋은점]
   - 의견 공유 및 소통이 좋았다.
   - 각자 맡은 역할을 충실히 수행한 것이 좋았다.
   - 프론트엔드로 웹을 구현해서 좋았다.
   - 나의 적성이 뭔지 명확히 알 수 있었다.
   - 깃허브를 통한 협업이 좋았다.
   - js를 많이 사용해 볼 수 있는 기회가 되어서 좋았다.

### [아쉬운점]
   - 테이블 수정이 빈번했던 것이 아쉬웠다.
   - 설계 단계에서 더 구체적으로 구상했으면 좋았을 것 같다.
   - 미흡한 디자인이 아쉬웠다.
   - 깃허브 커밋 메시지를 상세하게 적지 않은 것이 아쉬웠다.
<br><br>
