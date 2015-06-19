public class SortedIntArray
{
	private int capacity;
	private Integer [ ] rep;
	private int size;	// size ��ȱʡֵΪ 0
	//���췽��
	public SortedIntArray(int n){ 
		capacity = n; 
		rep = new Integer[capacity]; 
	}
   //�޲εĹ��췽��
	public SortedIntArray( ) { 
            this(100); 
        }
//����ķ������ö��ֲ����㷨���±��lower��upper��Χ�ڵ�����Ԫ���в��ҵ�һ��
//��С����Ԫ�ص�����Ԫ�ص��±ꡣ
	private int search(int i, int lower, int upper) {
            int index = lower;
            if (upper >= lower)	{
                int middle = (upper + lower) / 2;
		int current = rep[middle].intValue( );
		if (current == i){
                    index = middle; 
                }
                else if (current < i){ 
                    index = search(i, middle + 1, upper); 
                }
                else { 
                    index = search(i, lower, middle - 1); 
                }
            }
            return index;
	}
	public int search(int i) {   
            return search(i, 0, size - 1); 
        }
        //�������в���һ��Ԫ�ء�
        public SortedIntArray insert(int i){
            int index = search(i);
            for(int j = size; j > index; --j) {
                rep[j] = rep[j - 1]; }
		rep[index] = new Integer(i);
		++size;
		return this;
            }
        //��������ɾ��һ��Ԫ�ء�ֻɾ���鵽�ĵ�һ��Ԫ�ء�
	public SortedIntArray remove(int i){
            int index = search(i);
            if (rep[index].intValue( ) == i){ 
                --size;
		for (int j = index; j < size; ++j){ 
                    rep[j] = rep[j + 1]; 
                }
            }
            return this;
	}
	public String toString( ){
            String toReturn = "";
            for (int i = 0; i < size; ++i) { 
                toReturn += rep[i].toString( ) + ", "; 
            }
            return toReturn;
        }
	// ������
	static public void main(String [ ] args){
            SortedIntArray anArray = new SortedIntArray( );	
            anArray.insert(4).insert(9).insert(7).insert(1).insert(3).insert(2).insert(8).insert(7);
            System.out.println(anArray);
            anArray.remove(1).remove(8).remove(7).remove(3);
            System.out.println(anArray);		
        }
}
