import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);

		List<Food> FoodList = new ArrayList<>();

		System.out.println("Введите размеры гамбургера (большой, средний, малый) или 'exit' для завершения программы:");

		while (FoodList.size() < 20){
			String input = in.nextLine().toLowerCase();
			if(input.equals("exit")){
				break;
			}

			FoodList.add(new Burger(input));
		}

		Collections.sort(FoodList, new FoodComparator());

		int Calories = 0;
		for(Food item : FoodList){
			if(item != null){
				Calories += item.calculateCalories(Calories);
			}
		}

		System.out.println("Всего:" + Calories + " ккалорий");

	}
}
