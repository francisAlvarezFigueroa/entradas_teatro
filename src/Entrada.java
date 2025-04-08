public abstract class Entrada {
    //atributos de la clase

    protected String nombreZona;
    protected double precioEntrada;
    protected double desctoEstudiante = 0.1; // 10% sobre cualquier entrada
    protected double desctoTerceraEdad = 0.15; // 15% sobre cualquier entrada

    //constructor de la clase
    public Entrada (String nombreZona, double precioEntrada){
        this.nombreZona=nombreZona;
        this.precioEntrada=precioEntrada;
    }

    //getters
    public double getPrecioEntrada(){return precioEntrada;}
    public abstract String getNombreZona();

    public double aplicarDescuento(int edad){
        if(edad<5 || edad>100){ //edad invalida
            return 0;
        }else if(edad<=23){
            return getPrecioEntrada() * (1 - desctoEstudiante);
        } else if (edad>=60) {
            return getPrecioEntrada()* (1- desctoTerceraEdad);
        }else{
            return getPrecioEntrada(); //entrada general
        }
    }



}
