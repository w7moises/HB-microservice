package com.example.tarjeta.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tarjetas")
@Data
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 16, nullable = false)
    private String numeroTarjeta;

    @Column(name = "nombre_propietario", length = 40, nullable = false)
    private String nombrePropietario;

    @Column(name = "apellido_propietario", length = 40, nullable = false)
    private String apellidoPropietario;

    @Column(length = 8, nullable = false)
    private String dni;

    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;

    @Column(name = "codigo_cvc", length = 3, nullable = false)
    private String codigoCvc;
}
