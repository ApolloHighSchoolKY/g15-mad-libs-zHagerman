
//Import line for using new Random
import java.util.Random;

public class RandomStuff {

    public static void main (String[] args)
    {
    	//Math.random version
    	int x = (int)(Math.random()*50 + 1);

    	System.out.println(x);

    	//new Random version
    	Random rand = new Random();
    	int y = rand.nextInt(50) + 1;

    	System.out.println(y);

		//Range -3 to 8
		Random rand2 = new Random();
		int z = rand2.nextInt(12) -3;

		System.out.println(z);

		//Range 13 to 27
		int aa = (int)(Math.random()*15 + 13);

		System.out.println(aa);
    }


}