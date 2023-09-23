package components;

import org.springframework.stereotype.Component;

@Component
public class Person1 implements DataStack {

	@Override
	public String getname() {
		
		return "Devsiva";
	}

	@Override
	public Integer getage() {
		
		return 19;
	}

	@Override
	public Person getPerson() {
		
		return new Person(getname(), getage()); 
	}

}
