package sk.upjs.paz;

import lombok.With;

import java.time.LocalDateTime;
import java.util.Set;

@With
public record Attendance(
		Long id,
		LocalDateTime dateTime,
		Subject subject,
		Set<Student> students
) {
}
