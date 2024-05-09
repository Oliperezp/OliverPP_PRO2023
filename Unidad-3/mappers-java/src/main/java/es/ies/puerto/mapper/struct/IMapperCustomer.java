package es.ies.puerto.mapper.struct;

import es.ies.puerto.dto.AddressDto;
import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.model.entity.Address;
import es.ies.puerto.model.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses=IMapperAddress.class)
public interface IMapperCustomer {

    IMapperCustomer INTANCE = Mappers.getMapper(IMapperCustomer.class);

    Customer customerDtoToCustomer(CustomerDTO customerDTO);
    CustomerDTO customerToCustomerDto(Customer customer);

}
