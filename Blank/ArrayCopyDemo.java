public class ArrayCopyDemo{
	public static void main(String[] args) {
		char[] copyFrom={'a','b','c','d','e','f',
		'g','h','i'};
		char[] copyTo=new char[7];
		System.arraycopy(copyFrom,1,copyTo,0,6);
		System.out.println(new String(copyTo));
	}
}