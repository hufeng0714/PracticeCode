package com.how2j.NumString;

public class TestMyStringBuffer {

	public static String randomString(){
        char[] cs = new char[10];
        int start = (int)'a';
        int end = (int)'z';
        for(int i=0;i<cs.length;i++){
        	cs[i] = ((char)(Math.random()*(end - start)+start));
        }
        String str = new String(cs);
        
        //System.out.println(str);
        
        /*Ëæ»ú×Ö·û´®*/
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
	
	
	public static void StringBufferTime(String str){
		
		StringBuffer strBuffer = new StringBuffer(str);
		
		long startTime1 = System.currentTimeMillis();
		for(int i=0;i<1000000;i++){
			strBuffer.append(str);
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println(endTime2-startTime1);
	}
	
	public static void MyStringBufferTime(String str){
		
		MyStringBuffer myStrBuffer = new MyStringBuffer(str);
		
		long startTime1 = System.currentTimeMillis();
		for(int i=0;i<1000000;i++){
			myStrBuffer.append(str);
		}
		long endTime2 = System.currentTimeMillis();
		System.out.println(endTime2-startTime1);
	}
	public static void main(String[] args) {

		TestMyStringBuffer tmsb = new TestMyStringBuffer();
		String str = tmsb.randomString();
		StringBufferTime(str);
		MyStringBufferTime(str);
	}

}
