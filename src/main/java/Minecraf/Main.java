package Minecraf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Wold wold = new Wold(10, 10 ,10);
    Player player = new Player(wold, 5, 5 ,5);
    String input;
    Scanner scanner = new Scanner(System.in);

        System.out.println("Controls:");
        System.out.println("   w/a/s/d  = to move");
        System.out.println("   q/e   = up/down");
        System.out.println("   l     = Look around");
        System.out.println("   b     = Break block underneath");
        System.out.println("   p<type> = Place block (ej:p STONE)");
        System.out.println("   x       =  to exit");

        do {
            System.out.print("> ");
             input = scanner.nextLine();
            String[] parts = input.split(" ");

        switch (input){

            case "w" -> player.move(0, 0, -1);
            case "s" -> player.move(0, 0,  1);
            case "a" -> player.move(-1, 0, 0);
            case "d" -> player.move(1, 0, 0);
            case "q" -> player.move(0, 1, 0);
            case "e" -> player.move(0, -1, 0);
            case "l" -> player.lookAround();
            case "b" -> player.breakBlock();
            case "p" -> {
                if (parts.length >= 2){
                    try {
                        Block.Type type = Block.Type.valueOf(parts[1].toUpperCase());
                        player.placeBlock(type);
                    }catch (IllegalArgumentException e){
                        System.out.println("Invalid block type");
                    }
                }else {
                    System.out.println("You must indicate a type of block (ej: DIRT)");
                }
            }
            default -> System.out.println("Invalid command");
            case "x" -> System.out.println("Leaving...");
        }

        }while (!input.equals("x"));

    }
}