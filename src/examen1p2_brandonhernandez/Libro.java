
package examen1p2_brandonhernandez;

public class Libro {
    private String title;
    private String autor;
    private double precio;
    private int edicion;

    public Libro() {
    }

    public Libro(String title, String autor, double precio, int edicion) {
        this.title = title;
        this.autor = autor;
        this.precio = precio;
        this.edicion = edicion;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

      
}
