package org.dsp.files.write;

import java.io.FileInputStream;

import java.util.Properties;

public class readProperties
{
	public static void main(String[] args) throws Exception
	{
		Properties p = new Properties();
		p.load(new FileInputStream("arquivoPropertiesWrite.properties"));
		
		
		String user = p.getProperty("user");
		
		System.out.println(user);
	}

}
