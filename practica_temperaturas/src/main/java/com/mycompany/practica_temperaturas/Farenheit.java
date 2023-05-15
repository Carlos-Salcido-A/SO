
package com.mycompany.practica_temperaturas;

/**
 *
 * @author carlossalcidoa
 */
public class Farenheit {
    private double valor;
    private double resultado;
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getResultado() {
        return resultado;
    }

    public void Farenheit_Celsius() {
        this.resultado = (this.valor - 32) / 1.8;
    }
    
    public void Farenheit_Kelvin(){
        this.resultado = ((this.valor - 32) * (0.5555)) + 273.16;
    }
}
