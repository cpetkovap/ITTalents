
public interface IPage {
	void addTekst(String tekst);
	void deleteTekst();
	void representPage();
	boolean searchWord(String word);
	boolean containsDigits();
}
