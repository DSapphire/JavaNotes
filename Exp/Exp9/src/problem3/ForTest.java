/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem3;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
/**
 *
 * @author Duan
 */
public class ForTest extends JFrame{
    static final int WIDTH=300;
    static final int HEIGHT=200;
    public ForTest(){
        this.setSize(WIDTH,HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void paint(Graphics g){
//        this.setSize(600, 400);
//        super.paint(g); 
//        Graphics2D g2d=(Graphics2D)g; 
//        g2d.setPaint(new GradientPaint(0,0,Color.BLUE,180,45,Color.GREEN));                                    
//        g2d.drawString("Hello, Hebble ",25,25); 
//        g2d.drawLine(25,45,55,65);
//        g2d.drawRect(45,45,200,200);
//        int[] xPoints={40,150,150,40,20};
//        int[] yPoints={50,50,170,170,100};
//        g2d.drawPolygon(xPoints, yPoints,5);
//        int[] xPoints1={40,150,150,40,20,40};
//        int[] yPoints1={250,250,370,370,300,250};
//        g2d.drawPolyline(xPoints1, yPoints1,6);
//        
//        g2d.drawArc(400,300,100,100,0,180);
//        g2d.fillArc(200,300, 80, 80,0,180);
        super.paint(g);
        //g.drawString("Hello, Hebble!",25,25);
        
        g.setFont( new Font( "SansSerif", Font.BOLD, 12 ) );    
        g.setColor(Color.blue);                             //设置颜色
        g.drawString("字体ScanSerif，粗体，12号，蓝色",20,50); 
        
        g.setFont( new Font( "Serif", Font.ITALIC, 14 ) );
        g.setColor(new Color(255,0,0));
        g.drawString( " 字体Serif，斜体，14号，红色", 250, 50 );

        g.drawLine(20,60,460,60);                      //绘制直线

        g.setColor(Color.green);
        g.drawRect(20,70,100,50);                     //绘制空心矩形
        g.fillRect(130,70,100,50);                    //绘制实心矩形

        g.setColor(Color.yellow);
        g.drawRoundRect(240,70,100,50,50,50); //绘制空心圆角矩形
        g.fillRoundRect(350,70,100,50,50,50);      //绘制实心圆角矩形

        g.setColor(Color.cyan);
        g.draw3DRect(20,130,100,50,true);   //绘制突起效果空心矩形
        g.fill3DRect(130,130,100,50,false);    //绘制凹陷效果实心矩形
        
        g.setColor(Color.pink);
        g.drawOval(240,130,100,50);                //绘制空心椭圆
        g.fillOval(350,130,100,50);                    //绘制实心椭圆

        g.setColor(new Color(0,120,20));
        g.drawArc(20,190,100,50,0,90);            //绘制一段圆弧 
        g.fillArc(130,190,100,50,0,90);              //绘制扇形

        g.setColor(Color.black);
        int xValues[]={250,280,290,300,330,310,320,290,260,270};
        int yValues[]={210,210,190,210,210,220,230,220,230,220};
        g.drawPolygon(xValues,yValues,10);       //绘制空心多边形

        int xValues2[]={360,390,400,410,440,420,430,400,370,380};
        g.fillPolygon(xValues2,yValues,10);          //绘制实心多边形
        
    }
    public static void main(String[] args){
        new ForTest();
    }
}
