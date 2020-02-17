package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		colorMode(HSB);
	}

	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(0);

		//360 deg lines
		// int x1 = 0;
		// int y1 = 0;
		// int x2 = 500;
		// int y2 = 500;

		// while(x1 != 500)
		// {
		// 	line(x1,y1,250,250);
		// 	x1 = x1 + 20;
		// }
		// while(y1 != 500)
		// {
		// 	line(x1,y1,250,250);
		// 	y1 = y1 + 20;
		// }
		// while(x2 != 0)
		// {
		// 	line(x2,y2,250,250);
		// 	x2 = x2 - 20;
		// }
		// while(y2 != 0)
		// {
		// 	line(x2,y2,250,250);
		// 	y2 = y2 - 20;
		// }

		//circles
		// int x = 25;
		// int y = 25;
		// int w = 50;
		// int h = 50;
		// int counter = 0;

		// while(counter != 10)
		// {
		// 	ellipse(x,y,w,h);
		// 	x = x + 50;

		// 	counter++;
		// }

		//Rainbow
		// int x = 0;
		// int y = 0;
		// int w = 50;
		// int h = 500;
		// int count = 0;
		// int colour = 0;

		// noStroke();

		// while(count != 10)
		// {
		// 	fill(colour, 255, 255);
		// 	rect(x, y, w, h);

		// 	x = x + 50;
		// 	colour = colour + 18;
		// 	count++;
		// }

		//rainbow balls
		// int x = 25;
		// int y = 25;
		// int w = 50;
		// int h = 50;
		// int counter = 0;
		// int colour = 0;

		// noStroke();

		// while(counter != 10)
		// {
		// 	fill(colour, 255, 255);
		// 	ellipse(x,y,w,h);

		// 	x = x + 50;
		// 	colour = colour + 18;
		// 	counter++;
		// }

		//grid
		// int x1 = 50;
		// int y1 = 40;
		// int x2 = 450;
		// int y2 = 40;
		// int count = 0;
		// int num = -5;
		// int textx = 50;
		// int texty = 20;

		// stroke(75, 255, 255);

		// while(count != 11)
		// {
		// 	line(x1,y1,x2,y2);
		// 	text(num,textx,texty);

		// 	y1 = y1 + 40;
		// 	y2 = y2 + 40;
		// 	textx = textx + 40;
		// 	num++;

		// 	count++;
		// }

		// num = -5;
		// texty = 40;

		// while(count != 22)
		// {
		// 	line(x1,40,x1,440);
		// 	text(num,25,texty);

		// 	x1 = x1 + 40;
		// 	texty = texty + 40;
		// 	num++;

		// 	count++;
		// }

		//coloured balls
		// int x = 25;
		// int y = 25;
		// int w = 50;
		// int h = 50;
		// int counter = 0;
		// int counter2 = 0;
		// int colour = 0;
		// int shift = 8;

		// noStroke();

		// while(counter != 10)
		// {
		// 	while(counter2 != 10)
		// 	{
		// 		fill(colour, 255, 255);
		// 		ellipse(x,y,w,h);

		// 		x = x + 50;
		// 		colour = colour + 10;

		// 		counter2++;
		// 	}
		// 	colour = 0;
		// 	colour = colour + shift;
		// 	shift = shift + 10;
		// 	x = 25;
		// 	y = y + 50;
		// 	counter2 = 0;

		// 	counter++;
		// }

		//checkers
		// int x = 0;
		// int y = 0;
		// int w = 25;
		// int h = 25;
		// int olc = 0;
		// int ilc = 0;
		// int tilecheck = 0;

		// noStroke();

		// while(olc != 20)
		// {
		// 	while(ilc != 20)
		// 	{
		// 		if(tilecheck % 2 == 0)
		// 		{
		// 			fill(240, 255, 200);
		// 		}
		// 		else
		// 		{
		// 			fill(240, 255, 100);
		// 		}
		// 		rect(x,y,w,h);
		// 		x = x + 25;

		// 		ilc++;
		// 		tilecheck++;
		// 	}
		// 	ilc = 0;
		// 	x = 0;
		// 	y = y + 25;
		// 	tilecheck++;

		// 	olc++;
		// }
	}
}
