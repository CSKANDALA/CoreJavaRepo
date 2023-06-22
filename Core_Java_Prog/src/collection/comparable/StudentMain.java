package collection.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class StudentMain {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "a"));
		students.add(new Student(3, "b"));
		students.add(new Student(4, "c"));
		students.add(new Student(2, "d"));

		Collections.sort(students);
		/*Object[] a = students.toArray();
		Arrays.sort(a);
		System.out.println("===>"+Arrays.toString(a));
		ListIterator<Student> i = students.listIterator();
        for (int j=0; j<a.length; j++) {
            i.next();
            i.set((Student)a[j]);
        }*/

		for (Student student : students) {
			System.out.println(student);
		}

	}
}
