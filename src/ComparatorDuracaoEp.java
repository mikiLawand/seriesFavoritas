import java.util.Comparator;

public class ComparatorDuracaoEp implements Comparator<Series> {

   @Override
   public int compare(Series s1, Series s2) {
      int duracaoEp = Integer.compare(s1.getDuracaoEp(), s2.getDuracaoEp());
      if (duracaoEp != 0) return duracaoEp;
      
      return s1.getDuracaoEp().compareTo(s2.getDuracaoEp());

   }


}
