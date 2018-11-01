package com.how2j.log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class TestLog4j {

	static Logger logger = Logger.getLogger(TestLog4j.class);
	
	public static void main(String[] args) throws InterruptedException{
        BasicConfigurator.configure();
        logger.setLevel(Level.DEBUG);
        logger.trace("������Ϣ");
        logger.debug("������Ϣ");
        logger.info("�����Ϣ");
        Thread.sleep(1000);
        logger.warn("������Ϣ");
        logger.error("������Ϣ");
        logger.fatal("������Ϣ");
	}

}