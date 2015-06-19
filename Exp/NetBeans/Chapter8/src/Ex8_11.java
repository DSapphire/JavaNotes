public class Ex8_11
{
	public static void main(String[] args)
	{
		Balls ball=new Balls();	 //�½�һ���������
		Player0 p0=new Player0(ball);  //����0����Ϸ��
		Player1 p1=new Player1(ball);  //����1����Ϸ��
		Player2 p2=new Player2(ball);  //����2����Ϸ��
		p0.start();   //����0����Ϸ��
		p1.start();  //����1����Ϸ��
		p2.start();  //����2����Ϸ��
	}
}

class Balls     //����
{
	boolean flag0=false;  //0����ı�־������true��ʾ�ѱ����ã�false��ʾδ���κ�����
	boolean flag1=false;  //1����ı�־����
	boolean flag2=false;  //2����ı�־����
}

class Player0 extends Thread   //0����Ϸ�ߵ���
{
	private Balls ball;
	public Player0(Balls b)   //���캯��������һ������������
	{
		this.ball=b;
	}
	public void run()
	{
		while(true)
		{
			while(ball.flag1==true){}; //���1�����ѱ����ߣ���ȴ�
		    ball.flag1=true;  //����1����
		    while(ball.flag0==true){};  //���0�����ѱ����ߣ���ȴ�
		    if(ball.flag1==true && ball.flag0==false)   //�������1����δ��0����
		    {
		    	ball.flag0=true;  //����0����
		    	System.out.println("Player0 has got two balls!"); //��ʾ��Ϣ
		    	ball.flag1=false;  //����1����
		    	ball.flag0=false;  //����0����
		    	try{ sleep(1);}catch(Exception e){};  //���º���ʱ��Ϣ1����
		    }
		}
	}
}

class Player1 extends Thread  //1����Ϸ�ߵ���
{
	private Balls ball;
	public Player1(Balls b)
	{
		this.ball=b;
	}
	public void run()
	{
		while(true)
		{
			while(ball.flag0==true){};
		    	ball.flag0=true;
		    	while(ball.flag2==true){};
		    	if(ball.flag0==true && ball.flag2==false)
		    	{
		    		ball.flag2=true;
		    		System.out.println("Player1 has got two balls!");
		    		ball.flag0=false;
		    		ball.flag2=false;
		    		try{ sleep(1);}catch(Exception e){};
		    	}
		}
	}
}

class Player2 extends Thread    //2����Ϸ�ߵ���
{
	private Balls ball;
	public Player2(Balls b)
	{
		this.ball=b;
	}
	public void run()
	{
		while(true)
		{
			while(ball.flag2==true){};
		    ball.flag2=true;
		    while(ball.flag1==true){};
		    if(ball.flag2==true && ball.flag1==false)
		    {
		    	ball.flag1=true;
		    	System.out.println("Player2 has got two balls!");
		    	ball.flag1=false;
		    	ball.flag2=false;
		    	try{ sleep(1);}catch(Exception e){};
		    }
		}
	}
}
