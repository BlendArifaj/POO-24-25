package group_01.java_11;

import java.io.IOException;

// Throwable -> Exception
public class Main {
    public static void main(String[] args) throws Exception{
        try {
            int[] numrat = new int[5];
            numrat[5] = 10;
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch(ArithmeticException ae){

        }catch (Exception e){

        }
        finally {
            System.out.println("Ekzekutimi vazhdon ...");
        }

        calculateValue(5,6);

        try {
            vendosNoten(4);
        }catch(NotaException ne){
            System.out.println("Nota nuk eshte valide. Provoni nje note tjeter!");
        }

    }
    public static int calculateValue(int num1, int num2) throws Exception {
        if(num1 < 0 || num2 < 0){
            throw new Exception("Numri eshte me i vogel se zero!");
        }
        return num1 + num2;
    }
    public static void vendosNoten(int nota) throws NotaException{
        if(nota < 5 || nota > 10){
            throw new NotaException(nota);
        }
        System.out.println("Nota u vendos me sukses!");
    }
}

class NotaException extends Exception{
    public NotaException(int nota){
        super("Nota " + nota + " nuk eshte valide!");
        this.handleException();
    }

    private void handleException(){
//        logic ...
    }
}

