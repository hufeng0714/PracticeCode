package com.how2j.base;

public class GoldenSection {
/*
 寻找某两个数相除，其结果 离黄金分割点 0.618最近

分母和分子不能同时为偶数
分母和分子 取值范围在[1-20]
  
  
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
				//判断最小值
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
