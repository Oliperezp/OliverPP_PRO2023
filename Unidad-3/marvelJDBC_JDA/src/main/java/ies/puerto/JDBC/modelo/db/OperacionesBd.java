package ies.puerto.JDBC.modelo.db;


import ies.puerto.JDBC.exception.UsuarioException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class OperacionesBd extends puerto.modelo.db.Conexion {




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

    private Set<Usuario> obtenerUsuario(String query) throws UsuarioException {
        Set<Usuario> lista = new HashSet<>();
        Set<String> poderes = null;

        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int userId = rs.getInt("id");
                String userNombre = rs.getString("nombre");
                String userAlias = rs.getString("alias");
                String userGenero = rs.getString("genero");
                poderes=obtenerPoderes(userId);
                Usuario usuario = new Usuario(userId,userNombre, userAlias, userGenero);
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

    private Set<String> obtenerPoderesUsuario(String query) throws UsuarioException {


        Set<String> listaPoderes=null;
        Statement statement = null;
        ResultSet rs = null;

        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            listaPoderes = new HashSet<>();
            while (rs.next()) {

                listaPoderes.add(rs.getString("poder"));
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
        return listaPoderes;
    }





    public Set<Usuario> obtenerUsuarios() throws UsuarioException {
        String query = "select p.id, p.nombre, p.alias, p.genero from personajes as p";
        return obtenerUsuario(query);
    }


    public Usuario obtenerUsuario(Personaje personaje) throws UsuarioException {
        String query = "select p.id, p.nombre, p.alias, p.genero from personajes as p" +
                " where p.id='"+personaje.getId()+"'";
        Set<Usuario> lista = obtenerUsuario(query);
        if(lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }


    public Set<String> obtenerPoderes(int id) throws UsuarioException {
        String query = "select poder from poderes where personaje_id="+id;
        return obtenerPoderesUsuario(query);
    }



    public void insertarUsuario(Usuario usuario) throws UsuarioException {
        String query = "INSERT INTO personajes as p (id,nombre,alias,genero) VALUES ("+usuario.getId()+",'"
                +usuario.getNombre()+"','"+usuario.getAlias()+"','"+usuario.getGenero()+"')";
        actualizar(query);
    }

    public void actualizarUsuario(Usuario usuario) throws UsuarioException{
        String query = "update personajes set nombre='"+usuario.getNombre()+"', " +
                "alias='"+usuario.getAlias()+"', genero='"+usuario.getGenero()+"' " +
                "where id="+usuario.getId();
        actualizar(query);
    }
    public void actualizarPoderesUsuario(Poderes poderes) throws UsuarioException{
        String query = "update poderes set poder='"+poderes.getPoderes()+"', " +
                        "where personaje_id='"+poderes.getPersonaje_id()+"'";
        actualizar(query);
    }


    public void eliminarUsuario(Usuario usuario) throws UsuarioException{
        String query = "delete FROM personajes as p" +
                " where p.id='"+usuario.getId()+"'";
        actualizar(query);
    }

    public void eliminarPoderes(Poderes poder) throws UsuarioException{
        String query = "delete FROM poderes as pd" +
                " where pd.personaje_id='"+poder.getPersonaje_id()+"'";
        actualizar(query);
    }


}
