package org.mealkitspringboot.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BomListVo {
	private String listSeq;
	private String bomId;
	private String prodId;
	private String prodNm;
	private String prodDiv;
	private String prodSpec;
	private String prodPrice;
	private String lotId;
	private String lotSize;
	private String matDiv;
	private String matId;
	private String matNm;
	private String quantityUnits;
	private String bomProdQuantity;

	/* BOM 검색 옵션 */
	public BomListVo(String prodNm, String prodDiv, String matNm) {
		this.prodNm = prodNm;
		this.prodDiv = prodDiv;
		this.matNm = matNm;
	}

	/* BOM 옵션으로 검색 */

}
