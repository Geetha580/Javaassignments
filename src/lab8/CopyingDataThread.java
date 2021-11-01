package lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyingDataThread extends Thread {

	@Override
	public void run() {
		File source=new File("C:\\gcce7\\basics\\LabExercise1\\bin\\geetha1.txt");
		String target="C:\\gcce7\\basics\\LabExercise1\\bin\\target.txt";
		try {
			FileReader fr=new FileReader(source);
			FileWriter fw=new FileWriter(target);
			int ch=0;
			while(ch!=-1) {
				for(int i=1;i<=10;i++) {
					ch=fr.read();
					fw.write(ch);
				}
				fw.flush();
				System.out.println("10 characters copied");
				Thread.sleep(5000);
			}
		}
		catch(IOException | InterruptedException fe) {
			fe.printStackTrace();
		}
	}
	
}
