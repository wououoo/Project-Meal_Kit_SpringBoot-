<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>밀키트 관리 시스템</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/reset-css@5.0.2/reset.min.css">
	<link rel="stylesheet" href="/resources/css/main.css" />
    <link rel="stylesheet" href="/resources/css/footer.css" />
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" />
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic&display=swap" rel="stylesheet">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
	<script src="/resources/js/jquery-3.7.1.min.js"></script>
	<link rel="stylesheet" href="/resources/css/manufacturing.css" />
</head>
<body>
	<%@ include file="../includes/header.jsp" %>
	<div class="subject">
		<p><a href="/manufacturing">제조 수행</a></p>
	</div>
	<div class="manufacturing">
		<div class="table5">
			<div class="table1">
				<div class="sub_table">
					<table>
						<tr>
							<th class="t1_1">Lot번호</th>
							<th class="t1_2">지시자</th>
							<th class="t1_3">제품번호</th>
							<th class="t1_4">Lot Size</th>
							<th class="t1_5">생산량</th>
							<th class="t1_6">지시일</th>
							<th class="t1_7">수행일</th>
							<th class="t1_8">수행자</th>
							<th class="t1_9">완료버튼</th>
						</tr>
					</table>
				</div>
				<div class="content">
					<table>
					</table>
				</div>
			</div>
		</div>
		<div class="table4">
			<div class="table2">
				<div class="sub_table">
					<table>
						<tr>
							<th class="t2_1">제품번호</th>
							<th class="t2_2">제품명</th>
							<th class="t2_3">제품수량</th>
							<th class="t2_4">재료현황</th>
						</tr>
					</table>
				</div>
				<div class="content">
					<table>
					</table>
				</div>
			</div>
			<div class="table3">
				<div class="sub_table">
					<table>
						<tr>
                            <th class="t3_1">재료번호</th>
                            <th class="t3_2">재료명</th>
                            <th class="t3_3">재고수량</th>
                            <th class="t3_4">표준량</th>
                            <th class="t3_5">LOT(1000) 기준</th>
                        </tr>
                    </table>
                </div>
                <div class="content">
					<table>
					</table>
				</div>
			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-latest.min.js"></script>
    <script src="../js/manufacturing.js"></script>
	<%@ include file="../includes/footer.jsp" %>
</body>
</html>