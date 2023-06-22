package collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student1_8Main {

	public static void main(String[] args) {

		ArrayList<Student1_8> students = new ArrayList<Student1_8>();
		students.add(new Student1_8(1, "a"));
		students.add(new Student1_8(3, "b"));
		students.add(new Student1_8(4, "c"));
		students.add(new Student1_8(2, "d"));

		Comparator<Student1_8> comparator =(Student1_8 obj1, Student1_8 obj2)-> obj1.getRollNum().compareTo(obj2.getRollNum());
		
		Collections.sort(students, comparator);

		for (Student1_8 student : students) {
			System.out.println(student);
		}
	}
}
