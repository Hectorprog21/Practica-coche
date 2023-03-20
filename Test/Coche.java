public class Coche {
    public int velocidad;

    public void acelerar_hector(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar_hector(int deceleracion) {
        velocidad -= deceleracion;
        if(velocidad<0) velocidad = 0;
    }
}
