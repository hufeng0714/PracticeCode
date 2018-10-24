package com.how2j.NumString;

public class TestStringBufferExam {

	/**
	 *String��StringBuffer����������?
	 *����10λ���ȵ�����ַ���
	 *Ȼ��,��ʹ��String��+,����10000������ַ���,�������ĵ�ʱ��
	 *Ȼ��,��ʹ��StringBuffer����10000������ַ���,�������ĵ�ʱ��
	 *��ʾ: ʹ��System.currentTimeMillis() ��ȡ��ǰʱ��(����)
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
        
        /*����ַ���*/
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
