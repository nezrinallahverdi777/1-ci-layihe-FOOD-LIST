
package FoodRepository;

import FoodList.Food;

public class FoodRepository {

    private Food[] foods = {
            new Food(1, "Pizza", 12.5),
            new Food(2, "Burger", 8.0),
            new Food(3, "Doner", 6.5),
            new Food(4, "Lahmacun", 5.0),
            new Food(5, "Pasta", 10.0),
            new Food(6, "Sushi", 15.0),
            new Food(7, "Salad", 4.5),
            new Food(8, "Fries", 3.0)
    };

    private Food[] basket = new Food[0];

    public void showInfo() {

        for (int i = 0; i < foods.length; i++) {
            foods[i].showInfo();
            System.out.println("----------------");
        }
    }

    public Food findId(int id) {

        for (int i = 0; i < foods.length; i++) {

            if (foods[i].getId() == id) {
                return foods[i];
            }
        }

        return null;
    }


    public void addToBasket(int id) {

        Food food = findId(id);

        if (food == null) {
            System.out.println("ID Yanlisdir!");
            return;
        }

        Food[] newBasket = new Food[basket.length + 1];

        for (int i = 0; i < basket.length; i++) {
            newBasket[i] = basket[i];
        }

        System.out.println("Yemek sebete elave olundu!");
    }

    public void showBasket() {

        if (basket.length == 0) {
            System.out.println("Sebet bosdur!");
            return;
        }

        for (int i = 0; i < basket.length; i++) {
            basket[i].showInfo();
            System.out.println("----------------");
        }
    }
}
