package group_03.java_11;

// Throwable -> Exception
public class Main {
    public static void main(String[] args){
//        try-catch
        try{
            int[] numrat = new int[5];
            numrat[5] = 10;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException: " + e.getMessage());
        }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally!");
        }

        try {
            vendosNoten(3);
        }catch (NotaException e){
            System.out.println(e.getMessage());
        }


    }

    public static void vendosNoten(int nota) throws NotaException {
        if(nota < 5 || nota > 10){
            throw new NotaException(nota);
        }
        System.out.println("Nota " + nota + " u vendos me sukses!");
    }


}

class NotaException extends Exception{
    public NotaException(int nota){
        super("Nota " + nota + " nuk eshte valide!");
        this.handle();
    }
    private void handle(){
        System.out.println(this.getMessage());
    }
}










