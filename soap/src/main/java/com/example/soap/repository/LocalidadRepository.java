package com.example.soap.repository;

import com.example.soap.model.LocalidadModel;
import com.example.soap.model.ProvinciaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalidadRepository extends JpaRepository<LocalidadModel,Long> {

    @Query("SELECT l FROM LocalidadModel l WHERE l.provincia = ?1")
    List<LocalidadModel> findByProvincia(ProvinciaModel provincia);
}
