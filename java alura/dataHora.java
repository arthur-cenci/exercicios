import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dataHora {
    public static void main(String[] args) {
        String tarefa = "Envio do relatório semanal";


        LocalDate dataAtual = LocalDate.now();
        LocalTime horarioAtual = LocalTime.now();
        System.out.println("horario de "+tarefa);
        System.out.println("data: "+dataAtual);
        System.out.println("horario atual: "+ horarioAtual);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
 
        String dataFormatada = dataAtual.format(formatoData);
        String horaFormatada = horarioAtual.format(formatoHora);

        System.out.println("data br: "+ dataFormatada);
        System.out.println("horario br: "+ horaFormatada);
 











    
    }
}
