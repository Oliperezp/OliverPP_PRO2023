package es.ies.puerto.modelo.db;


import es.ies.puerto.jdbc.modelo.Alias;
import es.ies.puerto.jdbc.modelo.Poderes;
import es.ies.puerto.jdbc.modelo.Usuario;
import es.ies.puerto.jdbc.modelo.db.OperacionesBd;
import es.ies.puerto.exception.UsuarioException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class OperacionesBdTest {
    OperacionesBd operacionesBd;
    String urlBd = "src/main/resources/personajes.db";
    String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";
    Usuario usuario;
    Alias aliass;
    Poderes poderes;

    @BeforeEach
    public void beforeEach() {
        try {

            operacionesBd = new OperacionesBd(urlBd);
            usuario=new Usuario(5,"pacoman","fluido");
            aliass=new Alias("Wamedo",2,6);
            poderes=new Poderes(7,"Salpicar");

        }catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }

    @Test
    public void obtenerUsuariosAllTest() {
        try {
            Set<Usuario> lista = operacionesBd.obtenerUsuarios();
            Assertions.assertEquals(2, lista.size(), MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }




    @Test
    public void obtenerUsuarioTest() {
        Usuario usuario = new Usuario(2);
        try {
            usuario = operacionesBd.obtenerUsuario(usuario);
            Assertions.assertNotNull(usuario, MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getId(), MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getNombre(), MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getGenero(), MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void insertarEliminarUsuarioTest() {

        try {
            int numeroUsuarios = operacionesBd.obtenerUsuarios().size();
            operacionesBd.insertarUsuario(usuario);
            Usuario usuarioObtenido = operacionesBd.obtenerUsuario(usuario);
            Assertions.assertEquals(usuario, usuarioObtenido, MESSAGE_ERROR);
            operacionesBd.eliminarUsuario(usuarioObtenido);
            int numeroUsuariosFinal = operacionesBd.obtenerUsuarios().size();
            Assertions.assertEquals(numeroUsuarios, numeroUsuariosFinal, MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void actualizarUsuarioTest(){
        String aliasUpdate = "AliasUpdate";
        String generoUpdate = "GeneroUpdate";
        String nombreUpdate = "NombreUpdate";

        try {
            Usuario personajeActualizar= new Usuario(20);
            operacionesBd.insertarUsuario(personajeActualizar);
            personajeActualizar.setGenero(generoUpdate);
            personajeActualizar.setNombre(nombreUpdate);
            operacionesBd.actualizarUsuario(personajeActualizar);


            Assertions.assertEquals(generoUpdate, personajeActualizar.getGenero());
            Assertions.assertEquals(nombreUpdate, personajeActualizar.getNombre());
            operacionesBd.eliminarUsuario(personajeActualizar);
        } catch (UsuarioException e) {
            Assertions.fail();
        }
    }

    @Test
    public void actualizarPoderTest(){
        String poderActualizado = "poderUpdate";
        try {
            Poderes poderesActualizar= new Poderes(20);
            operacionesBd.insertarPoder(poderesActualizar);
            poderesActualizar.setPoder(poderActualizado);
            operacionesBd.actualizarPoderesUsuario(poderesActualizar);
            Assertions.assertEquals(poderActualizado, poderesActualizar.getPoder());
           operacionesBd.eliminarPoderes(poderesActualizar);
        } catch (UsuarioException e) {
            Assertions.fail();
        }
    }


    @Test
    public void obtenerAliasTest() {
        Alias alias = new Alias(2);
        try {
            alias = operacionesBd.obtenerAlia(alias);
            Assertions.assertNotNull(alias, MESSAGE_ERROR);
            Assertions.assertNotNull(alias.getId(), MESSAGE_ERROR);
            Assertions.assertNotNull(alias.getPersonaje_id(), MESSAGE_ERROR);
            Assertions.assertNotNull(alias.getAlias(), MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerPoderTest() {
       Poderes poder = new Poderes(2);
        try {
            poder = operacionesBd.obtenerPoder(poder);
            Assertions.assertNotNull(poder, MESSAGE_ERROR);
            Assertions.assertNotNull(poder.getId(), MESSAGE_ERROR);
            Assertions.assertNotNull(poder.getPoder(), MESSAGE_ERROR);
           } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void insertarEliminarAliasTest() {

        try {
            int numeroAlias = operacionesBd.obtenerAlias().size();
            operacionesBd.insertarAlias(aliass);
            Alias aliasObtenido = operacionesBd.obtenerAlia(aliass);
            Assertions.assertEquals(aliass, aliasObtenido, MESSAGE_ERROR);
            operacionesBd.eliminarAlias(aliasObtenido);
            int numeroAliasFinal = operacionesBd.obtenerAlias().size();
            Assertions.assertEquals(numeroAlias, numeroAliasFinal, MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void insertarEliminarPoderTest() {

        try {
            int numeroPoderes = operacionesBd.obtenerPoderes().size();
            operacionesBd.insertarPoder(poderes);
            Poderes poderObtenido = operacionesBd.obtenerPoder(poderes);
            Assertions.assertEquals(poderes, poderObtenido, MESSAGE_ERROR);
            operacionesBd.eliminarPoderes(poderObtenido);
            int numeroPoderesFinal = operacionesBd.obtenerPoderes().size();
            Assertions.assertEquals(numeroPoderes, numeroPoderesFinal, MESSAGE_ERROR);
        } catch (UsuarioException e) {
            Assertions.fail(e.getMessage());
        }
    }



}
