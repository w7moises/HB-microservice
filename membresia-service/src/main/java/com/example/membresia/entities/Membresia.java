package com.example.membresia.entities;


import com.example.membresia.models.Proveedor;
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

    @Column(name = "proveedor_id")
    private Long proveedorId;

    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencimiento;

    @OneToMany(mappedBy = "membresia")
    private List<TipoMembresia> tipoMembresias;

    public Membresia(){
        tipoMembresias = new ArrayList<>();
    }

    @Transient
    private Proveedor proveedor;
}