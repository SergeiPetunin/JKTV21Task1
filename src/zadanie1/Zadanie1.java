/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie1;

import java.util.Scanner;

/**
 *
 * @author spetu
 */
//Дано значение температуры T в градусах Цельсия.
//Определить значение этои же температуры по Фаренгейту. 
//1Температура по Цельсию TC итемпература по Фаренгейту TF связаны следующим соотношением:  TC = (TF –32)·5/9
//2Пользователь вводит трехзначное число. Найдите:Число единиц, десятков. Сумму цифр
//Для решения можно использовать арифметический оператор % -остаток от деления
public class Zadanie1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
              //1
              System.out.println("tempC-->tempF");
              System.out.println("Enter temp: ");
              float tempC = scanner.nextFloat();
              System.out.println((float)(tempC*1.8+32) + "tempF--> ");
              //2
              System.out.println("Enter triple number: ");
              int number = scanner.nextInt();
              System.out.println("Units: " + number%10);
              System.out.println("Dozens: " + (number-number%10)/10%10);
              int summ = 0;
              while (number > 0) {
                summ += number % 10;
                number /= 10;
              }
              System.out.println("Summ: " + summ);
              
              
              
      
    }
    
}
