import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class datahevento {
    public static void main(String[] args) {
        
        LocalDate show = LocalDate.of(2025, 03, 14);
        LocalDate agora = LocalDate.now();

        DateTimeFormatter formatadoShow = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatadoAgora = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String agoraFormatado = agora.format(formatadoAgora);
        String showFormatado = show.format(formatadoShow);

        System.out.println("o evento é "+showFormatado);
        System.out.println("e hoje é "+agoraFormatado);

        


        if (show.isBefore(agora)) {
            System.out.println("o show ja aconteceu");
 
        }else{
            System.out.println("o evento ainda nao aconteu");
        }










    }
}
