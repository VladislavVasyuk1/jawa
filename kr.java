package kr;

import java.util.Scanner;

public class kr {
    public static void main(String[] args) {
        boolean x = true;
        while (x == true) {
        System.out.println("1. Добавить контакт.");
        System.out.println("2. Вывести справочник.");
        System.out.println("3. Выход.");
        Scanner sc = new Scanner(System.in);
            System.out.println("Введите пункт из меню:");
            int y = sc.nextInt();
                if (y == 1) {
                    System.out.println("Введите имя:");
                    String name = sc.next();
                    System.out.println("Введите номер:");
                    String number = sc.next();
                    telbook.addContact(name, number);
                }
                else if( y == 2){
                    telbook.printContacts();
                }
                else if(y == 3){
                    System.out.println("Досвиданья.");
                    x = false;
                }
        }
        }
}

