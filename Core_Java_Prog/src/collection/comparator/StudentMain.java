package collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import collection.comparable.Student;

public class StudentMain {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "a"));
		students.add(new Student(3, "b"));
		students.add(new Student(4, "c"));
		students.add(new Student(2, "d"));

		Comparator<Student> comparator = new Comparator<Student>() {

			@Override
			public int compare(Student obj1, Student obj2) {
				System.out.println("--->" + obj1.getRollNum() + ", " + obj2.getRollNum());
				if (obj1.getRollNum() > obj2.getRollNum())
					return 1;
				if (obj1.getRollNum() < obj2.getRollNum())
					return -1;
				return 0;
			}
		};
		Collections.sort(students, comparator);

		for (Student student : students) {
			System.out.println(student);
		}
	}
}
