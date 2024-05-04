package mx.com.raccoon.punto.venta.models.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "boxes")
public class Box {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "short_name")
    private String shortName;

    private String description;

    private boolean status;
}
