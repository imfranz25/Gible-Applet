import javax.swing.JApplet;
import java.awt.*;
import javax.swing.*;


public class Gible extends JApplet{



   public void paint(Graphics g,int adx,int ady,int yup,int ball,int movy){
Graphics2D g2=(Graphics2D)g;
  	super.paint(g2);

g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
paint1(g2,adx,ady,yup,movy);
//fin
//color
g2.setStroke(new BasicStroke(1));
int xx[]={709,688,667,637,616,585,555,524,493,461,431,400,377,380,386,411,441,462,477,453,431,408,413,416,432,452,465};
int yy[]={202,193,187,180,178,177,177,181,188,198,211,230,250,261,272,264,257,255,255,269,281,297,305,307,305,305,309};
Color f1=new Color(117,145,166);
Color b131=new Color(45,70,92);
GradientPaint rd63=new GradientPaint(564-adx-movy,178-ady+yup,b131,565-adx-movy,205-ady+yup,f1);
g2.setPaint(rd63);
for(int i=0;i<xx.length;i++){
	xx[i]=xx[i]-adx-movy;
	yy[i]=yy[i]-ady+yup;
}
g.fillPolygon(xx,yy,xx.length);
//
Color f2=new Color(54,82,108);
g.setColor(f2);
int xxx[]={633,615,595,584,564,544,523,504,483,452,421,401,379,380,385,408,431,453,478,480};
int yyy[]={226,221,217,215,214,214,214,215,217,224,233,242,252,262,272,265,259,255,256,320};
for(int i=0;i<xxx.length;i++){
	xxx[i]=xxx[i]-adx-movy;
	yyy[i]=yyy[i]-ady+yup;
}
g.fillPolygon(xxx,yyy,xxx.length);

Color f3=new Color(45,70,92);
g.setColor(f3);
int xxxx[]={542,502,472,441,411,380,386,416,442,452,477,450,424,409,412,415,432,452,465};
int yyyy[]={231,231,233,239,248,260,272,262,257,256,255,270,286,297,305,308,304,306,309};
for(int i=0;i<xxxx.length;i++){
	xxxx[i]=xxxx[i]-adx-movy;
	yyyy[i]=yyyy[i]-ady+yup;
}
g.fillPolygon(xxxx,yyyy,xxxx.length);

int bq[]={488,497,512,528,546,565,585,606,626,646,657,662,636,606,616,592,573,544,524,506};
int qb[]={200,195,191,187,185,184,184,185,188,193,196,199,195,191,192,192,192,193,195,198};
Color f4=new Color(180,208,224);
g.setColor(f4);
for(int i=0;i<bq.length;i++){
	bq[i]=bq[i]-adx-movy;
	qb[i]=qb[i]-ady+yup;
}
g.fillPolygon(bq,qb,qb.length);

//outline
g.setColor(Color.black);
int x[]={708,687,667,646,626,606,585,565,543,524,503,483,463,442,421};
int y[]={202,193,187,182,179,177,176,177,178,181,185,191,198,207,218};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<x.length;i++){
	x[i]=x[i]-adx-movy;
	y[i]=y[i]-ady+yup;
}
g.drawPolyline(x,y,x.length);

int x1[]={422,419,401,387,378};
int y1[]={217,219,231,241,250};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<x1.length;i++){
	x1[i]=x1[i]-adx-movy;
	y1[i]=y1[i]-ady+yup;
}
g.drawPolyline(x1,y1,x1.length);

int x2[]={423,417,402,388,379};
int y2[]={216,219,230,240,248};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<x2.length;i++){
	x2[i]=x2[i]-adx-movy;
	y2[i]=y2[i]-ady+yup;
}
g.drawPolyline(x2,y2,x2.length);

int x3[]={424,403,389,380};
int y3[]={217,229,239,247};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<x3.length;i++){
	x3[i]=x3[i]-adx-movy;
	y3[i]=y3[i]-ady+yup;
}
g.drawPolyline(x3,y3,x3.length);

int x4[]={378,379,385,411,422,439};
int y4[]={251,259,272,264,261,258};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<x4.length;i++){
	x4[i]=x4[i]-adx-movy;
	y4[i]=y4[i]-ady+yup;
}
g.drawPolyline(x4,y4,x4.length);

int x5[]={437,452,463,472,476};
int y5[]={258,255,255,255,256};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<x5.length;i++){
	x5[i]=x5[i]-adx-movy;
	y5[i]=y5[i]-ady+yup;
}
g.drawPolyline(x5,y5,x5.length);

int x6[]={437,454,465,473};
int y6[]={259,255,255,255};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<x6.length;i++){
	x6[i]=x6[i]-adx-movy;
	y6[i]=y6[i]-ady+yup;
}
g.drawPolyline(x6,y6,x6.length);

int xb[]={479,470};
int yb[]={255,255};
for(int i=0;i<xb.length;i++){
	xb[i]=xb[i]-adx-movy;
	yb[i]=yb[i]-ady+yup;
}
g.drawPolyline(xb,yb,xb.length);

int x7[]={477,463,442,422,416};
int y7[]={256,263,274,287,292};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<x7.length;i++){
	x7[i]=x7[i]-adx-movy;
	y7[i]=y7[i]-ady+yup;
}
g.drawPolyline(x7,y7,x7.length);

int x8[]={417,408};
int y8[]={291,298};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<x8.length;i++){
	x8[i]=x8[i]-adx-movy;
	y8[i]=y8[i]-ady+yup;
}
g.drawPolyline(x8,y8,x8.length);

int x9[]={418,408};
int y9[]={291,299};
for(int i=0;i<x9.length;i++){
	x9[i]=x9[i]-adx-movy;
	y9[i]=y9[i]-ady+yup;
}
g.drawPolyline(x9,y9,x9.length);


int x10[]={408,416,422,442,452,465};
int y10[]={300,307,305,304,305,309};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<x10.length;i++){
	x10[i]=x10[i]-adx-movy;
	y10[i]=y10[i]-ady+yup;
}
g.drawPolyline(x10,y10,x10.length);

//end of fin

//right hand

//color
int faf[]={872,879,879,879,876,857,867};
int afa[]={313,327,341,349,363,355,328};
Color rh1=new Color(117,145,166);
g2.setColor(rh1);
for(int i=0;i<faf.length;i++){
	faf[i]=faf[i]-adx-movy;
	afa[i]=afa[i]-ady+yup;
}
g.fillPolygon(faf,afa,faf.length);

int brt[]={856,877,893,904,918,921,922,913,927,929,928,919,906,912,913,902,891,868,836,834,832,849};
int trb[]={354,365,376,385,391,393,394,401,410,412,414,419,422,427,429,434,436,447,459,429,409,377};
Color rh2=new Color(117,145,166);
Color b111=new Color(45,70,92);
GradientPaint rd61=new GradientPaint(525-adx-movy,329-ady+yup,b111,525-adx-movy,420-ady+yup,rh2);
g2.setPaint(rd61);
for(int i=0;i<brt.length;i++){
	brt[i]=brt[i]-adx-movy;
	trb[i]=trb[i]-ady+yup;
}
g.fillPolygon(brt,trb,trb.length);

int wew[]={869,873,873,872,870,864,857};
int ewe[]={360,348,345,343,341,337,353};
Color rh3=new Color(54,82,108);
g2.setColor(rh3);
for(int i=0;i<wew.length;i++){
	wew[i]=wew[i]-adx-movy;
	ewe[i]=ewe[i]-ady+yup;
}
g.fillPolygon(wew,ewe,wew.length);

int nn1[]={837,844,848,852,856,860,863,864,865,864,863,861,858,858,855,852,848,840,831,834};
int nn2[]={453,449,447,443,438,430,423,418,412,405,396,390,386,387,383,380,379,395,409,436};
for(int i=0;i<nn1.length;i++){
	nn1[i]=nn1[i]-adx-movy;
	nn2[i]=nn2[i]-ady+yup;
}
g.fillPolygon(nn1,nn2,nn2.length);

int byb[]={835,839,843,846,847,846,844,840,831,832};
int yby[]={433,430,425,420,413,407,402,396,409,421};
Color rh4=new Color(45,70,92);
g2.setColor(rh4);
for(int i=0;i<byb.length;i++){
	byb[i]=byb[i]-adx-movy;
	yby[i]=yby[i]-ady+yup;
}
g.fillPolygon(byb,yby,yby.length);

int yuu[]={863,872,881,889,892,891,888,884,878,870};
int yyu[]={369,371,376,381,385,388,389,388,384,377};
Color rh5=new Color(180,208,224);
g2.setColor(rh5);
for(int i=0;i<yuu.length;i++){
	yuu[i]=yuu[i]-adx-movy;
	yyu[i]=yyu[i]-ady+yup;
}
g.fillPolygon(yuu,yyu,yyu.length);

int ttq[]={906,908,908,908,907,905,902,899,897,901};
int qqt[]={405,407,409,412,415,417,421,418,413,409};
Color rh6=new Color(54,82,108);
g2.setColor(rh6);
for(int i=0;i<ttq.length;i++){
	ttq[i]=ttq[i]-adx-movy;
	qqt[i]=qqt[i]-ady+yup;
}
g.fillPolygon(ttq,qqt,qqt.length);


//outline
g.setColor(Color.black);
int bd[]={871,878,879,879,877,875,857,877,891};
int db[]={310,324,333,345,356,364,353,365,374};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<bd.length;i++){
	bd[i]=bd[i]-adx-movy;
	db[i]=db[i]-ady+yup;
}
g2.drawPolyline(bd,db,db.length);

int ahh[]={888,893,903,920,922,922,919,913,922,927,929,929,920,905,913,913,901,893,881,836};
int hha[]={372,376,384,392,393,395,397,401,405,409,412,414,418,422,427,429,434,435,441,459};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<ahh.length;i++){
	ahh[i]=ahh[i]-adx-movy;
	hha[i]=hha[i]-ady+yup;
}
g2.drawPolyline(ahh,hha,ahh.length);

int bba[]={886,901};
int aab[]={370,382};
for(int i=0;i<bba.length;i++){
	bba[i]=bba[i]-adx-movy;
	aab[i]=aab[i]-ady+yup;
}
g2.drawPolyline(bba,aab,aab.length);

int brb[]={901,918};
int rbr[]={383,391};
for(int i=0;i<brb.length;i++){
	brb[i]=brb[i]-adx-movy;
	rbr[i]=rbr[i]-ady+yup;
}
g2.drawPolyline(brb,rbr,rbr.length);

int bqwe[]={914,928};
int qweb[]={401,410};
for(int i=0;i<bqwe.length;i++){
	bqwe[i]=bqwe[i]-adx-movy;
	qweb[i]=qweb[i]-ady+yup;
}
g2.drawPolyline(bqwe,qweb,qweb.length);

int cas[]={926,906};
int sac[]={416,423};
for(int i=0;i<cas.length;i++){
	cas[i]=cas[i]-adx-movy;
	sac[i]=sac[i]-ady+yup;
}
g2.drawPolyline(cas,sac,sac.length);

int gag[]={893,836};
int aga[]={436,460};
for(int i=0;i<gag.length;i++){
	gag[i]=gag[i]-adx-movy;
	aga[i]=aga[i]-ady+yup;
}
g2.drawPolyline(gag,aga,aga.length);

int bu[]={906,898};
int ub[]={404,412};
for(int i=0;i<bu.length;i++){
	bu[i]=bu[i]-adx-movy;
	ub[i]=ub[i]-ady+yup;
}
g2.drawPolyline(bu,ub,ub.length);

g2.setStroke(new BasicStroke(1));
int att[]={891,898,903,907,909};
int tta[]={416,413,408,402,397};
for(int i=0;i<att.length;i++){
	att[i]=att[i]-adx-movy;
	tta[i]=tta[i]-ady+yup;
}
g2.drawPolyline(att,tta,tta.length);

int att1[]={891,898,903,907,909};
int tta1[]={416,412,408,403,397};
for(int i=0;i<att1.length;i++){
	att1[i]=att1[i]-adx-movy;
	tta1[i]=tta1[i]-ady+yup;
}
g2.drawPolyline(att1,tta1,tta1.length);

int bc[]={897,899,902};
int cb[]={414,418,421};
for(int i=0;i<bc.length;i++){
	bc[i]=bc[i]-adx-movy;
	cb[i]=cb[i]-ady+yup;
}
g2.drawPolyline(bc,cb,cb.length);

int nq[]={898,899,902};
int qn[]={414,418,421};
for(int i=0;i<nq.length;i++){
	nq[i]=nq[i]-adx-movy;
	qn[i]=qn[i]-ady+yup;
}
g2.drawPolyline(nq,qn,qn.length);

//mouth

//color
int r5[]={769,784,800,814,825,828,829,832,835,836,836,836,836,835,832,831,840,848,851,861,863,875,879,881,882,882,880,874,860,842,821,800,776,751,751,730,708,687,671,671,672,676,685,697,710,724,744,757};
int r6[]={543,551,559,561,560,558,558,547,535,520,499,479,459,439,419,410,396,380,371,343,335,293,278,264,251,239,232,232,237,244,255,268,285,301,303,320,340,359,378,396,406,421,444,467,486,505,524,535};
Color mm1=new Color(216,90,99);
Color mm2=new Color(183,33,39);
GradientPaint rd1=new GradientPaint(670-adx-movy,408-ady+yup,mm2,801-adx-movy,558-ady+yup,mm1);
g2.setPaint(rd1);
for(int i=0;i<r5.length;i++){
	r5[i]=r5[i]-adx-movy;
	r6[i]=r6[i]-ady+yup;
}
g.fillPolygon(r5,r6,r6.length);




//outline
g2.setColor(Color.black);
int qq[]={833,835,836,837,837,837,836,834,832};
int rr[]={545,538,529,509,489,470,449,429,414};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<qq.length;i++){
	qq[i]=qq[i]-adx-movy;
	rr[i]=rr[i]-ady+yup;
}
g2.drawPolyline(qq,rr,rr.length);

int a3[]={837,843,852,860,863,874,878,881,882,882};
int a4[]={402,390,371,347,338,298,281,261,250,242};
for(int i=0;i<a3.length;i++){
	a3[i]=a3[i]-adx-movy;
	a4[i]=a4[i]-ady+yup;
}
g2.drawPolyline(a3,a4,a4.length);

int ss[]={833,832,831,831,829,826,820};
int tt[]={543,548,552,553,557,559,560};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<ss.length;i++){
	ss[i]=ss[i]-adx-movy;
	tt[i]=tt[i]-ady+yup;
}
g2.drawPolyline(ss,tt,ss.length);

int uu[]={834,833,832,831,829,826,820};
int vv[]={543,548,552,553,557,559,560};
for(int i=0;i<uu.length;i++){
	uu[i]=uu[i]-adx-movy;
	vv[i]=vv[i]-ady+yup;
}
g2.drawPolyline(uu,vv,uu.length);

int a1[]={832,831,838};
int a2[]={417,410,400};
for(int i=0;i<a1.length;i++){
	a1[i]=a1[i]-adx-movy;
	a2[i]=a2[i]-ady+yup;
}
g2.drawPolyline(a1,a2,a1.length);

int a5[]={832,832,838};
int a6[]={417,410,400};
for(int i=0;i<a5.length;i++){
	a5[i]=a5[i]-adx-movy;
	a6[i]=a6[i]-ady+yup;
}
g2.drawPolyline(a5,a6,a6.length);

int a7[]={883,882,880};
int a8[]={245,235,231};
for(int i=0;i<a7.length;i++){
	a7[i]=a7[i]-adx-movy;
	a8[i]=a8[i]-ady+yup;
}
g2.drawPolyline(a7,a8,a8.length);

int a9[]={883,881,880};
int a0[]={245,235,231};
for(int i=0;i<a9.length;i++){
	a9[i]=a9[i]-adx-movy;
	a0[i]=a0[i]-ady+yup;
}
g2.drawPolyline(a9,a0,a0.length);

//teeth

//color
//teeth1
int s5[]={734,740,745,748,750,751,751,741};
int s6[]={317,323,329,334,329,311,304,311};
Color ttt2=new Color(170,164,149);
g2.setColor(ttt2);
for(int i=0;i<s5.length;i++){
	s5[i]=s5[i]-adx-movy;
	s6[i]=s6[i]-ady+yup;
}
g.fillPolygon(s5,s6,s6.length);

int s7[]={750,741,751};
int s8[]={325,311,312};
Color ttt1=new Color(249,245,232);
g2.setColor(ttt1);
for(int i=0;i<s7.length;i++){
	s7[i]=s7[i]-adx-movy;
	s8[i]=s8[i]-ady+yup;
}
g.fillPolygon(s7,s8,s8.length);


//teeth2
int n3[]={776,772,766,793,792,789,785,780};
int n4[]={324,311,292,274,292,305,315,322};
Color ttt3=new Color(170,164,149);
g2.setColor(ttt3);
for(int i=0;i<n3.length;i++){
	n3[i]=n3[i]-adx-movy;
	n4[i]=n4[i]-ady+yup;
}
g2.fillPolygon(n3,n4,n4.length);

int n5[]={782,781,780,786,793,793,790,787};
int n6[]={318,298,289,284,285,286,302,312};
Color ttt4=new Color(249,245,232);
g2.setColor(ttt4);
for(int i=0;i<n5.length;i++){
	n5[i]=n5[i]-adx-movy;
	n6[i]=n6[i]-ady+yup;
}
g.fillPolygon(n5,n6,n5.length);

//teeth 3

int k1[]={857,861,865,868,870,872,873,873,871,871,868,863,860};
int k2[]={322,309,301,296,295,296,311,319,330,339,345,337,330};
Color ttt5=new Color(249,245,232);
g2.setColor(ttt5);
for(int i=0;i<k1.length;i++){
	k1[i]=k1[i]-adx-movy;
	k2[i]=k2[i]-ady+yup;
}
g.fillPolygon(k1,k2,k1.length);

int k3[]={858,860,867,869,870,871,871,871,869,866,862,859};
int k4[]={319,324,333,327,322,322,315,310,305,300,306,315};
Color ttt6=new Color(170,164,149);
g2.setColor(ttt6);
for(int i=0;i<k3.length;i++){
	k3[i]=k3[i]-adx-movy;
	k4[i]=k4[i]-ady+yup;
}
g2.fillPolygon(k3,k4,k3.length);
//teeth 4
int w3[]={847,850,853,857,858,858,857,856,853,849,847};
int w4[]={359,349,342,339,342,353,366,370,371,365,362};
Color ttt7=new Color(249,245,232);
g2.setColor(ttt7);
for(int i=0;i<w3.length;i++){
	w3[i]=w3[i]-adx-movy;
	w4[i]=w4[i]-ady+yup;
}
g2.fillPolygon(w3,w4,w4.length);

int w5[]={847,854,855,855,854,854,850};
int w6[]={357,364,359,353,346,341,348};
Color ttt8=new Color(170,164,149);
g2.setColor(ttt8);
for(int i=0;i<w5.length;i++){
	w5[i]=w5[i]-adx-movy;
	w6[i]=w6[i]-ady+yup;
}
g.fillPolygon(w5,w6,w6.length);

int w7[]={854,850};
int w8[]={348,358};
g2.setColor(Color.black);
g2.setStroke(new BasicStroke(1));
for(int i=0;i<w7.length;i++){
	w7[i]=w7[i]-adx-movy;
	w8[i]=w8[i]-ady+yup;
}
g.drawPolyline(w7,w8,w8.length);

int w9[]={854,851};
int w0[]={351,360};
for(int i=0;i<w9.length;i++){
	w9[i]=w9[i]-adx-movy;
	w0[i]=w0[i]-ady+yup;
}
g.drawPolyline(w9,w0,w0.length);

int gf[]={855,852};
int fg[]={355,361};
for(int i=0;i<gf.length;i++){
	gf[i]=gf[i]-adx-movy;
	fg[i]=fg[i]-ady+yup;
}
g.drawPolyline(gf,fg,fg.length);

int br[]={855,853};
int rb[]={358,362};
for(int i=0;i<br.length;i++){
	br[i]=br[i]-adx-movy;
	rb[i]=rb[i]-ady+yup;
}
g.drawPolyline(br,rb,rb.length);

//outline
//teeth 1
g2.setColor(Color.black);
int s3[]={734,740,745,748,750,751,751,741};
int s4[]={317,323,329,334,329,311,304,311};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<s3.length;i++){
	s3[i]=s3[i]-adx-movy;
	s4[i]=s4[i]-ady+yup;
}
g.drawPolyline(s3,s4,s4.length);

int s9[]={741,745};
int s0[]={315,312};
g2.setStroke(new BasicStroke(1));
for(int i=0;i<s9.length;i++){
	s9[i]=s9[i]-adx-movy;
	s0[i]=s0[i]-ady+yup;
}
g.drawPolyline(s9,s0,s0.length);

int i1[]={742,744};
int i2[]={316,314};
for(int i=0;i<i1.length;i++){
	i1[i]=i1[i]-adx-movy;
	i2[i]=i2[i]-ady+yup;
}
g.drawPolyline(i1,i2,i2.length);

int i3[]={742,745};
int i4[]={318,316};
for(int i=0;i<i3.length;i++){
	i3[i]=i3[i]-adx-movy;
	i4[i]=i4[i]-ady+yup;
}
g.drawPolyline(i3,i4,i4.length);

int i5[]={743,746};
int i6[]={320,317};
for(int i=0;i<i5.length;i++){
	i5[i]=i5[i]-adx-movy;
	i6[i]=i6[i]-ady+yup;
}
g.drawPolyline(i5,i6,i6.length);

int i7[]={744,747};
int i8[]={321,319};
for(int i=0;i<i7.length;i++){
	i7[i]=i7[i]-adx-movy;
	i8[i]=i8[i]-ady+yup;
}
g.drawPolyline(i7,i8,i8.length);

//teeth2

int d1[]={792,792,790,786,782};
int d2[]={274,289,299,312,320};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<d1.length;i++){
	d1[i]=d1[i]-adx-movy;
	d2[i]=d2[i]-ady+yup;
}
g.drawPolyline(d1,d2,d2.length);

int d3[]={789,784,778,775,772,770,766};
int d4[]={307,317,325,318,310,301,292};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<d3.length;i++){
	d3[i]=d3[i]-adx-movy;
	d4[i]=d4[i]-ady+yup;
}
g.drawPolyline(d3,d4,d4.length);

int d5[]={776,771,766,765};
int d6[]={320,308,296,293};
for(int i=0;i<d5.length;i++){
	d5[i]=d5[i]-adx-movy;
	d6[i]=d6[i]-ady+yup;
}
g.drawPolyline(d5,d6,d6.length);

int d7[]={775,768};
int d8[]={316,298};
for(int i=0;i<d7.length;i++){
	d7[i]=d7[i]-adx-movy;
	d8[i]=d8[i]-ady+yup;
}
g.drawPolyline(d7,d8,d8.length);

int d9[]={783,777};
int d0[]={318,326};
for(int i=0;i<d9.length;i++){
	d9[i]=d9[i]-adx-movy;
	d0[i]=d0[i]-ady+yup;
}
g.drawPolyline(d9,d0,d0.length);

int n1[]={776,774};
int n2[]={325,316};
for(int i=0;i<n1.length;i++){
	n1[i]=n1[i]-adx-movy;
	n2[i]=n2[i]-ady+yup;
}
g.drawPolyline(n1,n2,n2.length);

int n7[]={774,784};
int n8[]={293,286};
g2.setStroke(new BasicStroke(1));
for(int i=0;i<n7.length;i++){
	n7[i]=n7[i]-adx-movy;
	n8[i]=n8[i]-ady+yup;
}
g.drawPolyline(n7,n8,n8.length);

int n9[]={774,782};
int n0[]={295,289};
for(int i=0;i<n9.length;i++){
	n9[i]=n9[i]-adx-movy;
	n0[i]=n0[i]-ady+yup;
}
g.drawPolyline(n9,n0,n0.length);

int z1[]={774,781};
int z2[]={297,290};
for(int i=0;i<z1.length;i++){
	z1[i]=z1[i]-adx-movy;
	z2[i]=z2[i]-ady+yup;
}
g.drawPolyline(z1,z2,z1.length);

int z3[]={775,780};
int z4[]={300,293};
for(int i=0;i<z3.length;i++){
	z3[i]=z3[i]-adx-movy;
	z4[i]=z4[i]-ady+yup;
}
g.drawPolyline(z3,z4,z4.length);

int z5[]={776,779};
int z6[]={302,297};
for(int i=0;i<z5.length;i++){
	z5[i]=z5[i]-adx-movy;
	z6[i]=z6[i]-ady+yup;
}
g.drawPolyline(z5,z6,z5.length);

int z7[]={777,779};
int z8[]={304,301};
for(int i=0;i<z7.length;i++){
	z7[i]=z7[i]-adx-movy;
	z8[i]=z8[i]-ady+yup;
}
g.drawPolyline(z7,z8,z8.length);

int z9[]={777,780};
int z0[]={306,304};
for(int i=0;i<z9.length;i++){
	z9[i]=z9[i]-adx-movy;
	z0[i]=z0[i]-ady+yup;
}
g.drawPolyline(z9,z0,z9.length);

int j1[]={778,781};
int j2[]={308,307};
for(int i=0;i<j1.length;i++){
	j1[i]=j1[i]-adx-movy;
	j2[i]=j2[i]-ady+yup;
}
g.drawPolyline(j1,j2,j2.length);
//teeth 3
int j3[]={858,860,863,866};
int j4[]={321,311,304,299};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<j3.length;i++){
	j3[i]=j3[i]-adx-movy;
	j4[i]=j4[i]-ady+yup;
}
g.drawPolyline(j3,j4,j4.length);

int j5[]={871,872,873,874,873};
int j6[]={339,329,320,310,300};
for(int i=0;i<j5.length;i++){
	j5[i]=j5[i]-adx-movy;
	j6[i]=j6[i]-ady+yup;
}
g.drawPolyline(j5,j6,j6.length);

int j7[]={859,857,862,866,868,869,870,872};
int j8[]={318,325,333,345,345,344,342,336};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<j7.length;i++){
	j7[i]=j7[i]-adx-movy;
	j8[i]=j8[i]-ady+yup;
}
g.drawPolyline(j7,j8,j8.length);

int j9[]={873,872,870,868,863};
int j0[]={303,296,294,295,302};
for(int i=0;i<j9.length;i++){
	j9[i]=j9[i]-adx-movy;
	j0[i]=j0[i]-ady+yup;
}
g.drawPolyline(j9,j0,j0.length);

int k6[]={867,861};
int k7[]={304,320};
g2.setStroke(new BasicStroke(1));
for(int i=0;i<k6.length;i++){
	k6[i]=k6[i]-adx-movy;
	k7[i]=k7[i]-ady+yup;
}
g.drawPolyline(k6,k7,k7.length);

int k8[]={868,862};
int k9[]={306,322};
for(int i=0;i<k8.length;i++){
	k8[i]=k8[i]-adx-movy;
	k9[i]=k9[i]-ady+yup;
}
g.drawPolyline(k8,k9,k9.length);

int k5[]={869,863};
int k0[]={308,324};
for(int i=0;i<k5.length;i++){
	k5[i]=k5[i]-adx-movy;
	k0[i]=k0[i]-ady+yup;
}
g.drawPolyline(k5,k0,k0.length);

int l1[]={869,865};
int l2[]={311,326};
for(int i=0;i<l1.length;i++){
	l1[i]=l1[i]-adx-movy;
	l2[i]=l2[i]-ady+yup;
}
g.drawPolyline(l1,l2,l2.length);

int l3[]={869,867};
int l4[]={314,328};
for(int i=0;i<l3.length;i++){
	l3[i]=l3[i]-adx-movy;
	l4[i]=l4[i]-ady+yup;
}
g.drawPolyline(l3,l4,l4.length);

//teeth 4
int l5[]={847,849,853};
int l6[]={359,352,342};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<l5.length;i++){
	l5[i]=l5[i]-adx-movy;
	l6[i]=l6[i]-ady+yup;
}
g.drawPolyline(l5,l6,l6.length);

int l7[]={859,858};
int l8[]={344,359};
for(int i=0;i<l7.length;i++){
	l7[i]=l7[i]-adx-movy;
	l8[i]=l8[i]-ady+yup;
}
g.drawPolyline(l7,l8,l8.length);

int l9[]={847,846,847,854,855,857,858};
int l0[]={356,362,364,371,372,370,355};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<l9.length;i++){
	l9[i]=l9[i]-adx-movy;
	l0[i]=l0[i]-ady+yup;
}
g.drawPolyline(l9,l0,l0.length);

int e1[]={858,859,858,855,853,850};
int e2[]={351,341,338,338,339,348};
for(int i=0;i<e1.length;i++){
	e1[i]=e1[i]-adx-movy;
	e2[i]=e2[i]-ady+yup;
}
g.drawPolyline(e1,e2,e2.length);

int e11[]={854,851};
int e22[]={340,349};
for(int i=0;i<e11.length;i++){
	e11[i]=e11[i]-adx-movy;
	e22[i]=e22[i]-ady+yup;
}
g.drawPolyline(e11,e22,e22.length);

int nbn[]={857,852};
int bnb[]={339,343};
for(int i=0;i<nbn.length;i++){
	nbn[i]=nbn[i]-adx-movy;
	bnb[i]=bnb[i]-ady+yup;
}
g.drawPolyline(nbn,bnb,nbn.length);

int w1[]={848,847};
int w2[]={358,364};
for(int i=0;i<w1.length;i++){
	w1[i]=w1[i]-adx-movy;
	w2[i]=w2[i]-ady+yup;
}
g.drawPolyline(w1,w2,w2.length);

//right foot

//color
int u7[]={785,769,749,731,731,737,750,764,774,782,785,786,784,778,770,757,772,779};
int u8[]={575,577,578,577,578,609,614,618,620,619,618,618,613,605,598,589,584,581};
Color ff1=new Color(117,145,166);
g2.setColor(ff1);
for(int i=0;i<u7.length;i++){
	u7[i]=u7[i]-adx-movy;
	u8[i]=u8[i]-ady+yup;
}
g.fillPolygon(u7,u8,u7.length);

int u9[]={763,758,753,749,739,736,737,741,743,744,744,728,702,705,706,707,705,715,731,747};
int u0[]={617,609,601,597,590,589,589,587,585,583,579,578,575,580,580,583,588,598,607,613};
Color ff2=new Color(45,70,92);
g2.setColor(ff2);
for(int i=0;i<u9.length;i++){
	u9[i]=u9[i]-adx-movy;
	u0[i]=u0[i]-ady+yup;
}
g.fillPolygon(u9,u0,u0.length);

//outline
g2.setColor(Color.black);
int v1[]={728,740,760,771,779,781,775};
int v2[]={605,610,617,619,619,619,612};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<v1.length;i++){
	v1[i]=v1[i]-adx-movy;
	v2[i]=v2[i]-ady+yup;
}
g2.drawPolyline(v1,v2,v2.length);

int v3[]={730,715,707,706,708,706,703,702};
int v4[]={606,597,591,588,584,580,578,576};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<v3.length;i++){
	v3[i]=v3[i]-adx-movy;
	v4[i]=v4[i]-ady+yup;
}
g2.drawPolyline(v3,v4,v4.length);

int v6[]={729,711};
int v7[]={606,595};
for(int i=0;i<v6.length;i++){
	v6[i]=v6[i]-adx-movy;
	v7[i]=v7[i]-ady+yup;
}
g2.drawPolyline(v6,v7,v7.length);

int v8[]={774,768,775};
int v9[]={609,605,615};
for(int i=0;i<v8.length;i++){
	v8[i]=v8[i]-adx-movy;
	v9[i]=v9[i]-ady+yup;
}
g2.fillPolygon(v8,v9,v9.length);

int v5[]={776,784,786,784,777,769,758};
int v0[]={620,619,617,613,604,596,589};
for(int i=0;i<v5.length;i++){
	v5[i]=v5[i]-adx-movy;
	v0[i]=v0[i]-ady+yup;
}
g2.drawPolyline(v5,v0,v0.length);

int u1[]={776,784,786,784,777,769,758};
int u2[]={620,619,617,613,605,597,589};
for(int i=0;i<u1.length;i++){
	u1[i]=u1[i]-adx-movy;
	u2[i]=u2[i]-ady+yup;
}
g2.drawPolyline(u1,u2,u2.length);

int u3[]={729,736,737,743,752,763,772,780,787};
int u4[]={585,589,589,590,590,588,584,580,574};
for(int i=0;i<u3.length;i++){
	u3[i]=u3[i]-adx-movy;
	u4[i]=u4[i]-ady+yup;
}
g2.drawPolyline(u3,u4,u4.length);

int u5[]={729,740,749,755,760,761,769};
int u6[]={585,591,591,591,589,589,586};
for(int i=0;i<u5.length;i++){
	u5[i]=u5[i]-adx-movy;
	u6[i]=u6[i]-ady+yup;
}
g2.drawPolyline(u5,u6,u6.length);

//tongue

//color
int s1[]={769,779,788,794,800,803,806,805,801,793,780,768,756,740,726,710,694,678,671,671,677,681,693,709,730,748};
int s2[]={542,532,520,509,491,479,461,440,420,400,380,367,356,347,341,338,353,370,378,405,423,437,462,487,511,528};
Color tt1=new Color(203,102,74);
Color tt2=new Color(160,44,27);
GradientPaint rd2=new GradientPaint(678-adx-movy,431-ady+yup,tt2,771-adx-movy,419-ady+yup,tt1);
g2.setPaint(rd2);
for(int i=0;i<s1.length;i++){
	s1[i]=s1[i]-adx-movy;
	s2[i]=s2[i]-ady+yup;
}
g.fillPolygon(s1,s2,s2.length);

//outline
g2.setColor(Color.black);
int q1[]={788,794,798,803,805,806,806,805,803,801,797,793,787,780,772,761,750,739,729,719};
int q2[]={519,509,499,480,470,460,449,440,430,421,410,400,389,380,370,360,352,346,342,339};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<q1.length;i++){
	q1[i]=q1[i]-adx-movy;
	q2[i]=q2[i]-ady+yup;
}
g2.drawPolyline(q1,q2,q1.length);

int q3[]={790,786,781,773,769};
int q4[]={515,523,530,539,541};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<q3.length;i++){
	q3[i]=q3[i]-adx-movy;
	q4[i]=q4[i]-ady+yup;
}
g2.drawPolyline(q3,q4,q4.length);

int q5[]={789,785,780,773,769};
int q6[]={516,523,530,539,541};
for(int i=0;i<q5.length;i++){
	q5[i]=q5[i]-adx-movy;
	q6[i]=q6[i]-ady+yup;
}
g2.drawPolyline(q5,q6,q6.length);

int q7[]={721,710};
int q8[]={340,338};
for(int i=0;i<q7.length;i++){
	q7[i]=q7[i]-adx-movy;
	q8[i]=q8[i]-ady+yup;
}
g2.drawPolyline(q7,q8,q8.length);

int q9[]={723,711};
int q0[]={340,338};
for(int i=0;i<q9.length;i++){
	q9[i]=q9[i]-adx-movy;
	q0[i]=q0[i]-ady+yup;
}
g2.drawPolyline(q9,q0,q0.length);

//chin

//color
int r1[]={750,769,790,812,822,807,790,775,756,739,720,704,692,683,676,672,669,666,663,658,662,667,668,667,662,654,638,655,677,697,719,736};
int r2[]={578,577,573,566,561,560,554,547,533,519,499,478,459,440,421,402,420,440,453,472,482,495,507,518,530,544,558,564,571,575,578,579};
Color c1=new Color(187,52,33);
g2.setColor(c1);
for(int i=0;i<r1.length;i++){
	r1[i]=r1[i]-adx-movy;
	r2[i]=r2[i]-ady+yup;
}
g2.fillPolygon(r1,r2,r2.length);

int r3[]={768,749,729,709,694,682,683,682,679,673,662,666,668,667,663,654,638,652,670,687,706,723,744,756};
int r4[]={577,574,568,561,550,537,520,510,500,489,478,492,503,518,531,544,558,563,568,573,576,578,579,579};
Color c2=new Color(137,11,4);
g2.setColor(c2);
for(int i=0;i<r3.length;i++){
	r3[i]=r3[i]-adx-movy;
	r4[i]=r4[i]-ady+yup;
}
g2.fillPolygon(r3,r4,r4.length);

//outline
g2.setColor(Color.black);
int xww[]={672,676,678,687,698,708,719,729,740,752};
int yww[]={402,420,430,450,470,485,499,510,521,531};
g2.setStroke(new BasicStroke(4));
for(int i=0;i<xww.length;i++){
	xww[i]=xww[i]-adx-movy;
	yww[i]=yww[i]-ady+yup;
}
g.drawPolyline(xww,yww,xww.length);

int xz[]={749,760,770,783,791};
int yz[]={529,537,544,551,555};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<xz.length;i++){
	xz[i]=xz[i]-adx-movy;
	yz[i]=yz[i]-ady+yup;
}
g.drawPolyline(xz,yz,xz.length);

int xzz[]={789,801,811,821};
int yzz[]={554,559,560,561};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<xzz.length;i++){
	xzz[i]=xzz[i]-adx-movy;
	yzz[i]=yzz[i]-ady+yup;
}
g.drawPolyline(xzz,yzz,xzz.length);

int xzzz[]={789,801,811,821};
int yzzz[]={555,559,560,561};
for(int i=0;i<xzzz.length;i++){
	xzzz[i]=xzzz[i]-adx-movy;
	yzzz[i]=yzzz[i]-ady+yup;
}
g.drawPolyline(xzzz,yzzz,xzzz.length);

int xaaa[]={657,677,698,718,739,770,790};
int yaaa[]={565,571,575,578,579,577,573};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<xaaa.length;i++){
	xaaa[i]=xaaa[i]-adx-movy;
	yaaa[i]=yaaa[i]-ady+yup;
}
g.drawPolyline(xaaa,yaaa,xaaa.length);

int xbbb[]={785,801,823};
int ybbb[]={574,570,561};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<xbbb.length;i++){
	xbbb[i]=xbbb[i]-adx-movy;
	ybbb[i]=ybbb[i]-ady+yup;
}
g.drawPolyline(xbbb,ybbb,xbbb.length);

int xccc[]={787,801,823};
int yccc[]={574,570,561};
for(int i=0;i<xccc.length;i++){
	xccc[i]=xccc[i]-adx-movy;
	yccc[i]=yccc[i]-ady+yup;
}
g.drawPolyline(xccc,yccc,xccc.length);

int xddd[]={659,638};
int yddd[]={565,558};
for(int i=0;i<xddd.length;i++){
	xddd[i]=xddd[i]-adx-movy;
	yddd[i]=yddd[i]-ady+yup;
}
g.drawPolyline(xddd,yddd,xddd.length);

int xeee[]={659,638};
int yeee[]={566,558};
for(int i=0;i<xeee.length;i++){
	xeee[i]=xeee[i]-adx-movy;
	yeee[i]=yeee[i]-ady+yup;
}
g.drawPolyline(xeee,yeee,xeee.length);

//tail

//color
int kk[]={393,372,360,363,371,381,392,405,421,435,452,472,493,510,519,523,525,521,514,509,508,507,506};
int ll[]={397,391,387,400,420,438,454,469,484,494,506,517,525,531,532,529,527,516,497,480,468,456,446};
Color t1=new Color(117,145,166);
g2.setColor(t1);
for(int i=0;i<kk.length;i++){
	kk[i]=kk[i]-adx-movy;
	ll[i]=ll[i]-ady+yup;
}
g.fillPolygon(kk,ll,kk.length);

int mm[]={519,497,478,469,442,421,401,391,384,382,384,386,391,409,507,507,509,513,520,526,523};
int nn[]={533,527,518,497,482,466,445,431,419,410,407,406,407,412,445,463,479,496,515,526,529};
Color t2=new Color(54,82,108);
g2.setColor(t2);
for(int i=0;i<mm.length;i++){
	mm[i]=mm[i]-adx-movy;
	nn[i]=nn[i]-ady+yup;
}
g.fillPolygon(mm,nn,mm.length);

int oo[]={518,497,491,483,481,462,440,422,412,409,410,411,416,434,463,491,507,507,509,509,514,522,526,523};
int pp[]={532,526,508,489,480,472,460,448,438,431,430,429,428,427,436,443,446,463,478,479,498,519,526,528};
Color t3=new Color(45,70,92);
g2.setColor(t3);
for(int i=0;i<oo.length;i++){
	oo[i]=oo[i]-adx-movy;
	pp[i]=pp[i]-ady+yup;
}
g.fillPolygon(oo,pp,pp.length);


//outline
g2.setColor(Color.black);
int s[]={367,377,390,401,417,432,447,473,495,505};
int t[]={410,430,450,463,479,492,503,518,526,530};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<s.length;i++){
	s[i]=s[i]-adx-movy;
	t[i]=t[i]-ady+yup;
}
g.drawPolyline(s,t,s.length);

int u[]={502,513,520};
int v[]={529,532,533};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<u.length;i++){
	u[i]=u[i]-adx-movy;
	v[i]=v[i]-ady+yup;
}
g.drawPolyline(u,v,u.length);

int w[]={502,513,520};
int z[]={529,532,533};
for(int i=0;i<w.length;i++){
	w[i]=w[i]-adx-movy;
	z[i]=z[i]-ady+yup;
}
g.drawPolyline(w,z,z.length);

int aa[]={505,513,520};
int bb[]={530,533,533};
for(int i=0;i<aa.length;i++){
	aa[i]=aa[i]-adx-movy;
	bb[i]=bb[i]-ady+yup;
}
g.drawPolyline(aa,bb,aa.length);

int cc[]={372,362,359,370,381,394};
int dd[]={421,399,387,391,394,397};
for(int i=0;i<cc.length;i++){
	cc[i]=cc[i]-adx-movy;
	dd[i]=dd[i]-ady+yup;
}
g.drawPolyline(cc,dd,cc.length);

int ee[]={372,363,359,370,381,394};
int ff[]={421,399,387,391,394,397};
for(int i=0;i<ee.length;i++){
	ee[i]=ee[i]-adx-movy;
	ff[i]=ff[i]-ady+yup;
}
g.drawPolyline(ee,ff,ee.length);

int ii[]={379,366};
int jj[]={393,389};
for(int i=0;i<ii.length;i++){
	ii[i]=ii[i]-adx-movy;
	jj[i]=jj[i]-ady+yup;
}
g.drawPolyline(ii,jj,ii.length);

int gg[]={377,392};
int hh[]={393,397};
for(int i=0;i<gg.length;i++){
	gg[i]=gg[i]-adx-movy;
	hh[i]=hh[i]-ady+yup;
}
g2.setStroke(new BasicStroke(3));
g.drawPolyline(gg,hh,gg.length);

//body and left leg

//color
Color b114=new Color(63,96,125);
int qw[]={613,637,672,699,733,763,787,821,844,865,873,881,871,857,838,808,780,753,727,708,688,677,671,672,669,666,664,658,664,667,668,668,667,661,651,637,622,599,585,575,559,560,560,557,552,550,547,544,540,538,535,529,527,523,519,518,522,527,519,514,511,514,516,520};
int qww[]={237,224,211,204,200,198,199,204,210,219,224,231,233,238,247,264,281,301,322,339,359,370,378,399,420,441,452,472,485,492,500,509,520,534,547,559,568,577,579,580,579,588,600,608,602,610,616,615,605,608,609,598,582,561,539,532,529,528,512,497,485,469,459,447};
Color b1=new Color(117,145,166);
Color b11=new Color(45,70,92);
GradientPaint rd6=new GradientPaint(703-adx-movy,201-ady+yup,b114,728-adx-movy,238-ady+yup,b1);
g2.setPaint(rd6);
for(int i=0;i<qw.length;i++){
	qw[i]=qw[i]-adx-movy;
	qww[i]=qww[i]-ady+yup;
}
g.fillPolygon(qw,qww,qw.length);

int qw11[]={826,852,869,880,873,854,828,806};
int qww11[]={253,238,234,233,225,214,207,201};
GradientPaint rd67=new GradientPaint(880-adx-movy,230-ady+yup,b1,827-adx-movy,224-ady+yup,b1);
g2.setPaint(rd67);
for(int i=0;i<qw11.length;i++){
	qw11[i]=qw11[i]-adx-movy;
	qww11[i]=qww11[i]-ady+yup;
}
g.fillPolygon(qw11,qww11,qw11.length);

int qwe1[]={535,558,606,628,646,661,667,668,667,663,654,620};
int qwe2[]={461,576,573,565,551,533,517,505,494,482,466,422};
GradientPaint rd671=new GradientPaint(659-adx-movy,535-ady+yup,b114,641-adx-movy,521-ady+yup,b1);
g2.setPaint(rd671);
for(int i=0;i<qwe1.length;i++){
	qwe1[i]=qwe1[i]-adx-movy;
	qwe2[i]=qwe2[i]-ady+yup;
}
g.fillPolygon(qwe1,qwe2,qwe1.length);


int xqwe[]={618,607,592,582,575,570,569,571,576,578,581,587,569,549,529,515,505,506,506,511,514,517,523,525,520,518,519,522,526,529,530,531,534,538,539,545,546,551,552,555,557,561,561,558,575,586,596,607};
int yqwe[]={569,568,559,547,533,510,489,479,459,449,439,425,437,443,446,446,446,459,470,484,498,509,521,527,530,534,541,559,577,593,600,600,609,609,603,616,616,609,602,608,607,598,589,579,580,579,578,573};
Color b2=new Color(54,82,108);
g2.setColor(b2);
for(int i=0;i<xqwe.length;i++){
	xqwe[i]=xqwe[i]-adx-movy;
	yqwe[i]=yqwe[i]-ady+yup;
}
g.fillPolygon(xqwe,yqwe,xqwe.length);

int xre[]={561,554,548,545,542,541,540,540,542,534,528,528,527,523,520,518,521,525,524,517,512,511,513,513,515,520};
int yre[]={441,453,469,482,499,519,539,549,562,555,550,559,573,560,545,532,530,527,523,508,493,483,480,468,459,446};
Color b3=new Color(45,70,92);
g2.setColor(b3);
for(int i=0;i<xre.length;i++){
	xre[i]=xre[i]-adx-movy;
	yre[i]=yre[i]-ady+yup;
}
g.fillPolygon(xre,yre,xre.length);

int xdf[]={511,507,506,506,521,516,514,513};
int ydf[]={484,470,458,446,447,458,469,480};
Color b4=new Color(59,89,123);
g2.setColor(b4);
for(int i=0;i<xdf.length;i++){
	xdf[i]=xdf[i]-adx-movy;
	ydf[i]=ydf[i]-ady+yup;
}
g.fillPolygon(xdf,ydf,xdf.length);

int nt[]={639,647,653,656,657,656,653,647,640,638,636,639,639,638,638,637,636,636,636,636,637};
int tn[]={469,474,482,490,501,512,522,532,540,540,538,528,519,513,509,506,503,489,476,469,468};
Color b5=new Color(180,208,224);
g2.setColor(b5);
for(int i=0;i<nt.length;i++){
	nt[i]=nt[i]-adx-movy;
	tn[i]=tn[i]-ady+yup;
}
g.fillPolygon(nt,tn,tn.length);

int ts[]={709,721,732,746,764,779,795,812,826,839,815,790,738,721,707,708};
int st[]={218,212,210,208,208,207,208,211,214,219,220,220,222,221,220,219};
Color b6=new Color(180,208,224);
g2.setColor(b6);
for(int i=0;i<ts.length;i++){
	ts[i]=ts[i]-adx-movy;
	st[i]=st[i]-ady+yup;
}
g.fillPolygon(ts,st,st.length);

//outline
g.setColor(Color.black);

int bty[]={829,840,845,850,851,851,850,841,833,830};
int ytb[]={225,225,226,228,230,231,232,231,228,226};
for(int i=0;i<bty.length;i++){
	bty[i]=bty[i]-adx-movy;
	ytb[i]=ytb[i]-ady+yup;
}
g.fillPolygon(bty,ytb,ytb.length);

int bre[]={855,858,861,864,866,866,865,863,861,859};
int reb[]={219,219,220,223,226,228,229,229,227,224};
for(int i=0;i<bre.length;i++){
	bre[i]=bre[i]-adx-movy;
	reb[i]=reb[i]-ady+yup;
}
g.fillPolygon(bre,reb,reb.length);

int xp[]={636,657,687,708,739,769,790,811,841,862};
int yp[]={225,216,207,203,199,198,199,202,209,218};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<xp.length;i++){
	xp[i]=xp[i]-adx-movy;
	yp[i]=yp[i]-ady+yup;
}
g.drawPolyline(xp,yp,xp.length);

int xq[]={637,613};
int yq[]={225,236};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<xq.length;i++){
	xq[i]=xq[i]-adx-movy;
	yq[i]=yq[i]-ady+yup;
}
g.drawPolyline(xq,yq,xq.length);

int xr[]={638,611};
int yr[]={223,237};
for(int i=0;i<xr.length;i++){
	xr[i]=xr[i]-adx-movy;
	yr[i]=yr[i]-ady+yup;
}
g.drawPolyline(xr,yr,xr.length);

int xs[]={851,867,873,880};
int ys[]={213,220,224,231};
for(int i=0;i<xs.length;i++){
	xs[i]=xs[i]-adx-movy;
	ys[i]=ys[i]-ady+yup;
}
g.drawPolyline(xs,ys,xs.length);

int xu[]={849,867,874};
int yu[]={213,221,225};
for(int i=0;i<xu.length;i++){
	xu[i]=xu[i]-adx-movy;
	yu[i]=yu[i]-ady+yup;
}
g.drawPolyline(xu,yu,xu.length);

int xv[]={705,728,759,790,811,841,858};
int yv[]={342,321,297,275,261,245,237};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<xv.length;i++){
	xv[i]=xv[i]-adx-movy;
	yv[i]=yv[i]-ady+yup;
}
g.drawPolyline(xv,yv,xv.length);

int xaa[]={851,863,873,880};
int yaa[]={241,235,233,232};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<xaa.length;i++){
	xaa[i]=xaa[i]-adx-movy;
	yaa[i]=yaa[i]-ady+yup;
}
g.drawPolyline(xaa,yaa,xaa.length);

int xbb[]={854,863,873,880};
int ybb[]={238,235,233,232};
for(int i=0;i<xbb.length;i++){
	xbb[i]=xbb[i]-adx-movy;
	ybb[i]=ybb[i]-ady+yup;
}
g.drawPolyline(xbb,ybb,xbb.length);

int xcc[]={710,672,671,668,665,658};
int ycc[]={338,377,408,429,449,473};
for(int i=0;i<xcc.length;i++){
	xcc[i]=xcc[i]-adx-movy;
	ycc[i]=ycc[i]-ady+yup;
}
g.drawPolyline(xcc,ycc,xcc.length);

int xdd[]={711,672};
int ydd[]={336,377};
for(int i=0;i<xdd.length;i++){
	xdd[i]=xdd[i]-adx-movy;
	ydd[i]=ydd[i]-ady+yup;
}
g.drawPolyline(xdd,ydd,xdd.length);

int xee[]={653,662,666,668,668,668,666,662,657,649,637,626,615,596,581};
int yee[]={466,480,490,500,509,515,521,530,539,549,559,566,571,577,579};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<xee.length;i++){
	xee[i]=xee[i]-adx-movy;
	yee[i]=yee[i]-ady+yup;
}
g.drawPolyline(xee,yee,xee.length);

int x54[]={658,663,666,668,668,667,665,660,652,644};
int y54[]={472,482,491,500,508,517,525,535,546,554};
for(int i=0;i<x54.length;i++){
	x54[i]=x54[i]-adx-movy;
	y54[i]=y54[i]-ady+yup;
}
g.drawPolyline(x54,y54,x54.length);

int xff[]={658,641};
int yff[]={470,453};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<xff.length;i++){
	xff[i]=xff[i]-adx-movy;
	yff[i]=yff[i]-ady+yup;
}
g.drawPolyline(xff,yff,xff.length);

int x22[]={754,715};
int y22[]={299,331};
for(int i=0;i<x22.length;i++){
	x22[i]=x22[i]-adx-movy;
	y22[i]=y22[i]-ady+yup;
}
g.drawPolyline(x22,y22,x22.length);

int x33[]={716,754};
int y33[]={333,301};
for(int i=0;i<x33.length;i++){
	x33[i]=x33[i]-adx-movy;
	y33[i]=y33[i]-ady+yup;
}
g.drawPolyline(x33,y33,x33.length);

int x123[]={672,672};
int y123[]={377,397};
for(int i=0;i<x123.length;i++){
	x123[i]=x123[i]-adx-movy;
	y123[i]=y123[i]-ady+yup;
}
g.drawPolyline(x123,y123,x123.length);

int x88[]={657,662};
int y88[]={469,478};
for(int i=0;i<x88.length;i++){
	x88[i]=x88[i]-adx-movy;
	y88[i]=y88[i]-ady+yup;
}
g.drawPolyline(x88,y88,x88.length);

int xgg[]={657,641};
int ygg[]={471,453};
for(int i=0;i<xgg.length;i++){
	xgg[i]=xgg[i]-adx-movy;
	ygg[i]=ygg[i]-ady+yup;
}
g.drawPolyline(xgg,ygg,xgg.length);

int xhh[]={585,565,554};
int yhh[]={579,579,578};
for(int i=0;i<xhh.length;i++){
	xhh[i]=xhh[i]-adx-movy;
	yhh[i]=yhh[i]-ady+yup;
}
g.drawPolyline(xhh,yhh,xhh.length);

int xii[]={585,565,554};
int yii[]={579,579,578};
for(int i=0;i<xii.length;i++){
	xii[i]=xii[i]-adx-movy;
	yii[i]=yii[i]-ady+yup;
}
g.drawPolyline(xii,yii,xii.length);

int xjj[]={558,561,561,558,556,552,553,551,547};
int yjj[]={579,587,598,608,608,601,601,609,617};
for(int i=0;i<xjj.length;i++){
	xjj[i]=xjj[i]-adx-movy;
	yjj[i]=yjj[i]-ady+yup;
}
g.drawPolyline(xjj,yjj,xjj.length);

int xkk[]={552,551};
int ykk[]={602,607};
for(int i=0;i<xkk.length;i++){
	xkk[i]=xkk[i]-adx-movy;
	ykk[i]=ykk[i]-ady+yup;
}
g.drawPolyline(xkk,ykk,xkk.length);

int xll[]={545,541};
int yll[]={616,607};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<xll.length;i++){
	xll[i]=xll[i]-adx-movy;
	yll[i]=yll[i]-ady+yup;
}
g.drawPolyline(xll,yll,xll.length);

int xmm[]={542,539,540,538,535,533};
int ymm[]={610,600,603,608,609,606};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<xmm.length;i++){
	xmm[i]=xmm[i]-adx-movy;
	ymm[i]=ymm[i]-ady+yup;
}
g.drawPolyline(xmm,ymm,xmm.length);

int xnn[]={533,530,527,522,523,521};
int ynn[]={608,599,580,558,559,549};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<xnn.length;i++){
	xnn[i]=xnn[i]-adx-movy;
	ynn[i]=ynn[i]-ady+yup;
}
g.drawPolyline(xnn,ynn,xnn.length);

int xoo[]={521,518,519,523,524,526};
int yoo[]={550,533,531,528,528,527};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<xoo.length;i++){
	xoo[i]=xoo[i]-adx-movy;
	yoo[i]=yoo[i]-ady+yup;
}
g.drawPolyline(xoo,yoo,xoo.length);

int xpp[]={522,518,519,523,524,526};
int ypp[]={551,533,531,528,528,527};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<xpp.length;i++){
	xpp[i]=xpp[i]-adx-movy;
	ypp[i]=ypp[i]-ady+yup;
}
g.drawPolyline(xoo,yoo,xoo.length);

int xqq[]={506,506,507,508,509,514,518};
int yqq[]={445,459,469,480,480,500,511};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<xqq.length;i++){
	xqq[i]=xqq[i]-adx-movy;
	yqq[i]=yqq[i]-ady+yup;
}
g.drawPolyline(xqq,yqq,xqq.length);

int xrr[]={516,514,512,518};
int yrr[]={458,469,490,511};
for(int i=0;i<xrr.length;i++){
	xrr[i]=xrr[i]-adx-movy;
	yrr[i]=yrr[i]-ady+yup;
}
g.drawPolyline(xrr,yrr,xrr.length);

int xss[]={516,524,533};
int yss[]={508,523,540};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<xss.length;i++){
	xss[i]=xss[i]-adx-movy;
	yss[i]=yss[i]-ady+yup;
}
g.drawPolyline(xss,yss,xss.length);

int xtt[]={517,524,533};
int ytt[]={508,523,540};
for(int i=0;i<xtt.length;i++){
	xtt[i]=xtt[i]-adx-movy;
	ytt[i]=ytt[i]-ady+yup;
}
g.drawPolyline(xtt,ytt,xtt.length);

int xw[]={673,668,664};
int yw[]={405,427,452};
for(int i=0;i<xw.length;i++){
	xw[i]=xw[i]-adx-movy;
	yw[i]=yw[i]-ady+yup;
}
g.drawPolyline(xw,yw,xw.length);

int xfff[]={515,521};
int yfff[]={460,447};
for(int i=0;i<xfff.length;i++){
	xfff[i]=xfff[i]-adx-movy;
	yfff[i]=yfff[i]-ady+yup;
}
g.drawPolyline(xfff,yfff,xfff.length);

int xcq[]={675,671};
int ycq[]={412,380};
for(int i=0;i<xcq.length;i++){
	xcq[i]=xcq[i]-adx-movy;
	ycq[i]=ycq[i]-ady+yup;
}
g.drawPolyline(xcq,ycq,xcq.length);

int xga[]={672,671};
int yga[]={412,384};
for(int i=0;i<xga.length;i++){
	xga[i]=xga[i]-adx-movy;
	yga[i]=yga[i]-ady+yup;
}
g.drawPolyline(xga,yga,xga.length);

int xza[]={751,740};
int yza[]={302,310};
for(int i=0;i<xza.length;i++){
	xza[i]=xza[i]-adx-movy;
	yza[i]=yza[i]-ady+yup;
}
g.drawPolyline(xza,yza,xza.length);

int xrq[]={847,866};
int yrq[]={243,235};
for(int i=0;i<xrq.length;i++){
	xrq[i]=xrq[i]-adx-movy;
	yrq[i]=yrq[i]-ady+yup;
}
g.drawPolyline(xrq,yrq,xrq.length);

int xb2[]={863,875,880};
int yb2[]={236,233,233};
for(int i=0;i<xb2.length;i++){
	xb2[i]=xb2[i]-adx-movy;
	yb2[i]=yb2[i]-ady+yup;
}
g.drawPolyline(xb2,yb2,xb2.length);

int xcs[]={714,671};
int ycs[]={332,376};
for(int i=0;i<xcs.length;i++){
	xcs[i]=xcs[i]-adx-movy;
	ycs[i]=ycs[i]-ady+yup;
}
g.drawPolyline(xcs,ycs,xcs.length);

int xcy[]={747,771,800,831,841,852};
int ycy[]={306,288,269,250,245,240};
g2.setStroke(new BasicStroke(4));
for(int i=0;i<xcy.length;i++){
	xcy[i]=xcy[i]-adx-movy;
	ycy[i]=ycy[i]-ady+yup;
}
g.drawPolyline(xcy,ycy,xcy.length);

//eye

//color

int cw[]={587,606,622,677,697,714,698,687,665,637,620,615,604};
int wc[]={317,308,301,292,290,289,283,281,281,281,285,286,289};
Color ee0=new Color(54,82,108);
g2.setColor(ee0);
for(int i=0;i<cw.length;i++){
	cw[i]=cw[i]-adx-movy;
	wc[i]=wc[i]-ady+yup;
}
g.fillPolygon(cw,wc,cw.length);

int ra[]={664,669,671,671,667,660,652,642,631,624,620,619,620,622,623,632,644,654};
int ar[]={281,291,304,316,329,339,345,345,340,330,320,308,297,286,284,282,281,281};
Color ee1=new Color(255,255,255);
g2.setColor(ee1);
for(int i=0;i<ra.length;i++){
	ra[i]=ra[i]-adx-movy;
	ar[i]=ar[i]-ady+yup;
}
g.fillPolygon(ra,ar,ar.length);

int nw[]={620,639,628,622,621};
int wn[]={295,282,283,284,289};
Color ee1d=new Color(171,171,171);
g2.setColor(ee1d);
for(int i=0;i<nw.length;i++){
	nw[i]=nw[i]-adx-movy;
	wn[i]=wn[i]-ady+yup;
}
g.fillPolygon(nw,wn,nw.length);

int r12[]={649,644,637,645,648,649,647,641,635,636,641,647,658,665,670,671,670,667,664,657};
int r21[]={281,281,290,295,300,304,309,313,314,321,329,335,342,335,323,307,295,287,282,281};
Color ee2=new Color(51,23,13);
g2.setColor(ee2);
for(int i=0;i<r12.length;i++){
	r12[i]=r12[i]-adx-movy;
	r21[i]=r21[i]-ady+yup;
}
g.fillPolygon(r12,r21,r12.length);

int fa[]={645,645,646,649,652,655,660,662,662,663,663,661,658,654,645,649,650,649};
int af[]={312,320,320,325,327,327,324,321,316,307,300,295,289,285,293,299,304,309};
Color ee3=new Color(24,9,5);
g2.setColor(ee3);
for(int i=0;i<fa.length;i++){
	fa[i]=fa[i]-adx-movy;
	af[i]=af[i]-ady+yup;
}
g.fillPolygon(fa,af,af.length);

int ga[]={641,645,650,653,656,658,657,656,654,650,646,643,641,643};
int ag[]={293,296,300,300,299,296,292,288,285,283,285,286,289,293};
Color ee4=new Color(192,172,165);
g2.setColor(ee4);
for(int i=0;i<ga.length;i++){
	ga[i]=ga[i]-adx-movy;
	ag[i]=ag[i]-ady+yup;
}
g.fillPolygon(ga,ag,ag.length);

g2.fillOval(657-adx-movy,323-ady+yup,6,6);

//outline
g2.setColor(Color.black);
int ht[]={629,647,667,677,688};
int th[]={283,281,281,281,282};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<ht.length;i++){
	ht[i]=ht[i]-adx-movy;
	th[i]=th[i]-ady+yup;
}
g.drawPolyline(ht,th,th.length);

int vr[]={685,697,705,713};
int rv[]={282,283,285,289};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<vr.length;i++){
	vr[i]=vr[i]-adx-movy;
	rv[i]=rv[i]-ady+yup;
}
g.drawPolyline(vr,rv,vr.length);

int cr[]={632,616,612};
int rc[]={282,286,288};
for(int i=0;i<cr.length;i++){
	cr[i]=cr[i]-adx-movy;
	rc[i]=rc[i]-ady+yup;
}
g.drawPolyline(cr,rc,cr.length);

int nr[]={685,697,705,713};
int rn[]={281,283,285,289};
for(int i=0;i<nr.length;i++){
	nr[i]=nr[i]-adx-movy;
	rn[i]=rn[i]-ady+yup;
}
g.drawPolyline(nr,rn,rn.length);

int bs[]={632,619,612};
int sb[]={283,285,288};
for(int i=0;i<bs.length;i++){
	bs[i]=bs[i]-adx-movy;
	sb[i]=sb[i]-ady+yup;
}
g.drawPolyline(bs,sb,sb.length);

int ca[]={621,619,619,621,622};
int ac[]={320,311,300,290,285};
for(int i=0;i<ca.length;i++){
	ca[i]=ca[i]-adx-movy;
	ac[i]=ac[i]-ady+yup;
}
g.drawPolyline(ca,ac,ac.length);

int vt[]={620,619,620,621,622};
int tv[]={315,311,300,290,285};
for(int i=0;i<vt.length;i++){
	vt[i]=vt[i]-adx-movy;
	tv[i]=tv[i]-ady+yup;
}
g.drawPolyline(vt,tv,vt.length);

int at[]={651,659};
int ta[]={337,341};
for(int i=0;i<at.length;i++){
	at[i]=at[i]-adx-movy;
	ta[i]=ta[i]-ady+yup;
}
g.drawPolyline(at,ta,at.length);

int wr[]={651,659};
int rw[]={338,341};
for(int i=0;i<wr.length;i++){
	wr[i]=wr[i]-adx-movy;
	rw[i]=rw[i]-ady+yup;
}
g.drawPolyline(wr,rw,rw.length);

int cv[]={619,622,622,628,636,642,648,655,662,667,670,671,671,670,668,665};
int vc[]={314,325,326,338,344,346,346,344,338,330,319,309,299,293,287,282};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<cv.length;i++){
	cv[i]=cv[i]-adx-movy;
	vc[i]=vc[i]-ady+yup;
}
g.drawPolyline(cv,vc,vc.length);

int bv[]={620,619,619};
int vb[]={320,307,302};
for(int i=0;i<bv.length;i++){
	bv[i]=bv[i]-adx-movy;
	vb[i]=vb[i]-ady+yup;
}
g.drawPolyline(bv,vb,vb.length);

int sd[]={644,640,636,643,648,649,649,646,641,635,636,640,647,651};
int ds[]={282,285,290,293,299,303,307,310,313,314,319,328,335,337};
for(int i=0;i<sd.length;i++){
	sd[i]=sd[i]-adx-movy;
	ds[i]=ds[i]-ady+yup;
}
g.drawPolyline(sd,ds,sd.length);

//missile

//color
int xt[]={573,593,605,614,617,616,608,591,575,555,535,514,493,475,464,460,460};
int yt[]={335,310,289,269,251,240,228,221,221,225,235,249,268,289,313,331,341};
Color m1=new Color(117,145,166);
g.setColor(m1);
for(int i=0;i<xt.length;i++){
	xt[i]=xt[i]-adx-movy;
	yt[i]=yt[i]-ady+yup;
}
g.fillPolygon(xt,yt,yt.length);

int xc[]={592,571,571,546,522,483,471,463,461,459,486,508,530,551,566,574};
int yc[]={309,313,314,314,308,281,299,315,321,341,334,330,329,331,332,334};
Color m2=new Color(45,70,92);
g.setColor(m2);
for(int i=0;i<xc.length;i++){
	xc[i]=xc[i]-adx-movy;
	yc[i]=yc[i]-ady+yup;
}
g.fillPolygon(xc,yc,yc.length);

int xh[]={583,571,554,541,529,519,505,501,499,500,485,482,481,485,495,496,513,534,554,565,573};
int yh[]={321,325,324,321,315,306,294,286,276,262,277,284,307,319,331,331,329,329,331,332,334};
Color m3=new Color(71,117,145);
g.setColor(m3);
for(int i=0;i<xh.length;i++){
	xh[i]=xh[i]-adx-movy;
	yh[i]=yh[i]-ady+yup;
}
g.fillPolygon(xh,yh,yh.length);

int xi[]={521,508,502,499,498,498,498,517,511,511,515};
int yi[]={309,298,290,280,270,271,263,247,270,288,300};
Color m4=new Color(155,205,223);
g.setColor(m4);
for(int i=0;i<xi.length;i++){
	xi[i]=xi[i]-adx-movy;
	yi[i]=yi[i]-ady+yup;
}
g.fillPolygon(xi,yi,yi.length);

int xj[]={483,475};
int yj[]={309,318};
g2.setStroke(new BasicStroke(3));
Color m0=new Color(139,173,196);
g.setColor(m0);
for(int i=0;i<xj.length;i++){
	xj[i]=xj[i]-adx-movy;
	yj[i]=yj[i]-ady+yup;
}
g.drawPolyline(xj,yj,yj.length);

int xk[]={474,476,470};
int yk[]={318,319,325};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<xk.length;i++){
	xk[i]=xk[i]-adx-movy;
	yk[i]=yk[i]-ady+yup;
}
g.drawPolygon(xk,yk,yk.length);

int xl[]={483,503};
int yl[]={309,290};
g2.setStroke(new BasicStroke(3));
Color m00=new Color(155,195,217);
g.setColor(m00);
for(int i=0;i<xl.length;i++){
	xl[i]=xl[i]-adx-movy;
	yl[i]=yl[i]-ady+yup;
}
g.drawPolyline(xl,yl,yl.length);

int xm[]={503,513};
int ym[]={290,284};
Color m000=new Color(201,233,244);
g.setColor(m000);
for(int i=0;i<xm.length;i++){
	xm[i]=xm[i]-adx-movy;
	ym[i]=ym[i]-ady+yup;
}
g.drawPolyline(xm,ym,ym.length);

g.fillOval(565-adx-movy,240-ady+yup,10,10);

int xn[]={469,480,495,516,532,543,561,542,525,503,484,477};
int yn[]={325,310,295,276,265,258,250,263,275,294,311,319};
Color m0000=new Color(180,208,224);
g.setColor(m0000);
for(int i=0;i<xn.length;i++){
	xn[i]=xn[i]-adx-movy;
	yn[i]=yn[i]-ady+yup;
}
g.fillPolygon(xn,yn,yn.length);
//outline

g2.setColor(Color.black);

int xd[]={517,513,511,511,516,522,534,545};
int yd[]={248,260,269,289,301,310,319,322};
for(int i=0;i<xd.length;i++){
	xd[i]=xd[i]-adx-movy;
	yd[i]=yd[i]-ady+yup;
}
g2.setStroke(new BasicStroke(3));

g.drawPolyline(xd,yd,xd.length);

int xg[]={483,481,482,486,495};
int yg[]={281,289,310,320,331};
for(int i=0;i<xg.length;i++){
	xg[i]=xg[i]-adx-movy;
	yg[i]=yg[i]-ady+yup;
}
g.drawPolyline(xg,yg,xg.length);

int xe[]={543,555,565,581};
int ye[]={321,324,325,323};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<xe.length;i++){
	xe[i]=xe[i]-adx-movy;
	ye[i]=ye[i]-ady+yup;
}
g.drawPolyline(xe,ye,xe.length);

int xf[]={542,556,566,579};
int yf[]={322,325,325,323};
for(int i=0;i<xf.length;i++){
	xf[i]=xf[i]-adx-movy;
	yf[i]=yf[i]-ady+yup;
}
g.drawPolyline(xf,yf,xf.length);

int x11[]={605,595,585,576,565,555,534,514,490,472,465,462,462};
int y11[]={227,222,221,221,223,226,235,248,270,295,310,320,321};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<x11.length;i++){
	x11[i]=x11[i]-adx-movy;
	y11[i]=y11[i]-ady+yup;
}
g.drawPolyline(x11,y11,x11.length);

int xa[]={592,603,611,615,616,616,615,609,604};
int ya[]={222,225,232,240,244,257,263,279,290};
for(int i=0;i<xa.length;i++){
	xa[i]=xa[i]-adx-movy;
	ya[i]=ya[i]-ady+yup;
}
g.drawPolyline(xa,ya,xa.length);

int x12[]={605,592,573};
int y12[]={289,310,334};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<x12.length;i++){
	x12[i]=x12[i]-adx-movy;
	y12[i]=y12[i]-ady+yup;
}
g.drawPolyline(x12,y12,x12.length);

int x13[]={605,593,574};
int y13[]={287,309,332};
for(int i=0;i<x13.length;i++){
	x13[i]=x13[i]-adx-movy;
	y13[i]=y13[i]-ady+yup;
}
g.drawPolyline(x13,y13,x13.length);

int x14[]={606,597,585};
int y14[]={285,301,319};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<x14.length;i++){
	x14[i]=x14[i]-adx-movy;
	y14[i]=y14[i]-ady+yup;
}
g.drawPolyline(x14,y14,x14.length);

int x15[]={462,460,459};
int y15[]={318,331,342};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<x15.length;i++){
	x15[i]=x15[i]-adx-movy;
	y15[i]=y15[i]-ady+yup;
}
g.drawPolyline(x15,y15,x15.length);

int x16[]={463,460,459};
int y16[]={317,329,340};
for(int i=0;i<x16.length;i++){
	x16[i]=x16[i]-adx-movy;
	y16[i]=y16[i]-ady+yup;
}
g.drawPolyline(x16,y16,x16.length);

int x17[]={463,460};
int y17[]={315,327};
for(int i=0;i<x17.length;i++){
	x17[i]=x17[i]-adx-movy;
	y17[i]=y17[i]-ady+yup;
}
g.drawPolyline(x17,y17,x17.length);

int x18[]={598,584,575};
int y18[]={300,320,331};
for(int i=0;i<x18.length;i++){
	x18[i]=x18[i]-adx-movy;
	y18[i]=y18[i]-ady+yup;
}
g.drawPolyline(x18,y18,x18.length);

//hand left

//color
int j[]={593,573,554,534,513,493,472,452,453,432,425,411,400,392,392,406,405,388,387,401,409,402,401,411,418,418,423,435,453,473,493,510,525,546,566,583,594,597};
int k[]={344,335,331,329,330,333,338,345,345,355,360,364,370,377,379,387,389,400,404,410,413,420,423,429,429,430,429,427,434,441,445,446,448,445,439,430,417,407};
Color h1=new Color(117,145,166);
Color b121=new Color(45,70,92);
GradientPaint rd62=new GradientPaint(519-adx-movy,330-ady+yup,b121,523-adx-movy,360-ady+yup,h1);
g2.setPaint(rd62);
for(int i=0;i<j.length;i++){
	j[i]=j[i]-adx-movy;
	k[i]=k[i]-ady+yup;
}
g.fillPolygon(j,k,j.length);

int q[]={598,598,596,591,581,561,544,525,504,483,472,452,432,421,404,400,404,413,423,432,443,465,486,506,524,544,566,584,593,596};
int r[]={408,404,399,405,411,420,425,429,430,429,428,424,416,419,419,422,426,428,429,427,431,439,444,447,448,445,438,428,419,414};
Color h2=new Color(54,82,108);
g.setColor(h2);
for(int i=0;i<q.length;i++){
	q[i]=q[i]-adx-movy;
	r[i]=r[i]-ady+yup;
}
g.fillPolygon(q,r,r.length);

int cs[]={603,595,585,575,564,555,543,535,528,544,558,574,590,599,605};
int sc[]={363,356,351,347,344,342,341,340,343,345,348,353,360,366,369};
Color h3=new Color(180,208,224);
g.setColor(h3);
for(int i=0;i<cs.length;i++){
	cs[i]=cs[i]-adx-movy;
	sc[i]=sc[i]-ady+yup;
}
g2.fillPolygon(cs,sc,sc.length);

int xtq[]={426,425,425,425,426,428,431,438};
int ytq[]={382,388,393,398,401,404,410,392};
Color h4=new Color(54,82,108);
g.setColor(h4);
for(int i=0;i<xtq.length;i++){
	xtq[i]=xtq[i]-adx-movy;
	ytq[i]=ytq[i]-ady+yup;
}
g2.fillPolygon(xtq,ytq,ytq.length);

//outline
g2.setColor(Color.black);
int xggg[]={447,472,473,493,514,534,534,555,568};
int yggg[]={348,337,337,332,329,328,329,330,333};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<xggg.length;i++){
	xggg[i]=xggg[i]-adx-movy;
	yggg[i]=yggg[i]-ady+yup;
}
g.drawPolyline(xggg,yggg,xggg.length);

int xhhh[]={564,585,591};
int yhhh[]={332,339,342};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<xhhh.length;i++){
	xhhh[i]=xhhh[i]-adx-movy;
	yhhh[i]=yhhh[i]-ady+yup;
}
g.drawPolyline(xhhh,yhhh,xhhh.length);

int xhhh1[]={564,585,591};
int yhhh1[]={331,339,342};
for(int i=0;i<xhhh1.length;i++){
	xhhh1[i]=xhhh1[i]-adx-movy;
	yhhh1[i]=yhhh1[i]-ady+yup;
}
g.drawPolyline(xhhh1,yhhh1,xhhh1.length);

int xiii[]={443,462,483,505,524,541,556,575,585};
int yiii[]={430,438,443,446,447,446,442,434,427};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<xiii.length;i++){
	xiii[i]=xiii[i]-adx-movy;
	yiii[i]=yiii[i]-ady+yup;
}
g.drawPolyline(xiii,yiii,xiii.length);

int xjjj[]={583,593,598};
int yjjj[]={429,419,409};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<xjjj.length;i++){
	xjjj[i]=xjjj[i]-adx-movy;
	yjjj[i]=yjjj[i]-ady+yup;
}
g.drawPolyline(xjjj,yjjj,xjjj.length);

int xkkk[]={584,593,598};
int ykkk[]={429,419,409};
for(int i=0;i<xkkk.length;i++){
	xkkk[i]=xkkk[i]-adx-movy;
	ykkk[i]=ykkk[i]-ady+yup;
}
g.drawPolyline(xkkk,ykkk,xkkk.length);

int xmmm[]={421,427,433,446};
int ymmm[]={428,428,427,431};
for(int i=0;i<xmmm.length;i++){
	xmmm[i]=xmmm[i]-adx-movy;
	ymmm[i]=ymmm[i]-ady+yup;
}
g.drawPolyline(xmmm,ymmm,xmmm.length);

int xnnn[]={421,427,433,445};
int ynnn[]={429,428,427,430};
for(int i=0;i<xnnn.length;i++){
	xnnn[i]=xnnn[i]-adx-movy;
	ynnn[i]=ynnn[i]-ady+yup;
}
g.drawPolyline(xnnn,ynnn,xnnn.length);

int a[]={410,401,401,409,402};
int b[]={428,424,421,413,411};
for(int i=0;i<a.length;i++){
	a[i]=a[i]-adx-movy;
	b[i]=b[i]-ady+yup;
}
g.drawPolyline(a,b,a.length);

int e[]={394,388,387,402,406,395,391,393,401,412,427,442,453};
int f[]={408,404,401,391,387,380,378,375,369,364,359,350,345};
for(int i=0;i<e.length;i++){
	e[i]=e[i]-adx-movy;
	f[i]=f[i]-ady+yup;
}
g.drawPolyline(e,f,e.length);

int h[]={392,388,387,402,406,395,391,393,401,412,427,432,449};
int ill[]={408,404,401,391,387,380,378,375,369,364,359,355,347};
for(int i=0;i<h.length;i++){
	h[i]=h[i]-adx-movy;
	ill[i]=ill[i]-ady+yup;
}
g.drawPolyline(h,ill,ill.length);

int xlll[]={408,413,423};
int ylll[]={427,428,428};
g2.setStroke(new BasicStroke(3));
for(int i=0;i<xlll.length;i++){
	xlll[i]=xlll[i]-adx-movy;
	ylll[i]=ylll[i]-ady+yup;
}
g.drawPolyline(xlll,ylll,xlll.length);

int c[]={406,392};
int d[]={413,407};
for(int i=0;i<c.length;i++){
	c[i]=c[i]-adx-movy;
	d[i]=d[i]-ady+yup;
}
g.drawPolyline(c,d,c.length);

int tqt[]={427,434};
int qtq[]={383,390};
g2.setStroke(new BasicStroke(2));
for(int i=0;i<tqt.length;i++){
	tqt[i]=tqt[i]-adx-movy;
	qtq[i]=qtq[i]-ady+yup;
}
g2.drawPolyline(tqt,qtq,qtq.length);

int bx[]={440,433};
int xxb[]={391,405};
for(int i=0;i<bx.length;i++){
	bx[i]=bx[i]-adx-movy;
	xxb[i]=xxb[i]-ady+yup;
}
g2.drawPolyline(bx,xxb,xxb.length);

int eqq[]={424,437};
int qqe[]={379,394};
g2.setStroke(new BasicStroke(1));
for(int i=0;i<eqq.length;i++){
	eqq[i]=eqq[i]-adx-movy;
	qqe[i]=qqe[i]-ady+yup;
}
g2.drawPolyline(eqq,qqe,qqe.length);

int eqq1[]={423,438};
int qqe1[]={379,394};
for(int i=0;i<eqq1.length;i++){
	eqq1[i]=eqq1[i]-adx-movy;
	qqe1[i]=qqe1[i]-ady+yup;
}
g2.drawPolyline(eqq1,qqe1,qqe1.length);

int x2e[]={437,442};
int y2e[]={397,383};
for(int i=0;i<x2e.length;i++){
	x2e[i]=x2e[i]-adx-movy;
	y2e[i]=y2e[i]-ady+yup;
}
g2.drawPolyline(x2e,y2e,x2e.length);

int x2e1[]={438,442};
int y2e1[]={397,383};
for(int i=0;i<x2e1.length;i++){
	x2e1[i]=x2e1[i]-adx-movy;
	y2e1[i]=y2e1[i]-ady+yup;
}
g2.drawPolyline(x2e1,y2e1,x2e1.length);

int xbz[]={434,430};
int ybz[]={402,411};
for(int i=0;i<xbz.length;i++){
	xbz[i]=xbz[i]-adx-movy;
	ybz[i]=ybz[i]-ady+yup;
}
g2.drawPolyline(xbz,ybz,xbz.length);

int xbz1[]={435,430};
int ybz1[]={402,411};
for(int i=0;i<xbz1.length;i++){
	xbz1[i]=xbz1[i]-adx-movy;
	ybz1[i]=ybz1[i]-ady+yup;
}
g2.drawPolyline(xbz1,ybz1,xbz1.length);



/*
//grid lines
g2.setStroke(new BasicStroke(1));
g.setColor(Color.black);
int line=10;
for(int i=0;i<800;i++){
	g.drawLine(line,0,line,1000);
	g.drawLine(0,line,1400,line);
	line=line+10;
}

*/


   }
   public void paint1(Graphics g3,int adx,int ady,int yup,int movy){
   	Graphics2D g2=(Graphics2D)g3;
   	//rocket fire left

//outline
int xra[]={539,534,530,524,517,511,509,508,507,506,507,508,508,509,510,512,514,518,520,521,521,523,527,531,536,540,545,549,553,557,560,561,561,564,567,569,571,572,573,575,576,575,574,572,571,567,563,557,551,545};
int yra[]={595,596,598,602,610,617,622,627,639,646,651,657,666,668,677,678,678,676,676,681,687,693,704,715,723,728,724,715,705,696,688,682,676,676,677,678,671,664,663,654,648,643,636,628,619,613,608,602,597,595};
for(int i=0;i<xra.length;i++){
	xra[i]=xra[i]-adx-movy;
	yra[i]=yra[i]-ady+yup;
}
g2.setColor(Color.blue);
g2.fillPolygon(xra,yra,xra.length);


int xasd[]={539,531,525,519,513,512,512,514,515,518,522,524,526,527,531,534,537,541,546,549,552,556,557,560,562,565,566,567,567,564,561,556,550,543};
int yasd[]={596,599,604,611,622,631,637,639,651,662,660,660,671,678,686,692,698,700,695,688,676,666,659,661,661,651,643,634,626,616,611,604,599,596};
for(int i=0;i<xasd.length;i++){
	xasd[i]=xasd[i]-adx-movy;
	yasd[i]=yasd[i]-ady+yup;
}
g2.setColor(Color.red);
g2.fillPolygon(xasd,yasd,xasd.length);

int xss1[]={540,532,526,521,521,524,527,531,530,533,534,537,541,544,548,549,550,551,551,556,558,560,560,561,556,555,550,545,543};
int yss1[]={597,603,614,627,637,645,644,645,656,659,665,675,679,673,666,659,654,649,644,645,644,636,628,624,616,609,605,600,597};
for(int i=0;i<xss1.length;i++){
	xss1[i]=xss1[i]-adx-movy;
	yss1[i]=yss1[i]-ady+yup;
}
g2.setColor(Color.orange);
g2.fillPolygon(xss1,yss1,yss1.length);

int xtt1[]={540,533,529,527,527,531,533,537,538,540,543,544,545,549,551,553,554,553,553,549,544,542};
int ytt1[]={599,608,617,626,635,634,639,649,656,661,654,647,638,633,637,636,629,621,614,609,603,599};
for(int i=0;i<xtt1.length;i++){
	xtt1[i]=xtt1[i]-adx-movy;
	ytt1[i]=ytt1[i]-ady+yup;
}
g2.setColor(Color.yellow);
g2.fillPolygon(xtt1,ytt1,ytt1.length);

//rocket fire riht

//outline
int xra1[]={539,534,530,524,517,511,509,508,507,506,507,508,508,509,510,512,514,518,520,521,521,523,527,531,536,540,545,549,553,557,560,561,561,564,567,569,571,572,573,575,576,575,574,572,571,567,563,557,551,545};
int yra1[]={595,596,598,602,610,617,622,627,639,646,651,657,666,668,677,678,678,676,676,681,687,693,704,715,723,728,724,715,705,696,688,682,676,676,677,678,671,664,663,654,648,643,636,628,619,613,608,602,597,595};
for(int i=0;i<xra1.length;i++){
	xra1[i]=xra1[i]-adx-movy+200;
	yra1[i]=yra1[i]-ady+yup;
}
g2.setColor(Color.blue);
g2.fillPolygon(xra1,yra,xra.length);


int xasd1[]={539,531,525,519,513,512,512,514,515,518,522,524,526,527,531,534,537,541,546,549,552,556,557,560,562,565,566,567,567,564,561,556,550,543};
int yasd1[]={596,599,604,611,622,631,637,639,651,662,660,660,671,678,686,692,698,700,695,688,676,666,659,661,661,651,643,634,626,616,611,604,599,596};
for(int i=0;i<xasd1.length;i++){
	xasd1[i]=xasd1[i]-adx-movy+200;
	yasd1[i]=yasd1[i]-ady+yup;
}
g2.setColor(Color.red);
g2.fillPolygon(xasd1,yasd1,yasd1.length);

int xss11[]={540,532,526,521,521,524,527,531,530,533,534,537,541,544,548,549,550,551,551,556,558,560,560,561,556,555,550,545,543};
int yss11[]={597,603,614,627,637,645,644,645,656,659,665,675,679,673,666,659,654,649,644,645,644,636,628,624,616,609,605,600,597};
for(int i=0;i<xss11.length;i++){
	xss11[i]=xss11[i]-adx-movy+200;
	yss11[i]=yss11[i]-ady+yup;
}
g2.setColor(Color.orange);
g2.fillPolygon(xss11,yss11,yss11.length);

int xtt11[]={540,533,529,527,527,531,533,537,538,540,543,544,545,549,551,553,554,553,553,549,544,542};
int ytt11[]={599,608,617,626,635,634,639,649,656,661,654,647,638,633,637,636,629,621,614,609,603,599};
for(int i=0;i<xtt11.length;i++){
	xtt11[i]=xtt11[i]-adx-movy+200;
	ytt11[i]=ytt11[i]-ady+yup;
}
g2.setColor(Color.yellow);
g2.fillPolygon(xtt11,ytt11,ytt11.length);










   }




}