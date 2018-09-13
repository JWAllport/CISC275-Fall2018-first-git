import java.util.Comparator;

import javax.print.attribute.standard.MediaSize.Other;

public class Dog implements Comparable<Dog>{
	
	String name;
	
	public String toString() {
		return this.name;
	}
	
	int legs;
	
	public int getLegs() {
		return legs;
	}

	
	public Dog(String name,int legs) {
		this.name=name;
		this.legs=legs;
	}


	@Override
	public int compareTo(Dog o) {
		// TODO Auto-generated method stub
		return this.getLegs()-o.getLegs();
	}



}


