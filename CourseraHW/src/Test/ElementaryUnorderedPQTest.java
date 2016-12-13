package Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import PriyorityQueue.ElementaryUnorderedPQ;


public class ElementaryUnorderedPQTest {

	private ElementaryUnorderedPQ<String> _pq;
	
	@Before
    public void setUp() {
        this._pq = new  ElementaryUnorderedPQ<String>(5);
    }
	
	@Test
	public void isEmptyTest() {
		assertTrue(this._pq.isEmpty());
	}
	
	@Test
	public void insertTest() {
		
		_pq.insert("a");
		assertEquals("a", _pq.delMax());
	}
	
	@Test
	public void delMaxTest() {
		
		_pq.insert("a");
		_pq.insert("b");
		_pq.insert("c");
		assertEquals("c", _pq.delMax());
	}

}
