package com.example.membresia.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class Tarjeta {
    private Long id;
    private String numeroTarjeta;
    private String nombrePropietario;
    private String apellidoPropietario;
    private String dni;
    private Date fechaVencimiento;
    private String codigoCvc;
}