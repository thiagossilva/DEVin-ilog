import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Datas {

    public static void main(String[] args) {

//        Date dataComDate = new Date();    datas originais até Java 8

        // LocalDate
        LocalDate hoje = LocalDate.now();
        LocalDate aniversario = LocalDate.of(1983, 5, 5);

//        System.out.println(hoje);
//        System.out.println(aniversario);

        // LocalDateTime
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime horario = LocalDateTime.of(1900, 5, 5, 11, 12, 10);

        System.out.println(agora);
        System.out.println(horario);

        // Formatar datas
        LocalDateTime formata = LocalDateTime.now();

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        String dataFormatada = formatador.format((formata));

        System.out.println(dataFormatada);

    }

}