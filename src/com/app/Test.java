package com.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {

		String fileName = "employee.mahi";

		serializableObject(fileName);
		deSerializableObject(fileName);
	}

	public static void serializableObject(String fileName) {

		Address addr = new Address(10, "Muthanapalli", "522601");
		Employee emp = new Employee(100, "Mahindra", 32.06, addr);
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(new File(fileName)))) {

			oos.writeObject(emp);
			System.out.println("object is serialize........");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void deSerializableObject(String fileName) {

		try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream(
				new File(fileName)))) {

			Employee emp = (Employee) oos.readObject();

			System.out.println(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
