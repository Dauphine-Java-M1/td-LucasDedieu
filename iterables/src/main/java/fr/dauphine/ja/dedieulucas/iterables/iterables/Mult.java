package fr.dauphine.ja.dedieulucas.iterables.iterables;

import java.util.ArrayList;
import java.util.List;

public class Mult {


	public static List<Integer> mult(int m, List<Integer> list) {
		int tmp;
		for(int i=0; i<list.size(); i++) {
			tmp=list.get(i);
			list.set(i,tmp*m);
		}
		return list;
	}
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.println(Mult.mult(2,l));
	}
}
