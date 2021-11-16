import java.util.*;
class MyHash
{
	int bucket;
	ArrayList<LinkedList<Integer>> table;
	MyHash(int b)
	{
		bucket=b;
		table=new ArrayList<LinkedList<Integer>>();
		for(int i=0;i<b;i++)
		{
			table.add(new LinkedList<Integer>());
		}

	}
	void insert(Integer k)
	{
		int i=k%bucket;
		table.get(i).add(k);
	}
	void delete(Integer k)
	{
		int i=k%bucket;
		table.get(i).remove(k);
	}
	boolean search(Integer k)
	{
		int i=k%bucket;
		return table.get(i).contains(k);
	}
}

class Chaining
{
	public static void main(String args[])
	{
		MyHash mh=new MyHash(7);
		mh.insert(10);
		mh.insert(7);
		mh.insert(70);
		System.out.println(mh.search(10));
		mh.delete(10);
		System.out.println(mh.search(10));
	}
}