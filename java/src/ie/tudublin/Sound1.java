package ie.tudublin;

import processing.core.PApplet;
import ddf.minim.*;
import ddf.minim.analysis.*;

public class Sound1 extends PApplet
{	
	Minim minim;
	AudioInput ai;
	AudioSample as;

	public void settings()
	{
		size(1024, 500);
	}

	public void setup() 
	{
		minim = new Minim(this);
		ai = minim.getLineIn(Minim.MONO, width, 44100, 16);

		as = minim.loadSample("Baby's On Fire.mp3");
		as.trigger();

		colorMode(HSB);
	}

	
	public void draw()
	{	
		background(255);		
		stroke(255);
		float cy = height / 2;
		float cx = width / 2;
		float avr = 0;
		float lerpedw = 0;
		float lowx = 256;
		float lowy = 125;
		float highx = 758;
		float highy = 375;
		float lerplowx = 0;
		float lerplowy = 0;
		float lerphighx = 0;
		float lerphighy = 0;
		float x = 512f;
		float xinv = 512f;
		int inf = 0;
		int colour = 0;
		
		avr = avr / (float) as.bufferSize();
		for(int i = 0 ; i < as.bufferSize() ; i ++)
		{
			// colour++;
			// if(colour == 255)
			// {
			// 	colour = 0;
			// }
			stroke(colour, 0, 0);
			line(x, cy, x, avr * 10);
			line(xinv, cy, xinv, avr * 10);
			line(x, cy, x, map(avr * 10, 255, 0, 500, cy));
			line(xinv, cy, xinv, map(avr * 10, 255, 0, 500, cy));
			line(x, cy, x, height - avr * 10);
			line(xinv, cy, xinv, height - avr * 10);

			avr = avr + abs(as.left.get(i));

			x++;
			xinv--;
		}
		noStroke();
		avr = avr / (float) as.bufferSize();
		float w = avr * 1000f;
		lerpedw = lerp(lerpedw, w, 0.45f);
		lerplowx = lerp(lerplowx, lowx, 0.45f);
		lerplowy = lerp(lerplowy, lowy, 0.45f);
		lerphighx = lerp(lerphighx, highx, 0.45f);
		lerphighy = lerp(lerphighy, highy, 0.45f);
		fill(
				map(avr, 0, 1, 0, 255)
				, 255
				, 255
			);
		ellipse(cx, cy, lerpedw, lerpedw);
		ellipse(lowx + lerpedw, lowy + lerpedw, lerpedw, lerpedw);
		ellipse(lowx + lerpedw, highy - lerpedw, lerpedw, lerpedw);
		ellipse(highx - lerpedw, lowy + lerpedw, lerpedw, lerpedw);
		ellipse(highx - lerpedw, highy - lerpedw, lerpedw, lerpedw);

		fill(
			map(avr, 0, 1, 130, 255)
			, 255
			, 255
		);

		rect(lowx, cy, 30f, lerpedw - 10f);
		rect(highx, cy, -30f, lerpedw - 10f);
		rect(lowx, cy, 30f, -lerpedw + 10f);
		rect(highx, cy, -30f, -lerpedw + 10f);

		fill(
				map(avr, 0, 1, 80, 130)
				, 255
				, 255
			);
		rect(lowx - 60f, cy, 30, lerpedw);
		rect(highx + 60f, cy, -30, lerpedw);
		rect(lowx - 60f, cy, 30, -lerpedw);
		rect(highx + 60f, cy, -30, -lerpedw);

		fill(
				map(avr, 0, 1, 0, 80)
				, 255
				, 255
			);
		rect(lowx - 120f, cy, 30, lerpedw + 10f);
		rect(highx + 120f, cy, -30, lerpedw + 10f);
		rect(lowx - 120f, cy, 30, -lerpedw - 10f);
		rect(highx + 120f, cy, -30, -lerpedw - 10f);

		fill(
				map(avr, 0, 1, 80, 130)
				, 255
				, 255
			);
		rect(lowx - 180f, cy, 30, lerpedw);
		rect(highx + 180f, cy, -30, lerpedw);
		rect(lowx - 180f, cy, 30, -lerpedw);
		rect(highx + 180f, cy, -30, -lerpedw);

		fill(
			map(avr, 0, 1, 130, 255)
			, 255
			, 255
		);
		rect(lowx - 240f, cy, 30, lerpedw - 10f);
		rect(highx + 240f, cy, -30, lerpedw - 10f);
		rect(lowx - 240f, cy, 30, -lerpedw + 10f);
		rect(highx + 240f, cy, -30, -lerpedw + 10f);

	}
}
