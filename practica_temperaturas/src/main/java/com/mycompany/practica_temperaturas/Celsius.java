
package com.mycompany.practica_temperaturas;

/**
 *
 * @author carlossalcidoa
 */
public class Celsius {
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

    public void Celsius_Kelvin() {
        this.resultado = this.valor + 273.16;
    }
    
    public void Celsius_Farenheit() {
        this.resultado = (this.valor * 1.8) + 32;
    }
}
