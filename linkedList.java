import java.util.Iterator;
public class linkedList {

	private Node first;
	
	public LinkedList() {
		this.first = null;
	}
	
	public void addFirst(int v){
		this.first.next = this.first;
		this.first.value = v;
	}
	
	public void addLast(int v){
		for(int i = 0; i <= this.size(); i++){
			this.first = this.first.next;
		}
		this.first.value = v;
	}
	
	
	public int get(int index) throws IllegalArgumentException{
		if (index < 0 || index > this.size()){
		throw new IllegalArgumentException();
		}
		for (int i = 0; i < index; i++){
			this.first = this.first.next;
		}
		return this.first.value;
	}
	
	public boolean contains(int v){
		for(int i = 0; i < this.size(); i++){
			if(this.first.value == v){
				return true;
			}
		}
		return false;
	}
	
	public int size(){
		int count = 0;
		while(this.first.next != null){
			this.first = this.first.next;
			count++;
		}
		return count;
	}
	
	public Iterator<T> iterator(){
		return new LinkedListIterator(this.first);
	}
	
	public static void main(String[] args){
	   LinkedList newList = new LinkedList();
	   newList.addFirst(7);
	   newList.addFirst(8);
	   newList.addFirst(9);
	   System.out.println(newList.size());
	   System.out.println(newList.get(1));
	   for(LinkedList newList){
		   this.first.value++;
	}
	   System.out.println(newList.get(1));
	   System.out.println(newList.get(2));
	   System.out.println(newList.get(3));
	   

}

}
