import java.util.Comparator;

public class FoodComparator implements Comparator<Food>{
    public int compare(Food o1, Food o2) {
        if (o1 instanceof Burger && o2 instanceof Burger) {
            Burger b1 = (Burger) o1;
            Burger b2 = (Burger) o2;
            return b1.getSize().compareTo(b2.getSize());
        }
        return 0;
    }
}