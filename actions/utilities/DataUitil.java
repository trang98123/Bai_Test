package utilities;

import java.util.Random;

import com.github.javafaker.Faker;

public class DataUitil {

	 private Faker faker;
	 public static DataUitil getData()
	 {
		 return new DataUitil();
	 }
	 
	 public DataUitil()
	 {
		 faker =new Faker();
	 }
	 
	 public String getfirstName()
	 {
		 return  faker.name().firstName();
		//  System.out.println(name);
	 }
	
	 public String getLastName()
	 {
		return faker.name().lastName();
	 }
	 public String getFullName()
	 {
		 return getfirstName() + getFullName();
	 }
	 public String randomEmail()
	 { Random rand= new Random();
		 return "hoang" + rand.nextInt(9999) + "@hotmail.com";
	 }
	
}
