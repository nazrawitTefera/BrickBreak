package com.BrickBreak;

import java.awt.Graphics;
import java.awt.*;

public class Paddle {


	//your code here!


	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;
	private int size;
	

	
	//constructor(s):
	public Paddle(int x , int y, int size){
		this.x=x;
		this.y=y;
		this.size=size;
		this.width=size;
		this.height=2;
		this.velocity=2;

	}
	
	//methods:
	//pre
	//post
	public void draw(Graphics g){
		g.setColor(Color.pink);
		g.fillRect(x, velocity, width, height);
	}
	public void move(){
		x+=velocity;
	}
	public void add velocity(int )

	
}
