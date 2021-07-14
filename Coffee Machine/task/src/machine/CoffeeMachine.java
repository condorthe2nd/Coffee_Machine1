package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scan = new Scanner(System.in);
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;


    public static void main(String[] args) {
        run();
    }

    private static void run() {
        /*OUTER:*/
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String command = scan.next();
            if (menu(command)) break;
        }
    }

    private static boolean menu(String command) {
        if ("buy".equals(command)) {
            buy();
        } else if ("fill".equals(command)) {
            fill();
        } else if ("take".equals(command)) {
            take();
        } else if ("exit".equalsIgnoreCase(command)) {
            return true;
        } else if ("remaining".equals(command)) {
            print(water, milk, beans, cups, money);
        }
        return false;
    }

    public static void buy() {
        int type1;
        while (true) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
            String type = scan.next();
            if (type.equals("back")) {
                break;
            } else {
                type1 = Integer.parseInt(type);
            }
            if (type1 == 1) {
                if (canMakeCoffee(250, 0, 16)) {
                    money += 4;
                    water -= 250;
                    beans -= 16;
                    cups--;
                    enough();
                }
            } else if (type1 == 2) {
                if (canMakeCoffee(350, 75, 20)) {
                    money += 7;
                    water -= 350;
                    beans -= 20;
                    milk -= 75;
                    cups--;
                    enough();
                }
            } else if (type1 == 3) {
                if (canMakeCoffee(200, 100, 12)) {
                    money += 6;
                    water -= 200;
                    beans -= 12;
                    milk -= 100;
                    cups--;
                    enough();
                }
            }
            break;
            //break OUTER;
        }
    }


    public static void print(int water, int milk, int beans, int cups, int cash) {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water", water);
        System.out.println();
        System.out.printf("%d ml of milk", milk);
        System.out.println();
        System.out.printf("%d g of coffee beans", beans);
        System.out.println();
        System.out.printf("%d disposable cups", cups);
        System.out.println();
        System.out.printf("$%d of money", cash);
        System.out.println();
    }

    private static void enough() {
        System.out.println("I have enough resources, making you a coffee!");
    }

    static void take() {
        System.out.printf("I gave you $%d \n", money);
        money = 0;
    }

    static void fill() {
        System.out.println("Write how many ml of water you want to add: ");
        water += scan.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        milk += scan.nextInt();
        System.out.println("Write how many grams of coffee you want to add:");
        beans += scan.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        cups += scan.nextInt();
    }

    static boolean canMakeCoffee(int waterNeed, int milkNeed, int beansNeed) {
        if (waterNeed > water) {
            System.out.println("Sorry, not enough water!");
            return false;
        } else if (milkNeed > milk) {
            System.out.println("Sorry, not enough milk!");
            return false;
        } else if (beansNeed > beans) {
            System.out.println("Sorry, not enough beans!");
            return false;
        }
        return true;
    }
}