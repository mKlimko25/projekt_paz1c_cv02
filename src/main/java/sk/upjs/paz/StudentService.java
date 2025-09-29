package sk.upjs.paz;

import java.util.Set;

import static sk.upjs.paz.Student.Gender.*;

public class StudentService {
	private Set<Student> students;

	public PomerPohlavi pomer(){
		int boys = 0;
		int girls = 0;
		int other = 0;
		for (Student s : students) {
			switch (s.gender()) {
				case MALE -> boys++;
				case FEMALE -> girls++;
				case OTHER -> other++;
				case null, default -> {
				}
			}
		}
		return new PomerPohlavi(boys, girls, other);
	}
}
