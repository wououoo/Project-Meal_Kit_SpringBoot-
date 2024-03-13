conlose.log('Bom Module...');

/* BOM List의 select box 옵션 값(제품명, 제품 규격, 재료명) */
function setSelectBox(o) {
    var selectVal = o.value;
    var upper = $(o).parent().parent();     // 셀렉트 박스의 상위 객체
                                            // 위 코드에서 <div class="row">가 해당된다.
                                            // 나는 <form class="searchBom">
                                            // 또는 <div class="class="search_header search_body"> 둘 중 하나다.
    var cnt = $('select', upper).size();    // 셀렉트 박스 개수
    var idx = $('select', upper).index(o);  // 현재 셀렉트 박스의 순서
    var depth = idx + 1;                    // 선택한 selectbox가 몇 depth인지.
    var level = 1+ idx;                     // db에 저장되어 있는 level이 1레벨이라
                                            // 다음 레벨을 구하기 위해 기본값을 2level로 잡았다.
    var selectBox = $('select', upper).eq(depth);   // 선택한 하위값 selectbox
    var text = '<option value="">제품구분</option>';  // 기본으로 설정할 값.
    var selectVal02 = selectVal.substring(2,4);     // 선택한 코드값으로 하위 코드값을 찾기 위함

    if(selectVal == '') {   // 전체(제품구분)을 선택했을 경우
        $('select:gt(' + idx + ')', upper).html(text);						// 선택한 하위값들의 값 전체로 변경
        $('select:gt(' + idx + ')', div).attr("disabled", true);	// 선택한 하위값들 disabled
        return;
    }
    
    // ajax 통신해 해당 값을 가져온다.
    $post("/setDirectoryList_ajax.do"
    					, {"level":level, "selectVal":selectVal, "selectVal02": selectVal02}
    					, function(res) {
				if(res.result > 0) {
					var dirList = eval(res.resultJList);		// jsonArray의 값을 list로
					var loop = res.resultCnt;								// 반복할 회수(뿌려줄 리스트의 size)
					
					$('select:gt(' + idx + ')', upper).html(text);	// select한 하위값들을 모두 전체로
					selectBox.attr("disabled", false);	// 선택한 하위값의 disable을 풀어준다.
					for(var i=0; i<loop; i++) {}
					var list = dirList[i];
					// 객체를 가져와 append한다.
					selectBox.append('<option value"' + list.selectVal + '">' + list.valName + '</option>');
				}
			}
    );
}

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