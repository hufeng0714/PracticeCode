package com.how2j.exception;

public class MyStringBuffer implements IStringBuffer {
	 
    int capacity = 16;
    int length = 0;
    char[] value;
 
    public MyStringBuffer() {
        value = new char[capacity];
    }
 
    public MyStringBuffer(String str) {
        this();
        if (null == str)
            return;
        length = value.length;
 
        if (capacity < value.length) {
            capacity = value.length * 2;
            value = new char[capacity];
        }
        if (capacity >= str.length()) {
            System.arraycopy(str.toCharArray(), 0, value, 0, str.length());
            length = str.length();
        }
    }
 
    @Override
    public void append(String str) throws IndexIsNagetiveException, IndexIsOutofRangeException {
        insert(length, str);
 
    }
 
    @Override
    public void append(char c) throws IndexIsNagetiveException, IndexIsOutofRangeException {
        insert(length, c);
 
    }
 
    @Override
    public void insert(int pos, char b) throws IndexIsNagetiveException, IndexIsOutofRangeException {
        String temp = String.valueOf(b);
        insert(pos, temp);
 
    }
 
    @Override//���쳣�ж�
    public void insert(int pos, String b) throws IndexIsNagetiveException, IndexIsOutofRangeException {
        if (b == null)
            return;
        if (pos < 0)
            throw new IndexIsNagetiveException();
        if (pos > length)
            throw new IndexIsOutofRangeException();
 
        // ����
        while (length + b.length() > capacity) {
            capacity = (int) (length + b.length() * 1.5f); // f ��ʾ������
            char[] newValue = new char[capacity];
            System.arraycopy(value, 0, newValue, 0, length);
            value = newValue;
        }
 
        char[] cs = b.toCharArray();
 
        // ����������
        System.arraycopy(value, pos, value, pos + cs.length, length - pos);
        System.arraycopy(cs, 0, value, pos, cs.length);
 
        length = length + cs.length;
 
    }
 
    @Override
    public void delete(int start) throws IndexIsNagetiveException, IndexIsOutofRangeException {
        delete(start, length);
    }
 
    @Override//���쳣�ж�
    public void delete(int start, int end) throws IndexIsNagetiveException, IndexIsOutofRangeException {
        if (end < 0 || end > length || start >= end)
            return;
        if (start < 0)
            throw new IndexIsNagetiveException();
        if (start > length)
            throw new IndexIsOutofRangeException();
        System.arraycopy(value, end, value, start, length - end);
        length = length - end + start;
    }
 
    @Override
    public void reverse() {
        for (int i = 0; i < length / 2; i++) {
            char temp = value[i];
            value[i] = value[length - i - 1];
            value[length - i - 1] = temp;
        }
    }
 
    @Override
    public int length() {
        return length;
 
    }
 
    public String toString() {
 
        char[] realValue = new char[length];
 
        System.arraycopy(value, 0, realValue, 0, length);
 
        return new String(realValue);
 
    }
 
    public static void main(String[] args) {
        MyStringBuffer sb = new MyStringBuffer("there light");
        System.out.println(sb);
        try {
            sb.insert(-1, "let ");
        } catch (IndexIsNagetiveException | IndexIsOutofRangeException e) {
            if (e instanceof IndexIsNagetiveException)
                System.out.println("����");
            if (e instanceof IndexIsOutofRangeException)
                System.out.println("�±�Խ��");
            e.printStackTrace();
        }
        System.out.println(sb);
        try {
            sb.insert(77, "be ");
        } catch (IndexIsNagetiveException | IndexIsOutofRangeException e) {
            if (e instanceof IndexIsNagetiveException)
                System.out.println("����");
            if (e instanceof IndexIsOutofRangeException)
                System.out.println("�±�Խ��");
            e.printStackTrace();
        }
        System.out.println(sb);
        try {
            sb.insert(0, "God Say:");
        } catch (IndexIsNagetiveException | IndexIsOutofRangeException e) {
            if (e instanceof IndexIsNagetiveException)
                System.out.println("����");
            if (e instanceof IndexIsOutofRangeException)
                System.out.println("�±�Խ��");
            e.printStackTrace();
        }
        System.out.println(sb);
        try {
            sb.append("!");
        } catch (IndexIsNagetiveException | IndexIsOutofRangeException e) {
            if (e instanceof IndexIsNagetiveException)
                System.out.println("����");
            if (e instanceof IndexIsOutofRangeException)
                System.out.println("�±�Խ��");
            e.printStackTrace();
        }
        System.out.println(sb);
        try {
            sb.append('?');
        } catch (IndexIsNagetiveException | IndexIsOutofRangeException e) {
            if (e instanceof IndexIsNagetiveException)
                System.out.println("����");
            if (e instanceof IndexIsOutofRangeException)
                System.out.println("�±�Խ��");
            e.printStackTrace();
        }
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
 
    }
 
}