package corejava2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.testng.annotations.Test;

public class Dateformat {

	
		@Test(enabled=false)
		public void date()
		{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		Date d = new Date();
		
		System.out.println(sdf.format(d));
		System.out.println(d.toString());
		}
		
		@Test
		public void calenderc()
		{
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
			System.out.println(s.format(cal.getTime()));
			System.out.println(cal.get(Calendar.DAY_OF_MONTH));
			System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		}
		
	}


