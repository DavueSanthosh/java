package File_Handling;

import java.io.File;
import java.io.IOException;

public class MethodFileHandling {

	public static void main(String[] args) {

		// create a folder and sub folder

		File file = new File("D:\\Food\\non-veg\\menu");

		boolean folderCreation = file.exists();

		System.out.println("folder is Created :" + folderCreation);

		if (folderCreation == false)

			file.mkdirs();

		folderCreation = file.exists();
		System.out.println("folder is present :" + folderCreation);

		File createFile = new File("D:\\Food\\non-veg\\menu\\eat.txt");
		
		try {
			boolean NewFile = createFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		File Rename = new File("D:\\Food\\non-veg\\menu\\drink.txt");
		createFile.renameTo(Rename);

		System.out.println(Rename.exists());

		// Getname

		System.out.println("File Name:" + Rename.getName());
		System.out.println("File Execute: " + Rename.canExecute());
		System.out.println("File Write: " + Rename.canWrite());
		System.out.println("File Read: " + Rename.canRead());
		System.out.println("File path: " + Rename.getAbsolutePath());

		// list

		File list = new File("D:\\Pratice");
		String[] listFile = file.list();

		for (int i = 0; i < listFile.length; i++)
			System.out.println(listFile[i]);

		for (String string : listFile) {
			System.out.println(string);
		}

		File[] filefolderlist = list.listFiles();

		for (File total : filefolderlist) {
			System.out.println(total);
		}
	}
}
