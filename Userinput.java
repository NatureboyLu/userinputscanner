package com.mycompany.userinput;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
import java.util.Scanner;


/**
 *
 * @author luald
 */
public class Userinput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");;
        String name = scanner.nextLine();
        System.out.println("How old are you ?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favourite food ?");
        String food = scanner.nextLine();
        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("You like  "+food);
    }
}
