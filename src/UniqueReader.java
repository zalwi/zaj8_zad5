import java.util.Scanner;

public class UniqueReader {
    public static void main(String[] args) {

        System.out.println("Start");
        String base = getNextValue();
        String temp, temp2;
        do{
            temp = base;
            temp2 = getNextValue();
            base = temp2;
        }while(!temp.equals(temp2));
        System.out.println("Koniec");
    }

    public static String getNextValue(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
