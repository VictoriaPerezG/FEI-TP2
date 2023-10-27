package com.example.soap.converter;

import com.example.soap.gen.Localidad;
import com.example.soap.model.LocalidadModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LocalidadConverter {

    public LocalidadModel localidadToModel(Localidad localidad){
        LocalidadModel model=new LocalidadModel();
        model.setId(localidad.getId());
        model.setNombre(localidad.getNombre());
        return model;
    }

    public Localidad modelToLocalidad(LocalidadModel model){
        Localidad localidad=new Localidad();
        localidad.setId(model.getId());
        localidad.setNombre(model.getNombre());
        return localidad;
    }

    public List<LocalidadModel> mapToModel(List<Localidad> localidades){
        return localidades.stream()
                .map(this::localidadToModel)
                .collect(Collectors.toList());
    }

    public List<Localidad> mapToLocalidades(List<LocalidadModel> models){
        return models.stream()
                .map(this::modelToLocalidad)
                .collect(Collectors.toList());
    }
}
