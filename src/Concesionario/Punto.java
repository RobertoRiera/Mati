package Concesionario;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void desplaza(int x, int y){
        this.x=this.x+x;
        this.y=this.y+y;
    }
    public String toString(){
        return "x: "+ x+" - y: "+ y;
    }
}
