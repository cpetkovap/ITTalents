
public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice{
	boolean isStart;

	public ElectronicSecuredNotepad(int numOfPages, String password, boolean isStart) {
		super(numOfPages, password);
		this.isStart = isStart;
	}
	
	

	@Override
	public void start() {
		if(isStarted()){
			System.out.println("Electronic notepad is already started");
		}else{
			this.isStart = true;
		}
		
	}

	@Override
	public void stop() {
		if(!isStarted()){
			System.out.println("Electronic notebook is already stopped");
		}else{
			isStart = false;
		}
		
	}

	@Override
	public boolean isStarted() {
		if(isStart)
			return true;
		else
			return false;
	}



	@Override
	public void addTekst(int numPage, String tekst) {
		if(isStart){
			super.addTekst(numPage, tekst);
		}else{
			System.out.println("Sorry! Notepad is stop ! You can not add tekst.");
		}
	}



	@Override
	public void replaceTekst(int numPage, String tekst) {
		if(isStart){
			super.replaceTekst(numPage, tekst);
		}else{
			System.out.println("Sorry! Notepad is stop ! You can not replace tekst.");
		}
	}



	@Override
	public void deleteTekst(int numPage) {
		if(isStart){
			super.deleteTekst(numPage);
		}else{
			System.out.println("Sorry! Notepad is stop ! You can not delete tekst.");
		}
	}



	@Override
	public void setTitle(int numPage, String tekst) {
		if(isStart){
			super.setTitle(numPage, tekst);
		}else{
			System.out.println("Sorry! Notepad is stop ! You can not set title");
		}
	}



	@Override
	public void representNotepad() {
		if(isStart){
			super.representNotepad();
		}else{
			System.out.println("Sorry! Notepad is stop !You can not print pages.");
		}
	}



	@Override
	public int searchWord(String word) {
		if(isStart){
			return super.searchWord(word);
		}else{
			System.out.println("Sorry! Notepad is stop !You can not search.");
			return -2;
		}
	}



	@Override
	public void printAllPagesWithDigits() {
		if(isStart){
			super.printAllPagesWithDigits();
		}else{
			System.out.println("Sorry! Notepad is stop !You can not print pages with digits");
		}
	}
	
	

}
