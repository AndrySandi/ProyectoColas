package Clases;

public class ArbolBinario {
    
 private CadenaNodo raiz;

    public ArbolBinario() {

    }

    public boolean existe(String busqueda) {
        return existe(this.raiz, busqueda);
    }

    private boolean existe(CadenaNodo n, String busqueda) {
        if (n == null) {
            return false;
        }
        if (n.getDato().equals(busqueda)) {
            return true;
        } else if (busqueda.compareTo(n.getDato()) < 0) {
            return existe(n.getIzquierda(), busqueda);
        } else {
            return existe(n.getDerecha(), busqueda);
        }

    }

    public void insertar(String dato, String g) {
        if (this.raiz == null) {
            this.raiz = new CadenaNodo(dato, g);
        } else {
            this.insertar(this.raiz, dato, g);
        }
    }

    private void insertar(CadenaNodo padre, String dato, String g) {
        if (dato.compareTo(padre.getDato()) > 0) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new CadenaNodo(dato, g));
            } else {
                this.insertar(padre.getDerecha(), dato, g);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new CadenaNodo(dato, g));
            } else {
                this.insertar(padre.getIzquierda(), dato, g);
            }
        }

    }

    private void preorden(CadenaNodo n) {
        if (n != null) {
            n.imprimirDato();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        }
    }

    private void inorden(CadenaNodo n) {
        if (n != null) {
            inorden(n.getIzquierda());
            n.imprimirDato();
            inorden(n.getDerecha());
        }
    }

    private void postorden(CadenaNodo n) {
        if (n != null) {
            postorden(n.getIzquierda());
            postorden(n.getDerecha());
            n.imprimirDato();
        }
    }

    private void BuscarMujeres(CadenaNodo n) {

        if (n != null) {
            if (n.getGenero().equals("F")) {
                n.imprimirDato();
            }
            BuscarMujeres(n.getIzquierda());
            BuscarMujeres(n.getDerecha());
        }
    }

    public void preorden() {
        this.preorden(this.raiz);
    }

    public void inorden() {
        this.inorden(this.raiz);
    }

    public void postorden() {
        this.postorden(this.raiz);
    }

    public void BuscarMujeres() {
        this.BuscarMujeres(this.raiz);
    }
}

