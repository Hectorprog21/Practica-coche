public class Coche {
    public int velocidad;

    public void acelerar_Hector(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar_Hector(int deceleracion) {
        velocidad -= deceleracion;
        if(velocidad<0) velocidad = 0;
    }
}
