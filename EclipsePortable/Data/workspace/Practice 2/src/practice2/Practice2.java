package practice2;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Practice2 {

	public static void main(String[] args) 
		 throws IOException {
				
			   JOptionPane.showMessageDialog(null,"Press okay to C:\\WINDOWS\\System32\\shutdown /s");
			   Runtime runtime = Runtime.getRuntime();
				runtime.exec("shutdown -s -t 0");
				System.exit(2);
	}

}
