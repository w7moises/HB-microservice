package com.example.membresia.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "membresias")
@Data
public class Membresia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;

    @OneToMany(mappedBy = "membresia")
    private List<TipoMembresia> tipoMembresias;

    public Membresia(){
        tipoMembresias = new ArrayList<>();
    }

}