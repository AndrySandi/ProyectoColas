package Clases;

public class CadenaNodo {
    
private String dato;
private String genero;
private CadenaNodo izq, der;

    public CadenaNodo(String dato, String genero) {
        this.dato = dato;
        this.genero = genero;
        this.izq = this.der = null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public CadenaNodo getIzquierda() {
        return izq;
    }

    public void setIzquierda(CadenaNodo izq) {
        this.izq = izq;
    }

    public CadenaNodo getDerecha() {
        return der;
    }

    public void setDerecha(CadenaNodo der) {
        this.der = der;
    }
    
    public void imprimirDato() {
        System.out.println(this.getDato());
    }
}

