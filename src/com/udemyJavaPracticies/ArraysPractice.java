package com.udemyJavaPracticies;

public class ArraysPractice {
	private static String getRating(float rating) {
		 if (rating <= 5.0){
	            return "bad";
	        } else if (rating > 5.0 && rating <= 6.5){
	            return "average";
	        } else if (rating > 6.5 && rating <= 7.0){
	            return "good";
	        } else if (rating > 7.0 && rating <= 8.0){
	            return "very good";
	        }else{
	            return "amazing";
	        }
	}
public static void main(String[] args) {
String actorName = "Tom Cruise";
int yearOfBorn = 1962;
int age = 2020 - yearOfBorn;
String[] movietitle = {
		 "The Last Samurai", "Minority Report", "Top Gun",
         "Rain Man", "Cocktail", "The Mummy", "American Made"
};
 float[] movieRating= {
		 7.7F, 7.6F, 6.9F,
         8.0F, 5.9F, 5.4F, 7.1F
 };
 System.out.println("Actor Name - "+actorName );
 System.out.println("Born - "+yearOfBorn + "Age- " + age);
 System.out.println("Titles"+ movietitle);
 for(int i =0; i<movietitle.length;i++) {
	 System.out.println(movietitle[i] + "-" + getRating(movieRating[i]));
 }
}


}
