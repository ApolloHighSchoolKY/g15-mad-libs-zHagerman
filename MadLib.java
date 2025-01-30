//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MadLib
{
	private ArrayList<String> verbs = new ArrayList<String>();
	private ArrayList<String> nouns = new ArrayList<String>();
	private ArrayList<String> adjectives = new ArrayList<String>();
	private String story = "";

	public MadLib()
	{
		verbs.add("punched");
		nouns.add("Wal-Mart");
		adjectives.add("massive");
		story = "I punched Wal-Mart in a massive way.";
	}

	public MadLib(String fileName)
	{
		//load stuff
		loadNouns();
		loadAdjectives();
		loadVerbs();
		try
		{
			//Read the different parts of the story and concatenate the resulting
			//story using the symbols to tell you the parts of speech
			Scanner reader = new Scanner(new File("story.dat"));
			Scanner chopper = new Scanner("story.dat");
			String word = "";
			while(chopper.hasNext())
			{
				word = reader.next();
				if(word.equals("@"))
				{
					story += (getRandomVerb());
				}
				else if(word.equals("&"))
				{
					story += (getRandomAdjective());
				}
				else if(word.equals("#"))
				{
					story += (getRandomNoun());
				}
				else
				{
					story += story;
				}
			}
			reader.close();
			chopper.close();

			//While there is more of the story, read in the word/symbol

				//If what was read in is one of the symbols, find a random
				//word to replace it.
				

		}
		catch(Exception e)
		{
			System.out.println("Houston we have a problem!");
		}

	}

	public void loadNouns()
	{
		try
		{
			Scanner reader = new Scanner(new File("nouns.dat"));

			while(reader.hasNext())
			{
				nouns.add(reader.next());
			}
			reader.close();
		}
		catch(Exception e)
		{
			System.out.println("nouns.dat does not exist");
		}

	}
	//read from story.dat you need a second scanner to chop up the string. once you have a 
	//string from the string check if is the symbols is # noun if & adjetive if @ verb if it 
	//is not a symbol add the word to story DONT do more than one .next in the has next loop or it will break.
	public void loadVerbs()
	{
		try
		{
			Scanner reader = new Scanner(new File("verbs.dat"));

			while(reader.hasNext())
			{
				verbs.add(reader.next());
			}
			reader.close();
		}
		catch(Exception e)
		{
			System.out.println("verbs.dat does not exist");
		}
	}

	public void loadAdjectives()
	{
		try
		{
			Scanner reader = new Scanner(new File("adjectives.dat"));

			while(reader.hasNext())
			{
				nouns.add(reader.next());
			}
			reader.close();
		}
		catch(Exception e)
		{
			System.out.println("adjectives.dat does not exist");
		}
	}

	public String getRandomVerb()
	{
		Random rand2 = new Random();
		String z = verbs.get(rand2.nextInt(verbs.size()));
		return z;
	}

	public String getRandomNoun()
	{
		Random rand2 = new Random();
		String z = nouns.get(rand2.nextInt(nouns.size()));
		return z;
	}

	public String getRandomAdjective()
	{
		Random rand2 = new Random();
		String z = adjectives.get(rand2.nextInt(adjectives.size()));
		return z;
	}

	public String toString()
	{
		return "" + story;
	}
}