import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {

	private String password;

	public SecuredNotepad(String password) {
		this.password = password;
	}

	@Override
	public void writeOnNewPage(int pageNumber, String title, String text) {
		if (checkPassword()) {
			super.writeOnNewPage(pageNumber, title, text);
		}
	}

	private boolean checkPassword() {
		System.out.println("Enter the SecuredNotepad Password: ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			String enteredPassword = sc.nextLine();
			if (enteredPassword.equals(this.password)) {
				System.out.println("CORRECT! :)");
				return true;
			} else {
				System.out.println("Wrong password, try again!");
			}
		}
		return false;
	}

	@Override
	public void replaceText(int pageNumber, String text) {
		if (checkPassword()) {
			super.replaceText(pageNumber, text);
		}
	}

	@Override
	public void removeText(int pageNumber) {
		if (checkPassword()) {
			super.removeText(pageNumber);
		}
	}

	@Override
	public void displayPages() {
		if (checkPassword()) {
			super.displayPages();
		}
	}

}
