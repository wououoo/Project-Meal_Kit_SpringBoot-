package org.mealkitspringboot.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
/*검색을 위한 클래스 VO*/
@Getter
@Setter
public class CriteriaVo {
    private String prodNmKeyword;
    private String prodDivKeyword;
    private String MatNmKeyword;
    private String keywords;

    // 제품명, 제품 규격, 재료명(option value값들)
    // prodNm, prodDiv, matNm
    public String[] getKeywordsArr() {
        return keywords == null ? new String[] {} : keywords.split("");
    }

    /* BOM 검색 옵션 */
    public CriteriaVo(String prodNm, String prodDiv, String matNm) {
        this.prodNmKeyword = prodNm;
        this.prodDivKeyword = prodDiv;
        this.MatNmKeyword = matNm;
    }
}
