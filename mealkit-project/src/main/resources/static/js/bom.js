conlose.log('Bom Module...');

// Ajax 연결 디버깅
console.log('Sending AJAX request...');
bomService.getBomList('searchProdNmValue', 'searchProdDivValue', 'searchMatNmValue', function(data) {
    console.log('Received data:', data);
}, function() {
    console.error('Error occurred while sending AJAX request.');
});


var bomService = (function () {

	/* BOM 현황 조회 ajax 호출 함수 */
	function getBomList(searchProdNm, searchProdDiv, searchMatNm, callback, error) {
		$.ajax({
			url: '/bom/getBomList',
			type: 'GET',
			data: JSON.stringify(bom),													// json으로 string처리하면서 파라미터 전달
			contentType : "application/json; charset=utf-8",    // content-type지정
			data: {
				searchProdNm: searchProdNm,
				searchProdDiv: searchProdDiv,
				searchMatNm: searchMatNm
			},
			success: function (data) {
				console.log(data);	// 데이터 확인용 로그
				if (callback) {
					callback(data);
				}
			},
			error: function (xhr, status, error) {
				console.error(error);
				if (error) {
					error();
				}
			}
		});
	}

	/* BOM 등록 ajax 호출 함수 */
	function bomRegister(bom, callback, error) {
		console.log("register BOM.......");

		$.ajax({
				// request 처리
				type: 'post',																				// form의 method 속성 값
				url: '/bom/register',																// form의 action값
				data: JSON.stringify(bom),													// json으로 string처리하면서 파라미터 전달
				contentType : "application/json; charset=utf-8",    // content-type지정
				//response 처리
				success : function(result, status, xhr) {           // call 성공시 오는 처리되는 함수
						if (callback) {
								callback(result);
						}
				},
						error : function(xhr, status, er) {                 // call 실패시 오는 처리되는 함수
								if (error) {
										error(er);
						}
				}
		});
	}

	/* BOM 삭제 */
	function remove(listSeq, callback, error) {
		$.ajax({
			type: 'delete',
			url: '/bom/' + listSeq,			// form의 action값
			success : function(deleteResult, status, xhr) {
					if (callback) {
							callback(deleteResult);
					}
			},
			error : function(xhr, status, er) {
					if (error) {
							error(er);
					}
			}
		});
	}

	/* BOM 수정 */
	function update(bom, callback, error) {
		conlose.log("listSeq: " + bom.listSeq);

		$.ajax({
			type: 'PUT',
			url: '/bom/' + bom.listSeq,
			data: JSON.stringify(bom),
			contentType : "application/json; charset=utf-8",
			success : function(result, status, xhr) {
					if (callback) {
							callback(result);
					}
			},
			error : function(xhr, status, er) {
					if (error) {
							error(er);
					}
			}
		});
	}
	
	return {
		getBomList: getBomList,
		bomRegister: bomRegister,
		remove: remove,
		update, update
	};

	
})();