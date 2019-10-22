package assignment9.problem10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
public static void main(String args[]){
	Human[] list = { new Human("Joe",35,"Male"), new Human("Jane",45,"Female"), new Human("John",30,"Male")};
	
    // Query 1  : Print only Female canditates names
	humanstream(list)
	.filter(h->h.getGender().equals("Female"))
	.map(h->h.getName())
	.forEach(System.out::println);
	

    // Query 2 : Cretae an objecy by choosing suitable Interface to the specified constructors(Totally 3 constuctors)using fouth type of Method Reference ClassName::new. Then print the object status 
  Function<String,Human> ob1 = Human::new;
  BiFunction<String,Integer,Human> ob2= Human::new;
  TriFunction<String,Integer,String,Human> ob3 = Human::new;
  List<Human> humans = Arrays.asList(ob1.apply("Bob"),ob2.apply("Eric",27),ob3.apply("Joseph",50,"Male"));
  humans.forEach(System.out::println);
	
	// Query 3 : Count the male candidates whose age is more than 30
    Long males = humanstream(list)
    .filter(m->m.gender.equals("Male")&& m.age >30)
    .count();
    System.out.println(males);       	
    }
public static Stream<Human> humanstream(Human[]humans){
	return Arrays.stream(humans);  
   }
}
