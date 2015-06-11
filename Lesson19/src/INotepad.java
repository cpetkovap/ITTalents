
public interface INotepad {
	void addTekst(int numPage, String tekst);
	void replaceTekst(int numPage, String tekst);
	void deleteTekst(int numPage);
	void representNotepad();
	void setTitle(int numPage, String tekst);
	int searchWord(String word);//dali v nqkoq ot stranicite se sydyrja dumata i vryshtam 1vata stranica v koqto q namerim
	void printAllPagesWithDigits();//printi vsichki stranici koito sydyrjat cifri

}
