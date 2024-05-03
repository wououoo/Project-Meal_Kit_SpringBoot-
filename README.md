# 스프링부트를 이용한, 밀키트 제조업체를 위한 웹 솔루션 개발

## 📌 목차
1. [🖥️ 프로젝트 개요](#-프로젝트-개요)
2. [📕 주요기능](#-주요기능)
3. [🔧 아키텍처](#-아키텍처)
4. [🏗️ ERD](#-ERD)
5. [⚠️ 트러블 슈팅](#-트러블-슈팅)
   <br><br>

## 🖥️ 프로젝트 개요
### ⏲️ 프로젝트 개발 기간
  - 2024.01.29 ~ 2024.02.14
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
|김영범(팀장)|[조다혜(팀원)](https://github.com/ChoDaHye)|우경주(팀원)|[정수하(팀원)](https://github.com/heyJSH)|진재원(팀원)|
|---|---|---|---|---|
|ㅇㅇ|<img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/e311d453-aebb-4758-a744-49af4fa63319" width="100" align="center">|ㅇㅇ|<img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/8a862690-502f-4eea-912c-74dd2e970756" width="100" align="center">|ㅇㅇ|
|판매관리 - 프로젝트 구성 및 개발 범위 기획, 판매 주문서 CRUD|인사관리 - 메인메뉴, 구성원 관리, 로그인 화면, 공지사항 CRUD|구매관리 - 공급업체 및 원자재 데이터 베이스 작성, 구매 시스템 설계 및 기능 구현|제조관리 - 공유 드라이브/깃허브 관리, 테이블 설계 및 ERD 초안 작성, BOM CRUD|제조관리 - 제조 지시서 CRUD, 제조 수행 CRUD|

  - 김영범(팀장): 판매관리 - 프로젝트 구성 및 개발 범위 기획, 판매 주문서 CRUD
  - 조다혜(팀원): 인사관리 - 메인메뉴, 구성원 관리, 로그인 화면, 공지사항 CRUD
  - 우경주(팀원): 구매관리 - 공급업체 및 원자재 데이터 베이스 작성, 구매 시스템 설계 및 기능 구현
  - 정수하(팀원): 제조관리 - 공유 드라이브/깃허브 관리, 테이블 설계 및 ERD 초안 작성, BOM CRUD
  - 진재원(팀원): 제조관리 - 제조 지시서 CRUD, 제조 수행 CRUD <br>
<br><br>

## 📕 주요기능
밀키트를 생산/제조하는 업체에서 자원관리를 위해 사용하는 프로그램을 제공한다.
<details>
  <summary><b>1. 로그인 & 접근제한</b> (👈 Click)</summary>
  <div markdown="1">
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
  <summary><b>2. 마이페이지</b> (👈 Click)</summary>
  <div markdown="1">
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
  <summary><b>3. 공지사항</b> (👈 Click)</summary>
  <div>
    <ul>
      <li>'공지사항'에서 제목을 검색할 수 있다.</li>
      <li>title을 누르면 해당 글을 수정할 수 있다.</li>
    </ul>
    <img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/151722511/8aa1c6e0-36c0-4665-b32f-3835c3501ef6" alt="공지사항 이미지">
  </div>
</details>

<details>
  <summary><b>4. 사원관리</b> (👈 Click)</summary>
  <div markdown="1">
    
  </div>
</details>

<details>
  <summary><b>5. 재고현황</b> (👈 Click)</summary>
  <div markdown="1">
    
  </div>
</details>

<details>
  <summary><b>6. 제조관리 - BOM 관리</b> (👈 Click)</summary>
  <div markdown="1">
    
  </div>
</details>

<details>
  <summary><b>7. 제조관리 - 제조지시 및 제조수행</b> (👈 Click)</summary>
  <div markdown="1">
    
  </div>
</details>

<details>
  <summary><b>8. 판매관리</b> (👈 Click)</summary>
  <div markdown="1">
    
  </div>
</details>
<br><br>

## 🔧 아키텍처
#### 수정필요!!!!!!!!!!!!!!
그림 첨부 필요. 예시는 아래와 같다.<br>
![image](https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/41d35377-005b-49ff-8df4-5669487e3ba3)
<br><br>

## 🏗️ ERD
DB와 ERD <br>
![image](https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/bcbfa9be-686b-4970-81d5-977aa1d2e7b5)
<br><br>

## ⚠️ 트러블 슈팅
<br><br>
