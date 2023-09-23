package components;


import org.springframework.stereotype.Component;

record Person( String name , Integer age ) {};

@Component
public interface DataStack {
	
	
	 String getname();
	
	
	
	 Integer getage();
	

    
     Person getPerson();
	
	
	
}
