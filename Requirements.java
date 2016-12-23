/*
 * Created on Jun 11, 2003
 * for Duke Eclipse project
 *
 */
import java.io.*;
/**
 * @author jett
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class Requirements
{
	private BufferedWriter myOut;
	private BufferedReader myIn;
	private Requirements()
	{
		//myOut = 
		myIn = new BufferedReader(new InputStreamReader(System.in));
	}
	private String readln()
	{
		try
		{
			return myIn.readLine();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return "";
	}
	private void write(String s)
	{
		try
		{
			myOut.write(s);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	private void doFileLocation()
	{
		boolean fileIsValid = false;
		while (!fileIsValid)
		{
			try
			{
				System.out.println(
					"Enter the location for the xml file (nothing for current directory): ");
				String s = readln();
				if (s.equals(""))
				{
					myOut = new BufferedWriter(new FileWriter("requirements.xml"));
					fileIsValid = true;
				}
				else
				{
					if (s.charAt(s.length() - 1) != '/')
					{
						s += "/";
					}
					s += "requirements.xml";
					myOut = new BufferedWriter(new FileWriter("requirements.xml"));
					fileIsValid = true;
				}
			}
			catch (IOException e)
			{
				System.out.print("Invalid path!  ");
			}
		}
	}
	private void writeFirstLine()
	{
		System.out.print(
			"What is the maximum size for this project in kilobytes? ");
		String maxSize = readln();
		int size = Integer.parseInt(maxSize);
		size *= 1000;
		String byteSize = "" + size;
		write("<requirements maxsize=\"" + byteSize + "\">\n");
	}
	private void doRequiredFiles()
	{
		write("\t<required_files>\n");
		System.out.print("Are there any required files? ");
		String response = readln().toLowerCase();
		if (response.startsWith("y"))
		{
			String fileName = "";
			while (true)
			{
				System.out.print("Name of file? (q to stop): ");
				fileName = readln();
				if (fileName.equals("q") || fileName.equals("Q"))
				{
					break;
				}
				if (!fileName.equals(""))
				{
					write("\t\t<file>" + fileName + "</file>\n");
				}
			}
		}
		write("\t</required_files>\n");
	}
	private void doFilters()
	{
		write("\t<filters>\n");
		System.out.print("Would you like to include any filters? ");
		String response = readln();
		response.toLowerCase();
		if (response.startsWith("y"))
		{
			String type = "", allow = "", text = "";
			while (true)
			{
				System.out.println("What is the filter type? (q to quit)");
				System.out.println("1)NAME\n2)EXTENSION\n3)CONTAINS\n4)REGEX");
				String typeResponse = readln();
				if (typeResponse.length() < 1)
				{
					break;
				}
				char x = typeResponse.charAt(0);
				if (x == '1')
					type = "NAME";
				else if (x == '2')
					type = "EXTENSION";
				else if (x == '3')
					type = "CONTAINS";
				else if (x == '4')
					type = "REGEX";
				else if (x == 'q')
					break;
				else if (x == 'Q')
					break;
				else
				{
					System.out.println("Invalid selection!");
					break;
				}
				System.out.print(
					"Enter the text to filter on (without quotes please): ");
				text = readln();
				System.out.print(
					"Would you like to allow(a) or deny(d) files satisfying these criteria?");
				String allowResponse = readln().toLowerCase();
				if (allowResponse.startsWith("a"))
				{
					allow = "TRUE";
				}
				else
				{
					allow = "FALSE";
				}
				write(
					"\t\t<filter type=\""
						+ type
						+ "\" allow=\""
						+ allow
						+ "\">"
						+ text
						+ "</filter>\n");
			}
		}
		write("\t</filters>\n");
	}
	private void writeLastLine()
	{
		write("</requirements>");
		try
		{
			System.out.println(
				"requirements.xml written and ready to use,"
					+ "\nif created in current directory please move it to the submission directory of this project," +
						"\nyou may reuse this xml file for multiple projects");
			myOut.close();
			File f = new File("requirements.xml");
			System.out.println("File saved to: " + f.getPath());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		Requirements p = new Requirements();
		p.doFileLocation();
		p.writeFirstLine();
		p.doRequiredFiles();
		p.doFilters();
		p.writeLastLine();
	}
}
