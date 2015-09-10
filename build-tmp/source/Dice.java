import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {


public void setup()
{
	size(520,560);
	noLoop();
}
public void draw()
{
	background(155);
	textSize(20);
	text("Sum of All Rolls: ",140,535);
	for(int x=25; x<500; x=x+100)
	{
		for(int y=25; y<500; y=y+100)
		{
	Die theDie = new Die(x,y);
	theDie.show();
	
}
	}
}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int myX, myY;//variable declarations here
	Die(int x, int y) //constructor
	{
		myX=x;
		myY=y;//variable initializations here
	}
	public void roll()
	{
		int dot=(int)(Math.random()*6+1);
		System.out.println(dot);
		strokeWeight(10);
		stroke(10);
		if (dot==1)
		{
		
			fill(255);
			point(myX+33,myY+33);
		}
		else if (dot==2)
		{
			point(myX+20,myY+25);
			point(myX+50,myY+45);
		}
		else if (dot ==3)
		{
			point(myX+20,myY+20);
			point(myX+35,myY+35);
			point(myX+50,myY+50);
		}
		else if(dot==4)
		{
			point(myX+20,myY+25);
			point(myX+20,myY+48);
			point(myX+50,myY+25);
			point(myX+50,myY+48);
		}
		else if(dot==5)
		{
			point(myX+20,myY+23);
			point(myX+20,myY+50);
			point(myX+50,myY+23);
			point(myX+50,myY+50);
			point(myX+35,myY+37);
		}
		else if(dot==6)
		{
			point(myX+20,myY+20);
			point(myX+20,myY+35);
			point(myX+20,myY+50);
			point(myX+50,myY+20);
			point(myX+50,myY+35);
			point(myX+50,myY+50);
		}

	}

	public void show()
	{
		noStroke();
		rect(myX,myY,70,70,60);//your code here
		roll();
	}
}


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
