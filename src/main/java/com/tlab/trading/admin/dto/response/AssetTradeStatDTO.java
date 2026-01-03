package com.tlab.trading.admin.dto.response;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class AssetTradeStatDTO {
    private String stockCode;
    private BigDecimal ratio;

}
