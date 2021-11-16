import java.util.*; 
import java.io.*; 
class MyHash
{
	int arr[];
	int cap,size;
	MyHash(int c)
	{
		cap=c;
		size=0;
		arr=new int[cap];
		for(int i=0;i<cap;i++)
		{
			arr[i]=-1;
		}
	}

	int hash(int key)
	{
		return key%cap;
	}

	boolean search(int key)
	{
		int i=hash(key);
		int h=i;
		while(arr[i]!=-1)
		{
			if(arr[i]==key)
				return true;
			i=(i+1)%cap;
			if(i==h)
				return false;
		}
		return false;
	}

	boolean insert(int key)
	{
		if(cap==size)
			return false;
		int h=hash(key);
		int i=h;
		while(arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key)
			i=(i+1)%cap;
		if(arr[i]==key)
			return false;
		else
		{
			arr[i]=key;
			size++;
			return true;
		}
	}

	boolean delete(int key)
	{
		int i=hash(key);
		int h=i;
		while(arr[i]!=-1)
		{
			if(arr[i]==key)
			{
				arr[i]=-2;
				return true;
			}
			i=(i+1)%cap;
			if(i==h)
				return false;
		}
		return false;
	}

	void display()
	{
		for(int i=0;i<cap;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

}

class OpenAddressing
{
	public static void main(String args[])
	{
		boolean t;
		MyHash mh=new MyHash(7);
		mh.insert(49);
		mh.insert(56);
		mh.insert(63);
		t= mh.search(56);
		if(t==true)
			System.out.println("yes");
		else
			System.out.println("no");

		t= mh.delete(56);
		if(t==true)
			System.out.println("yes");
		else
			System.out.println("no");

		t= mh.search(56);
		if(t==true)
			System.out.println("yes");
		else
			System.out.println("no");
		mh.display();

	}
}