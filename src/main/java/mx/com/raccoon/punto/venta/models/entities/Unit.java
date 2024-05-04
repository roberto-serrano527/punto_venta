package mx.com.raccoon.punto.venta.models.entities;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "units")
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private boolean status;

}
