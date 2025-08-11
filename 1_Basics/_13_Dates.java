import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class _13_Dates {

	// Java 8 introduced a new Date and Time API
	// which is more comprehensive and easier to use than the old java.util.Date and
	// java.util.Calendar classes.

	// The new API is found in the java.time package.
	// It includes classes like LocalDate, LocalTime, LocalDateTime, ZonedDateTime,
	// and Duration.

	public static void main(String[] args) {

		// Example of using LocalDate
		LocalDate today = LocalDate.now();
		System.out.println("Today's date: " + today);

		// Example of using LocalTime
		LocalTime now = LocalTime.now();
		System.out.println("Current time: " + now);

		// Example of using LocalDateTime
		LocalDateTime dateTimeNow = LocalDateTime.now();
		System.out.println("Current date and time: " + dateTimeNow);

		// Example of using Instant for UTC timestamp
		Instant instant = Instant.now();
		System.out.println("Current UTC timestamp: " + instant);

		// custom date and time formatting
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDateTime = dateTimeNow.format(formatter);
		System.out.println("Formatted date and time: " + formattedDateTime);

		// Example of 12 hour format time
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
		String formattedTime = now.format(timeFormatter);
		System.out.println("Formatted time (12-hour format): " + formattedTime);

		// Parsing a date string
		String dateString = "25-12-2023 15:30:00";
		LocalDateTime parsedDateTime = LocalDateTime.parse(dateString, formatter);
		System.out.println("Parsed date and time: " + parsedDateTime);

		// Example of calculating the difference between two dates
		LocalDate christmas = LocalDate.of(2025, 12, 25);
		long daysUntilChristmas = today.until(christmas).getDays();
		// this displays the number of days, not months or years
		// if you want months or years, use getMonths() or getYears() respectively
		// but here we are just interested in days
		long monthsUntilChristmas = today.until(christmas).getMonths();
		long yearsUntilChristmas = today.until(christmas).getYears();
		System.out.println(yearsUntilChristmas + " years, " + monthsUntilChristmas + " months, and " + daysUntilChristmas
				+ " days until Christmas 2025.");

		// Example of checking if a date is before, after or equal to another date
		LocalDate newYear = LocalDate.of(2026, 1, 1);
		if (today.isBefore(newYear)) {
			System.out.println("Today is before New Year's Day 2026.");
		}
		if (today.isAfter(christmas)) {
			System.out.println("Today is after Christmas 2025.");
		}
		if (today.isEqual(LocalDate.now())) {
			System.out.println("Today is equal to the current date.");
		}

		// Example of calculating the difference between two date Strings
		String dateString1 = "2025-02-14";
		String dateString2 = "2025-05-29";
		LocalDate date1 = LocalDate.parse(dateString1);
		LocalDate date2 = LocalDate.parse(dateString2);

		long daysBetween = ChronoUnit.DAYS.between(date1, date2);
		System.out.println("Days between " + dateString1 + " and " + dateString2 + ": " + daysBetween + " days");

		// Example of getting the first day of the month
		LocalDate firstDayOfMonth = today.withDayOfMonth(1);
		System.out.println("First day of the month: " + firstDayOfMonth);
		// Example of getting the last day of the month
		LocalDate lastDayOfMonth = today.withDayOfMonth(today.lengthOfMonth());
		System.out.println("Last day of the month: " + lastDayOfMonth);

		// Example of manipulating dates
		LocalDate nextWeek = today.plusWeeks(1);
		System.out.println("Date one week from today: " + nextWeek);

	}
}