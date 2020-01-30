//Alysyn Howell 1/30/2020 Prog Fundamentals for Android
package com.company.Howell;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        int answer = userInput();
        while (answer >= 0 || answer < 5) {
            if(answer == 0){
                exit();
            }
            if (answer == 1){
                String task = add();
                list.add(task);
                System.out.println("Your task has been added.");
                answer = userInput();
            }
            if(answer == 2){
                int task = remove();
                list.remove(task);
                System.out.println("Your task has been removed.");
                answer = userInput();
            }
            if(answer == 3){
                Scanner input = new Scanner(System.in);
                int task = update();
                System.out.println("What would you like to set the new task to:");
                String changedTask = input.nextLine();
                list.set(task, changedTask);
                System.out.println("Your task has been updated.");
                answer = userInput();
            }
            if(answer == 4){
                list(list);
                answer = userInput();
            }
            if(answer < 0 || answer >= 5){
                System.out.println("Sorry but you entered an invalid option. Please try again.");
                answer = userInput();
            }
        }
    }
    static int userInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose an option:\n" +
                "(1) Add a task.\n" +
                "(2) Remove a task.\n" +
                "(3) Update a task.\n" +
                "(4) List all tasks.\n" +
                "(0) Exit.");
        int a = input.nextInt();
        return a;
    }
    static String add(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please describe your task.");
        String a = input.nextLine();
        return a;
    }
    static int remove(){
        Scanner input = new Scanner(System.in);
        System.out.println("Which item would you like to remove.");
        int a = input.nextInt();
        return a;
    }
    static int update(){
        Scanner input = new Scanner(System.in);
        System.out.println("Which item would you like to update.");
        int a = input.nextInt();
        return a;
    }
    static void list(ArrayList<String> array){
        System.out.println("Here is your list.");
        System.out.println(array);

    }
    static void exit(){
        System.exit(0);
    }
}
