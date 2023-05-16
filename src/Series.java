import java.util.Objects;

public class Series implements Comparable<Series>{

    String titulo;
    String genero;
    Integer duracaoEp;
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getDuracaoEp() {
        return duracaoEp;
    }

    public void setDuracaoEp(Integer duracaoEp) {
        this.duracaoEp = duracaoEp;
    }

    public Series(String titulo, String genero, Integer duracaoEp) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracaoEp = duracaoEp;
    }

    @Override
    public String toString() {
        return "{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", duracaoEp=" + duracaoEp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return titulo.equals(series.titulo) && genero.equals(series.genero) && duracaoEp.equals(series.duracaoEp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, genero, duracaoEp);
    }

    @Override
    public int compareTo(Series series) {
       int duracaoEp = Integer.compare(this.getDuracaoEp(), series.getDuracaoEp());
       if (duracaoEp != 0) return duracaoEp;

       return this.getGenero().compareToIgnoreCase(series.getGenero());
    }

}



   