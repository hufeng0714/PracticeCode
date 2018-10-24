package com.how2j.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestStreamAutoCreateJava {

	/**
     * public class @class@ {
     * public @type@ @property@; public @class@() {
     *
     * } public void set@Uproperty@(@type@ @property@){ this.@property@
     * = @property@; } public @type@ get@Uproperty@(){ return this.@property@; }
     * }
     */
 
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        File inFile = new File("e:/filetest/template.txt");
        File outFile = new File("e:/filetest/template1.txt");
 
        // ����һ������
        InputStream in = System.in;
        Scanner sc = new Scanner(in);
        System.out.println("�������������:");
        String $class = sc.nextLine();
        System.out.println("���������Ե�����:");
        String $type = sc.nextLine();
        System.out.println("���������Ե�����:");
        String $property = sc.nextLine();
 
        try (
                BufferedReader br = new BufferedReader(new FileReader(inFile));
                PrintWriter pw = new PrintWriter(new FileWriter(outFile))
        ) {
            String temp = null;
            while (true) {
                temp = br.readLine();
                if (temp == null) {
                    break;
                }
                if (temp.contains("@class@")) {
                    temp = temp.replaceAll("@class@", $class);
                }
                if (temp.contains("@type@")) {
                    temp = temp.replaceAll("@type@", $type);
                }
                if (temp.contains("@property@")) {
                    temp = temp.replaceAll("@property@", $property);
                }
                if (temp.contains("@Uproperty@")) {
                    temp = temp.replaceAll("@Uproperty@", $property.substring(0, 1).toUpperCase() + $property.substring(1));
                }
                pw.println(temp);
                System.out.println(temp);
            }
        } catch (Exception e) {
        	e.printStackTrace();
        }
 
    }
}
