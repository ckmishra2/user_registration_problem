package sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JunitUserRegistration {

	public String regex;

	// method to validate first name
	public boolean firstName(String firstName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}
	// method to validate last name
	public boolean lastName(String lastName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}
	// method to validate email
	public boolean emailId(String emailIds) {
		regex = "^[a][b][c].[a-z]{3,}+@[b][l].[c][o].[a-z]{0,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailIds);
		return matcher.matches();
	}
	// method to validate mobilenumber
	public boolean mobileNumber(String mobileNumber) {
		regex = "[0-9]{0,2}[1-9] [0-9]{10}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobileNumber);
		return matcher.matches();
}
	public boolean password(String password) {
		regex = "[A-Za-z]{8}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
}
}