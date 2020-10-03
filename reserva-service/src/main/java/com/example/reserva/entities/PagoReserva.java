package com.example.reserva.entities;

import javax.persistence.*;
import java.util.Date;

@Table(name = "pago_reservas")
public class PagoReserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "membresia_id")
    private Reserva reserva;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tarjeta_id")
    private Tarjeta tarjeta;


}
