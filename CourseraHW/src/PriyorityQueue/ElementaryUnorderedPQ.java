package PriyorityQueue;

public class ElementaryUnorderedPQ<Key extends Comparable<Key>> 
{

	private Key[] _pq;
	private int _size;
	
	public ElementaryUnorderedPQ(int capacity)
	{
		_pq = (Key[]) new Comparable[capacity];		
	}
	
	public boolean isEmpty()
	{
		return _size == 0;
	}
	
	public void insert(Key item)
	{
		_pq[_size ++] = item;
	}
	public Key delMax()
	{
		int max = 0;
		for(int i =1; i<_size; i++)
		{
			if(less(max, i)) max = i;
		}
		Key returnValue = _pq[max];
		exch(max,_size-1);
		_pq[_size--] = null;
		return returnValue;
	}
	
	private boolean less(int index1, int index2)
	{
		return _pq[index1].compareTo(_pq[index2]) < 0;
	}
	
	private void exch(int index1, int index2)
	{
		Key temp = _pq[index1];
		_pq[index1] = _pq[index2];
		_pq[index2] = temp;
	}
}
