package String;

public class RemoveTheDuplicates 
{

	public void removeCharacters(String name, String remove) 
	{

		char split = 0;
		String emptyString = name, search;
		String replace = "";

	for (int index = 0; index < name.length(); index++) {
			
			split = name.charAt(index);//split the letters
			search = Character.toString(split); //char convert to string

	  for (int index2 = 0; index2 < remove.length(); index2++) {
				
			if (split == remove.charAt(index2)) {
				emptyString = emptyString.replace(search, replace);
				}
			}

		}

		System.out.println("Name of the String:" + name);
		System.out.println("Remove words:" + remove);

		System.out.println("After removing:" + emptyString);

	}
}
