package com.how2j.NumString;

public class TestStringBufferExam {

	/**
	 *String与StringBuffer的性能区别?
	 *生成10位长度的随机字符串
	 *然后,先使用String的+,连接10000个随机字符串,计算消耗的时间
	 *然后,再使用StringBuffer连接10000个随机字符串,计算消耗的时间
	 *提示: 使用System.currentTimeMillis() 获取当前时间(毫秒)
	 */
	
	public static String randomString(){
        char[] cs = new char[10];
        int start = (int)'a';
        int end = (int)'z';
        for(int i=0;i<cs.length;i++){
        	cs[i] = ((char)(Math.random()*(end - start)+start));
        }
        String str = new String(cs);
        
        //System.out.println(str);
        
        /*随机字符串*/
/*        private static String random() {
            char[] cr = new char[10];
            for (int i = 0; i < cr.length; i++) {
                char c = (char)(Math.random() * 127);
                cr[i] = c;
            }
            String str= new String(cr);
            return str;
        }*/
        return str;
	}
		
	public static void StringTime(String str){
		String s ="";
		long startTime = System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			s += str;
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
	
	public static void StringBufferTime(String str){
		
		StringBuffer strBuffer = new StringBuffer(str);
		
		long startTime1 = System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			strBuffer = strBuffer.append(str);
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println(endTime2-startTime1);
	}
	
	public static void main(String[] args) {
		
		TestStringBufferExam tsbe = new TestStringBufferExam();
		String str = tsbe.randomString();
		tsbe.StringTime(str);
		tsbe.StringBufferTime(str);		
		
	}

}
