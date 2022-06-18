package com.company;

import java.io.*;
import java.util.Arrays;
import java.io.IOException;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import java.io.InputStreamReader;


public class Main {

    public static void main (String[] args) throws IOException {
        Object[] values;
        values = FormattedInput.scanf( "%f %a 4 %c"); // scanf

//        Scanner console = new Scanner(System.in);
//        String format = "%c %d %s";
//        while(true) {
//            try {
//                System.out.println("\nFormat: " + format);
//                System.out.print("Enter symbols: ");
//                String source = console.nextLine();
//                values = FormattedInput.sscanf(format, source); // sscanf
//                break;
//            }
//            catch(InputMismatchException exception){
//                System.out.println(exception.getMessage() + ".Try again");
//
//            }
//        }
//
        System.out.println(Arrays.toString(values));

        EncodingConverter encodingConverter = new EncodingConverter();
        encodingConverter.EConverter("D:\\Java project\\Input-Output Laba#6\\TextInput.txt","D:\\Java project\\Input-Output Laba#6\\TextOutput.txt", "Cp1251","Windows-1251" );




    }

}
