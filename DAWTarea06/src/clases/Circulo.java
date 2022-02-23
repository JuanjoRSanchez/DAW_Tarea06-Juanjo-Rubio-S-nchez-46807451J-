package clases;


/**
 * @version 1.1.0, 03/02/22
 * @author Juanjo Rubio
 */
public class Circulo extends Figura{
    
    final double pi=3.1416;
    private double radio;
    /**
     * Calcula el area de un circulo
     * @return double
     */
    
    @Override
    public double CalcularArea() {        
        return this.area=pi*radio*radio;
     }
    /**
     * Devuelve la propiedad radio del Circulo
     * @return double
     */
    public double getRadio() {
        return radio;
    }
    /**
     * Asigna un valor a la propiedad radio 
     * @param radio 
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
