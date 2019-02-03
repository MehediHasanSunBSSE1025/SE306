package arrayList;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		Array_List list =new Array_List();
		list.add("hello");
		list.add("the");
		list.add("world");
		list.add(3,"magical");
		
		list.showAll();
		list.remove(2);
		list.showAll();
		
		System.out.println("size : "+list.size());
		System.out.println("is emplty : "+ list.isEmpty());
		System.out.println("no 3 element is : "+list.get(3));
		System.out.println("index of 'hello' : "+list.indexOf("hello"));
		
		ArrayList<String> arr=new ArrayList<String>(5);
		arr.add("hello");
		arr.add("the");
		
		
	}

}
