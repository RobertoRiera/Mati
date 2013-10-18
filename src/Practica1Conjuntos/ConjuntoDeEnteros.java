package Practica1Conjuntos;

public class ConjuntoDeEnteros {
    
    private int[] conjunto;
    private int tam;

    public ConjuntoDeEnteros() {
        conjunto = new int[10];
        tam = 0;
    }
    public int cardinal(){
        return tam;
    
    }
    public boolean estáVacío (){
        return tam==0;
    }
    public boolean pertenece(int numero){
        for (int i = 0; i < conjunto.length; i++) {
            if (numero == conjunto[i])
                return true;
        }
        return false;
    }
    public boolean añade (int elemento){
        if (this.pertenece(elemento) || tam == 10)
            return false;
        for (int i = tam; i < conjunto.length; i++) {
            conjunto[tam] = elemento;
            return true;
        }
    }
    public ConjuntoDeEnteros union(ConjuntoDeEnteros conjuntoB){
        ConjuntoDeEnteros nuevoConjunto;
        nuevoConjunto = conjuntoB;
        for (int i = 0; i < nuevoConjunto.conjunto.length; i++) {
            
            }
        }
    }
    
}
