public class main {

	public static void main(String[] args) {

	
		clock obj = new clock();
		int x=0;
		
/*		while(x <= 7200)
		{
			x++;
			obj.tick();
			
		}*/
	
		alarmclock obja = new alarmclock();
		obja.setAlarm(1,7,5);
		
		
		while(x <= 7200)
		{
			x++;
			obja.tick();
			
		}
		
		}
}
