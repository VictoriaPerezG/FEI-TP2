package com.example.soap.repository;

import com.example.soap.model.ProvinciaModel;
import org.springframework.data.jpa.repository.JpaRepository;
// import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinciaRepository extends JpaRepository<ProvinciaModel,Long> {

}
