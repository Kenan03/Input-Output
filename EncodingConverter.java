package com.company;

import java.io.*;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedMap;
public class EncodingConverter {
    public void EConverter(String inputFile, String outputFile, String firstEncoding, String secondEncoding) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), firstEncoding));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), secondEncoding));
            int s;
            bw.write(firstEncoding + "->" + secondEncoding + "\n");
            while ((s = br.read()) > 0) {
//                if(br.read() == '\0')
//                    bw.write("\n");
                bw.write(s);
                bw.flush();
            }

            br.close();
            bw.close();
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e);
        }

    }
}
