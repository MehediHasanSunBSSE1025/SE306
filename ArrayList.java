package arrayList;

public class ArrayList {
	
	
	private int size,current_pos;
	private int[] arr;
	public ArrayList (int size)
	{
		this.size=size;
		current_pos=0;
		arr=new int [size];
	}
	
	public boolean add(int a)
	{
		if(size<=current_pos) return false;
				
		arr[current_pos]=a;
		current_pos++;
		return true;
	}

	public void add(int pos ,int a)
	{		
		if(pos>=size || pos < 0 || size<=current_pos) return;
		for(int i=current_pos;i>=pos;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[pos]=a;
		current_pos++;
	}
	
	public void clear()
	{
		for(int i=0;i<current_pos;i++)
		{
			arr[i]=0;
		}
		current_pos=0;
	}
	
	public int size() {
		return current_pos;
	}
	
	public boolean isEmpty()
	{
		if(current_pos==0) return true;
		else return false;
	}
	
	public void ensureCapacity(int minCapacity) 
	{
		int []temp=new int [size];
		for(int i=0;i<current_pos;i++)
		{
			temp[i]=arr[i];
		}
		arr=new int [minCapacity];
		for(int i=0;i<current_pos;i++)
		{
			arr[i]=temp[i];
		}
		size=minCapacity;
	}
	
	public int get(int index)
	{
		return arr[index];
	}
	
	public int indexOf(int a)
	{
		for(int i=0;i<current_pos;i++)
		{
			if(arr[i]==a) return i;
		}
		return -1;	
	}
	
	public int lastIndexOf(int a)
	{
		for(int i=current_pos-1;i>=0;i--)
		{
			if(arr[i]==a) return i;
		}
		return -1;	
	}
	
	public void remove(int index) {
		if(index<0 || index >= current_pos) return;
		for(int i=current_pos-1;i>index;i--)
		{
			arr[i-1]=arr[i];
		}
		current_pos--;
	}
	
	
	
	
	
}
