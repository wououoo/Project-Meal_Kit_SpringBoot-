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
	<link rel="stylesheet" href="/resources/css/employees.css" />
</head>
<body>
	<%@ include file="../includes/header.jsp" %>
	<div class="subject">
		<p><a href="/employees">사원 관리</a></p>
	</div>
	<div class="employees">
		<div class="table">
			<div class="sub_table">
				<table>
					<tr>
						<th class="t1">사원번호</th>
						<th class="t2">비밀번호</th>
						<th class="t3">사원명</th>
						<th class="t4">연락처</th>
						<th class="t5">부서번호</th>
						<th class="t6">부서명</th>
						<th class="t7">직책</th>
						<th class="t8">완료버튼</th>
					</tr>
					<form action="/employees_btn" method="post">
						<tr>
							<td class="t1"></td>
							<td class="t2"></td>
							<td class="t3"><input type="text" class="inputField" name="emp_nm" placeholder="사원명"></td>
							<td class="t4"><input type="text" class="inputField" name="emp_contact" placeholder="연락처"></td>
							<td class="t5"><input type="text" class="inputField" name="dep_id" id="dep_id" placeholder="부서번호"></td>
							<td class="t6"><input type="hidden" name="dep_nm" id="dep_nm"></td>
							<td class="t7"><input type="text" class="inputField" name="emp_role" placeholder="직급"></td>
							<td class="t8"><button id="addBtn">사원추가</button></td>
						</tr>
					</form>
				</table>
			</div>
			<div class="content">
				<table>
				    <c:forEach items="${employeesVOList}" var="employees">
                        <tr>
                            <td class="t1"><c:out value="${employees.emp_id}"/></td>
                            <td class="t2"><c:out value="${employees.emp_pw}"/></td>
                            <td class="t3"><c:out value="${employees.emp_nm}"/></td>
                            <td class="t4"><c:out value="${employees.emp_contact}"/></td>
                            <td class="t5"><c:out value="${employees.dep_id}"/></td>
                            <td class="t6"><c:out value="${employees.dep_nm}"/></td>
                            <td class="t7"><c:out value="${employees.emp_role}"/></td>
                            <td class="t8"></td>
                        </tr>
                    </c:forEach>
				</table>
			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-latest.min.js"></script>
    <script src="../js/employees.js"></script>
	<%@ include file="../includes/footer.jsp" %>
</body>
</html>