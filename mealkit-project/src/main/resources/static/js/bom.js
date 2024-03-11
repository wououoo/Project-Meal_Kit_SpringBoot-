conlose.log('Bom Module...');

var bomService = (function () {
	/* BOM 현황 조회 ajax 호출 함수 */
	function getBomList(param, callback, error) {
			var searchProdNm = param.searchProdNm;
			var searchProdDiv = param.searchProdDiv;
			var searchMatNm = param.searchMatNm;

			// get 전용 ajax 함수
			$.getJSON("/getBomList/searchProdNm/" + searchProdNm + "/searchProdDiv/" + searchProdDiv + "/searchMatNm/" + searchMatNm,
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
})();