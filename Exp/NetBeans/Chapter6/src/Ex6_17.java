import java.io.*;
public class Ex6_17
{
	public static void main(String args[]) throws IOException,ClassNotFoundException
	{
    //新建一个Book类的对象
	Book book=new Book(100032,"Java Programming Skills","Wang Sir",30);
	ObjectOutputStream oos=new ObjectOutputStream(
                        new FileOutputStream("c:/book.dat"));//创建一对象输出流
	oos.writeObject(book);//向流中写对象
	oos.close();   //关闭输出流
	book=null;
	ObjectInputStream ois=new ObjectInputStream(
	                       new FileInputStream("c:/book.dat"));//创建一对象输入流
	book=(Book)ois.readObject(); //读入对象并强制转型为Book类
	ois.close();                 //关闭输入流
	System.out.println("ID is:"+book.id);  //读取对象信息并显示
	System.out.println("name is:"+book.name);
	System.out.println("author is:"+book.author);
	System.out.println("price is:"+book.price);
	}
}

class Book implements Serializable    //创建Book类，并声明其实现Serializable接口
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
