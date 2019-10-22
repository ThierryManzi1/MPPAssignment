package assignment9.problem9;
import java.util.*;
import java.util.stream.Stream;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                           new Dish("beef", false, 700, Dish.Type.MEAT),
                           new Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Dish("rice", true, 350, Dish.Type.OTHER),
                           new Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Dish("prawns", false, 400, Dish.Type.FISH),
                           new Dish("salmon", false, 450, Dish.Type.FISH));
    
    //a.
    public static boolean isAnyVegeterian() {
    	return menuStream()
    			.anyMatch(x->x.isVegetarian());
    }
    //b.
    public static boolean isAnyHealthMenu() {
    	return menuStream()
    	.anyMatch(m->m.getCalories()<1000);
    }
    //c.
    public static boolean isAnyUnHealthMenu() {
    	return menuStream()
    	    	.anyMatch(m->m.getCalories()>1000);
    }
    //d.
    public static Optional<Dish> firstMeat() {
    	return menuStream()
    			.filter(m->m.type==Type.MEAT)
    			.findFirst();
    }
    //e.
    public static int totalCalories() {
    	return menuStream()
    	.map(m->m.calories)
    	.reduce(0,(a,b)->(a+b));
    }
    //f.
    public static int totalMethodReferenceCalories() {
    	return menuStream()
    	.map(m->m.calories)
    	.reduce(0,Integer::sum);
    }
    public static Stream<Dish> menuStream(){
    	return menu.stream();
    }
    public static void main(String[]args) {
    	//a
    	System.out.println("Is there any Vegetarian meal available: "+Dish.isAnyVegeterian());
    	
    	//b
    	System.out.println("Is there any healthy menu have calories less than 1000: "+Dish.isAnyHealthMenu());
    	
    	//c
    	System.out.println("Is there any unhealthy menu have calories greater than 1000:  "+Dish.isAnyUnHealthMenu());
    	
    	
		//d
    	System.out.println("find and return the first item for the type of MEAT: "+
    			Dish.firstMeat());
    	
    	//e
    	System.out.println("calculateTotalCalories() in the menu using reduce: "+ Dish.totalCalories());
    	
    	//f
    	System.out.println("calculateTotalCaloriesMethodReference()in the menu using MethodReferences.: " + 
    			Dish.totalMethodReferenceCalories());
	}
    

}


