
public class linklist extends list{

	public node list;
	public node First = null;
	public node Last = null;
	public int i=0;
	public int j;
    public int h;
    public int num;
    
	
	public void add(int num){
		
		node list=new node(num,null,null);
		
		i++;
		if (First==null){
 			First=list;
 			Last=First;
 		}
		else
 		{
 			Last.next=list;
 			list.previous=Last;
 			Last=list;
 			
 		}
		
     }
public int index(int num){
	
		
		node ptr=First;
		
		for(j=1;j<=i;j++){
			
			if(ptr.num==num)
			{
			h=j;
			}
			ptr=ptr.next;}
		return h;
	}
   
	
	public void remove (){
		node ptr=First;
		Last=Last.previous;
		Last.next=null;
		i--;
	}
	
	public void search(int num){
		index(num);
		node ptr=First;
		for(j=1;j<i;j++)
		{
			if(ptr.num==num){
				System.out.println("The number is at pos "+h);
			}
		ptr=ptr.next;}
	}
	
public void sort(){
	
	for(j=1;j<1;j++){
		node ptr=First;
	for(j=1;j<i;j++)
	{
		node a=ptr;
		node b=ptr.next;
		if(a.num>b.num){
		int x=a.num;
		a.num=b.num;
		b.num=x;}
	ptr=ptr.next;}
	}}
	public void update(int num,int pos,int val){
		node ptr=First;
	    index(num);
	    pos=h;
		for(j=1;j<i;j++){
			if(j==pos)
			{
				ptr.num=val;
			}
		ptr=ptr.next;}
		
	}
	public void display(){
        if (i == 0) 

        {

            System.out.println("empty");

            return;
        }
       
 node ptr=First;
 System.out.print(First.num+ " ");

 ptr = First.next;
        
    while (ptr.next != null)

    {

        System.out.print(ptr.num+ " ");

        ptr= ptr.next;

    }
    System.out.println(ptr.num);
	}
}
