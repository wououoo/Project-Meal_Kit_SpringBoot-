conlose.log('Bom Module...');

var bomService = (function () {

	/* BOM 등록 ajax 호출 함수 */
	function bomRegister(reply, callback, error) {
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

	/* BOM 현황 조회 ajax 호출 함수 */
	function getBomList(param, callback, error) {
			var searchProdNm = param.searchProdNm;
			var searchProdDiv = param.searchProdDiv;
			var searchMatNm = param.searchMatNm;

			// get 전용 ajax 함수
			$.getJSON("/getBomList",		// get 전용 ajax 함수
					function(data) {		// 호출 성공시 처리되는 함수
							if (callback) {
							callback(data);
							}
			}).fail(
					function(xhr, status, err) {		// 호출 실패시 처리되는 함수
							if(error) {
							error();
							}
					}
			);
	}

	/* BOM 삭제 */
	function remove(listSeq, callback, error) {
		$.ajax({
			type: 'delete',
			url: '/getBomList/' + listSeq,			// form의 action값
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
			url: '/getBomList/' + bom.listSeq,
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

	
})();