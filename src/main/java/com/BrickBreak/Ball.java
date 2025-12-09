package com.BrickBreak;
import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int ypos;
	private int xpos;
	private int size;
	private int xVelocity;
	private int yVelocity;

	
	//constructor(s):
	public ball(int x, int y, int size){
		 this.xpos = x;
         this.ypos = y;
         this.size = size;
         this.xVelocity = 1;
         this.yVelocity = -2;
	}
	//methods:
	public void draw(Graphics g){
		g.setColor(Color.cyan);
		g.fillOval(x,y,size,size);
	
	}
    public void setY(int y){
	this.ypos=y;	
	}
	
	public void setX(int x){
		this.xpos=x;
	}
	public void setXVelocity(int x){

	}
	    
}
