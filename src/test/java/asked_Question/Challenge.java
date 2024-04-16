package asked_Question;

import java.util.Optional;
import java.util.stream.Stream;

public class Challenge 
{
	public static void main(String[] args) {
		 Stream<Optional<String>> names = Stream.of(
		 Optional.of("Anna"),
		 Optional.empty(),
		 Optional.of("Mike"),
		 Optional.empty(),
		 Optional.of("Joe")
		 );

		 long count = names.filter(Optional::isPresent)
		 .map(Optional::get)
		 .filter(name -> name.startsWith("A"))
		 .count();
		 System.out.println(count);
		 }
	
	

}
