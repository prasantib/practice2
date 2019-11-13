package com.company;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please select the shape to calculate the area: (circle, triangle, rectangle or square) ");
        String answer = key.nextLine();
        if (answer.equalsIgnoreCase("circle")) {
            System.out.println("Please enter the radius length: ");
            int radius = key.nextInt();
            System.out.println((circleArea(radius)));
        } else if (answer.equalsIgnoreCase("triangle")) {
            System.out.println("Please enter the length of the base and the height: ");
            int length = key.nextInt();
            int height = key.nextInt();
            System.out.println((triangleArea(length, height)));
        } else if (answer.equalsIgnoreCase("rectangle")) {
            System.out.println("Please enter the length and the width: ");
            int length = key.nextInt();
            int width = key.nextInt();
            System.out.println((triangleArea(length, width)));
        } else if (answer.equalsIgnoreCase("square")){
            System.out.println("Please enter the length of one side of the square: ");
            int length = key.nextInt();
            System.out.println((squareArea(length)));
        }
    }
    public static int circleArea(int radius) {
        int area = radius*radius;
        return (area);
    }
    public static double triangleArea(int length, int height) {
        double area2 = 0.5*length*height;
        return (area2);
    }
    public static int rectangleArea(int length, int width) {
        int area = length*width;
        return (area);
    }
    public static int squareArea(int length) {
        int area = length*length;
        return (area);
    }
}