package pack1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MainClass
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("David",23,"USA");
		Person p2 = new Person("Joy",63,"German");
		Person p3 = new Person("Rayan",87,"Italy");
		Person p4 = new Person("Ram",50,"India");
		Person p5 = new Person("Chinng",54,"China");
		Person p6 = new Person("Manas",12,"Inida");
		Person p7 = new Person("Jai Shir Ram",54,"India");
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		
		//findFirst()
		Optional<Person> op =persons.stream()
		.filter(p -> p.getPersonCountry().equals("India"))
		.findFirst();
		
		if(op.isPresent())
		{
			System.out.println(op.get());
		}
		
		//findAny()
	    Optional<Person> op1 = persons.stream()
	     .filter(p -> p.getPersonCountry().equals("India"))
	     .findAny();
	    
	    if(op1.isPresent())
	    {
	    	System.out.println(op1.get());
	    }
		
		
		
	}

}
