package sk.upjs.paz;

import lombok.With;

import java.time.LocalDate;

@With
public record Student (
		Long Id,
		String firstName,
		String lastName,
		Enum gender,
		LocalDate dateOfBirth) {

	public enum Gender {
		MALE, FEMALE, OTHER
	}
}
