package com.javacloudstack.pro.entrypoint.rest.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TransferRequest {

    @ApiModelProperty(value = "Agencia de Origem", example = "1234")
    @NotNull
    private String agencySource;

    @ApiModelProperty(value = "Conta de Origem", example = "1234")
    @NotNull
    private String accountSource;

    @ApiModelProperty(value = "Digito de Origem", example = "1")
    @NotNull
    private String digitSource;

    @ApiModelProperty(value = "Agencia de Destino", example = "1234")
    @NotNull
    private String agencyTarget;

    @ApiModelProperty(value = "Conta de Destino", example = "1234")
    @NotNull
    private String accountTarget;

    @ApiModelProperty(value = "Digito de Destino", example = "1")
    @NotNull
    private String digitTarget;

    @ApiModelProperty(value = "Valor Transferencia", example = "1")
    @NotNull
    private BigDecimal value;
}
