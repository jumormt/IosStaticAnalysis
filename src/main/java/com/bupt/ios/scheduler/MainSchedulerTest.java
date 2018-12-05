/**
 * 
 */
package com.bupt.ios.scheduler;

import static org.junit.Assert.*;

import com.lowagie.text.DocumentException;
import org.junit.Before;
import org.junit.Test;

/**
 * @author yujianbo
 *
 * 2017年2月2日
 */
public class MainSchedulerTest {

	@Test
	public void test() throws DocumentException {
		String[] args = {"/Users/chengxiao/Desktop/ios逆向/样本/BuyOne","report"};
//		String[] args = {"D:\\workList\\ios_test\\DVIA-2.1\\com.yjb.dvia","D:\\workList\\ios_test"};
		MainScheduler.main(args);
		
	}


}
