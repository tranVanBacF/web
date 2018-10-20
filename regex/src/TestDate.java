
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class TestDate {

    final static String DATE_FORMAT = "dd-MMM-yyyy";

    public static boolean isDateValid(String date) {
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
        try {
            
             // df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
//    public static boolean isValiate(String date){
//        DateFormat
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex1 = "(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)";
        String regexYear = "20[0-9][0-9]";
        String regex = "[0-3]?[0-9]-" + regex1 + "-" + regexYear;
        while (true) {
            String line = sc.next();
           // System.out.println(line.matches(regex));
            System.out.println(isDateValid(line));
        }
    }
//    public static void main(String[] args) throws ParseException {
//        Scanner sc = new Scanner(System.in);
//        Date date = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//        //  String strDate = formatter.format(date);
//        String line = sc.next();
//         formatter.parse(line);
//        System.out.println(line);
//    }

}
