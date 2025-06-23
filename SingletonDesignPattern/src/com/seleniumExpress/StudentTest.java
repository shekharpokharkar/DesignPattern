package com.seleniumExpress;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentTest {

	public static void main(String[] args)
			throws CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException {
		Student studentInstance = Student.getStudentInstance();
		Student studentInstance1 = Student.getStudentInstance();
		// Student studentInstanceclone = (Student) studentInstance.clone();

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Abc.txt"));
		oos.writeObject(studentInstance);

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Abc.txt"));
		Student studentInstanceSerialization = (Student) ois.readObject();

		System.out.println("studentInstance" + studentInstance.hashCode());
		System.out.println("studentInstance" + studentInstance1.hashCode());
		// System.out.println("studentInstanceclone" + studentInstanceclone.hashCode());
		System.out.println("studentInstanceSerialization" + studentInstanceSerialization.hashCode());
	}

}
