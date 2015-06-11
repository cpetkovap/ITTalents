
public class NotepadDemo {

	public static void main(String[] args) {
		
		
//		SimpleNotepad sp = new SimpleNotepad(10);
//		sp.setTitle(3, "Title page 3");
//		sp.addTekst(3, "alabala 11 nica");
//		sp.replaceTekst(4, "repla45cetekst");
//		sp.addTekst(10, "page 10");
//		sp.addTekst(11, "greshka trqbva da ima");
//		sp.representNotepad();
//		sp.deleteTekst(10);
//		sp.representNotepad();
//		containsWord(sp.searchWord("ala"));
//		containsWord(sp.searchWord("gf"));
//		
//		
//		sp.printAllPagesWithDigits();
//		
//		SecuredNotepad sn = new SecuredNotepad(5, "123");
//		sn.setTitle(1, "Title One");
//		sn.addTekst(1, "addTekst21");
//		sn.replaceTekst(2, "new text");
//		sn.deleteTekst(3);
//		sn.representNotepad();
//		containsWord(sn.searchWord("new"));
//		containsWord(sn.searchWord("alabla"));
//		sn.printAllPagesWithDigits();
//		
//		//referencii ot ISecuritNotepad nqmam , zashtoto nqmam takyv interfeis :)
//		
//		INotepad notePad = new SimpleNotepad(1);
//		INotepad notePad1 = new SecuredNotepad(1, "123");
//		notePad.setTitle(1, "Title Notepad bla bla");
//		notePad.replaceTekst(1, "ulqlqlq");
//		notePad.representNotepad();
//		notePad1.setTitle(1, "neshto si za zaglavie");
//		notePad1.deleteTekst(1);
//		notePad1.deleteTekst(2);
//		notePad1.representNotepad();
		
		ElectronicSecuredNotepad esn = new ElectronicSecuredNotepad(3, "Aaaat", false);
		esn.setTitle(1, "Title One");
		esn.addTekst(1, "tekst3tekst");
		esn.replaceTekst(2, "new text");
		esn.deleteTekst(3);
		esn.representNotepad();
		String s = "new";
		containsWord(esn.searchWord(s), s);
		s = "alabala";
		containsWord(esn.searchWord(s), s);
		esn.printAllPagesWithDigits();
		esn.stop();
		esn.start();
		esn.start();
		esn.setTitle(1, "Title One");
		esn.addTekst(1, "addTekst");
		esn.addTekst(1, "jhjh");
		esn.addTekst(1, null);
		esn.replaceTekst(2, "new text21");
		esn.deleteTekst(3);		
		System.out.println();
		esn.representNotepad();
		containsWord(esn.searchWord(s), s);
		s = "new";
		containsWord(esn.searchWord(s), s);
		esn.printAllPagesWithDigits();

	}
	
	static void containsWord(int r, String searchWord){
		if(r == -2){
			return;
		}else if(r == -1){
			System.out.println("Word \"" + searchWord + "\" is not found !");
		}else{
			System.out.println("Word \"" + searchWord + "\" is found on page " + r);
			
		}
	}

}
