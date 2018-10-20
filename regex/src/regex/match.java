
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author bactv
 */
public class match {

    public static void main(String[] args) {
        String match1 = "(D|C)\\d{2}(CN|DT|KT)\\d{1,4}";
        String match = "[DC]\\d{2}[CN DT KT]\\d{1,4}";
        String match3 = "[0-9a-zA-Z]+{2}{8,18}";
        String s1 = "";
        while (true) {
            String s = new Scanner(System.in).nextLine();
            if (s.matches(match3)) {
                System.out.println("ok");
            } else {
                System.out.println("not ok");
            }
        }
//        Pattern pattern = Pattern.compile(match);
//        Matcher matchera = pattern.matcher(s1);
//        while(matchera.find()){
//            System.out.println(matchera.group());
//            System.out.println("dd");
//        }
//        System.out.println(s1.matches(match));
//    }
}
}