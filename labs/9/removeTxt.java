import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.*;

public class removeTxt {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		if (args.length != 2)
		{
			System.out.println("There's an error.");
			System.exit(0);
		}
			
		File infile = new File(args[1]);
		try
		{
			String blanks = "";
			while (scan.hasNextLine())
			{
				String line = scan.nextLine();
				line = line.replaceAll(args[0], "");
				line += line + "\n";
			}	

			scan.close();
			PrintWriter p = new PrintWriter(new File(args[1]));
			p.println(blanks);
			p.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error: cannot open file.");
		}
	}
}
