package examen1p2_brandonhernandez;

public class LibroTexto extends Libro{
    private String curso;
    private String facu;

    public LibroTexto() {
    }

    public LibroTexto(String curso, String facu, String title, String autor, double precio, int edicion) {
        super(title, autor, precio, edicion);
        this.curso = curso;
        this.facu = facu;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getFacu() {
        return facu;
    }

    public void setFacu(String facu) {
        this.facu = facu;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCurso: " + curso + "\nFacultad: " + facu;
    }
    
    
}
