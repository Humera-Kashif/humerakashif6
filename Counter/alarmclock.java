
public class alarmclock extends clock {
	private boolean alarmOn;
    private int hrSet, minSet,secSet;
    public alarmclock( ) 
    {
  	  alarmOn = false;  
    }
    public void setAlarm(int hr, int min, int sec) 
    {
  	  hrSet = hr; minSet = min; secSet=sec; alarmOn = true;
    }
    public void tick( ) 
    {
  	  super.tick( );
   
	if ((viewHr( ) == hrSet)&&(viewMin() == minSet)&&(viewSec() == secSet)&&alarmOn)
	{
		System.out.println("ring");
  }
  }
    
    public void resetAlarm( )  
    {
  	  alarmOn = false;
    }
}
