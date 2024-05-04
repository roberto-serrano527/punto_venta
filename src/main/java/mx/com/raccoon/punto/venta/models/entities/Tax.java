package mx.com.raccoon.punto.venta.models.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "taxes")
public class Tax {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "tax_rate")
    private Double taxRate;

    private String description;

    private boolean status;
}
