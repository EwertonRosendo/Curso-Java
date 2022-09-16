import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class datahora{

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		// hora local é armazenada sem fuso horario
		// ano-mes=dia[hora]
		// hora é opcional
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss").withZone(ZoneId.systemDefault());
		
		LocalDate d01;
		LocalDateTime d02;
		Instant d03;

		LocalDate d04 = LocalDate.parse("2022-10-03");
		LocalDateTime d05 = LocalDateTime.parse("2022-10-03T12:30:00");
		Instant d06 = Instant.parse("2022-10-03T10:30:20Z");
		Instant d07 = Instant.parse("2022-10-01T10:30:20-03:00");
		LocalDate d08 = LocalDate.parse("03-10-2022", fmt1);
		LocalDate d10 = LocalDate.of(2022, 9, 02);
		Instant d11  = Instant.parse("2022-09-02T22:54:01Z");
		
		
		LocalDate r1 = LocalDate.ofInstant(d11,ZoneId.systemDefault());
		
		LocalDateTime t1 = LocalDateTime.parse("2022-09-03T12:00:00");
		LocalDateTime t2 = LocalDateTime.parse("2022-10-03T12:00:00");
		Duration drt = Duration.between(t1, t2);
		
		
		
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
		System.out.println("d08= " + d08.format(fmt1));
		System.out.println("d10= " + d10.format(fmt1));
		System.out.println("d11= " + fmt2.format(d11));
		System.out.println("r1= " + r1);
		System.out.println("Tempo entre semanas: " + drt.toDays());
		
		System.out.println();

		// data-hora global
		// ano-mes-dia com fuso horario

		// duracao
		// tempo decorrido entre duas data-horas

		sc.close();

	}

}
