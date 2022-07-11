package cn.tedu.shoot;

import javafx.scene.image.Image;

import java.util.Random;

/** 小蜜蜂: 是飞行物，也是奖励 */
public class Bee extends FlyingObject implements Award {

	private int xSpeed = 1; //x坐标移动的速度
	private int ySpeed = 2; //y坐标移动的速度
	private int awardType; //奖励的类型(0或1)
	/** 构造方法 */
	public Bee(){

		image = ShootGame.bee; //图片
		width = image.getWidth();   //宽
		height = image.getHeight(); //高
		Random rand = new Random(); //随机数对象
		x = rand.nextInt(ShootGame.WIDTH-this.width); //x:0到(窗口宽-小蜜蜂宽)之内的随机数
		y = -this.height; //y:负的小蜜蜂的高
		awardType = rand.nextInt(2); //生成0到1之间的随机数
	}
	
	/** 重写getType()获取奖励类型 */
	public int getType(){
		return awardType; //返回奖励类型
	}
	
	/** 重写step()走一步 */
	public void step(){
		x += xSpeed; //x+(向左或向右)
		y += ySpeed; //y+(向下)
		if(x>=ShootGame.WIDTH-this.width){ //若x>=(窗口宽-蜜蜂宽)，则xSpeed为-1，加-1即为向左
			xSpeed = -1;
		}
		if(x<=0){ //若x<=0，则xSpeed为1，加1即为向右
			xSpeed = 1;
		}
	}

	/** 重写outOfBounds()检查是否出界 */
	public boolean outOfBounds(){
		return this.y>=ShootGame.HEIGHT; //小蜜蜂的y>=窗口高时，即为越界了
	}
	
}














