package com.how2j.NumString;

public class TestStringOption {


	public static void main(String[] args) {
		
		//charAt(int index)获取指定位置的字符
        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号 ";
        char c = sentence.charAt(0);
        System.out.println(c);

        //toCharArray() 获取对应的字符数组
        

        char[] cs = sentence.toCharArray(); //获取对应的字符数组
        System.out.println(sentence.length() == cs.length);
        
        //subString 截取子字符串
        //截取从第3个开始的字符串 （基0）
        String subString1 = sentence.substring(3);
        System.out.println(subString1);
         
        //截取从第3个开始的字符串 （基0）
        //到5-1的位置的字符串
        //左闭右开
        String subString2 = sentence.substring(3,5);
        System.out.println(subString2);
        
        //split根据分隔符进行分隔
        //根据,进行分割，得到3个子字符串
        String subSentences[] = sentence.split(",");
        for (String sub : subSentences) {
            System.out.println(sub);
        }
        
        //trim 去掉首尾空格
        String sentence2 = "   盖伦,在进行了连续8次击杀后,获得了 超神 的称号     ";
        System.out.println(sentence2);
        //去掉首尾空格
        System.out.println(sentence2.trim());
        
        //toLowerCase 全部变成小写 
        //toUpperCase 全部变成大写
        String sentence3 = "Garen";
        //全部变成小写
        System.out.println(sentence3.toLowerCase());
        //全部变成大写
        System.out.println(sentence3.toUpperCase());
        
        //indexOf 判断字符或者子字符串出现的位置
        //contains 是否包含子字符串
        System.out.println(sentence.indexOf('8')); //字符第一次出现的位置   
        System.out.println(sentence.indexOf("超神")); //字符串第一次出现的位置          
        System.out.println(sentence.lastIndexOf("了")); //字符串最后出现的位置         
        System.out.println(sentence.indexOf(',',5)); //从位置5开始，出现的第一次,的位置          
        System.out.println(sentence.contains("击杀")); //是否包含字符串"击杀"
        
        //replaceAll 替换所有的 
        //replaceFirst 只替换第一个
        
        String temp = sentence.replaceAll("击杀", "被击杀"); //替换所有的        
        temp = temp.replaceAll("超神", "超鬼");         
        System.out.println(temp);         
        temp = sentence.replaceFirst(",","");//只替换第一个         
        System.out.println(temp);        
	}

}
