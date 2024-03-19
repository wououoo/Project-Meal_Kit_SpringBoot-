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
	<link rel="stylesheet" href="/resources/css/instruction.css" />
</head>
<body>
	<%@ include file="../includes/header.jsp" %>
	<div class="subject">
		<p><a href="/instruction">제조 지시</a></p>
	</div>
	<div class="instruction">
		<div class="table1">
			<div class="sub_table">
				<table>
					<tr>
						<th class="t1_1">제품번호</th>
						<th class="t1_2">제품명</th>
						<th class="t1_3">제품수량</th>
					</tr>
				</table>
			</div>
			<div class="content">
				<table>
				    <c:forEach items="${finishedProductVOList}" var="instProd">
                        <tr>
                            <td class="t1_1"><c:out value="${instProd.product_id}"/></td>
                            <td class="t1_2"><c:out value="${instProd.product_nm}"/><br>(<c:out value="${instProd.product_spec}"/>)</td>
                            <td class="t1_3"><c:out value="${instProd.product_quantity}"/></td>
                        </tr>
                    </c:forEach>
				</table>
			</div>
		</div>
		<div class="table2">
			<div class="sub_table">
                <form action="instruction_btn" method="post">
				    <table>
                        <tr>
                            <th class="t2_1">Lot번호</th>
                            <th class="t2_2">지시자</th>
                            <th class="t2_3">제품번호</th>
                            <th class="t2_4">Lot Size</th>
                            <th class="t2_5">생산량</th>
                            <th class="t2_6">지시일</th>
                            <th class="t2_7">수행일</th>
                            <th class="t2_8">수행자</th>
                            <th class="t2_9">제출버튼</th>
                            <th class="t2_10">완료여부</th>
                        </tr>
						<tr>
							<td class="t2_1"></td>
							<td class="t2_2"><input type="text" id="inst_id" class="inputField" name="inst_id" placeholder="지시자ID"></td>
							<td class="t2_3"><input type="text" id="product_id" class="inputField" name="product_id" placeholder="제품번호"></td>
							<td class="t2_4"><input type="text" id="lot_size" class="inputField" name="lot_size" placeholder="Lot Size"></td>
							<td class="t2_5"></td>
							<td class="t2_6"><input type="date" id="inst_date" class="inputField" name="inst_date" placeholder="지시일"></td>
							<td class="t2_7"></td>
							<td class="t2_8"></td>
							<td class="t2_9"><button id="submitBtn">제출</button></td>
							<td class="t2_10"></td>
						</tr>
				    </table>
                </form>
			</div>
			<div class="content">
				<table>
				    <c:forEach items="${instructionVOList}" var="instruction">
                        <tr>
                            <td class="t2_1"><c:out value="${instruction.lot_id}"/></td>
                            <td class="t2_2"><c:out value="${instruction.inst_nm}"/></td>
                            <td class="t2_3"><c:out value="${instruction.product_id}"/></td>
                            <td class="t2_4"><c:out value="${instruction.lot_size}"/></td>
                            <td class="t2_5"><c:out value="${instruction.output}"/></td>
                            <td class="t2_6"><c:out value="${instruction.inst_date}"/></td>
                            <td class="t2_7"><c:out value="${instruction.manu_date}"/></td>
                            <td class="t2_8"><c:out value="${instruction.manu_nm}"/></td>
                            <td class="t2_9"></td>
                            <td class="t2_10"><c:out value="${instruction.completion}"/></td>
                        </tr>
                    </c:forEach>
				</table>
			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-latest.min.js"></script>
    <script src="../js/instruction.js"></script>
	<%@ include file="../includes/footer.jsp" %>
</body>
</html>