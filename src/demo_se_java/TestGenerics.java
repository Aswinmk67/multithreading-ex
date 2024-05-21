package demo_se_java;

class Generic<T>{
	private T data;
 
	public Generic(T data) {
		this.data = data;
	}
 
	@Override
	public String toString() {
		return "Generic [data=" + data + "]";
	}
 
	public T getData() {
		return data;
	}
	
	
}
 
public class TestGenerics {
 
	public static void main(String[] args) {
 
		Generic<Integer> gData = new Generic<>(2);
		int data =gData.getData();
		System.out.println("Integer value is "+data);
	}	
}