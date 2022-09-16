import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class dataandhora {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		// hora local é armazenada sem fuso horario
		// ano-mes=dia[hora]
		// hora é opcional
		LocalDate d01;
		LocalDateTime d02;
		Instant d03;

		LocalDate d04 = LocalDate.parse("2022-10-03");
		LocalDateTime d05 = LocalDateTime.parse("2022-10-03T12:30:00");
		Instant d06 = Instant.parse("2022-10-03T10:30:20Z");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Instant d07 = sdf.parse("2022-10-01T10:30:20-03:00").toInstant();

		d01 = LocalDate.now();
		d02 = LocalDateTime.now();
		d03 = Instant.now();

		System.out.println("d01= " + d01);
		System.out.println("d02= " + d02);
		System.out.println("d03= " + d03); // horario gnt;
		System.out.println("d04= " + d04);
		System.out.println("d05= " + d05);
		System.out.println("d06= " + d06);
		System.out.println("d07= " + d07);

		// data-hora global
		// ano-mes-dia com fuso horario

		// duracao
		// tempo decorrido entre duas data-horas

		sc.close();

	}

}
