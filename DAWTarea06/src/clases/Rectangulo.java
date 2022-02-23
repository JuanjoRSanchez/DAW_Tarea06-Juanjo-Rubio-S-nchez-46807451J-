package clases;
/**
 * @version 1.1.0, 03/02/22
 * @author Juanjo Rubio
 */
public class Rectangulo extends Figura{
   
    private double base;
    private double altura;
    /**
     * Calcula el area del rectangulo
     * @return double
     */
    @Override
    public double CalcularArea() {        
        return this.area=(base*altura);
     }
    /**
     * Devuelve la propiedad radio del rectangulo
     * @return double
     */
    public double getBase() {
        return base;
    }
    /**
     * Asigna un valor a la propiedad base 
     * @param base 
     */
    public void setBase(double base) {
        this.base = base;
    }
    /**
     * Devuelve la propiedad altura del rectangulo
     * @return double
     */
    public double getAltura() {
        return altura;
    }
    /**
     * Asigna un valor a la propiedad altura 
     * @param altura 
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
