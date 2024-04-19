package es.ies.puerto.modelo.db;


import es.ies.puerto.JDBC.modelo.Poderes;
import es.ies.puerto.JDBC.modelo.Usuario;
import es.ies.puerto.JDBC.modelo.db.OperacionesBd;
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
    Poderes poderes;

    @BeforeEach
    public void beforeEach() {
        try {

            operacionesBd = new OperacionesBd(urlBd);
            usuario=new Usuario(5,"pacoman","fluido");

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

}
