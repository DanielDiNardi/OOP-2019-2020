package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{	
	//one way to make an array
	//float[] rainFall = new float[12];

	//assigning values in the array
	float[] rainFall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
	String[] months = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep","oct", "nov", "dec"};

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		float min;
		float max;
		int minIndex = 0;
		int maxIndex = 0;

		min = rainFall[0];
		max = rainFall[0];

		for(int i = 0; i < rainFall.length; i++)
		{
			if(rainFall[i] < min)
			{
				min = rainFall[i];
				minIndex = i;
			}
			else if(rainFall[i] > max)
			{
				max = rainFall[i];
				maxIndex = i;
			}
		}

		println("Max: " + months[maxIndex] + "\t" + rainFall[maxIndex]);
		println("Min: " + months[minIndex] + "\t" + rainFall[minIndex]);

		// for(float f:rainFall)
		// {
		// 	println(f);
		// }

		// for(String s:months)
		// {
		// 	println(s);
		// }
	}

	

	float offset = 0;

	
	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(0);		
		colorMode(HSB);
		noStroke();

		float x = 0;
		int y = 500;
		float w = 500f/rainFall.length;
		int c = 0;


		for(int i = 0; i < rainFall.length; i++)
		{
			int h = (int) rainFall[i];

			fill(c,255,255);
			rect(x, y, w, -h);

			c = c + 20;
			x = x + w;
		}
	}
}
