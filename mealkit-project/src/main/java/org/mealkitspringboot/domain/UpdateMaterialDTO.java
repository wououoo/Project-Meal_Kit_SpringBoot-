package org.mealkitspringboot.domain;

import lombok.Data;

@Data
public class UpdateMaterialDTO {
    private int product_id;
    private int lot_size;
}
