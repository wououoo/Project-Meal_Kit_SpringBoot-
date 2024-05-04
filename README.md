# 스프링부트를 이용한, 밀키트 제조업체를 위한 웹 솔루션 개발

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
  - 
### 🧑‍🤝‍🧑 멤버 구성
|팀원명|프로필|담당업무|
|---|---|---|
|[김영범(팀장)](https://github.com/blanchit)|<p align="center"><img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/1c2ddcb9-00a5-4f01-adbf-70476726e1c1" width="100"></p>|판매관리 - 프로젝트 구성 및 개발 범위 기획, 판매 주문서 CRUD|
|[조다혜(팀원)](https://github.com/ChoDaHye)|<p align="center"><img src="https://avatars.githubusercontent.com/u/151722511?v=4" width="100"></p>|인사관리 - 메인메뉴, 구성원 관리, 로그인 화면, 공지사항 CRUD|
|[우경주(팀원)](https://github.com/wououoo)|<p align="center"><img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/2bdb07d5-ae47-44f5-89dd-6335d7030ca3" width="100"></p>|구매관리 - 공급업체 및 원자재 데이터 베이스 작성, 구매 시스템 설계 및 기능 구현|
|[정수하(팀원)](https://github.com/heyJSH)|<p align="center"><img src="https://avatars.githubusercontent.com/u/150403977?v=4" width="100"></p>|공유 드라이브/깃허브 관리, 테이블 설계 및 ERD 초안 작성, 제조관리 - BOM CRUD|
|[진재원(팀원)](https://github.com/jinjw98?tab=overview&from=2024-04-01&to=2024-04-30)|<p align="center"><img src="https://github.com/heyJSH/Project-Meal_Kit_SpringBoot/assets/150403977/11e3b565-bdbc-413d-97a4-89b32a34a785" width="100"></p>|제조관리 - 제조 지시서 CRUD, 제조 수행 CRUD|


<br><br>


## 📕 담당 기능
밀키트를 생산/제조하는 업체에서 자원관리를 위해 사용하는 프로그램을 제공한다.
<details>
  <summary><b>1. 원자재 관리</b> (👈 Click)</summary>
  <br>
  <div markdown="1">
    <ul>
      <li>.</li>
      <li>부서별 접근 가능한 페이지가 다르다.
        <ol>
          <li>
            ex1) 생산팀은 로그인 시 `재고현황`, `제조관리`만 보여준다. <br>
            <src = "https://github.com/wououoo/Project-Meal_Kit_SpringBoot-/assets/156730657/54d83d40-1dab-4cb8-8cfa-d196e90afb24">

          </li>
          <li>
            ![원자재12](https://github.com/wououoo/Project-Meal_Kit_SpringBoot-/assets/156730657/3f0e3e54-f78c-448a-a61f-69fc7e6f4357)

          </li>
        </ol>
      </li>
    </ul>
  </div>
</details>



<details>
  <summary><b>2. 공급업체 관리</b> (👈 Click)</summary>
   <br>
  <div markdown="1">
    <ul>
       <li>BOM 현황
          <ol>
             <li>
                BOM 현황에서 [BOM 검색 및 조회], [BOM 수정], [BOM 삭제]를 할 수 있다.
             </li>
             ![원자재1](https://github.com/wououoo/Project-Meal_Kit_SpringBoot-/assets/156730657/724a4045-d2a8-4376-aa9b-9e5982c54fb0)
             <li>
                <b>BOM 현황 - BOM 검색 및 조회</b>
             </li>
             <ol>
                <li>select box의 option을 선택 → 검색 버튼을 누르면 해당하는 목록을 조회할 수 있다.</li>
                ![원자재12](https://github.com/wououoo/Project-Meal_Kit_SpringBoot-/assets/156730657/5444a62a-03dd-4049-8870-939564487d85)
             </ol>
          </ol>
       </li>
    </ul>
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
