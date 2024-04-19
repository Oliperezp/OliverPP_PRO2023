package puerto.modelo;

public class Usuario extends Personaje {


    public Usuario(int id) {
        super(id);
    }

    public Usuario(int id, String nombre, String alias, String genero) {
        super(id, nombre, alias, genero);
    }
}
