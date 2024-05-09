package mx.com.raccoon.punto.venta.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
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

    @ManyToOne
    @JoinColumn(name = "categories")
    @NotNull
    private Category category;

    @ManyToOne
    @JoinColumn(name = "suppliers")
    @NotNull
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "brands")
    @NotNull
    private Brand brand;

    @Column(name = "barcode_type")
    @NotEmpty
    private String barcodeType;

    @ManyToOne
    @JoinColumn(name = "boxes")
    @NotNull
    private Box box;

    @ManyToOne
    @JoinColumn(name = "units")
    @NotNull
    private Unit unit;

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
