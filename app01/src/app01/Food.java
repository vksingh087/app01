package app01;

public class Food {
    String name;
    int calories;
    double rating;
    Food(String name,int calories,double rating)
    {
    	this.name=name;
    	this.calories=calories;
    	this.rating=rating;
    }
    public int getCalories() {
		return calories;
	}
    public double getRating() {
		return rating;
	}
    public String getName() {
		return name;
	}
    public void setCalories(int calories) {
		this.calories = calories;
	}
    public void setName(String name) {
		this.name = name;
	}
    public void setRating(double rating) {
		this.rating = rating;
	}
    public void print()
    {
    	System.out.println("Food Name: "+getName()+"   Food Calories: "+getCalories()+"   Food Rating: "+getRating());
    }
	public static void main(String[] args) {
       
		 Food f1=new Food("Candy",7,4.5);
		 Food f2=new Food("Rice",17,3.5);
		 f1.print();
		 System.out.println();
		 f2.print();

	}

}
