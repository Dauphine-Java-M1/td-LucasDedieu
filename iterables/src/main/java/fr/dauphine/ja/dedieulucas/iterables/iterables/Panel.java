package fr.dauphine.ja.dedieulucas.iterables.iterables;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Panel extends AbstractList<Integer>{
		private final int start;
		private final int end;
	
	Panel(int start, int end){
		this.start=start;
		this.end=end;
	}
	
	Panel(){
		this.start=0;
		this.end=0;
	}
	
	public Iterator<Integer> iterator() {
		return panel1(start,end);
	}
	
	public static Iterator<Integer> panel1(final int start, final int end) {
		return new Iterator<Integer>() {
			int cursor = start;
			
			public boolean hasNext() {
				if (cursor<=end) {
					return true;
				}
				return false;
			}
			
			public Integer next() {
				return cursor++;
			}
		};
			
	}
	
	public static ArrayList<Integer> panel2(int beginning, int end) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=beginning;i<=end;i++) {
			a.add(i);
		}
		return a;
	}
	
	public static List<Integer> panel(int beginning, int end){
		return new Panel(beginning,end);
	}
	
	@Override
	public Integer get(int index) {
		return start+index;
	}

	@Override
	public int size() {
		return end-start+1;
	}
	
	public static void main( String[] args ){
		 Iterator<Integer> it = panel1(3,10); 
		 for(int i:panel(1,5)) {
			 System.out.println(i);
		 }
	}
	

}
