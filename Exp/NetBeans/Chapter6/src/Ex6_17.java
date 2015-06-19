import java.io.*;
public class Ex6_17
{
	public static void main(String args[]) throws IOException,ClassNotFoundException
	{
    //�½�һ��Book��Ķ���
	Book book=new Book(100032,"Java Programming Skills","Wang Sir",30);
	ObjectOutputStream oos=new ObjectOutputStream(
                        new FileOutputStream("c:/book.dat"));//����һ���������
	oos.writeObject(book);//������д����
	oos.close();   //�ر������
	book=null;
	ObjectInputStream ois=new ObjectInputStream(
	                       new FileInputStream("c:/book.dat"));//����һ����������
	book=(Book)ois.readObject(); //�������ǿ��ת��ΪBook��
	ois.close();                 //�ر�������
	System.out.println("ID is:"+book.id);  //��ȡ������Ϣ����ʾ
	System.out.println("name is:"+book.name);
	System.out.println("author is:"+book.author);
	System.out.println("price is:"+book.price);
	}
}

class Book implements Serializable    //����Book�࣬��������ʵ��Serializable�ӿ�
{
	int id;
	String name;
	String author;
	float price;
	public Book(int id,String name,String author,float price)
	{
	this.id=id;
	this.name=name;
	this.author=author;
	this.price=price;
	}
}