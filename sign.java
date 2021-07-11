import javax.swing.*;
import java.awt.*;

public class sign extends JApplet {
boolean dec=false;
int ch=0;
int hc=255;
    public void paint(Graphics g,int xx,int yy) {
int x[]={1240,1185,1197,1205,1210,1213,1210,1204,1199,1197,1198,1199,1206,1221,1227,1225,1225,1225,1222,1222,1217,1210,1206,1201,1198,1198,1203,1208,1213,1213,1216,1218,1218,1220,1221,1223,1226,1229,1230,1228,1232,1240,1244,1244,1240,1235,1232,1236,1247};
int y[]={444,445,440,435,427,420,415,415,418,424,429,435,442,460,469,466,471,472,474,475,478,477,475,471,466,461,454,443,441,444,444,441,444,441,445,442,447,442,443,445,445,455,464,468,469,468,462,457,443};
g.setColor(Color.cyan);
for(int i=0;i<x.length;i++){
	x[i]=x[i]-xx;
	y[i]=y[i]+yy;
}
g.drawPolyline(x,y,x.length);

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

Font f=new Font("Times New Roman",Font.BOLD,25);
g.setFont(f);
g.drawString("Francis C. Ong",920,490);
g.drawString("BSIT - 2B",950,520);
Color gg=new Color(ch,25,hc);
g.setColor(gg);
Font f1=new Font("Times New Roman",Font.PLAIN,100);
g.setFont(f1);
g.drawString("GIBLE",850,420);
    }


}