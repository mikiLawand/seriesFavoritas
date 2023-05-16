import java.util.Comparator;

public class ComparatorTituloGeneroDuracaoEp implements Comparator<Series>{
  
    @Override
    public int compare(Series s1, Series s2) {
       int titulo = s1.getTitulo().compareToIgnoreCase(s2.getTitulo());
       if (titulo != 0) return titulo;
       //se os titulos forem iguais,o desenpate é feito pelo genero
       int genero = s1.getGenero().compareToIgnoreCase(s2.getGenero());
       if (genero != 0) return genero;

       return Integer.compare(s1.getDuracaoEp(), s2.getDuracaoEp());
    }
}
