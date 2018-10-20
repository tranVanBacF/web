
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bactv
 */
public class checkString8_31 {
    public static void main(String[] args) {
        String regex="[[a-zA-Z]+\\d+]{8,17}";
        Scanner sc = new Scanner(System.in); 
        String name = sc.next();
        while(!name.matches(regex)){
            System.out.println("enter again");
            name = sc.next();
        }
        System.out.println("hop le");
    }
}
