package mx.com.raccoon.punto.venta.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductModel {

    private Integer id;

    @NotNull
    private Integer employeeId;

    @NotEmpty
    private String productType;

    @NotEmpty
    private String name;

    @NotNull
    private Long code;

    @NotNull
    private Long categoryId;

    @NotNull
    private Long supplierId;

    @NotNull
    private Long brandId;

    @NotEmpty
    private String barcodeType;

    @NotNull
    private Long boxId;

    @Column(name = "unit_id")
    @NotNull
    private Long unitId;

    @NotNull
    private Double price;

    @Column(name = "stock_alert")
    private Integer stockAlert;

    private String description;

    private boolean status;

    @Column(name = "percentage_tax")
    private String percentageTax;

    @Column(name = "method_tax")
    private String methodTax;
}
