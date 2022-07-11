package cn.tedu.shoot;

import java.util.Random;

/** 子弹: 是飞行物 */
public class Bullet extends FlyingObject {
	private int speed = 3; //移动的速度
	/** 构造方法 x,y不是固定的*/
	public Bullet(int x,int y){
		image = ShootGame.bullet; //图片
		width = image.getWidth();   //宽
		height = image.getHeight(); //高
		this.x = x; //x坐标(随英雄机位置)
		this.y = y; //y坐标(随英雄机位置)
	}
	
	/** 重写step()走一步 */
	public void step(){
		y-=speed; //y-(向上)
	}
	
	/** 重写outOfBounds()检查是否出界 */
	public boolean outOfBounds(){
		return this.y<=-this.height; //子弹的y<=负的子弹的高时，即为越界了
	}
	
}











