package test;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private List<String> personData=new ArrayList<String>();
	
	
	public List<String> getPersonData(){
		return this.personData;
	}
	
	public void setPersonData(String add){
		
		this.personData.add(add);
	}
	
	
}


