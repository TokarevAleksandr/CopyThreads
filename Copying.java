package sample;

import java.io.File;
import java.io.IOException;

public class Copying implements Runnable {

	private File in;
	private File out;
	private int start;
	private int stop;

	public Copying (File in, File out, int start, int stop) {
		super();
		this.in = in;
		this.out = out;
		this.start = start;
		this.stop = stop;
	}

	public Copying () {
		super();
	}
	
	
	
	@Override
	public void run() {
		try {
			FileOperations.fileCopy(in, out, start, stop);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	

}