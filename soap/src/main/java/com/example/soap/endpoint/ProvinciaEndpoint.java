package com.example.soap.endpoint;

import com.example.soap.converter.ProvinciaConverter;
import com.example.soap.gen.GetProvinciasRequest;
import com.example.soap.gen.GetProvinciasResponse;
import com.example.soap.gen.Provincia;
import com.example.soap.model.ProvinciaModel;
import com.example.soap.repository.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class ProvinciaEndpoint {

    private static final String NAMESPACE_URI ="http://www.example.com/soap/gen";
    @Autowired
    private ProvinciaRepository provinciaRepository;
    @Autowired
    private ProvinciaConverter provinciaConverter;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getProvinciasRequest")
    @ResponsePayload
    public GetProvinciasResponse getProvincias(@RequestPayload GetProvinciasRequest request) {
        GetProvinciasResponse response = new GetProvinciasResponse();
        List<ProvinciaModel> models = provinciaRepository.findAll();
        List<Provincia> provincias=provinciaConverter.modelsToProvincias(models);
        response.getProvincias().addAll(provincias);
        return response;
    }
}
