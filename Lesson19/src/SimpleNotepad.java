
public class SimpleNotepad implements INotepad{

	//variable
	private Page[] pages;
	private int numOfPages;
	
	public SimpleNotepad(int numOfPages) {
		setNumOfPages(numOfPages);
		pages = new Page[numOfPages];
		for(int i = 0 ; i < pages.length; i++){
			pages[i]= new Page();
		}
	}

//	//get
//	private Page[] getPages() {
//		return pages;
//	}
//
//	private int getNumOfPages() {
//		return numOfPages;
//	}

	private void setNumOfPages(int numOfPages) {
		if(numOfPages > 0 && numOfPages <= 100){
			this.numOfPages = numOfPages;
		}else{
			this.numOfPages = 20;
		}
	}

	@Override
	public void addTekst(int numPage, String tekst) {
		if(numPage > 0 && numPage <= pages.length){
			pages[numPage -1].addTekst(tekst);
		}
		
	}

	@Override
	public void replaceTekst(int numPage, String tekst) {
		if(numPage > 0 && numPage <= pages.length){
			pages[numPage -1].setTekst(tekst);
		}
		
	}

	@Override
	public void deleteTekst(int numPage) {
		if(numPage > 0 && numPage <= pages.length){
			pages[numPage -1].deleteTekst();
		}
		
	}

	@Override
	public void representNotepad() {
		System.out.println("****** Start Notepad ******");
		for(int  i= 0 ; i < pages.length; i++){
			System.out.println();
			System.out.println("   ---- Page " + (i+1) + " ----");
			pages[i].representPage();
			
		}
		System.out.println();
		System.out.println("****** End Notepad ******");
		System.out.println();
		
	}

	@Override
	public void setTitle(int numPage, String tekst) {
		if(numPage > 0 && numPage <= pages.length){
			pages[numPage -1].setTitle(tekst);
		}
		
	}

	@Override
	public int searchWord(String word) {
		
		int result = -1;
		for(int i = 0 ; i < pages.length; i ++){
			if(pages[i].searchWord(word)){
				return (i + 1);
			}
		}
		return result;
	}

	@Override
	public void printAllPagesWithDigits() {
		boolean hasPageWithDigits = false;
		System.out.println("__Pages with digits :");
		for(int i = 0 ; i < pages.length; i ++){
			
			if(pages[i].containsDigits()){
				System.out.println("Page :" + (i + 1));
				pages[i].representPage();
				hasPageWithDigits = true;
				//System.out.println();
			}
		}
		if(!hasPageWithDigits){
			System.out.println("In this notepad has not pages with digits !");
		}
		System.out.println("__End page with digits");
		System.out.println();
	}
	
	
}
