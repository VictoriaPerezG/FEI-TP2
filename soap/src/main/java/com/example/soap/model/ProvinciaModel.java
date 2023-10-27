package com.example.soap.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="provincias")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProvinciaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @OneToMany(mappedBy = "provincia",cascade = CascadeType.MERGE)
    private List<LocalidadModel> localidades;
}
