package collection_test;

public class LinkList_Example2 {
	
	int id;
	String author, title;
	
	//LinkList_Example2(){}
	
	public LinkList_Example2(int id, String author, String title) {
		//new LinkList_Example2().id = id;
		this.id = id;
		this.author = author;
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "ID: "+id+ ", AUTHOR: "+author+ ", TITLE: "+title;
	}

}
