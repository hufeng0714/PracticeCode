package com.how2j.NumString;

import java.util.Arrays;

public class TestmyStringBufferExam implements IStringBuffer{

    char[] chars = new char[20];
    int index = 0;
    
    public String toString(){
/*    	String str="";
    	
    	for(int i=0;i<chars.length;i++){
    		str += chars[i];
    	}
    	return str;*/
    	return new String(chars);
    }
    
	/**
	 * 根据接口IStringBuffer ，自己做一个MyStringBuffer
	 */
	public static void main(String[] args) {
		TestmyStringBufferExam sb = new TestmyStringBufferExam();
        sb.append('c');
        System.out.println(sb);
        System.out.println(sb.length());
        sb.append("StringBufferTest");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.insert(5, "insert");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.insert(5, 'a');
        System.out.println(sb);
        System.out.println(sb.length());
        sb.delete(13);
        System.out.println(sb);
        System.out.println(sb.length());
        sb.delete(6,7);
        System.out.println(sb);
        System.out.println(sb.length());
	}

	@Override
	//追加字符串
	public void append(String str) {
        while (true) {
            if (chars.length < (index + str.length()))
                chars = Arrays.copyOf(chars, chars.length + 20);
            else
                break;
        }
        for (int i = 0; i < str.length(); i++) {
            chars[index + i] = str.charAt(i);
        }
        index += str.length();
	}

	@Override
	//追加字符
	public void append(char c) {
        if (chars.length < index + 1)
            chars = Arrays.copyOf(chars, chars.length + 20);
        chars[index] = c;
        index++;		
	}

	@Override
	//指定位置插入字符
	public void insert(int pos, char b) {
        if (chars.length < index + 1)
            chars = Arrays.copyOf(chars, chars.length + 20);
        for (int i = index; i >= pos; i--) {
            chars[i + 1] = chars[i];
        }
        chars[pos] = b;
        index++;		
	}

	@Override
	//指定位置插入字符串
	public void insert(int pos, String b) {
        while (true) {
            if (chars.length < (index + b.length()))
                chars = Arrays.copyOf(chars, chars.length + 20);
            else
                break;
        }
        for (int i = index; i >= pos; i--) {
            chars[i + b.length()] = chars[i];
        }
        for (int i = 0; i < b.length(); i++) {
            chars[pos + i] = b.charAt(i);
        }
        index += b.length();		
	}

	@Override
	//从开始位置删除剩下的
	public void delete(int start) {
        for (int i = start; i <= index; i++) {
            chars[i] = '\0';
        }
        index = start;		
	}

	@Override
	//从开始位置删除结束位置-1
	public void delete(int start, int end) {
        for (int i = start; i <=index; i++) {
            chars[i-1] = chars[i + end - start-1];
            chars[i + end - start - 1] = '\0';
        }
        index = index - end + start;		
	}

	@Override
	//反转
	public void reverse() {
        for (int i = 0; i >= index - i; i++) {
            char temp = chars[i];
            chars[i] = chars[index - i];
            chars[index - i] = temp;
        }		
	}

	@Override
	//返回长度
	public int length() {
		return index;
	}

}
