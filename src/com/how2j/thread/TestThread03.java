package com.how2j.thread;

/*
 ������Battle��ʵ��Runnable�ӿ�
������ʱ�����ȴ���һ��Battle����Ȼ���ٸ��ݸ�battle���󴴽�һ���̶߳��󣬲�����
 
Battle battle1 = new Battle(gareen,teemo);
new Thread(battle1).start();
 

battle1 ����ʵ����Runnable�ӿڣ�������run����������ֱ�ӵ���run����������������һ���µ��̡߳�
���룬����һ���̶߳����start()�������Ż�����һ���µ��̡߳�
���ԣ��ڴ���Thread�����ʱ�򣬰�battle1��Ϊ���췽���Ĳ������ݽ�ȥ������߳�������ʱ�򣬾ͻ�ȥִ��battle1.run()�����ˡ�
 */
public class TestThread03 {

	public static void main(String[] args) {
		Hero gareen = new Hero();
		gareen.name = "����";
		gareen.hp = 616;
		gareen.damage = 50;
		
		Hero teemo = new Hero();
		teemo.name = "��Ī";
		teemo.hp = 300;
		teemo.damage = 30;
		
		Hero bh = new Hero();
		bh.name = "�ͽ�����";
		bh.hp = 500;
		bh.damage = 65;
		
		Hero leesin = new Hero();
		leesin.name = "äɮ";
		leesin.hp = 455;
		leesin.damage = 80;
		
		Battle battle1 = new Battle(gareen,teemo);
		new Thread(battle1).start();
		
		Battle battle2 = new Battle(bh,leesin);
		new Thread(battle2).start();

	}

}
