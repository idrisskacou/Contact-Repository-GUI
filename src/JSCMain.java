public class JSCMain {

	public static void main(String[] args) {

		try {
			JSCFrame frame = new JSCFrame(new ObjectRepository<>("contacts.dat"));
			frame.setVisible(true);
			frame.setResizable(true);
		} catch (ClassNotFoundException ex) {
			System.err.println(ex);
		}

	}

}
