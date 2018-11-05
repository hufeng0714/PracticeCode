package com.H5.Hmc;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class MainAction {
	public static void main(String[] args) throws InterruptedException, AddressException, MessagingException{
		

		LogoutH5 logout = new LogoutH5();
		
		//三辆车循环，每辆车循环执行3次
		for(int i=1;i<10;i++){
			System.out.println("当前的i等于"+i);
			
			//第二次循环开始至循环结束，调用logout方法
			if(i>1){
				logout.logout();
			}
			
			HomePage homepage = new HomePage();
			homepage.homepage();

			if(i<=3){
				CarBrandMaZiDa mazida = new CarBrandMaZiDa();
				mazida.carbrandmazida();
				Thread.sleep(4000);
			}else if(4<=i&&i<=6){
				CarBrandLuHu carbrandluhu = new CarBrandLuHu();
				carbrandluhu.carbrandluhu();
			}else{
				CarBrandXfl carbrandxfl = new CarBrandXfl();
				carbrandxfl.carbrandxfl();
			}
			
			if(i<=3){
				CarModelMaZiDa carmodelmazida = new CarModelMaZiDa();
				carmodelmazida.carmodelmazida();
			}else if(4<=i&&i<=6){
				CarModelLuHu carmodelluhu = new CarModelLuHu();
				carmodelluhu.carmodelluhu();
			}else{
				CarModelXfl carmodelxfl = new CarModelXfl();
				carmodelxfl.carmodelxfl();
			}
			
			if(i<=3){
				CarColorMaZiDa carcolormazida = new CarColorMaZiDa();
				carcolormazida.carcolormazida();
			}else if(4<=i&&i<=6){
				CarColorLuHu carcolorluhu = new CarColorLuHu();
				carcolorluhu.carcolorluhu();
			}else{
				CarColorXfl carcolorxfl = new CarColorXfl();
				carcolorxfl.carcolorxfl();
			}
			
			int modData = i % 9;
			System.out.println("当前的modData等于"+modData);
			
			if(modData==1|modData==4|modData==7){
				LicenseHuA licensehua = new LicenseHuA();
				licensehua.licensehua();
			}else if(modData==2|modData==5|modData==8){
				LicenseHuC licensehuc = new LicenseHuC();
				licensehuc.licensehuc();
			}else{
				LicenseWpSh licensewpsh = new LicenseWpSh();
				licensewpsh.licensewpsh();
			}
			
			if(modData==1|modData==4|modData==7){
				PayQk payqk = new PayQk();
				payqk.payqk();
			}else if(modData==2|modData==5|modData==8){
				PayDk paydk = new PayDk();
				paydk.paydk();
			}else{
				PayQuanZhi payquanzhi = new PayQuanZhi();
				payquanzhi.payquanzhi();
			}
			
			if(modData==1|modData==4|modData==7){
				PurchaseTime6Month purchasetime6month = new PurchaseTime6Month();
				purchasetime6month.purchasetime6month();
			}else if(modData==2|modData==5|modData==8){
				PurchaseTime3Month purchasetime3month = new PurchaseTime3Month();
				purchasetime3month.purchasetime3month();
				
			}else{
				PurchaseTime1Month purchasetime1month = new PurchaseTime1Month();
				purchasetime1month.purchasetime1month();
			}
			
			XiYiBu xiyibu = new XiYiBu();
			xiyibu.xiyibu();
			
			Area area = new Area();
			area.area();
			
			FaSongBiJiaDan fasongbijiadan = new FaSongBiJiaDan();
			fasongbijiadan.fasongbijiadan();
			
			RegisterLogin registerlogin = new RegisterLogin();
			registerlogin.registerlogin();
			
			Result result = new Result();
			result.result();
			
			SendMail sendmail = new SendMail();
			sendmail.sendmail();
						
			
		}
		//循环结束后，关闭chrome浏览器进程
		DriverQuit dq = new DriverQuit();
		dq.quitDriver();
	}

}
