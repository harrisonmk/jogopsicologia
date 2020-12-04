package com.gcstudios.entities;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.gcstudios.main.Game;

public class Player extends Entity{

	public boolean right,left;
	
	public boolean isShooting = false;
	public int quantidadeTiros = 0;
	
	public Player(int x, int y, int width, int height,double speed,BufferedImage sprite) {
		super(x, y, width, height,speed,sprite);
	}
	
	public void tick(){
		if(right)
		{
			x+=speed;
		}else if(left) {
			x-=speed;
		}
		
		if(x == Game.WIDTH-251) {
		x = Game.WIDTH-250;

		}
		
		else if(x == Game.WIDTH-63) {
		x = Game.WIDTH-64;
	
		}
		
		//Sistema de tiro!
		if(isShooting) {
			isShooting = false;
		
			int xx = this.getX() + 5;
			int yy = this.getY();
	
			Bullet bullet = new Bullet(xx,yy,3,3,4,null);
			Game.entities.add(bullet);
			
			
		}
		
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public boolean isShooting() {
		return isShooting;
	}

	public void setShooting(boolean isShooting) {
		this.isShooting = isShooting;
	}

	public int getQuantidadeTiros() {
		return quantidadeTiros;
	}

	public void setQuantidadeTiros(int quantidadeTiros) {
		this.quantidadeTiros = quantidadeTiros;
	}
	
	

	


}
