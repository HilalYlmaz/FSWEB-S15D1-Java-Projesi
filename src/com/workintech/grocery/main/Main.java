package com.workintech.grocery.main;

import com.workintech.grocery.groceryList.MarketCar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> groceryList = new LinkedList<>();
        start(groceryList);
    }
    public static void start(List<String> groceryList){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("yapacağınız işlemi seçiniz");
                int process = scanner.nextInt();
                if (process < 0 || process > 2) {
                    System.out.println("invalid process!!");
            }
                if (process == 0){
                    System.exit(0);
                }
                if(process == 1){
                    MarketCar.addItems(groceryList);

                }
                if(process == 2){
                    MarketCar.removeItems(groceryList);

                }
            }catch (Exception ex){
                System.out.println("invalid process: " + ex.getMessage());
            }
        }
    }
}