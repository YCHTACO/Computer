package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComputerApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入第一個數字:");
        double num1 = scanner.nextDouble();

        System.out.println("請輸入第二個數字:");
        double num2 = scanner.nextDouble();

        System.out.println("請輸入運算符號 (+, -, *, /) :");
        String operator = scanner.next();

        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("不支援的運算符號");
                return;
        }

        System.out.println("計算結果是: " + result);
        
	}

}
