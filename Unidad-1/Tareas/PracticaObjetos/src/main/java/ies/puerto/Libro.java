package ies.puerto;

/*
* @author Oliver
 */
public class Libro {

 private String titulo;
 private String autor;
 private int añoPublicacion;

    /**
     * Constructor por defecto
     */
 public Libro(){}


    /**
     * Constructor de la clase con el titulo, el autor y el año de publicación
     * @param titulo
     * @param autor
     * @param añoPublicacion
     */
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
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

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public String imprimirLibro(){


     return "Titulo:" + titulo + "Autor:" + autor + "anioPublicacion:" + añoPublicacion;

    }


    public static void main(String[] args) {

     Libro libro = new Libro("EL señor de los anillos","Tolkien",1954);


        libro.setAutor("Federico");

        libro.imprimirLibro();



    }


}


