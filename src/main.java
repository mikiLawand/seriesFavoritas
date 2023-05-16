import java.util.*;

public class main {
    public static void main(String[] args) {
        
        System.out.println("Ordem aleatória: ");
        Set<Series> minhasSeries = new HashSet<>(){{
            add(new Series("I May Destroy You", "Drama Psicologico", 35));
            add(new Series("Succession", "Comedia Dramatica", 60));
            add(new Series("Once Upon a Time", "Fantasia", 43));
        }};
        for (Series serie: minhasSeries) System.out.println(serie.getTitulo() + " - "
                + serie.getGenero() + " - " + serie.getDuracaoEp());
        
        System.out.println("Ordem de inserção: ");
        Set<Series> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Series("I May Destroy You", "Drama Psicologico", 35));
            add(new Series("Succession", "Comedia Dramatica", 60));
            add(new Series("Once Upon a Time", "Fantasia", 43));
        }};
        for (Series serie: minhasSeries2) System.out.println(serie.getTitulo() + " - "
        + serie.getGenero() + " - " + serie.getDuracaoEp());

        System.out.println("Ordem natural por duração de episodio: ");
        Set<Series> minhasSeries3 = new TreeSet<>(minhasSeries2);
        minhasSeries3.addAll(minhasSeries);
        for (Series series: minhasSeries3) System.out.println(series.getTitulo() + " - " + series.getGenero() + " - " + series.getDuracaoEp());
        
        System.out.println("Ordem por Titulo/Genero/Duração do episodio: ");
        Set<Series> minhasSeries4 = new TreeSet<>(new ComparatorTituloGeneroDuracaoEp());
        minhasSeries3.addAll(minhasSeries);
        for (Series series: minhasSeries3) System.out.println(series.getTitulo() + " - " + series.getGenero() + " - " + series.getDuracaoEp());

        System.out.println("Ordem de genero: ");
        Set<Series> minhasSeries5 = new TreeSet<>(new ComparatorGenero());
        for (Series series: minhasSeries3) System.out.println(series.getTitulo() + " - " + series.getGenero() + " - " + series.getDuracaoEp());

        System.out.println("Ordem por duração de episodio: ");
        Set<Series> minhasSeries6 = new TreeSet<>(new ComparatorDuracaoEp());
        minhasSeries6.addAll(minhasSeries);
        for (Series series: minhasSeries6) System.out.println(series.getTitulo() + " - " + series.getGenero() + " - " + series.getDuracaoEp());
    }
      
}
