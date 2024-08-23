package com.tienda.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

public interface ReporteService {

    public ResponseEntity<Resource>
            generaReporte(String reporte, //Nombre del reporte(usuarios.jasper)
                    Map<String, Object> parametros, //username
                    String tipo)throws IOException;

}
