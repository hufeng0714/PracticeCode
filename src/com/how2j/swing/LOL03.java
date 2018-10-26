package com.how2j.swing;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LOL03{
    static int x;
    static int y;
    static JFrame f=new JFrame("lol");
    static File f1 = new File("d:/窗口坐标.txt");
    public  LOL03() {
        f.setSize(400, 300);              
        if(f1.length()==0) {               //txt中没有值，窗口出现位置600,600
            f.setLocation(600, 600);
        }else {                           //否则就读取txt，并取其中的值作为出现位置。
            try (FileReader fe = new FileReader(f1);) {
                char[] all = new char[(int) f1.length()];
                fe.read(all);
                String st=String.valueOf(all);
                String ss[]=st.split("@");          //ss-0是上次保存的坐标x，ss-1是上次保存的坐标y
                f.setLocation(Integer.parseInt(ss[0]),Integer.parseInt(ss[1]));   
                fe.close();   
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
 
        f.setLayout(null);
        JButton b = new JButton("一键秒对方基地挂");
        b.setBounds(50, 50, 280, 30);
        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
         
    }
    public static void main(String[] args) {
        new LOL03();
         
        Thread s1=new Thread() {
            public void run() {
                while(true) {
                try {
                    Thread.sleep(50);       //隔50毫秒读取一次窗口坐标
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                x=f.getX();
                y=f.getY();
                String str=x+"@"+y;    //坐标保存到txt,格式【***@***】
                try(FileWriter fr = new FileWriter(f1);){
                     char[] cs = str.toCharArray();
                     fr.write(cs);
                     fr.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
                }
            }
            };
            s1.start();
    }
}