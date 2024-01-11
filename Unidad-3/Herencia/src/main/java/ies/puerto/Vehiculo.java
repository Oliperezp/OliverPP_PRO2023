package ies.puerto;

public class Vehiculo {

    protected String color;



  public Vehiculo(){}

    public Vehiculo(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected void mover() {
            System.out.println("El vehiculo se esta moviendo...");
        }


        private void apagar(){

            System.out.println("Apagando el vehiculo");

        }

        public String toString(){

         return "Mi color es: " + color;

        }


        public void miColor(){

            System.out.println("Mi color es: " +color);

        }

}
