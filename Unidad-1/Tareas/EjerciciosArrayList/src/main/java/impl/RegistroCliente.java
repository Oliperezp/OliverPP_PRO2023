package impl;

import java.util.ArrayList;
import java.util.List;

public class RegistroCliente {

    private List<Cliente> clientes;

    public RegistroCliente() {
        clientes = new ArrayList<>();
    }

    public RegistroCliente(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente buscarCliente(Cliente cliente) {

        for (Cliente cliente1 : clientes) {
            if (cliente.equals(clientes)) {
                return cliente1;
            }
        }

        return null;
    }

    public void addCliente(Cliente cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
        }
    }

    public void transaccion(String numeroCLiente, float cantidad) {
       // Cliente cliente = new Cliente(numeroCLiente);
        //if (buscarCliente(cliente) != null) {

        }
    }



