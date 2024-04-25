package es.ies.puerto.jdbc.modelo.db;

import es.ies.puerto.jdbc.modelo.Alias;
import es.ies.puerto.exception.UsuarioException;
import es.ies.puerto.jdbc.modelo.Personaje;
import es.ies.puerto.jdbc.modelo.Poderes;
import es.ies.puerto.jdbc.modelo.Usuario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import static java.sql.DriverManager.getConnection;

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

    private Set<Usuario> obtenerUsuario(String query) throws UsuarioException {
        Set<Usuario> lista = new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int userId = rs.getInt("id");
                String userNombre = rs.getString("nombre");
                String userGenero = rs.getString("genero");
                Usuario usuario = new Usuario(userId,userNombre,userGenero);
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

    private Set<Poderes> obtenerPoder(String query) throws UsuarioException {


        Set<Poderes> listaPoderes=new HashSet<>();
        Statement statement = null;
        ResultSet rs = null;

        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            listaPoderes = new HashSet<>();
            while (rs.next()) {
                int poderId = (rs.getInt("id"));
                String poderPoder =(rs.getString("poder"));
                Poderes poder = new Poderes(poderId,poderPoder);
                listaPoderes.add(poder);
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

    private Set<Alias> obtenerAlias(String query) throws UsuarioException {


        Set<Alias> listaAlias=null;
        Statement statement = null;
        ResultSet rs = null;

        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            listaAlias = new HashSet<>();
            while (rs.next()) {

                int aliasId = (rs.getInt("id"));
                int idPersonaje =(rs.getInt("personaje_id"));
                String aliasN = (rs.getString("alias"));
                Alias alias = new Alias(aliasN,idPersonaje,aliasId);
                listaAlias.add(alias);
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
        return listaAlias;
    }



    public Set<Usuario> obtenerUsuarios() throws UsuarioException {
        String query = "select p.id, p.nombre,p.genero from personajes as p";
        return obtenerUsuario(query);
    }


    public Usuario obtenerUsuario(Personaje personaje) throws UsuarioException {
        String query = "select p.id, p.nombre,p.genero from personajes as p" +
                " where p.id='"+personaje.getId()+"'";
        Set<Usuario> lista = obtenerUsuario(query);
        if(lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }


    public Set<Poderes> obtenerPoderes() throws UsuarioException {
        String query = "select p.id,p.poder from poderes as p";
        return obtenerPoder(query);
    }


    public Alias obtenerAlia(Alias alias) throws UsuarioException {
        String query = "select a.id, a.personaje_id,a.alias from alias as a" +
                " where a.id="+alias.getId();
        Set<Alias> lista = obtenerAlias(query);
        if(lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    public Poderes obtenerPoder(Poderes poder) throws UsuarioException {
        String query = "select p.id, p.poder from poderes as p" +
                " where p.id="+poder.getId();
        Set<Poderes> lista = obtenerPoder(query);
        if(lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }




    public Set<Alias> obtenerAlias() throws UsuarioException {
        String query = "select a.id,a.personaje_id,a.alias from alias as a";
        return obtenerAlias(query);
    }
    public void eliminarAlias(Alias alias) throws UsuarioException{
        String query = "delete FROM alias as a" +
                " where a.id="+alias.getId();
        actualizar(query);
    }

    public void actualizarAlias(Alias alias) throws UsuarioException{
        String query = "update alias set alias='"+alias.getAlias() +
                "where id="+alias.getId();
        actualizar(query);
    }



    public void insertarUsuario(Usuario usuario) throws UsuarioException {
        String query = "INSERT INTO personajes as p (id,nombre,genero) VALUES ("+usuario.getId()+",'"
                +usuario.getNombre()+"','"+usuario.getGenero()+"')";

        actualizar(query);
    }

    public void insertarPoder(Poderes poder) throws UsuarioException {
        String query = "INSERT INTO poderes as p (id,poder) VALUES ("+poder.getId()+",'"
                +poder.getPoder()+")";
        actualizar(query);
    }

    public void insertarAlias(Alias alias) throws UsuarioException {
        String query = "INSERT INTO alias as a (id,personaje_id,alias) VALUES ("+alias.getId()+",'"
                +alias.getPersonaje_id()+"','"+alias.getAlias()+"')";

        actualizar(query);
    }


    public void actualizarUsuario(Usuario usuario) throws UsuarioException{
        String query = "update personajes set nombre='"+usuario.getNombre()+"', genero='"+usuario.getGenero()+"' " +
                "where id="+usuario.getId();
        actualizar(query);
    }
    public void actualizarPoderesUsuario(Poderes poderes) throws UsuarioException{
        String query = "update poderes set poder='"+poderes.getPoder()+"', " +
                        "where id="+poderes.getId();
        actualizar(query);
    }


    public void eliminarUsuario(Usuario usuario) throws UsuarioException{
        String query = "delete FROM personajes as p" +
                " where p.id='"+usuario.getId()+"'";
        actualizar(query);
    }

    public void eliminarPoderes(Poderes poder) throws UsuarioException{
        String query = "delete FROM poderes as pd" +
                " where pd.id="+poder.getId();
        actualizar(query);
    }





}
