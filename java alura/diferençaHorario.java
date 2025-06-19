import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class diferençaHorario {
    public static void main(String[] args) {
        
        LocalDate inicio = LocalDate.of(2025, 03, 15);
        LocalDate fim = inicio.plusMonths(1);

        System.out.println("o dia e ano é "+inicio+"e o final é "+fim);

        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String dataformada = inicio.format(formatar);
        String entrega = fim.format(formatar);

        System.out.println(" o prazo e de "+dataformada+" até "+entrega);

        // Duration duraçao = Duration.between(inicio, fim);

        // System.out.println("a duraçao e de "+ duraçao.toDays());












    }
}
