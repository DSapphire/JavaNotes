class UnevenExample3
{
  public static void main( String[] arg )
  {
    // ����������һ��2ά����
    int[ ][ ] uneven =
        { { 1, 9, 4 },
          { 0, 2},
          { 0, 1, 2, 3, 4 } };
      // ����ĳ��� (����)
    System.out.println("Length of array is: " + uneven.length );

    // ����ÿһ�еĳ��ȣ�������
    System.out.println("Length of row[0] is: " + uneven[0].length );
    System.out.println("Length of row[1] is: " + uneven[1].length );
    System.out.println("Length of row[2] is: " + uneven[2].length );
  }
}

