import java.awt.*;
import javax.swing.*;
import java.awt.geom.Point2D;

public class beam extends JApplet{
int ch=0;
int hc=255;
boolean dec=false;


	int ym=0;
	int ym2=0;
    	int y=0;
    	int x=0;
    	int beam=0;
    	int y1=0;
    	int x1=0;
    	int movex=0;
    	int y3=0;
    	int x3=0;
    	int radius=5;
    	int rad=5;
    	boolean tx1=true;
    	boolean tx2=false;
    	boolean tx3=false;
    	boolean tx4=false;
		boolean ssolar=true;
    	boolean spark=true;
boolean okayr=true;

    	int xmark=0;
    	int ymark=0;

int ok1=0;
int ok2=0;
int ko1=0;
int ko2=0;

int kk1=0;
int kk2=0;
int hh1=0;
int hh2=0;

int ii=0;
int i=0;
int add=0;
int boval=0;
int plus=0;
int bup=0;

boolean smove=false;
boolean next=false;
boolean blink=true;
boolean readyb=false;
int count=0;
int itstime=0;
int boost =0;
int boom=0;

boolean red1=true;
boolean orange1=false;
boolean pink1=false;
boolean white1=false;
boolean cyan1=false;
boolean magenta1=false;
boolean yellow1=false;

    public void paint(Graphics g,int xmove,boolean ready,int yup,int movy,int s,float alpha,int rx1,int ry1,int rx2,int ry2,int ry4){
    	logo ll=new logo();
    	Graphics2D g2=(Graphics2D)g;
    	super.paint(g2);
    	g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
Color []red={Color.red,Color.orange};
Color []orange={Color.orange,Color.gray};
Color []pink={Color.red,Color.yellow};
Color []white={Color.white,Color.gray};
Color []cyan={Color.cyan,Color.gray};
Color []magenta={Color.magenta,Color.white};
Color []yellow={Color.yellow,Color.red};


if(ready==true){

//for solar layer 1
if(xmove>20&&xmove<200){
	ym+=2;
plus+=3;

}
 y=(605+yup)-ym;
 x=737-movy;

//first layer
xmove=xmove+1;

if(xmove>200){
	okayr=true;
}

if(okayr==true){
	if(rad>135){
		count++;
	}
	if(count==10){
		smove=true;
	}
if(blink==true&&next==false){

	if(ssolar==true){
	if(rad>135){
		ssolar=false;
	}
	rad+=3;
}
else{
	if(rad<130){
		ssolar=true;
	}
	rad-=7;
}
}
if(smove==true){
	if(itstime>400){
		smove=false;
		next=true;
		blink=false;
	}
	itstime+=20;
}
if(next==true){
	if(rad>300){
		next=false;
		readyb=true;
	}
	rad+=10;
	boost+=21;
if(rad>140&&rad<300){
	bup+=13;
}
}
//faded
if(boom>=50){
	alpha=0;
}
if(readyb==true){
AlphaComposite acomp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha);
g2.setComposite(acomp);
boom++;
}

xmove=xmove+boost;
 ymark=y+1+plus-25;
 xmark=(x+1+plus-18)+itstime;
 x=x+itstime-bup;
 y=y-bup;
Point2D cent =new Point2D.Float(xmark,ymark);
float []ds={0.5f,1f};
RadialGradientPaint rdc=new RadialGradientPaint(cent,rad,ds,red);
g2.setPaint(rdc);
}
else{
g2.setColor(Color.yellow);
}
g2.fillOval(x,y,xmove,xmove);

//end of faded
g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC));




}

if(boom>30){
//logo
ll.paint(g2,232,80);
//rain
if(spark==true){
		if(radius>=8){
		spark=false;
}
	radius++;

}

else{
			if(radius<=5){
			spark=true;
}
	radius--;

}



for(int o=-400;o<2000;o+=200){
	Color ggg=new Color(hc,125,ch);
g2.setColor(ggg);
Font f=new Font("Times New Roman",Font.BOLD,25);
g2.setFont(f);
g2.drawString("Francis C. Ong",920,490);
g2.drawString("BSIT - 2B",950,520);
Color gg=new Color(ch,25,hc);
g2.setColor(gg);
Font f1=new Font("Times New Roman",Font.PLAIN,100);
g2.setFont(f1);
g2.drawString("GIBLE",850,420);

int x123[]={1240,1185,1197,1205,1210,1213,1210,1204,1199,1197,1198,1199,1206,1221,1227,1225,1225,1225,1222,1222,1217,1210,1206,1201,1198,1198,1203,1208,1213,1213,1216,1218,1218,1220,1221,1223,1226,1229,1230,1228,1232,1240,1244,1244,1240,1235,1232,1236,1247};
int y123[]={444,445,440,435,427,420,415,415,418,424,429,435,442,460,469,466,471,472,474,475,478,477,475,471,466,461,454,443,441,444,444,441,444,441,445,442,447,442,443,445,445,455,464,468,469,468,462,457,443};
g.setColor(Color.cyan);
for(int i=0;i<x123.length;i++){
	x123[i]=x123[i]-200;
	y123[i]=y123[i]+24;
}
g.drawPolyline(x123,y123,x123.length);

if(dec==false){
	ch+=5;
	hc-=1;
	if(ch==255){
	dec=true;
}
}
else{
		ch-=5;
		hc+=1;
		if(ch==0){
	dec=false;
}

}
while(i<=1200){
i+=1200;



	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 ok1=(101+o)+rx1;
 ok2=10+ry1;
ko1=(93+o)+rx1;
 ko2=3+ry1;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 ok1=(101+o)+rx2;
 ok2=10+ry2;
 ko1=(93+o)+rx2;
 ko2=3+ry2;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 ok1=(101+o)+rx1;
 ok2=10+ry1;
 ko1=(93+o)+rx1;
 ko2=3+ry1;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D center11213 =new Point2D.Float(ok1,ok2);
float []dist112213={0.5f,1f};
RadialGradientPaint rdc=new RadialGradientPaint(center11213,radius,dist112213,red);

if(red1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdc);
g2.fillOval(ko1,ko2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
ok1=0;
 ok2=ok2+add;
 ko1=0;
 ko2=ko2+add;

}
while(i<=1200){
i+=1200;



	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 ok1=(101+o)-rx1;
 ok2=ry1-50;
ko1=(93+o)-rx1;
 ko2=ry1-57;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 ok1=(101+o)+rx2;
 ok2=ry2-70;
 ko1=(93+o)+rx2;
 ko2=ry2-77;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 ok1=(101+o)+rx1;
 ok2=ry1-90;
 ko1=(93+o)+rx1;
 ko2=ry1-97;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D center11213 =new Point2D.Float(ok1,ok2);
float []dist112213={0.5f,1f};
RadialGradientPaint rdc=new RadialGradientPaint(center11213,radius,dist112213,red);

if(red1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdc);
g2.fillOval(ko1,ko2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
ok1=0;
 ok2=ok2+add;
 ko1=0;
 ko2=ko2+add;

}
while(i<=1200){
i+=1200;



	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 ok1=(101+o)-rx1;
 ok2=ry1-120;
ko1=(93+o)-rx1;
 ko2=ry1-127;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 ok1=(101+o)+rx2;
 ok2=ry2-150;
 ko1=(93+o)+rx2;
 ko2=ry2-157;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 ok1=(101+o)+rx1;
 ok2=ry1-170;
 ko1=(93+o)+rx1;
 ko2=ry1-177;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D center11213 =new Point2D.Float(ok1,ok2);
float []dist112213={0.5f,1f};
RadialGradientPaint rdc=new RadialGradientPaint(center11213,radius,dist112213,red);

if(red1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdc);
g2.fillOval(ko1,ko2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
ok1=0;
 ok2=ok2+add;
 ko1=0;
 ko2=ko2+add;

}

while(i<=1200){
i+=1200;



	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 ok1=(101+o)-rx1;
 ok2=ry1-190;
ko1=(93+o)-rx1;
 ko2=ry1-197;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 ok1=(101+o)+rx2;
 ok2=ry2-210;
 ko1=(93+o)+rx2;
 ko2=ry2-217;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 ok1=(101+o)+rx1;
 ok2=ry1-240;
 ko1=(93+o)+rx1;
 ko2=ry1-247;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D center11213 =new Point2D.Float(ok1,ok2);
float []dist112213={0.5f,1f};
RadialGradientPaint rdc=new RadialGradientPaint(center11213,radius,dist112213,red);

if(red1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdc);
g2.fillOval(ko1,ko2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
ok1=0;
 ok2=ok2+add;
 ko1=0;
 ko2=ko2+add;

}

while(i<=1200){
i+=1200;



	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 ok1=(101+o)-rx1;
 ok2=ry1-270;
ko1=(93+o)-rx1;
 ko2=ry1-277;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 ok1=(101+o)+rx2;
 ok2=ry2-290;
 ko1=(93+o)+rx2;
 ko2=ry2-297;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 ok1=(101+o)+rx1;
 ok2=ry1-310;
 ko1=(93+o)+rx1;
 ko2=ry1-317;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D center11213 =new Point2D.Float(ok1,ok2);
float []dist112213={0.5f,1f};
RadialGradientPaint rdc=new RadialGradientPaint(center11213,radius,dist112213,red);

if(red1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdc);
g2.fillOval(ko1,ko2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
ok1=0;
 ok2=ok2+add;
 ko1=0;
 ko2=ko2+add;

}

while(i<=1200){
i+=1200;



	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 ok1=(101+o)-rx1;
 ok2=ry1-330;
ko1=(93+o)-rx1;
 ko2=ry1-337;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 ok1=(101+o)+rx2;
 ok2=ry2-370;
 ko1=(93+o)+rx2;
 ko2=ry2-377;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 ok1=(101+o)+rx1;
 ok2=ry1-390;
 ko1=(93+o)+rx1;
 ko2=ry1-397;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D center11213 =new Point2D.Float(ok1,ok2);
float []dist112213={0.5f,1f};
RadialGradientPaint rdc=new RadialGradientPaint(center11213,radius,dist112213,red);

if(red1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdc);
g2.fillOval(ko1,ko2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
ok1=0;
 ok2=ok2+add;
 ko1=0;
 ko2=ko2+add;

}
while(i<=1200){
i+=1200;



	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 ok1=(101+o)-rx1;
 ok2=ry1-410;
ko1=(93+o)-rx1;
 ko2=ry1-417;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 ok1=(101+o)+rx2;
 ok2=ry2-430;
 ko1=(93+o)+rx2;
 ko2=ry2-437;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 ok1=(101+o)+rx1;
 ok2=ry1-470;
 ko1=(93+o)+rx1;
 ko2=ry1-477;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D center11213 =new Point2D.Float(ok1,ok2);
float []dist112213={0.5f,1f};
RadialGradientPaint rdc=new RadialGradientPaint(center11213,radius,dist112213,red);

if(red1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdc);
g2.fillOval(ko1,ko2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
ok1=0;
 ok2=ok2+add;
 ko1=0;
 ko2=ko2+add;

}

while(i<=1200){
i+=1200;



	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 ok1=(101+o)-rx1;
 ok2=ry1-500;
ko1=(93+o)-rx1;
 ko2=ry1-507;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 ok1=(101+o)+rx2;
 ok2=ry2-530;
 ko1=(93+o)+rx2;
 ko2=ry2-537;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 ok1=(101+o)+rx1;
 ok2=ry1-570;
 ko1=(93+o)+rx1;
 ko2=ry1-577;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D center11213 =new Point2D.Float(ok1,ok2);
float []dist112213={0.5f,1f};
RadialGradientPaint rdc=new RadialGradientPaint(center11213,radius,dist112213,red);

if(red1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdc);
g2.fillOval(ko1,ko2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
ok1=0;
 ok2=ok2+add;
 ko1=0;
 ko2=ko2+add;

}

while(i<=1200){
i+=1200;

	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 ok1=(101+o)-rx1;
 ok2=ry1-600;
ko1=(93+o)-rx1;
 ko2=ry1-607;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 ok1=(101+o)+rx2;
 ok2=ry2-630;
 ko1=(93+o)+rx2;
 ko2=ry2-637;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 ok1=(101+o)+rx1;
 ok2=ry1-670;
 ko1=(93+o)+rx1;
 ko2=ry1-677;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D center11213 =new Point2D.Float(ok1,ok2);
float []dist112213={0.5f,1f};
RadialGradientPaint rdc=new RadialGradientPaint(center11213,radius,dist112213,red);

if(red1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdc);
g2.fillOval(ko1,ko2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
ok1=0;
 ok2=ok2+add;
 ko1=0;
 ko2=ko2+add;

}

while(i<=1200){
i+=1200;

	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 ok1=(101+o)-rx1;
 ok2=ry1-700;
ko1=(93+o)-rx1;
 ko2=ry1-707;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 ok1=(101+o)+rx2;
 ok2=ry2-730;
 ko1=(93+o)+rx2;
 ko2=ry2-737;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 ok1=(101+o)+rx1;
 ok2=ry1-770;
 ko1=(93+o)+rx1;
 ko2=ry1-777;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D center11213 =new Point2D.Float(ok1,ok2);
float []dist112213={0.5f,1f};
RadialGradientPaint rdc=new RadialGradientPaint(center11213,radius,dist112213,red);

if(red1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdc);
g2.fillOval(ko1,ko2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
ok1=0;
 ok2=ok2+add;
 ko1=0;
 ko2=ko2+add;

}

while(i<=1200){
i+=1200;

	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 ok1=(101+o)-rx1;
 ok2=ry1-800;
ko1=(93+o)-rx1;
 ko2=ry1-807;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 ok1=(101+o)+rx2;
 ok2=ry2-830;
 ko1=(93+o)+rx2;
 ko2=ry2-837;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 ok1=(101+o)+rx1;
 ok2=ry1-870;
 ko1=(93+o)+rx1;
 ko2=ry1-877;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D center11213 =new Point2D.Float(ok1,ok2);
float []dist112213={0.5f,1f};
RadialGradientPaint rdc=new RadialGradientPaint(center11213,radius,dist112213,red);

if(red1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdc);
g2.fillOval(ko1,ko2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
ok1=0;
 ok2=ok2+add;
 ko1=0;
 ko2=ko2+add;

}

while(i<=1200){
i+=1200;

	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 ok1=(101+o)-rx1;
 ok2=ry1-900;
ko1=(93+o)-rx1;
 ko2=ry1-907;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 ok1=(101+o)+rx2;
 ok2=ry2-930;
 ko1=(93+o)+rx2;
 ko2=ry2-937;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 ok1=(101+o)+rx1;
 ok2=ry1-970;
 ko1=(93+o)+rx1;
 ko2=ry1-977;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D center11213 =new Point2D.Float(ok1,ok2);
float []dist112213={0.5f,1f};
RadialGradientPaint rdc=new RadialGradientPaint(center11213,radius,dist112213,red);

if(red1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdc);
g2.fillOval(ko1,ko2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
ok1=0;
 ok2=ok2+add;
 ko1=0;
 ko2=ko2+add;

}

while(i<=1200){
i+=1200;

	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 ok1=(101+o)-rx1;
 ok2=ry1-1000;
ko1=(93+o)-rx1;
 ko2=ry1-1007;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 ok1=(101+o)+rx2;
 ok2=ry2-1030;
 ko1=(93+o)+rx2;
 ko2=ry2-1037;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 ok1=(101+o)+rx1;
 ok2=ry1-1070;
 ko1=(93+o)+rx1;
 ko2=ry1-1077;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D center11213 =new Point2D.Float(ok1,ok2);
float []dist112213={0.5f,1f};
RadialGradientPaint rdc=new RadialGradientPaint(center11213,radius,dist112213,red);

if(red1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdc);
g2.fillOval(ko1,ko2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
ok1=0;
 ok2=ok2+add;
 ko1=0;
 ko2=ko2+add;

}


while(i<=1200){
i+=1200;

	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 ok1=(101+o)-rx1;
 ok2=ry1-1100;
ko1=(93+o)-rx1;
 ko2=ry1-1107;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 ok1=(101+o)+rx2;
 ok2=ry2-1130;
 ko1=(93+o)+rx2;
 ko2=ry2-1137;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 ok1=(101+o)+rx1;
 ok2=ry1-1170;
 ko1=(93+o)+rx1;
 ko2=ry1-1177;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D center11213 =new Point2D.Float(ok1,ok2);
float []dist112213={0.5f,1f};
RadialGradientPaint rdc=new RadialGradientPaint(center11213,radius,dist112213,red);

if(red1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdc);
g2.fillOval(ko1,ko2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
ok1=0;
 ok2=ok2+add;
 ko1=0;
 ko2=ko2+add;

}

while(i<=1200){
i+=1200;

	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 ok1=(101+o)-rx1;
 ok2=ry1-1200;
ko1=(93+o)-rx1;
 ko2=ry1-1207;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 ok1=(101+o)+rx2;
 ok2=ry2-1230;
 ko1=(93+o)+rx2;
 ko2=ry2-1237;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 ok1=(101+o)+rx1;
 ok2=ry1-1270;
 ko1=(93+o)+rx1;
 ko2=ry1-1277;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D center11213 =new Point2D.Float(ok1,ok2);
float []dist112213={0.5f,1f};
RadialGradientPaint rdc=new RadialGradientPaint(center11213,radius,dist112213,red);

if(red1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdc);
g2.fillOval(ko1,ko2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
ok1=0;
 ok2=ok2+add;
 ko1=0;
 ko2=ko2+add;

}

while(i<=1200){
i+=1200;

	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 ok1=(101+o)-rx1;
 ok2=ry1-1200;
ko1=(93+o)-rx1;
 ko2=ry1-1207;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 ok1=(101+o)+rx2;
 ok2=ry2-1230;
 ko1=(93+o)+rx2;
 ko2=ry2-1237;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 ok1=(101+o)+rx1;
 ok2=ry1-1270;
 ko1=(93+o)+rx1;
 ko2=ry1-1277;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D center11213 =new Point2D.Float(ok1,ok2);
float []dist112213={0.5f,1f};
RadialGradientPaint rdc=new RadialGradientPaint(center11213,radius,dist112213,red);

if(red1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdc);
g2.fillOval(ko1,ko2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
ok1=0;
 ok2=ok2+add;
 ko1=0;
 ko2=ko2+add;

}

while(i<=1200){
i+=1200;

	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 ok1=(101+o)-rx1;
 ok2=ry1-1300;
ko1=(93+o)-rx1;
 ko2=ry1-1307;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 ok1=(101+o)+rx2;
 ok2=ry2-1330;
 ko1=(93+o)+rx2;
 ko2=ry2-1337;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 ok1=(101+o)+rx1;
 ok2=ry1-1370;
 ko1=(93+o)+rx1;
 ko2=ry1-1377;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
if(ry1>1350){
	 boval=1377;
	}
	}


Point2D center11213 =new Point2D.Float(ok1,ok2);
float []dist112213={0.5f,1f};
RadialGradientPaint rdc=new RadialGradientPaint(center11213,radius,dist112213,red);

if(red1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdc=new RadialGradientPaint(center11213,radius,dist112213,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdc);
g2.fillOval(ko1,ko2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
ok1=0;
 ok2=ok2+add;
 ko1=0;
 ko2=ko2+add;

}

}

//boval
if(boval==1377){

for(int o=-400;o<2000;o+=200){

while(i<=1200){
i+=1200;



	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 kk1=(101+o)+rx1;
 kk2=10+ry4;
hh1=(93+o)+rx1;
 hh2=3+ry4;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 kk1=(101+o)+rx2;
 kk2=10+ry4;
 hh1=(93+o)+rx2;
 hh2=3+ry4;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 kk1=(101+o)+rx1;
 kk2=10+ry4;
 hh1=(93+o)+rx1;
 hh2=3+ry4;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D hah =new Point2D.Float(kk1,kk2);
float []hah1={0.5f,1f};
RadialGradientPaint rdctt=new RadialGradientPaint(hah,radius,hah1,red);

if(red1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdctt);
g2.fillOval(hh1,hh2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
kk1=0;
 kk2=kk2+add;
 hh1=0;
 hh2=hh2+add;

}
while(i<=1200){
i+=1200;



	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 kk1=(101+o)-rx1;
 kk2=ry4-50;
hh1=(93+o)-rx1;
 hh2=ry4-57;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 kk1=(101+o)+rx2;
 kk2=ry4-70;
 hh1=(93+o)+rx2;
 hh2=ry4-77;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 kk1=(101+o)+rx1;
 kk2=ry4-90;
 hh1=(93+o)+rx1;
 hh2=ry4-97;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D hah =new Point2D.Float(kk1,kk2);
float []hah1={0.5f,1f};
RadialGradientPaint rdctt=new RadialGradientPaint(hah,radius,hah1,red);

if(red1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdctt);
g2.fillOval(hh1,hh2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
kk1=0;
 kk2=kk2+add;
 hh1=0;
 hh2=hh2+add;

}
while(i<=1200){
i+=1200;



	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 kk1=(101+o)-rx1;
 kk2=ry4-120;
hh1=(93+o)-rx1;
 hh2=ry4-127;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 kk1=(101+o)+rx2;
 kk2=ry4-150;
 hh1=(93+o)+rx2;
 hh2=ry4-157;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 kk1=(101+o)+rx1;
 kk2=ry4-170;
 hh1=(93+o)+rx1;
 hh2=ry4-177;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D hah =new Point2D.Float(kk1,kk2);
float []hah1={0.5f,1f};
RadialGradientPaint rdctt=new RadialGradientPaint(hah,radius,hah1,red);

if(red1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdctt);
g2.fillOval(hh1,hh2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
kk1=0;
 kk2=kk2+add;
 hh1=0;
 hh2=hh2+add;

}

while(i<=1200){
i+=1200;



	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 kk1=(101+o)-rx1;
 kk2=ry4-190;
hh1=(93+o)-rx1;
 hh2=ry4-197;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 kk1=(101+o)+rx2;
 kk2=ry4-210;
 hh1=(93+o)+rx2;
 hh2=ry4-217;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 kk1=(101+o)+rx1;
 kk2=ry4-240;
 hh1=(93+o)+rx1;
 hh2=ry4-247;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D hah =new Point2D.Float(kk1,kk2);
float []hah1={0.5f,1f};
RadialGradientPaint rdctt=new RadialGradientPaint(hah,radius,hah1,red);

if(red1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdctt);
g2.fillOval(hh1,hh2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
kk1=0;
 kk2=kk2+add;
 hh1=0;
 hh2=hh2+add;

}

while(i<=1200){
i+=1200;



	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 kk1=(101+o)-rx1;
 kk2=ry4-270;
hh1=(93+o)-rx1;
 hh2=ry4-277;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 kk1=(101+o)+rx2;
 kk2=ry4-290;
 hh1=(93+o)+rx2;
 hh2=ry4-297;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 kk1=(101+o)+rx1;
 kk2=ry4-310;
 hh1=(93+o)+rx1;
 hh2=ry4-317;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D hah =new Point2D.Float(kk1,kk2);
float []hah1={0.5f,1f};
RadialGradientPaint rdctt=new RadialGradientPaint(hah,radius,hah1,red);

if(red1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdctt);
g2.fillOval(hh1,hh2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
kk1=0;
 kk2=kk2+add;
 hh1=0;
 hh2=hh2+add;

}

while(i<=1200){
i+=1200;



	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 kk1=(101+o)-rx1;
 kk2=ry4-330;
hh1=(93+o)-rx1;
 hh2=ry4-337;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 kk1=(101+o)+rx2;
 kk2=ry4-370;
 hh1=(93+o)+rx2;
 hh2=ry4-377;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 kk1=(101+o)+rx1;
 kk2=ry4-390;
 hh1=(93+o)+rx1;
 hh2=ry4-397;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D hah =new Point2D.Float(kk1,kk2);
float []hah1={0.5f,1f};
RadialGradientPaint rdctt=new RadialGradientPaint(hah,radius,hah1,red);

if(red1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdctt);
g2.fillOval(hh1,hh2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
kk1=0;
 kk2=kk2+add;
 hh1=0;
 hh2=hh2+add;

}
while(i<=1200){
i+=1200;



	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 kk1=(101+o)-rx1;
 kk2=ry4-410;
hh1=(93+o)-rx1;
 hh2=ry4-417;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 kk1=(101+o)+rx2;
 kk2=ry4-430;
 hh1=(93+o)+rx2;
 hh2=ry4-437;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 kk1=(101+o)+rx1;
 kk2=ry4-470;
 hh1=(93+o)+rx1;
 hh2=ry4-477;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D hah =new Point2D.Float(kk1,kk2);
float []hah1={0.5f,1f};
RadialGradientPaint rdctt=new RadialGradientPaint(hah,radius,hah1,red);

if(red1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdctt);
g2.fillOval(hh1,hh2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
kk1=0;
 kk2=kk2+add;
 hh1=0;
 hh2=hh2+add;

}

while(i<=1200){
i+=1200;



	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 kk1=(101+o)-rx1;
 kk2=ry4-500;
hh1=(93+o)-rx1;
 hh2=ry4-507;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 kk1=(101+o)+rx2;
 kk2=ry4-530;
 hh1=(93+o)+rx2;
 hh2=ry4-537;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 kk1=(101+o)+rx1;
 kk2=ry4-570;
 hh1=(93+o)+rx1;
 hh2=ry4-577;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D hah =new Point2D.Float(kk1,kk2);
float []hah1={0.5f,1f};
RadialGradientPaint rdctt=new RadialGradientPaint(hah,radius,hah1,red);

if(red1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdctt);
g2.fillOval(hh1,hh2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
kk1=0;
 kk2=kk2+add;
 hh1=0;
 hh2=hh2+add;

}

while(i<=1200){
i+=1200;

	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 kk1=(101+o)-rx1;
 kk2=ry4-600;
hh1=(93+o)-rx1;
 hh2=ry4-607;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 kk1=(101+o)+rx2;
 kk2=ry4-630;
 hh1=(93+o)+rx2;
 hh2=ry4-637;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 kk1=(101+o)+rx1;
 kk2=ry4-670;
 hh1=(93+o)+rx1;
 hh2=ry4-677;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D hah =new Point2D.Float(kk1,kk2);
float []hah1={0.5f,1f};
RadialGradientPaint rdctt=new RadialGradientPaint(hah,radius,hah1,red);

if(red1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdctt);
g2.fillOval(hh1,hh2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
kk1=0;
 kk2=kk2+add;
 hh1=0;
 hh2=hh2+add;

}

while(i<=1200){
i+=1200;

	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 kk1=(101+o)-rx1;
 kk2=ry4-700;
hh1=(93+o)-rx1;
 hh2=ry4-707;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 kk1=(101+o)+rx2;
 kk2=ry4-730;
 hh1=(93+o)+rx2;
 hh2=ry4-737;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 kk1=(101+o)+rx1;
 kk2=ry4-770;
 hh1=(93+o)+rx1;
 hh2=ry4-777;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D hah =new Point2D.Float(kk1,kk2);
float []hah1={0.5f,1f};
RadialGradientPaint rdctt=new RadialGradientPaint(hah,radius,hah1,red);

if(red1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdctt);
g2.fillOval(hh1,hh2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
kk1=0;
 kk2=kk2+add;
 hh1=0;
 hh2=hh2+add;

}

while(i<=1200){
i+=1200;

	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 kk1=(101+o)-rx1;
 kk2=ry4-800;
hh1=(93+o)-rx1;
 hh2=ry4-807;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 kk1=(101+o)+rx2;
 kk2=ry4-830;
 hh1=(93+o)+rx2;
 hh2=ry4-837;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 kk1=(101+o)+rx1;
 kk2=ry4-870;
 hh1=(93+o)+rx1;
 hh2=ry4-877;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D hah =new Point2D.Float(kk1,kk2);
float []hah1={0.5f,1f};
RadialGradientPaint rdctt=new RadialGradientPaint(hah,radius,hah1,red);

if(red1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdctt);
g2.fillOval(hh1,hh2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
kk1=0;
 kk2=kk2+add;
 hh1=0;
 hh2=hh2+add;

}

while(i<=1200){
i+=1200;

	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 kk1=(101+o)-rx1;
 kk2=ry4-900;
hh1=(93+o)-rx1;
 hh2=ry4-907;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 kk1=(101+o)+rx2;
 kk2=ry4-930;
 hh1=(93+o)+rx2;
 hh2=ry4-937;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 kk1=(101+o)+rx1;
 kk2=ry4-970;
 hh1=(93+o)+rx1;
 hh2=ry4-977;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D hah =new Point2D.Float(kk1,kk2);
float []hah1={0.5f,1f};
RadialGradientPaint rdctt=new RadialGradientPaint(hah,radius,hah1,red);

if(red1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdctt);
g2.fillOval(hh1,hh2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
kk1=0;
 kk2=kk2+add;
 hh1=0;
 hh2=hh2+add;

}

while(i<=1200){
i+=1200;

	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 kk1=(101+o)-rx1;
 kk2=ry4-1000;
hh1=(93+o)-rx1;
 hh2=ry4-1007;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 kk1=(101+o)+rx2;
 kk2=ry4-1030;
 hh1=(93+o)+rx2;
 hh2=ry4-1037;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 kk1=(101+o)+rx1;
 kk2=ry4-1070;
 hh1=(93+o)+rx1;
 hh2=ry4-1077;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D hah =new Point2D.Float(kk1,kk2);
float []hah1={0.5f,1f};
RadialGradientPaint rdctt=new RadialGradientPaint(hah,radius,hah1,red);

if(red1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdctt);
g2.fillOval(hh1,hh2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
kk1=0;
 kk2=kk2+add;
 hh1=0;
 hh2=hh2+add;

}


while(i<=1200){
i+=1200;

	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 kk1=(101+o)-rx1;
 kk2=ry4-1100;
hh1=(93+o)-rx1;
 hh2=ry4-1107;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 kk1=(101+o)+rx2;
 kk2=ry4-1130;
 hh1=(93+o)+rx2;
 hh2=ry4-1137;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 kk1=(101+o)+rx1;
 kk2=ry4-1170;
 hh1=(93+o)+rx1;
 hh2=ry4-1177;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D hah =new Point2D.Float(kk1,kk2);
float []hah1={0.5f,1f};
RadialGradientPaint rdctt=new RadialGradientPaint(hah,radius,hah1,red);

if(red1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdctt);
g2.fillOval(hh1,hh2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
kk1=0;
 kk2=kk2+add;
 hh1=0;
 hh2=hh2+add;

}

while(i<=1200){
i+=1200;

	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 kk1=(101+o)-rx1;
 kk2=ry4-1200;
hh1=(93+o)-rx1;
 hh2=ry4-1207;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 kk1=(101+o)+rx2;
 kk2=ry4-1230;
 hh1=(93+o)+rx2;
 hh2=ry4-1237;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 kk1=(101+o)+rx1;
 kk2=ry4-1270;
 hh1=(93+o)+rx1;
 hh2=ry4-1277;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D hah =new Point2D.Float(kk1,kk2);
float []hah1={0.5f,1f};
RadialGradientPaint rdctt=new RadialGradientPaint(hah,radius,hah1,red);

if(red1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdctt);
g2.fillOval(hh1,hh2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
kk1=0;
 kk2=kk2+add;
 hh1=0;
 hh2=hh2+add;

}

while(i<=1200){
i+=1200;

	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 kk1=(101+o)-rx1;
 kk2=ry4-1200;
hh1=(93+o)-rx1;
 hh2=ry4-1207;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 kk1=(101+o)+rx2;
 kk2=ry4-1230;
 hh1=(93+o)+rx2;
 hh2=ry4-1237;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 kk1=(101+o)+rx1;
 kk2=ry4-1270;
 hh1=(93+o)+rx1;
 hh2=ry4-1277;
tx4=false;
tx3=false;
tx2=false;
tx1=true;
	}



Point2D hah =new Point2D.Float(kk1,kk2);
float []hah1={0.5f,1f};
RadialGradientPaint rdctt=new RadialGradientPaint(hah,radius,hah1,red);

if(red1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdctt);
g2.fillOval(hh1,hh2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
kk1=0;
 kk2=kk2+add;
 hh1=0;
 hh2=hh2+add;

}

while(i<=1200){
i+=1200;

	if(tx1==true&&tx2==false&&tx3==false&&tx4==false){
 kk1=(101+o)-rx1;
 kk2=ry4-1300;
hh1=(93+o)-rx1;
 hh2=ry4-1307;
tx1=false;
tx2=true;
tx3=false;
tx4=false;
	}
	else if(tx2==true&&tx3==false&&tx4==false&&tx1==false){
 kk1=(101+o)+rx2;
 kk2=ry4-1330;
 hh1=(93+o)+rx2;
 hh2=ry4-1337;
 tx1=false;
tx2=false;
tx3=false;
tx4=true;
	}

	else if(tx4==true&&tx1==false&&tx2==false&&tx3==false){
 kk1=(101+o)+rx1;
 kk2=ry4-1370;
 hh1=(93+o)+rx1;
 hh2=ry4-1377;
 if(ry4>1350){
 	boval=0;
 }

tx4=false;
tx3=false;
tx2=false;
tx1=true;

	}



Point2D hah =new Point2D.Float(kk1,kk2);
float []hah1={0.5f,1f};
RadialGradientPaint rdctt=new RadialGradientPaint(hah,radius,hah1,red);

if(red1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,red);
	red1=false;
	orange1=true;
}
else if(orange1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,orange);
	pink1=true;
	orange1=false;
}
else if(pink1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,pink);
	pink1=false;
	white1=true;
}
else if(white1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,white);
	white1=false;
	cyan1=true;
}
else if(cyan1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,cyan);
	cyan1=false;
	magenta1=true;
}else if(magenta1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,magenta);
	magenta1=false;
	yellow1=true;
}
else if(yellow1==true){
	rdctt=new RadialGradientPaint(hah,radius,hah1,yellow);
	yellow1=false;
	red1=true;
}
//ovals
g2.setPaint(rdctt);
g2.fillOval(hh1,hh2,16,15);


}
if(i>1200){
	add+=200;
 i=0;
kk1=0;
 kk2=kk2+add;
 hh1=0;
 hh2=hh2+add;

}
}
}
//AlphaComposite acomp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha);
//g2.setComposite(acomp);
//end of faded
//g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC));

}


    }


}