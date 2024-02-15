package ies.puerto.modelo.entity;

public class LibroEntity {

    private String isbn;
    private String titulo;
    private String autor;
    private int publicacion;
    private int idBiblioteca;


    public LibroEntity(){}

    public LibroEntity(String isbn, String titulo, String autor, int publicacion,int idBiblioteca) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.idBiblioteca=idBiblioteca;
    }


    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPublicacion() {
        return publicacion;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPublicacion(int publicacion) {
        this.publicacion = publicacion;
    }
}
