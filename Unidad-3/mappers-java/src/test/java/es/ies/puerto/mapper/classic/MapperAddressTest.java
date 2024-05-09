package es.ies.puerto.mapper.classic;

import es.ies.puerto.dto.AddressDto;
import es.ies.puerto.model.entity.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MapperAddressTest extends MapperHelps {

    AddressDto addressDtoMapper;
    Address addressEntityMapper;

    @Test
    public void addressToAddressDtoTest(){
        addressDtoMapper=MapperAddress.addressToAddressDto(addressEntity);
        Assertions.assertEquals(addressDto.getId(),addressDtoMapper.getId(),"No son iguales");
        Assertions.assertEquals(addressDto.getCountry(),addressDtoMapper.getCountry(),"No son iguales");
        Assertions.assertEquals(addressDto.getZipCode(),addressDtoMapper.getZipCode(),"No son iguales");
        Assertions.assertEquals(addressDto.getAddress(),addressDtoMapper.getAddress(),"No son iguales");
    }

    @Test
    public void addressDtoToAddressTest(){
        addressEntityMapper= MapperAddress.addressDtoToAddress(addressDto);
        Assertions.assertEquals(addressEntity.getId(),addressEntityMapper.getId(),"No son iguales");
        Assertions.assertEquals(addressEntity.getCountry(),addressEntityMapper.getCountry(),"No son iguales");
        Assertions.assertEquals(addressEntity.getZipCode(),addressEntityMapper.getZipCode(),"No son iguales");
        Assertions.assertEquals(addressEntity.getAddress(),addressEntityMapper.getAddress(),"No son iguales");
    }




    MapperAddress mapperAddress;





}