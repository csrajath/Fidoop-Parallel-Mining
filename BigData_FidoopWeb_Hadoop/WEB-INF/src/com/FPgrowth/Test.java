package com.FPgrowth;

public class Test
{

	public static void main(String args[])
	{
		System.out.println("Input String");
		String input="Welcome to java programming programming";
		System.out.println(input);
		String mm= countWords(input);
		System.out.println("=============MM==============="+mm);
		// a(1);
	}

	// static void a(Int id)
	public static String countWords(String st)
	{
		// split text to array of words
		String[] words = st.split("\\s");
		StringBuffer sb=new StringBuffer();

		// clean duplicates
		for (int i = 0; i < words.length; i++)
		{
			for (int j = 0; j < words.length; j++)
			{
				if (words[i].equals(words[j]))
				{
					if (i != j)
						words[i] = "";

				}
			}
		}

		// show the output

		System.out.println("Removing Duplicate words:\n");
		for (int i = 0; i < words.length; i++)
		{

			if (words[i] != "")
			{
				//System.out.print(words[i]+" ");
				sb.append(words[i]+" ");

			}
		}
		return sb.toString();
	}
}