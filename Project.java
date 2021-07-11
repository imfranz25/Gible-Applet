import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import java.awt.Graphics2D;
import java.awt.AlphaComposite;
import java.awt.GradientPaint;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;

import javax.swing.JPanel;
public class Project extends JFrame{

//constructors
Gible gib=new Gible();
background b=new background();
beam bm=new beam();
sounds ss=new sounds();

//initialization
public int[]palette=new int[256];
public BufferedImage offscreen;
public int[] data;
public int[] data2;
public int x=7;
public int vm=10;
boolean right=true;
boolean right1=true;
public JFrame frame;
DrawPanel panel;
int yy=420;
int height=500;
boolean back=false;
boolean ready=false;

//fade
float alpha = 0f;
boolean con=true;

//updown rocket
	boolean up=true;
	boolean down=true;
	boolean back1=false;
	boolean he=false;
	boolean ver=true;
	int yup=0;
	int movy=0;
	int bstroke=7;

//rain init
private int rx1 = 0;
private int rx2 = 0;
private int rx3 = 0;
private int rx4 = 0;
private int ry1= 0;
private int ry2 = 0;
private int ry3 = 700;
private int ry4 = 700;
boolean rup1 = true;
boolean rup2 = true;
boolean rup3 = true;
boolean rup4 = true;
boolean rl1 = false;
boolean rl2 = true;
boolean rl3 = false;
boolean rl4 = true;
boolean rr1= true;
boolean rr2= false;
boolean rr3= true;
boolean rr4= false;

boolean ssolar =true;
int rad=0;
int ym=0;
int xmove=0;
int yb=0;
int xb=0;
int ymark=0;
int xmark=0;


public  void ff() {
panel=new DrawPanel();
getContentPane().add(panel);
ss.sound();
setBounds(-5,0,1280,900);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
offscreen=new BufferedImage(400,300,BufferedImage.TYPE_INT_RGB);
data=((DataBufferInt)offscreen.getRaster().getDataBuffer()).getData();
data2=new int[400*320];

for(int x=0;x<200;x++){
	float saturation=x>96? 0:1f -x / 100f;
	palette[x]=Color.HSBtoRGB(x/526f,saturation,Math.min(5f,x/48f));
}

new Thread(new Runnable(){
	@Override
	public void run(){
		while(true){
			repaint();


		}
	}
}).start();
setVisible(true);
}//


class DrawPanel extends JPanel{
public void paint(final Graphics g){
	Graphics2D g2=(Graphics2D)g;
	super.paint(g2);


b.paint(g2,x);//cloud1
b.paint1(g2,x);//cloud2
paint1(g2);//Fire
gib.paint(g2,0,-200,yup,x,movy);//gible
bm.paint(g2,vm,ready,yup,movy,bstroke,alpha,rx1,ry1,rx2,ry2,ry4);





}

public void paint1(Graphics g){

	for(int x=0;x<400;x++){
		data2[x+250*318]=Math.random()>0.55?0:300;
	}
	for(int y=5;y<320-2;y++){

		for(int x=-100;x<400-2;x++){
			data2[x+400*y]=(int)((int)((data2[x+400*y]+data2[x+400*(y+1)]+data2[(x-1)+400*(y+1)]+data2[(x+1)+400*(y+1)]+data2[x+400*(y+2)])/5.045)*1.01);
		}
	}
	for (int i=0;i<data.length;i++){
		data[i]=palette[data2[i]];
	}


	g.drawImage(offscreen,0,yy,200,height,null);
	g.drawImage(offscreen,200,yy,200,height,null);
	g.drawImage(offscreen,400,yy,200,height,null);
	g.drawImage(offscreen,600,yy,200,height,null);
	g.drawImage(offscreen,800,yy,200,height,null);
	g.drawImage(offscreen,1000,yy,200,height,null);
	g.drawImage(offscreen,1200,yy,280,height,null);


}
}
public static void main(String[]args){
	Project f1=new Project();

	SwingUtilities.invokeLater(new Runnable(){
		public void run(){
			 f1.ff();

		}



	});
	f1.moveit();



}


public void moveit (){




	while(true){
		if(right==true){
			x++;
			if(x>=200){
				right=false;
			}
		}
		else {
			x--;
			if(x<=-100){
				right=true;
			}
		}

if(up==true){
		if(yup<-250){
		up=false;
		back1=true;
	}
	yup--;

}
else if(down==false){
	if(yup==-200){

		down=true;
		if(ver==true){
				he=true;
		}
	}
	yup--;

}


else if(back1==true&&down==true){
		if(yup==-190){
		down=false;
	}
	yup++;

}

 if(he==true){
	movy++;
if(movy==280){
	he=false;
		ready=true;
		ver=false;
	}
}


if(ready==true){
	if(bstroke<180){
		bstroke +=1;
if(bstroke>=80){
		bstroke +=5;
}//boots beam
	}//beam stroke
	if(right1==true){
			vm+=2;
			if(vm>=200){
				right1=false;
			}
		}//vm

}

//rain
        if (rx1==80){
        	rr1 = false;
        	rl1 = true;
        }
        if (rx1==-150){
        	rr1 = true;
        	rl1 = false;
        }
        if (ry1==1350){
        	ry1=-50;
        }
        if (rup1) ry1+=2;
        if (rl1) rx1--;
        if (rr1) rx1++;
//2
        if (rx2==10){
        	rr2 = false;
        	rl2 = true;
        }
        if (rx2==-90){
        	rr2 = true;
        	rl2 = false;
        }
        if (ry2==1350){
        	ry2=-50;
        }
        if (rup2) ry2+=3;
        if (rl2) rx2--;
        if (rr2) rx2++;
//4
           if (rx4==80){
        	rr4 = false;
        	rl4 = true;
        }
        if (rx4==-150){
        	rr4 = true;
        	rl4 = false;
        }
        if (ry4==1300){
        	ry4=-50;
        }
        if (rup4) ry4+=2;
        if (rl4) rx4--;
        if (rr4) rx4++;

		try{
			Thread.sleep(20);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		repaint();

		//fade
		alpha += -0.05f;
        if (alpha <= 0) {
            alpha = 1;
		}
		if (alpha == 0){
			alpha += 0.1;
		}







	}
}//moveit


}//class

