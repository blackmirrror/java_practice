package prac09.number1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static final Pattern innCheck = Pattern.compile("\\d{10}|\\d{12}");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Введите номер ИНН");
            try{
                String inn = sc.nextLine();
                isRightInn(inn);
                break;
            }catch (InnException e){
                System.out.println(e.getLocalizedMessage());
            }
        }
        System.out.println("ИНН действителен!");
    }

    public static boolean isRightInn(String inn) throws InnException{
        if(!innCheck.matcher(inn).matches())
            throw new InnException(inn);
        return true;
    }
}
