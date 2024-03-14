package org.mealkitspringboot.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BomListVo {
	private int listSeq;
	private int bomId;
	private int prodId;
	private String prodNm;
	private String prodDiv;
	private String prodSpec;
	private int prodPrice;
	private int lotId;
	private int lotSize;
	private String matDiv;
	private int matId;
	private String matNm;
	private String quantityUnits;
	private int bomProdQuantity;



	/* BOM 옵션으로 검색 */
}
