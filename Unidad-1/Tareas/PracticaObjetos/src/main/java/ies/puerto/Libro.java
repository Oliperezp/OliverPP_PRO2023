package ies.puerto;

/*
* @author Oliver
 */
public class Libro {

 private String titulo;
 private String autor;
 private int anioPublicacion;

    /**
     * Constructor por defecto
     */
 public Libro(){}


    /**
     * Constructor de la clase con el titulo, el autor y el año de publicación
     * @param titulo
     * @param autor
     * @param anioPublicacion
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }



    public String imprimirLibro(){


     return "Titulo:" + titulo + "Autor:" + autor + "anioPublicacion:" + anioPublicacion;

    }





}


