package sptv21task3milanajegorova;

import java.util.Scanner;

public class SPTV21Task3MilanaJegorova {

    public static void main(String[] args) {
       
        String birthyear = "";
        Scanner scanner = new Scanner(System.in);
       
        String[] months = {"января", "февраля", "марта",
            "апреля", "мая", "июня",
            "июля", "августа", "сентября",
            "октября", "ноября", "декабря"};
       
        System.out.print("Ваше имя: ");
        String firstname = scanner.nextLine();
        System.out.print("Ваша фамилия: ");
        String lastname = scanner.nextLine();
        System.out.print("Ваш личный номер: ");
        String mynumber = scanner.nextLine();
       
        if (mynumber.substring(0,1).equals("5") || mynumber.substring(0,1).equals("6")) {
            birthyear = "20";
        } else if (mynumber.substring(0,1).equals("3") || mynumber.substring(0,1).equals("4")) {
            birthyear = "19";
        } else if (mynumber.substring(0,1).equals("1") || mynumber.substring(0,1).equals("2")) {
            birthyear = "18";
        } else {
            System.out.println("Личный код некорректный!");
        }
       
        System.out.println(firstname + " "
                + lastname + " родился " + mynumber.substring(5,7)
                + " " + months[Integer.parseInt(mynumber.substring(3,5))-1]
                + " " + birthyear + mynumber.substring(1,3) + " года");
    }
   
}