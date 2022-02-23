/**
 * 
 */
package clases;
/**
 * @version 1.1.0, 03/02/22
 * @author Juanjo Rubio
 */
public class Triangulo extends Figura{
    
    private double base;
    private double altura;

    /**
     * Calcula el area de un triangulo
     * @return double
     */
    @Override
    public double CalcularArea() {        
        return this.area=(base*altura)/2;
     }
    /**
     * Devuelve la propiedad radio del triangulo
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
