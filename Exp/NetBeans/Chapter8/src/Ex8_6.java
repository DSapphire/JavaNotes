public class Ex8_6
{
	public static void main(String[] args)
	{
		SellTickets t=new SellTickets();   //�½�һ����Ʊ��Ķ���
		new Thread(t).start();      //�ô˶�����Ϊ��������3�����̲߳�����
		new Thread(t).start();
		new Thread(t).start();
	}
}
class SellTickets implements Runnable
{
	private int tickets=200;   //���������Դ��Ϊ˽�б���
	public void run()
	{
		while(tickets>0)   //ֱ��û��Ʊ����Ϊֹ
		{
			System.out.println(Thread.currentThread().getName()
			+" is selling ticket "+tickets--);
		}
	}
}
