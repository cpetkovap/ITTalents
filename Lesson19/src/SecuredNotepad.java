import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {

	// scanner
	Scanner input = new Scanner(System.in);

	// variable
	private String password;

	public SecuredNotepad(int numOfPages, String password) {
		super(numOfPages);
		if (password != null && validatePassword(password)) {
			setPassword(password);
		} else {
			System.out.println("!!!!! This is not security notepad!!!!");
			System.out.println();
		}
	}

	// get pass
	private String getPassword() {
		return password;
	}

	// check pass
	private boolean validatePassword(String password) {
		//boolean result = true;
		char[] pass = password.toCharArray();
		if (pass.length < 5) {
			//result = false;
			return false;
		}
		boolean uppercase = false;
		boolean lowercase = false;
		boolean digit = false;
		for (int i = 0; i < pass.length; i++) {
			if (Character.isUpperCase(pass[i])) {
				uppercase = true;
			}
			if (Character.isLowerCase(pass[i])) {
				lowercase = true;
			}
			if (Character.isDigit(pass[i])) {
				digit = true;
			}
		}
		if (uppercase && lowercase && digit) {
			return true;
		}

		return false;
	}

	// set pass
	private void setPassword(String password) {

		if (validatePassword(password)) {
			this.password = password;
		} 
	}

	private boolean checkPassword(String password) {
		boolean result = false;
		if (getPassword().equals(password)) {
			result = true;
		}
		return result;
	}

	@Override
	public void addTekst(int numPage, String tekst) {
		if (password != null) {
			System.out.println("Enter your password");
			String password = input.nextLine();
			if (checkPassword(password)) {
				super.addTekst(numPage, tekst);
			} else {
				System.out
						.println("Invalid password ! Sorry ! You can not add tekst !");
			}
		} else {
			super.addTekst(numPage, tekst);
		}
	}

	@Override
	public void replaceTekst(int numPage, String tekst) {
		if (password != null) {
			System.out.println("Enter your password");
			String password = input.nextLine();
			if (checkPassword(password)) {
				super.replaceTekst(numPage, tekst);
			} else {
				System.out
						.println("Invalid password ! Sorry ! You can not replace tekst !");
			}
		} else {
			super.replaceTekst(numPage, tekst);
		}

	}

	@Override
	public void deleteTekst(int numPage) {
		if (password != null) {
			System.out.println("Enter your password");
			String password = input.nextLine();
			if (checkPassword(password)) {
				super.deleteTekst(numPage);
			} else {
				System.out
						.println("Invalid password ! Sorry ! You can not delete tekst !");
			}
		} else {
			super.deleteTekst(numPage);
		}

	}

	@Override
	public void setTitle(int numPage, String tekst) {
		if (password != null) {
			System.out.println("Enter your password");
			String password = input.nextLine();
			if (checkPassword(password)) {
				super.setTitle(numPage, tekst);
			} else {
				System.out
						.println("Invalid password ! Sorry ! You can not set title !");
			}
		} else {
			super.setTitle(numPage, tekst);
		}

	}

	@Override
	public void representNotepad() {
		if (password != null) {
			System.out.println("Enter your password");
			String password = input.nextLine();
			if (checkPassword(password)) {
				super.representNotepad();
			} else {
				System.out
						.println("Invalid password ! Sorry ! You can not represent the pages !");
			}
		} else {
			super.representNotepad();
		}

	}

	@Override
	public int searchWord(String word) {
		if (password != null) {
			System.out.println("Enter your password");
			String password = input.nextLine();
			if (checkPassword(password)) {
				return super.searchWord(word);
			} else {
				System.out
						.println("Invalid password ! Sorry ! You can not search !");
				return -2;
			}
		} else {
			return super.searchWord(word);
		}

	}

	@Override
	public void printAllPagesWithDigits() {
		if (password != null) {
			System.out.println("Enter your password");
			String password = input.nextLine();
			if (checkPassword(password)) {
				super.printAllPagesWithDigits();
			} else {
				System.out
						.println("Invalid password ! Sorry ! You can not print page with numbers !");
			}
		} else {
			super.printAllPagesWithDigits();
		}

	}

}
