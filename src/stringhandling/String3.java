package stringhandling;

public class String3 {

	public static void main(String arg[]) {
		// validate @
		// validate domain with at least 2 char
		// value before @
		// value after @ and before domain
		// check no special char other than @
		// space should not be there
		String email = "test@gmail.co.c".trim();

		if (email.contains("@")) {
			System.out.println("@ is present");

			//checkDomain(email);
			
			//checkBeforeAddress(email);
			
			checkAfterAddress(email);
			
		} else {
			System.out.println("Invalid email id : '@' is not present");
		}

	}

	public static void checkDomain(String email) {
		int totalLenght = email.length();

		int lastIndexofDot = email.lastIndexOf(".");

		int domainLength = totalLenght - lastIndexofDot;

		System.out.println(lastIndexofDot);
		if (domainLength > 2) {
			System.out.println("Valid domain Length");

			boolean isDomainValid = true;
			for (int x = lastIndexofDot + 1; x < totalLenght; x++) {
				if (validateCharacterValue(email.charAt(x)) == false) {
					isDomainValid = false;
				}
			}

			if (isDomainValid == true) {
				System.out.println("Valid domain");
			} else {
				System.out.println("Invalid domain");
			}

		} else {
			System.out.println("Invalid domain Length");
		}

	}

	public static boolean validateCharacterValue(char c) {
		int val = Integer.valueOf(c);

		if ((val >= 65 && val <= 90) || (val >= 97 && val <= 122)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void checkBeforeAddress(String email) {

		if(email.indexOf("@")!=0) {
			System.out.println("Value is present before address");
		}else {
			System.out.println("Value is not present before address");
		}
		
	}
	
	public static void checkAfterAddress(String email) {

		String emailsubstring = email.substring(email.indexOf("@")+1);
		
		emailsubstring = emailsubstring.substring(0, emailsubstring.indexOf("."));
		
		System.out.println(emailsubstring);
		
		if(emailsubstring.length()>0)
		{
			System.out.println("Value after address and before dot is valid");
		}
		
		
		
	}
}
