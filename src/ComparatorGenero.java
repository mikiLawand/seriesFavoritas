import java.util.Comparator;

public class ComparatorGenero implements Comparator<Series> {

    @Override
    public int compare(Series s1, Series s2) {
       return s1.genero.compareToIgnoreCase(s2.genero);

    }
}



