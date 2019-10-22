package assignment9.problem8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        System.out.println(allTransaction(transactions)); //Output: [{Trader:Brian in Cambridge, year: 2011, value:300}, {Trader:Raoul in Cambridge, year: 2011, value:400}, {Trader:Mario in Milan, year: 2012, value:700}, {Trader:Mario in Milan, year: 2012, value:710}, {Trader:Alan in Cambridge, year: 2012, value:950}, {Trader:Raoul in Cambridge, year: 2012, value:1000}]
        System.out.println(uniqueCities(transactions)); //Output: [Cambridge, Milan]
        System.out.println(tradersFromCambridge(transactions)); //Output:[Alan, Brian, Raoul]
        System.out.println(allTraders(transactions));//Output:Alan,Brian,Mario,Raoul
        System.out.println(checkCity(transactions, "Milan"));//Output:true
        System.out.println(UpdateTransactions(transactions));//Output:[Cambridge]
        System.out.println(highestValue(transactions));//Output:1000
        
    }
    
    // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
    public static List<Transaction>allTransaction(List<Transaction> trans){
    	return trans.stream()
    	.filter(t->t.getYear()>=2011)
    	.sorted((t1,t2)->Integer.compare(t1.getValue(), t2.getValue()))
    	.collect(Collectors.toList());
    }
    // Query 2: What are all the unique cities where the traders work?
    public static List<String>uniqueCities(List<Transaction> trans){
    	return trans.stream()
    		.map(t->t.getTrader().getCity())
    		.distinct()
    		.collect(Collectors.toList());  			
    }
 // Query 3: Find all traders from Cambridge and sort them by name.
    public static List<String> tradersFromCambridge(List<Transaction> trans){
    	return trans.stream()
    			.map(m->m.getTrader())
    			.filter(m->m.getCity().equals("Cambridge"))
    			.sorted((t1,t2)->t1.getName().compareTo(t2.getName()))
    			.map(t->t.getName())
    			.distinct()
    			.collect(Collectors.toList()); 					
    }
 // Query 4: Return a string of all traders names sorted alphabetically.
    public static String allTraders(List<Transaction> trans){
    	return trans.stream()
    			.map(m->m.getTrader().getName())
    			.sorted()
    			.distinct()
    			.collect(Collectors.joining(","));
  
                
    }
    // Query 5: Are there any trader based in Milan?	
    public static boolean checkCity(List<Transaction> trans, String city)  {	
    	return trans.stream()
    	.map(x->x.getTrader().getCity())
    	.anyMatch(x->x.equals(city));
    }
 // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
    public static List<String> UpdateTransactions(List<Transaction> trans){
    	return trans.stream()
    	.map(x->x.getTrader().getCity().replace("Milan", "Cambridge"))
    	.distinct()
    	.collect(Collectors.toList()); 	
    }
 // Query 7: What's the highest value in all the transactions?
    public static int highestValue(List<Transaction> trans) {
    	return trans.stream()
    			.max((t1,t2)->Integer.compare(t1.getValue(), t2.getValue()))
    			.get().getValue();
    }
    
    
}
