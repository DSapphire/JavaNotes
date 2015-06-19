public class Ex8_13
{
    public static void main(String[] args) {    	
        TestThread[] runners = new TestThread[2]; //����һ������2���߳�Ԫ�ص��߳�����
        for (int i = 0; i < 2; i++)        
        	runners[i] = new TestThread(i);   //�����������߳�
        runners[0].setPriority(2);   //���õ�һ���߳����ȼ�Ϊ2
        runners[1].setPriority(3);   //���õڶ����߳����ȼ�Ϊ3
        for (int i = 0; i < 2; i++)
            runners[i].start();        //�����߳�
    }
}
class TestThread extends Thread
{
	private int tick = 1;
	private int num;
	public TestThread(int i)   //���캯��
	{
		this.num=i;
	}
	public void run()
	{
		while (tick < 400000) {
            tick++;
            if ((tick % 50000) == 0) {  //ÿ��5000������ʾ
                System.out.println("Thread #" + num + ", tick = " + tick);
                yield();  //����ִ��Ȩ
//                try{ sleep(1);}catch(Exception e){}
            }
        }
    }			
}
