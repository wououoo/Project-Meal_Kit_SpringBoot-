<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="java.util.*" %>
<%@ page import="org.mealkitspringboot.mapper.*"%>
<%@ page import="org.mealkitspringboot.config.*"%>
<%@ page import="org.mealkitspringboot.domain.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>밀키트 관리 시스템</title>
	<!-- 부트스트랩 연결 -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
	<!-- reset.css 연결 -->
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/reset-css@5.0.2/reset.min.css">
	<!-- main.css 연결 -->
	<link rel="stylesheet" href="/resources/css/main.css" />
	<!-- google font & google material icon -->
  <!-- Google 나눔고딕 -->
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" />
  <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap" rel="stylesheet">

	<!-- Google material 아이콘 -->
	<!-- 아이콘을 이미지가 아닌, 폰트처럼 사용 가능함 -->
	<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />

	<!-- jQuery 연결 -->
	<script defer src="/resources/js/jquery-3.7.1.min.js"></script>
	
	<!-- bomList.css 연결 -->
	<link href="/resources/css/bomList.css" rel="stylesheet">

	<!-- jQuery 연결 -->
	<script defer src="/resources/js/readBom.js"></script>

</head>
<body>	

	<!-- header 공통 부분 연결 -->
	<%@ include file="../includes/header.jsp" %>
	
	<!-- ============================================================================== -->
	<!-- BOM 현황 -->
	<section>
		<div class="main_wrap">
			<div class="blank"></div>
			<!-- 제품 검색 -->
			<div class="inner search_container">
				<div class="BOM_list_tit">
					<h1>BOM 현황</h1>
				</div>
				<div class="search_header">
					<div class="search_header search_tit">
						<div class="search_tit search_detail_tit">
							제품검색
						</div>
						<div class="search_tit search">
							<span class="material-symbols-outlined">
								<!-- ★★★ # 에 검색 메소드 연결할 것 -->
								<!-- <a href="javascript:submitReadBomForm();">Search</a> -->
								<a href="#">Search</a>
							</span>
						</div>
					</div>
					<div class="search_header search_body">
					<!-- form 태그는 여기다 ============================== -->
						<form action="" method="get" class="searchBom" name="searchBom" id="searchBom">
							<div class="search_body prodNm_search">
								<h3>제품명</h3>
								<select class="form-select" name="prodNm" id="prodNm" aria-label="Default select example">
									<option value="">제품명 선택</option>
									<c:forEach items="${prodNmList}" var="prodNms">
										<option value="<c:out value='${prodNms.prodNm}' />" >
											<%-- <c:if test ="${user.selectedprodNm eq prodNmList.prodNm}">selected="selected"</c:if> --%>
											<c:out value='${prodNms.prodNm}' />
										</option>
									</c:forEach>
								</select>
							</div>
							<div class="search_body prodSpec_search">
								<h3>제품종류</h3>
									<select class="form-select" name="prodDiv" id="prodDiv" aria-label="Default select example" >
										<option value="">제품종류 선택</option>
									  <c:forEach items="${prodDivList}" var="prodDivs">
											<option value="<c:out value='${prodDivs.prodDiv}' />" >
												<%-- <c:if test ="${user.selectedprodDiv eq prodDivList.prodDiv}">selected="selected"</c:if>> --%>
												<c:out value='${prodDivs.prodDiv}' />
											</option>
										</c:forEach>
									</select>
							</div>
							<div class="search_body matNm_search">
								<h3>재료명</h3>
									<select class="form-select" name="matNm" id="matNm" aria-label="Default select example">
									  <option value="">재료명 선택</option>
										<c:forEach items="${matNmList}" var="matNms">
											<option value="<c:out value='${matNms.matNm}' />" >
												<%-- <c:if test ="${user.selectedMatNm eq matNmList.matNmResult}">selected="selected"</c:if>> --%>
												<c:out value='${matNms.matNm}' />
											</option>
										</c:forEach>
									</select>
							</div>
						</form>
					</div>
				</div>
			</div>
			
			<!-- BOM 목록 -->
			<form action="./bomDelete.jsp" method="post" id="container-all">
				<div class="inner list_container">
	    		<div class="inner BOM_list">
	        	<div class="BOM_list bom_delete">
	        		<!-- checkBox 누른 것을 삭제하는 함수 연결할 것 -->
	            <!-- <a href="javascript: submitDeleteRow();"> -->
	            <a href="#">
	        	    <button type="button" class="btn btn-secondary btn-sm btn-delete">삭제</button>
	            </a>
	       		</div>
	        	<div class="BOM_list list_box">
	          <table class="table" id="table">
	          	<thead class="table-dark">
						    <tr>
						    	<th>
						    		<div class="form-check">
						    			<!-- checkAll 누르면 전체 checkBox 선택/해제 적용하는 함수 연결할 것 -->
										  <!-- <input class="form-check-input" type="checkbox" value="" id="checkAll" onclick="javascript: checkBox();"> -->
										  <input class="form-check-input" type="checkbox" value="" id="checkAll" onclick="#">
										  <label class="form-check-label" for="checkAll"></label>
										</div>
						    	</th>
						    	<th>#</th>
						    	<th>BOM코드</th>
						    	<th>제품코드</th>
						    	<th>제품명</th>
						    	<th>종류</th>
						    	<th>규격</th>
						    	<th>LOT사이즈</th>
						    	<th>종류</th>
						    	<th>재료코드</th>
						    	<th>재료명</th>
						    	<th>단위</th>
						    	<th>수량</th>
						    	<th>수정</th>
						    </tr>
						  </thead>
						  <tbody id="tBody">
								<c:forEach items="${bomList}" var="bom">
							  	<tr data-row-id="<c:out value='${bom.listSeq}' />">
							    	<td>
							    		<div class="form-check">
							    			<!-- delete 쿼리문에 필요한 값인 bomId, matId를 넘겨야 함 => value 값에 넣기 -->
											  <input class="form-check-input chk" type="checkbox" value="<c:out value='${bom.bomId}' />, <c:out value='${bom.matId}' />" id="flexCheckDefault" name="deleteCheckBox">
											  <label class="form-check-label" for="flexCheckDefault"></label>
											</div>
							    	</td>
							    	<td><c:out value='${bom.listSeq}' /></td>
							    	<td><c:out value='${bom.bomId}' /></td>
							    	<td><c:out value='${bom.prodId}' /></td>
							    	<td><c:out value='${bom.prodNm}' /></td>
							    	<td><c:out value='${bom.prodDiv}' /></td>
							    	<td><c:out value='${bom.prodSpec}' /></td>
							    	<td><c:out value='${bom.lotSize}' /></td>
							    	<td><c:out value='${bom.matDiv}' /></td>
							    	<td><c:out value='${bom.matId}' /></td>
							    	<td><c:out value='${bom.matNm}' /></td>
							    	<td><c:out value='${bom.quantityUnits}' /></td>
							    	<td><c:out value='${bom.bomProdQuantity}' /></td>
							    	<td>
							    		<!-- ★★★ 메소드 링크할 것 -->
											<%-- <button type="button" class="btn btn-secondary btn-sm btn-update" onclick="editRow(${bom.listSeq})"> --%>
											<button type="button" class="btn btn-secondary btn-sm btn-update" onclick="#">
		                  	수정
		                  </button>
						    		</td>
							    </tr>
							    <!-- 수정 Form이 들어갈 빈 행 추가 -->
		             	<%-- <tr id="modifyRow_<%= /* list.getList_seq() */ %>" style="display: none;"> --%>
		             	<tr id="modifyRow_<c:out value='${bom.listSeq}' />" style="display: none;">
		              	<td colspan="14"></td>
		              </tr>
								</c:forEach>
						  </tbody>
						</table>
					</div>
					
				</div>
			</div>
		</form>
	</section>
	
	
	<!-- ============================================================================== -->
	<!-- footer 공통 부분 연결 -->
	<%@ include file="../includes/footer.jsp" %>

<script defer src="/resources/js/bom.js"></script>
<script>
	
</script>
</body>
</html>
