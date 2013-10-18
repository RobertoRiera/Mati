package Concesionario;

public abstract class Coche {
    
    private String conductor;
    private String tipo;
    private String color;
    private Punto posicion;

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Punto getPosicion() {
        return posicion;
    }

    public void setPosicion(Punto posicion) {
        this.posicion = posicion;
    }

    public Coche(String conductor, String tipo, String color, Punto posicion) {
        this.conductor = conductor;
        this.tipo = tipo;
        this.color = color;
        this.posicion = posicion;
    }
    public String toString(){
        return "El conductor es: "+conductor+", el tipo de coche: "
                    +tipo+", el color: "+color+" y la posición: "+
                        posicion.toString();
    }
    public abstract void avanza();
    
    
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Coche){
            Coche compare = (Coche)obj;
                return conductor==compare.conductor && tipo==compare.tipo && color==compare.color;
        }
        else return false;

    }
}