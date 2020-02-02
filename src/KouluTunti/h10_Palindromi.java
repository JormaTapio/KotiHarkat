package KouluTunti
;

import java.util.*;

/**
 * Harjoitus 8-10: Palindromi
 * 
 * Tee Ohjelma, joka tarkastaa, onko jokin sana palindromi vai ei.
 * Tarkastuksessa voi kÃ¤yttÃ¤Ã¤ sekÃ¤ pinoa ettÃ¤ jonoa.
 *
 * Queue<Character> q = new LinkedList<Character>(); Stack<Character> s = new
 * Stack<Character>();
 * 
 * Vinkki: Pinossa otetaan pÃ¤Ã¤limmÃ¤inen (viimeinen) ja jonossa otetaan
 * ensimmÃ¤inen Molemmissa rakenteissa lisÃ¤Ã¤minen tehdÃ¤Ã¤n aina viimeiseksi.
 */
public class h10_Palindromi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String rivi = "";
		do {
			System.out.println("Anna lause testattavaksi>");
			rivi = in.nextLine();
			if (onPalindromi(rivi)) {
				System.out.println("On palindromi");
			} else {
				System.out.println("Ei ole palindromi");
			}

		} while (rivi.length() > 0);
	}

	public static boolean onPalindromi(String mj) {
		Queue<Character> q = new LinkedList<Character>();
		Stack<Character> s = new Stack<Character>();
		Character kirjain;
		int i = 0;

		for (i = 0; i < mj.length(); i++) {
			kirjain = mj.charAt(i);
			if (Character.isLetter(kirjain)) {
				q.add(kirjain);
				s.push(kirjain);
			}
		}

		while (!q.isEmpty()) {
			if (q.remove() != s.pop()) {
				return false;
			} // Jonossa eri kirjain kuin pinossa
			System.out.println(q + ":" + s);
		}
		return true;

	}
}