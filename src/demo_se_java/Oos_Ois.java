package demo_se_java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Vehicle implements Serializable{
	int i;
}

public class Oos_Ois {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Vehicle v = new Vehicle();
		v.i = 2;		
		
		File f = new File("samplefile.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(v);
		
		System.out.println(v.i);
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Vehicle v1 = (Vehicle) ois.readObject();
		System.out.println(v1.i);
	}
}
