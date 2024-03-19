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
	<link rel="stylesheet" href="/resources/css/inventoryStatus.css" />
</head>
<body>
	<%@ include file="../includes/header.jsp" %>
	<div class="subject">
		<p><a href="inventoryStatus">재고 현황</a></p>
	</div>
	<div class="inventoryStatus">
		<div class="full_box">
		    <div class="small_box">
		        <div>
			        <p>
				        완제품
			        </p>
		        </div>
		    <div class="table">
			    <div class="up">
				    <table border="1">
					    <tr>
						    <th class="t1">제품번호</th>
						    <th class="t2">제품명</th>
						    <th class="t3">제품수량</th>
					    </tr>
				    </table>
			    </div>
			    <div class="content">
				    <table border="1">
				        <c:forEach items="${finishedProductVOList}" var="invenProd">
                            <tr>
                                <td class="t1"><c:out value="${invenProd.product_id}"/></td>
                                <td class="t2"><c:out value="${invenProd.product_nm}"/> (<c:out value="${invenProd.product_spec}"/>)</td>
                                <td class="t3"><c:out value="${invenProd.product_quantity}"/></td>
                            </tr>
                        </c:forEach>
				    </table>
			    </div>
			</div>
	    </div>
	    <div class="small_box">
			<div>
				<p>
					재료
				</p>
			</div>
			<div class="table">
			    <div class="up">
				    <table border="1">
					    <tr>
						    <th class="t1">재료번호</th>
						    <th class="t2">재료명</th>
						    <th class="t3">재료수량</th>
					    </tr>
				    </table>
			    </div>
			    <div class="content">
				    <table border="1">
				        <c:forEach items="${invenMateVOList}" var="invenMate">
                            <tr>
                                <td class="t1"><c:out value="${invenMate.material_id}"/></td>
                                <td class="t2"><c:out value="${invenMate.material_nm}"/></td>
                                <td class="t3"><c:out value="${invenMate.material_quantity}"/> <c:out value="${invenMate.quantity_units}"/></td>
                            </tr>
                        </c:forEach>
				    </table>
			    </div>
		    </div>
	    </div>
	</div>
	<script src="https://code.jquery.com/jquery-latest.min.js"></script>
	<%@ include file="../includes/footer.jsp" %>
</body>
</html>