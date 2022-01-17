package sample;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		int threads = 4;
		
		File in = new File ("C:/JavaÎÎÏ");
		File out = new File ("C:/Java 24.11.21");
		
		Thread [] a = new Thread[threads];
		for (int i = 0; i < a.length; i++) {
			int startPoint = (((in.list()).length) / threads) * i;
			int stopPoint = (((in.list()).length )/ threads) * (i + 1);
			if ((in.list()).length % threads != 0 && i == (threads - 1)) {
				stopPoint = stopPoint + (in.list()).length % threads;
			}
			a[i] = new Thread(new Copying(in, out, startPoint, stopPoint));
			
		}
		
		for (int i = 0; i < a.length; i++) {
			a[i].start();
			
			
		}
			
		for (int i = 0; i < a.length; i++) {
			try {
				a[i].join();
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
		}
	}
		

	

}