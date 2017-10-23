package me.soulyana;

import javax.jws.Oneway;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> ingredients = new ArrayList<String>();
        ArrayList<String> directions = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        ingredients.add("tomato");
        ingredients.add("onion");
        ingredients.add("lettuce");

        directions.add("Cut tomatos");
        directions.add("Cut onions");
        directions.add("Cut lettuce");

        int option = 0;
        String ans = "";
        String enterIngd = "";
        String enterDir = "";

        do {


            System.out.println("Select from the following choices: ");
            System.out.println("1. Add ingredients");
            System.out.println("2. Delete an ingredient");
            System.out.println("3. Add directions");
            System.out.println("4. Show recipe");
            System.out.println("5. Quit");
            option = scan.nextInt();

            scan.nextLine();

            if (option == 1) {
                do {
                    System.out.println("Enter the ingredient to add to ingredients section: ");
                    enterIngd = scan.nextLine();
                    ingredients.add(enterIngd);
                    System.out.println("Would you like to enter another ingredient? (Y)es or (N)o");
                    ans = scan.nextLine();
                } while (ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));
            }

            if (option == 2) {
                System.out.println("Enter the ingredient to delete from ingredients list: ");
                enterIngd = scan.nextLine();
                if (ingredients.contains(enterIngd)) {
                    ingredients.remove(enterIngd);
                } else {
                    System.out.println("Ingredient doesn't exist on list!");
                }
            }

            if (option == 3) {
                do {
                    System.out.println("Enter directions in recipe: ");
                    enterDir = scan.nextLine();
                    directions.add(enterDir);
                    System.out.println("Would you like to add another direction in the recipe: ");
                    ans = scan.nextLine();
                } while (ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n"));
            }

            if (option == 4) {
                printIngredients(ingredients);
                System.out.println();
                printRecipe(directions);
                System.out.println();
            }

        }while (option == 1 || option == 2 || option == 3 || option == 4 || option == 5);
    }
    public static void printRecipe(ArrayList<String> recipe) {
        Object[] obj = recipe.toArray();

        System.out.println("~~~~~RECIPE~~~~~");
        for(Object eachRecipe : obj) {
                System.out.println("Step: " + eachRecipe);
            }
        }



    public static void printIngredients(ArrayList<String> ingredients) {
        Object[] obj = ingredients.toArray();

        System.out.println("~~~~~INGREDIENT~~~~~");
        for(Object eachIngredient : obj) {
            System.out.println("Ingredient: " + eachIngredient);
        }
    }
}
