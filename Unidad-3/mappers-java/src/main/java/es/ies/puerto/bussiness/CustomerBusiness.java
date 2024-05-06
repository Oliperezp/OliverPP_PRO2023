package es.ies.puerto.bussiness;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.mapper.classic.MapperAddress;
import es.ies.puerto.mapper.classic.MapperCustomer;
import es.ies.puerto.model.entity.Address;
import es.ies.puerto.model.entity.Customer;

public class CustomerBusiness {

    public CustomerDTO obtenerCustomer(CustomerDTO customerDTO){

        if(customerDTO==null){
            return null;
        }

        Customer customer= MapperCustomer.customerDtoToCustomerEntity(customerDTO);
        Address address = MapperAddress.customerDtoToAddress(customerDTO);

        /**
         * Llamar a BBDD (Dao)
         */

        CustomerDTO respuesta = MapperCustomer.customerEntityToCustomerDto(customer,address);


        return respuesta;
    }

    public CustomerDTO obtenerCustomer(Long id){
        if(id==null){
            return null;
        }
        CustomerDTO customerDTO=new CustomerDTO(id);

        return obtenerCustomer(customerDTO);
    }
}
