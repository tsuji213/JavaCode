package org.KonohaScript.KLib;

public class Mylist {
	
	class Entry{
		public Object value;
		public Entry next;
		
		Entry(Object value){
			this.value = value;
		}
	}
	
	Mylist(){}
	
	Entry headentry;
	
	public Object get(int n){
		Entry entry = headentry;
		for(int i = 0; i < n; i++){
			entry = entry.next;
		}
		return entry.value;
	}
	
	void add(Object value){
		Entry newentry = new Entry(value);
		if(headentry == null){
			headentry = newentry;
			return;
		}
		Entry entry = headentry;
		while(entry.next != null){
			entry = entry.next;
		}
		entry.next = newentry;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubad

		Mylist test = new Mylist();
		test.add(10);
		test.add(9);
		test.add(7);
		
		System.out.println(test.get(0));
		System.out.println(test.get(1));
		System.out.println(test.get(2));
		
	}

}