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
    static File f1 = new File("d:/��������.txt");
    public  LOL03() {
        f.setSize(400, 300);              
        if(f1.length()==0) {               //txt��û��ֵ�����ڳ���λ��600,600
            f.setLocation(600, 600);
        }else {                           //����Ͷ�ȡtxt����ȡ���е�ֵ��Ϊ����λ�á�
            try (FileReader fe = new FileReader(f1);) {
                char[] all = new char[(int) f1.length()];
                fe.read(all);
                String st=String.valueOf(all);
                String ss[]=st.split("@");          //ss-0���ϴα��������x��ss-1���ϴα��������y
                f.setLocation(Integer.parseInt(ss[0]),Integer.parseInt(ss[1]));   
                fe.close();   
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
 
        f.setLayout(null);
        JButton b = new JButton("һ����Է����ع�");
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
                    Thread.sleep(50);       //��50�����ȡһ�δ�������
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                x=f.getX();
                y=f.getY();
                String str=x+"@"+y;    //���걣�浽txt,��ʽ��***@***��
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