package com.example.soap.model;

// import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="localidades")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LocalidadModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @ManyToOne
    private ProvinciaModel provincia;
}
