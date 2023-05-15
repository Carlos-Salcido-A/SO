
package org.Programacion;

/**
 *
 * @author carlossalcidoa
 */
public class Burbuja {
    private int [] array;
    
    public Burbuja(int [] array){
        this.array=array;
    }
    
    public void Ordenar(){
        int aux;
        for(int i=0; i< this.array.length; i++){
            for(int j=1; j< this.array.length; j++){
                if(this.array[j-1]> this.array[j-0]){
                    aux=this.array[j];
                    this.array[j]=this.array[j-1];
                    this.array[j-1]=aux;
                }
            }
        }
    }
    
    public int[] getResultado(){
        return this.array;
    }
}
