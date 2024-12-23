import java.util.Scanner;
public class Burger extends Food {
	
	private String size;
	Scanner in = new Scanner(System.in);
	
	public Burger(String size) {
		super("Гамбургер");
		this.size = size;
	}

	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	public int calculateCalories(int Calories) {
		if(this.size.equals("малый")) {
			Calories = 188;
			System.out.println(this + " 188 калорий");
		}
		else if(this.size.equals("средний")){
			Calories = 270;
			System.out.println(this + "270 калорий");
		}
		else if(this.size.equals("большой")){
			Calories = 380;
			System.out.println(this + "380 калорий");
		}
		else {
			System.out.println(this + "калорий");
			Calories = in.nextInt();
		}
		return Calories;
	}

	public boolean equals(Object arg0) {
		if (super.equals(arg0)) {
			if (!(arg0 instanceof Burger)) return false;
			return size.equals(((Burger) arg0).size);
		} else
			return false;
	}

	public String toString() {
		return /*super.toString() + */"Был съеден размера/Типа '" + size.toUpperCase() + "' ";
	}
}
