package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.next();
		int col1 = in.nextInt();
		int col2 = in.nextInt();
		int col3 = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double param1 = in.nextDouble();
		double param2 = in.nextDouble();
		double param3 = in.nextDouble();
		double param4 = in.nextDouble();
		
		StdDraw.setPenColor( col1, col2, col3);
		if (isFilled && (shapeType.equals("rectangle"))){
			
		StdDraw.filledRectangle(param1, param2, param3, param4);
		}
		else if (!isFilled && (shapeType.equals("rectangle"))) {
			StdDraw.rectangle(param1, param2, param3, param4);
		}
		
	}
}
