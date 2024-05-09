package es.ies.puerto.mapper.struct;

import es.ies.puerto.dto.AddressDto;
import es.ies.puerto.model.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMapperAddress {

    IMapperAddress INTANCE = Mappers.getMapper(IMapperAddress.class);

    @Mapping(source = "isla", target = "provincia")

    Address addressDtoToAddress(AddressDto addressDto);

    @Mapping(source = "provincia", target = "isla")
    AddressDto addressToAddressDto(Address address);



}
