
import java.util.Scanner;
public class sorting {
	public int x,i;
    public int a[]= new int[5];
    public void values()
    {
    	Scanner scn = new Scanner(System.in);
    	System.out.println("Enter the values");
    			
    			for(i=0;i<5;i++)
    			{
    				a[i]=scn.nextInt();
    			}
    			
    }
   
	public void ascending(){
		for (i=0;i<5;i++)
		{
		for(int j=i+1;j<5;j++)
		{
			if (a[i]>a[j]){
		x=a[i];
		a[i]=a[j];
		a[j]=x;
		}
		}}
		System.out.print("Ascending order:");
		for(i=0;i<5;i++)
		{
			System.out.print(a[i]+",");
		}
		}
	
	public void descending(){
		
	
		for (i=0;i<5;i++)
		{
		for(int j=i+1;j<5;j++)
		{
			if (a[i]<a[j]){
		x=a[i];
		a[i]=a[j];
		a[j]=x;
		}
		}}
		System.out.print("Descending order:");
		for(i=0;i<5;i++)
		{
			System.out.print(a[i]+",");
		}
		}


}
