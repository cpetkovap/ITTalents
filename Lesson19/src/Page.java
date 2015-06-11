
public class Page implements IPage{

	//variable
	private String title;
	private String tekst;
	
	//konstruktor
	public Page(String title, String tekst) {
		setTitle(title);
		setTekst(tekst);
	}
	
	public Page(){
		setTitle("Default title");
		setTekst("default tekst");
	}

	//getTitle
	public String getTitle() {
		return title;
	}
	
	//setTitle
	public void setTitle(String title) {
		if(title != null){
			this.title = title;
		}else{
			this.title = "Default title";
		}
	}
	
	//getTekst
	public String getTekst() {
		return tekst;
	}
	
	//setTekst
	public void setTekst(String tekst) {
		if(tekst != null){
			this.tekst = tekst;
		}else{
			this.tekst = "default tekst";
		}
	}

	@Override
	public void addTekst(String tekst) {
		if(tekst != null){
			setTekst(this.tekst + " " + tekst);
		}else{
			System.out.println("You can not add null tekst !");
		}
		
	}

	@Override
	public void deleteTekst() {
		setTekst(null);;
		
	}

	@Override
	public void representPage() {
		if(getTitle() != null){
			System.out.println(getTitle());
			System.out.println();
		}
		if(getTekst() != null){
			System.out.println(getTekst());
			//System.out.println();
		}
		
	}

	@Override
	public boolean searchWord(String word) {
		boolean result = false; 
		if(getTekst() != null && word != null){
			int index = getTekst().indexOf(word);
			if(index != -1){
				result = true;
			}
		}
		return result;
	}

	@Override
	public boolean containsDigits() {		
		if(getTekst() != null && getTekst().matches(".*[0-9]+.*"))
			return true;
		else
			return false;
	}
	
	
}
