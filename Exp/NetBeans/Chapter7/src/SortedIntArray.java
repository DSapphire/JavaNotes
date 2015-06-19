public class SortedIntArray
{
	private int capacity;
	private Integer [ ] rep;
	private int size;	// size 的缺省值为 0
	//构造方法
	public SortedIntArray(int n){ 
		capacity = n; 
		rep = new Integer[capacity]; 
	}
   //无参的构造方法
	public SortedIntArray( ) { 
            this(100); 
        }
//下面的方法运用二分查找算法在下标从lower到upper范围内的数组元素中查找第一个
//不小于新元素的数组元素的下标。
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
        //在数组中插入一个元素。
        public SortedIntArray insert(int i){
            int index = search(i);
            for(int j = size; j > index; --j) {
                rep[j] = rep[j - 1]; }
		rep[index] = new Integer(i);
		++size;
		return this;
            }
        //在数组中删除一个元素。只删除查到的第一个元素。
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
	// 主方法
	static public void main(String [ ] args){
            SortedIntArray anArray = new SortedIntArray( );	
            anArray.insert(4).insert(9).insert(7).insert(1).insert(3).insert(2).insert(8).insert(7);
            System.out.println(anArray);
            anArray.remove(1).remove(8).remove(7).remove(3);
            System.out.println(anArray);		
        }
}
