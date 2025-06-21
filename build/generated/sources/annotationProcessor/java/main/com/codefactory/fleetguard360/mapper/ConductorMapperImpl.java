package com.codefactory.fleetguard360.mapper;

import com.codefactory.fleetguard360.controller.DTO.ConductorDTO;
import com.codefactory.fleetguard360.repository.entities.Conductor;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-21T09:54:56-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.13.jar, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class ConductorMapperImpl implements ConductorMapper {

    @Override
    public void updateConductorFromDto(ConductorDTO dto, Conductor entity) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getNombre() != null ) {
            entity.setNombre( dto.getNombre() );
        }
        if ( dto.getDocumentoIdentidad() != null ) {
            entity.setDocumentoIdentidad( dto.getDocumentoIdentidad() );
        }
        if ( dto.getTelefono() != null ) {
            entity.setTelefono( dto.getTelefono() );
        }
    }
}
