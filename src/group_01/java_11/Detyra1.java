package group_01.java_11;

import java.util.ArrayList;

// Te krijohet gabimi CustomException ashtu qe kur te shkaktohet
// ky gabim, mesazhi te ruhet me nje variabel dhe pas cdo
// shkaktimi te gabimit te shtypen te gjitha gabimet e
// shkaktuara gjate ekzekutimit.
public class Detyra1 {
    public static void main(String[] args){
        try{
            throw new CustomException("Gabimi 1");
        }catch (CustomException e){
        }
        try{
            throw new CustomException("Gabimi 2");
        }catch (CustomException e){
        }
        try{
            throw new CustomException("Gabimi 3");
        }catch (CustomException e){
        }

        try{
            int[] numrat = new int[5];
            System.out.println(numrat[5]);
        }finally {
            System.out.println("Finally!");
            try{
                System.out.println(10/0);
            }catch (ArithmeticException ae){
                System.out.println(ae.getMessage());
                ae.printStackTrace();
            }
        }
    }
}

class CustomException extends Exception{
    private static ArrayList<String> EXCEPTIONS = new ArrayList<>();

    public CustomException(String message){
        this.handleLogic(message);
    }
    private void handleLogic(String message){
        EXCEPTIONS.add(message);

        EXCEPTIONS.forEach(
                e -> System.out.println(e)
        );
    }
}