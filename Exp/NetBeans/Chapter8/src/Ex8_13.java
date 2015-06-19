public class Ex8_13
{
    public static void main(String[] args) {    	
        TestThread[] runners = new TestThread[2]; //定义一个包含2个线程元素的线程数组
        for (int i = 0; i < 2; i++)        
        	runners[i] = new TestThread(i);   //创建这两个线程
        runners[0].setPriority(2);   //设置第一个线程优先级为2
        runners[1].setPriority(3);   //设置第二个线程优先级为3
        for (int i = 0; i < 2; i++)
            runners[i].start();        //启动线程
    }
}
class TestThread extends Thread
{
	private int tick = 1;
	private int num;
	public TestThread(int i)   //构造函数
	{
		this.num=i;
	}
	public void run()
	{
		while (tick < 400000) {
            tick++;
            if ((tick % 50000) == 0) {  //每隔5000进行显示
                System.out.println("Thread #" + num + ", tick = " + tick);
                yield();  //放弃执行权
//                try{ sleep(1);}catch(Exception e){}
            }
        }
    }			
}
