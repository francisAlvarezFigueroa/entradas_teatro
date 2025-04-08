public class EntradaZonaA extends Entrada {

    private double precioEntrada = 20000;

    public EntradaZonaA(String nombreZona, double precioEntrada){
        super(nombreZona, precioEntrada);
    }

    //override methods

    @Override
    public double getPrecioEntrada() {
        return precioEntrada;
    }

    @Override
    public String getNombreZona() {
        return " Zona A ";
    }
}
