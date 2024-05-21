package demo_se_java;

import java.util.*;

class Data<K, V>{
	private K key;
	private V value;
	
	public Data(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	public void display() {
		System.out.println(key + " "+ value);
	}

}

public class SampleMain {
	public static void main(String[] args) {
		Data<Integer, String> d = new Data<Integer, String>(1, "ab");
		d.display();
	}
}
