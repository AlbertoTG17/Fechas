import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Main {
	public static void main(String[]args) {
		
		Date fechaDate = new Date();
		System.out.println("Date: "+fechaDate);
		
		TimeZone.setDefault(TimeZone.getTimeZone("GMT+1"));
		Calendar cal=Calendar.getInstance(TimeZone.getDefault());
		System.out.println("GMT + 1: "+cal.getTime());
		
		TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
		Calendar fechaCalendar = Calendar.getInstance(TimeZone.getDefault());
		System.out.println("GMT: "+fechaCalendar.getTime());
		
		Calendar fechaGregorian = new GregorianCalendar();
		System.out.println("Gregorian calendar: "+fechaGregorian.getTime());
		
		fechaGregorian.add(Calendar.MONTH, 2);
		System.out.println("Gregorian add 2 meses: "+fechaGregorian.getTime());
		
		fechaGregorian.roll(Calendar.HOUR, 27);
		System.out.println("Gregorian roll 27 horas: "+fechaGregorian.getTime());
		
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("SimpleDateFormat(dd/mm/yyyy): "+fmt.format(fechaDate));
		
		DateFormat df = DateFormat.getDateInstance();
		System.out.println("DataFormat (getDateInstance): "+df.format(fechaDate));
		
		DateFormat dfti = DateFormat.getTimeInstance();
		System.out.println("DataFormat (getTimeInstance): "+dfti.format(fechaDate));
		
		LocalDate fechaLocalDate = LocalDate.now(); 
		System.out.println("LocalDate: "+fechaLocalDate);
		
		DayOfWeek dayOfWeek = DayOfWeek.from(fechaLocalDate);
		System.out.println("DayOfWeek: "+dayOfWeek);
		
		LocalDate mañanaLocalDate = fechaLocalDate.plusDays(1); 
		System.out.println("LocalDate (plusDays): "+mañanaLocalDate);
		
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("Es año bisiesto: " + calendar.isLeapYear(2019));
		
	}
}
