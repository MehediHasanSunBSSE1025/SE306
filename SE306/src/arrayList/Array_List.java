package arrayList;

public class Array_List {
	private int size=5,current_pos=0;
	private String[] arr=new String [size];
	
	public void showAll() {
		for(int i=0;i<current_pos;i++)
		{
			System.out.print(arr[i]+' ');
		}
		System.out.println();
	}
	
	public boolean add(String s)
	{
		if(size==current_pos) enlarge();
				
		arr[current_pos]=s;
		current_pos++;
		
		return true;
	}
	
	public void enlarge() {
		size=size*2;
		String newArr[]= new String [size];
		
		for(int i=0;i<current_pos;i++)
		{
			newArr[i]=arr[i];
		}
		
		arr=newArr;
	}

	public void add(int pos ,String a)
	{		
		if(pos>=size || pos < 0) return;
		
		if (size==current_pos) enlarge();
		
		for(int i=current_pos;i>=pos-1;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[pos-1]=a;
		current_pos++;
	}
	
	public void clear()
	{
		for(int i=0;i<current_pos;i++)
		{
			arr[i]="";
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

	
	public String get(int index)
	{
		return arr[index-1];
	}

	public int indexOf(String a)
	{
		for(int i=0;i<current_pos;i++)
		{
			if(arr[i]==a) return i+1;
		}
		return -1;	
	}
	
	public int lastIndexOf(String a)
	{
		for(int i=current_pos-1;i>=0;i--)
		{
			if(arr[i]==a) return i+1;
		}
		return -1;	
	}
	
	public void shrink() {
		if(size%2==0) size=size/2;
		else size=size/2+1;
		
		String newArr[]=new String [size];
		for(int i=0;i<current_pos;i++)
		{
			newArr[i]=arr[i];
		}
		
		arr=newArr;
	}
	
	public void remove(int index) {
		if(index<0 || index >= current_pos) return;

		for(int i=index-1;i<current_pos-1;i++)
		{
			arr[i]=arr[i+1];
		}
		current_pos--;
		
		if(current_pos<size/2); shrink();
	}
	
	
	
}
