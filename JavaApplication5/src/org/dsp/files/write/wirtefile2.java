package org.dsp.files.write;

import java.io.PrintStream;

public class wirtefile2 {

	public static void main(String[] args) throws Exception
	{
		PrintStream ps = new PrintStream("arquivoPrintStream.txt");
		
		ps.println("Quinta-Feira");
		ps.close();
	}
	
}
