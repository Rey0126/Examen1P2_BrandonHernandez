package examen1p2_brandonhernandez;

public class LibroNoFiccion extends Libro {

    private String tipo;

    public LibroNoFiccion() {
    }

    public LibroNoFiccion(String tipo, String title, String autor, double precio) {
        super(title, autor, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: " + tipo;
    }

}
