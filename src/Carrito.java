import java.util.ArrayList;

public class Carrito {


    private ArrayList <EntradaComprada> entradas;  //lista para guardar entradas en el carrito

    public Carrito (){
        entradas = new ArrayList<>(); //inicializa arraylist entradas
    }

    //metodos

    public void agregarEntrada (Entrada entrada, String tipocliente){
        entradas.add(new EntradaComprada(entrada, tipocliente)); // crea objeto entrada comprada y agrega al arraylist
    }

    public double calcularTotal (){
        double total=0;
        for(EntradaComprada entradaComprada : entradas){
            total+= entradaComprada.getPrecioConDescuento(int edad);
        }
    }

}
