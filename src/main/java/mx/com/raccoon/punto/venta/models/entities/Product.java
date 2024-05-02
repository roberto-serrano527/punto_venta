package mx.com.raccoon.punto.venta.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Setter
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "employee_id")
    @NotNull
    private Integer employeeId;

    @Column(name = "product_type")
    @NotEmpty
    private String productType;

    @NotEmpty
    private String name;

    @Column(unique = true)
    @NotNull
    private Long code;

    @Column(name = "category_id")
    @NotEmpty(message = "es requerido")
    private String categoryId;

    @Column(name = "supplier_id")
    @NotEmpty
    private String supplierId;

    @Column(name = "brand_id")
    @NotEmpty
    private String brandId;

    @Column(name = "barcode_type")
    @NotEmpty
    private String barcodeType;

    @Column(name = "box_id")
    @NotEmpty
    private String boxId;

    @Column(name = "unit_id")
    @NotEmpty
    private String unitId;

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
