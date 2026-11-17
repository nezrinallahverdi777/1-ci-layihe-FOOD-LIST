import FoodList.Food;
import FoodRepository.FoodRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        FoodRepository repository = new FoodRepository();

        int choice;
        do {
            System.out.println("------FOOD LIST------");
            System.out.println("1. Butun yemekleri goster");
            System.out.println("2. ID ile yemek tap");
            System.out.println("3. Yeni yemek elave et");
            System.out.println("4. Sebete yemek elave et");
            System.out.println("5. Sebetdeki yemekleri goster");
            System.out.println("6. Exit");

            System.out.print("Seciminizi daxil edin: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    repository.showInfo();
                    System.out.println("-----------------------------");

                case 2:
                    System.out.print("Yemeyin ID-sini daxil edin: ");
                    int id = sc.nextInt();

                    Food food = repository.findId(id);

                    if (food != null) {
                        food.showInfo();
                    } else {
                        System.out.println("Bele ID-li yemek yoxdur!");
                    }
                    System.out.println("-----------------------------");
                    break;

                case 3:
                    System.out.print("ID daxil edin: ");
                    int Id = sc.nextInt();

                    System.out.print("Yemeyin adini daxil edin: ");
                    String name = sc.next();

                    System.out.print("Qiymetini daxil edin: ");
                    double price = sc.nextDouble();

                    System.out.println(Id + name + price);
                    System.out.println("-----------------------------");
                    break;

                case 4:
                    System.out.print("Sebete elave etmek istediyiniz yemeyin ID-sini daxil edin: ");
                    int basketId = sc.nextInt();

                    repository.addToBasket(basketId);
                    System.out.println("-----------------------------");
                    break;

                case 5:
                    repository.showBasket();
                    System.out.println("-----------------------------");
                    break;

                case 6:
                    System.out.println("Proqramdan cixildi!");
                    System.out.println("-----------------------------");
                    break;

                default:
                    System.out.println("Yanlis secim etdiniz!");
            }

        } while(choice != 6);


    }
}