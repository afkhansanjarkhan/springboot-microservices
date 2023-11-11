package com.programmingtechie.inventoryservice.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InventoryResponse {
    private String skuCode;
    private boolean isInStock;
}
