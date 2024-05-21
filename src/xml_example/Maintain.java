package xml_example;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Maintain {
	public static void main(String[] args) {
		Student s1 = new Student(0, "aaa");
		Student s2 = new Student(1, "bbb");
		
		List<Student> s = new ArrayList<Student>();
		s.add(s1);
		s.add(s2);
		
		File f = new File("college.xml");
	}
}
