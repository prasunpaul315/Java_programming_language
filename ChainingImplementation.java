import java.util.*;

class Myhash
{
	int BUCKET;
	ArrayList<LinkedList<Integer>> table;
	Myhash(int b)
	{
		BUCKET=b;
		table= new ArrayList<LinkedList<Integer>>();
		for(int i=0;i<b;i++)
		{
			table.add(new LinkedList<Integer>());
		}
	}

	void insert(Integer k)
	{
		int i=k%BUCKET;
		table.get(i).add(k);
	}
	void delete(Integer k)
	{
		int i=k%BUCKET;
		table.get(i).remove(k);
	}
	boolean search(Integer k)
	{
		int i=k%BUCKET;
		return table.get(i).contains(k);
	}

}

class ChainingImplementation
{
	public static void main(String args[])
	{
		Myhash mh=new Myhash(7);
		mh.insert(20);
		mh.insert(10);
		mh.insert(30);
		mh.insert(7);
		System.out.println(mh.search(7));
		mh.delete(30);
		System.out.println(mh.search(30));
	}
}