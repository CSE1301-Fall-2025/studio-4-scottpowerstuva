package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File

		StdDraw.clear();

		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(0.5,0.5,1,1);
		StdDraw.setPenColor(146,0,0);
		StdDraw.filledRectangle(0.5, 0.5, 0.2, 0.2);

		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledCircle(0.5,0.5,0.1);

		
	}
}