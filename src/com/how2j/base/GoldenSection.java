package com.how2j.base;

public class GoldenSection {
/*
 Ѱ��ĳ��������������� ��ƽ�ָ�� 0.618���

��ĸ�ͷ��Ӳ���ͬʱΪż��
��ĸ�ͷ��� ȡֵ��Χ��[1-20]
  
  
 */
	public static void main(String[] args) {
		
		float shang=0;
		float goldenNumber=0.618f;
		float miniDiff=100;
		float diff = 0;
		int answerFenzi = 0;
		int answerFenmu = 0;
		
		for(int fenmu=1;fenmu<21;fenmu++){
			for(int fenzi=1;fenzi<fenmu;fenzi++){
				if(fenzi%2==0&&fenmu%2==0)
					continue;
				shang=(float)fenzi/fenmu;
				//�ж���Сֵ
				diff = Math.abs(shang-goldenNumber);
				if(diff<miniDiff){
					miniDiff=diff;
					answerFenmu=fenmu;
					answerFenzi=fenzi;
				}
			}
		}
		
		System.out.println(answerFenzi+" "+answerFenmu+"  "+(float)answerFenzi/answerFenmu);
		
	}

}
