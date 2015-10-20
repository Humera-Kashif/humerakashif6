

public class node {

public int num;
	public node previous;
	public node next;
	public node address;
	
	public node(){
		num=0;
		next=null;
	}
	public node(int num,node next,node previous)
	{
		this.num=num;
		this.next=next;
		this.previous=previous;
	}
}