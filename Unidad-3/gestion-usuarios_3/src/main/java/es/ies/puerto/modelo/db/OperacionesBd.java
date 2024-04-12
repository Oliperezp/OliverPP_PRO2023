package es.ies.puerto.modelo.db;

import es.ies.puerto.exception.UsuarioException;
import es.ies.puerto.modelo.Usuario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OperacionesBd extends Conexion{

    public OperacionesBd(String url) throws UsuarioException {
        super(url);
    }

    private void actualizar(String query) throws UsuarioException {
        Statement statement = null;
        try {
            statement = getConexion().createStatement();
            statement.executeUpdate(query);
        } catch (SQLException exception) {
            throw new UsuarioException(exception.getMessage(), exception);
        } finally {
            try {
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (!getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException e) {
                throw new UsuarioException(e.getMessage(), e);
            }
        }
    }

    private Set<Usuario> obtenerPersonaje(String query) throws UsuarioException {
        Set<Usuario> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String userNombre = rs.getString("nombre");
                String userAlias = rs.getString("alias");
                String userGenero = rs.getString("genero");
                List<String> userPoderes = rs.getString("ciudad");
                Usuario usuario = new Usuario(userNombre, userAlias, userGenero, userPoderes);
                lista.add(usuario);
            }
        } catch (SQLException exception) {
            throw new UsuarioException(exception.getMessage(), exception);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (!getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException e) {
                throw new UsuarioException(e.getMessage(), e);
            }
        }
        return lista;
    }
    public Set<Usuario> obtenerUsuarios() throws UsuarioException {
        String query = "select p.nombre, p.alias, p.genero, p.poderes from personajes as p";
        return obtenerPersonaje(query);
    }

    public Usuario obtenerUsuario(Usuario usuario) throws UsuarioException {
        String query = "select u.id, u.nombre, u.edad, u.ciudad from usuarios as u" +
                " where u.id='"+usuario.getId()+"'";
        Set<Usuario> lista = obtener(query);
        if(lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    public void insertarUsuario(Usuario usuario) throws UsuarioException {
        String query = "INSERT INTO personajes as p (nombre, alias, genero)" +
                " VALUES ('"+usuario.getNombre()+"',"
                + usuario.getAlias()+"," +
                " '"+usuario.getGenero()+"')";
        actualizar(query);
    }

    public void actualizarUsuario(Usuario usuario) throws UsuarioException{
        String query = "update usuarios set nombre='"+usuario.getNombre()+"', " +
                "ciudad='"+usuario.getCiudad()+"', edad="+usuario.getEdad()+" " +
                "where id='"+usuario.getId()+"'";
        actualizar(query);
    }

    public void eliminarUsuario(Usuario usuario) throws UsuarioException{
        String query = "delete FROM usuarios as u" +
                " where u.id='"+usuario.getId()+"'";
        actualizar(query);
    }


}
