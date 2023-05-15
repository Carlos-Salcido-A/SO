
package com.mycompany.practica2_areafiguras;

/**
 *
 * @author carlossalcidoa
 */
public class triangulo {
    //atributos
    private Double base;
    private Double altura;
    private Double area;
    
    //metodos o comportamiento del objeto
    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
    
    public Double getBase (Double base){
        return base;
    }
    
    public void setBase (Double base){
        this.base=base;
    }
    
    
    public void CalcularArea(){
        this.area=(this.base*this.altura)/2;
    }
    
}
