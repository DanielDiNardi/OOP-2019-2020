package ie.tudublin;

import processing.core.PApplet;

public class Berzerk extends PApplet
{
    public void settings()
    {
        size(500, 500);
    }

    public void draw()
    {
        background(0);
        borders();
    }

    public void borders()
    {
        noStroke();
        fill(0, 0, 255);
        rect(-1, -1, 200, 10);
        rect(-1, -1, 10, 200);
        rect(300, -1, 201, 10);
        rect(491, -1, 10, 200);

        rect(-1, 490, 200, 10);
        rect(-1, 490, 10, -200);
        rect(300, 490, 201, 10);
        rect(491, 490, 10, -200);
    }
}