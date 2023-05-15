
package com.mycompany.practica2_areafiguras;

import static java.lang.Math.tan;

/**
 *
 * @author carlossalcidoa
 */
public class poligono {

     //atributos
    private Double lado;
    private Double numLados;
    private Double perimetro;
    private Double apotema;
    private Double area;
    
    //metodos
    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Double getNumLados() {
        return numLados;
    }

    public void setNumLados(Double numLados) {
        this.numLados = numLados;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    public Double getApotema() {
        return apotema;
    }

    public void setApotema(Double apotema) {
        this.apotema = apotema;
    }

    public Double getArea() {
        return area;
    }
    public void setArea(Double area) {
        this.area = area;
    }
    
    public void CalcularPerimetro(){
        this.perimetro=(this.lado*this.numLados);
    }
    
    public void CalcularApotema(){
        double angulo = 360/(numLados*2);
        double variable2 = (tan(Math.toRadians(angulo)));
        //double variable3 = Math.toDegrees(variable2);
        this.apotema=(this.lado/(2*variable2));
    }
 
    public void CalcularArea(){
        this.area = (this.perimetro*this.apotema)/2;
    }
    
}
