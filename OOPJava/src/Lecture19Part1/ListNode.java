package Lecture19Part1;

/** LinkedList referred to these classes.  */
public class ListNode {

	private String data;
	private ListNode link;
	
	/** Default constructor.  */
	ListNode() {
		data = null;
		link = null;
	}
	
	/** Constructor with arguments.  */
	public ListNode(String rData, ListNode rLink) {
		data = rData; 
		link = rLink; 
	}
	
	public void setData(String rData) {
		this.data = rData; 
	}
	
	public String getData() {
		return data;
	}
	
	public void setLink(ListNode rLink) {
		this.link = rLink;
	}
	
	public ListNode getLink() {
		return link;
	}
	
}
