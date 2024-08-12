public class Libro {
    String codigo;
    String titulo;
    String autor;
    int vecesPrestado;

    public Libro() {
    }

    public Libro(String codigo, String titulo, String autor, int vecesPrestado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.vecesPrestado = vecesPrestado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getVecesPrestado() {
        return vecesPrestado;
    }

    public void setVecesPrestado(int vecesPrestado) {
        this.vecesPrestado = vecesPrestado;
    }

    public void prestarLibro(){
        this.vecesPrestado++;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", vecesPrestado=" + vecesPrestado +
                '}';
    }
}
