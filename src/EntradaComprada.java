public class EntradaComprada {

    private Entrada entrada;
    private String tipoCliente; //"Estudiante" "General" "Tercera Edad"
    public EntradaComprada(Entrada entrada, String tipoCliente) {
        this.entrada=entrada;
        this.tipoCliente=tipoCliente;
    }

    public double getPrecioConDescuento(int edad){
        return entrada.aplicarDescuento(edad);
    }
    public String getDetalles (){
        return entrada.getNombreZona() +  " | " + entrada.getPrecioEntrada() + " | " + tipoCliente + " | " + getPrecioConDescuento(int edad);
    }

}
