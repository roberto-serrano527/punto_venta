package mx.com.raccoon.punto.venta.models.entities.product;

import jakarta.persistence.*;
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
    private Integer employeeId;
    @Column(name = "product_type")
    private String productType;
    private String name;
    @Column(unique = true)
    private Long code;
    @Column(name = "category_id")
    private String categoryId;
    @Column(name = "supplier_id")
    private String supplierId;
    @Column(name = "brand_id")
    private String brandId;
    @Column(name = "barcode_type")
    private String barcodeType;
    @Column(name = "box_id")
    private String boxId;
    @Column(name = "unit_id")
    private String unitId;
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
