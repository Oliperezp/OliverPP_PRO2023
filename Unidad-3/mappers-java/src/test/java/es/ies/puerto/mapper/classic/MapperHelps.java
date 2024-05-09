package es.ies.puerto.mapper.classic;

import es.ies.puerto.dto.AddressDto;
import es.ies.puerto.model.entity.Address;
import org.junit.jupiter.api.BeforeEach;

public class MapperHelps {

    public static final String MI_DIRECCION = "Mi direccion";
    public static final String MI_PAIS = "Mi Pais";
    public static final String CODIGO = "codigo";
    public static final Long ID_ADDRESS = new Long(1);
    public static final String PROVINCIA_ISLA = "San Borondon";

    public Address addressEntity;
    public AddressDto addressDto;

    @BeforeEach
    public void beforeEach(){
        addressDto=new AddressDto();
        addressDto.setAddress(MI_DIRECCION);
        addressDto.setCountry(MI_PAIS);
        addressDto.setId(ID_ADDRESS);
        addressDto.setZipCode(CODIGO);
        addressDto.setIsla(PROVINCIA_ISLA);
        addressEntity=new Address();
        addressEntity.setAddress(MI_DIRECCION);
        addressEntity.setCountry(MI_PAIS);
        addressEntity.setId(ID_ADDRESS);
        addressEntity.setZipCode(CODIGO);
        addressEntity.setProvincia(PROVINCIA_ISLA);




    }

}
