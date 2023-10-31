package com.example.soap.converter;

// import com.example.soap.gen.ListaLocalidades;
import com.example.soap.model.ProvinciaModel;
import org.springframework.stereotype.Component;
import com.example.soap.gen.Provincia;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProvinciaConverter {

    // private final LocalidadConverter localidadConv;

    public ProvinciaConverter(LocalidadConverter localidadConv) {
        // this.localidadConv = localidadConv;
    }

    public ProvinciaModel provinciaToProvinciaModel(Provincia provincia){
        ProvinciaModel model=new ProvinciaModel();
        model.setId(provincia.getId());
        model.setNombre(provincia.getNombre());
        // model.setLocalidades(this.localidadConv.mapToModel(provincia.getLocalidades().getLocalidad()));
        return model;
    }

    public Provincia provinciaModelToProvincia(ProvinciaModel model){
        Provincia provincia=new Provincia();
        provincia.setId(model.getId());
        provincia.setNombre(model.getNombre());
        return provincia;
    }

    public List<ProvinciaModel> provinciasToModels(List<Provincia> provincias){
        return provincias.stream()
                .map(this::provinciaToProvinciaModel)
                .collect(Collectors.toList());
    }

    public List<Provincia> modelsToProvincias(List<ProvinciaModel> models){
        return models.stream()
                .map(this::provinciaModelToProvincia)
                .collect(Collectors.toList());
    }



}
