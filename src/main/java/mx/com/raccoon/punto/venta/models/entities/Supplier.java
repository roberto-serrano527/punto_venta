package mx.com.raccoon.punto.venta.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "suppliers")
@Getter
@Setter
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String address;

    @Column(name = "box_id")
    private Integer boxId;

    private String description;

    private boolean status;
}
