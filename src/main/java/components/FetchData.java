package components;


import org.springframework.stereotype.Component;

@Component
public class FetchData {

	
	private DataStack data;
	
	public FetchData( DataStack data ) {
		this.data = data;
	}
	
	public void fetchDetails()
	{
		
		System.out.println(data.getPerson());
		
	}
	
}
