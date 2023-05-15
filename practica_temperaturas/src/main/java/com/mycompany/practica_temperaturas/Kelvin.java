
package com.mycompany.practica_temperaturas;

/**
 *
 * @author carlossalcidoa
 */
public class Kelvin {
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

    public void Kelvin_Celsius() {
        this.resultado = this.valor - 273.16;
    }
    
    public void Kelvin_Farenheit() {
        this.resultado = (1.8 * (this.valor - 273.16)) + 32;
    }
}
