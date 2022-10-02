import java.lang.reflect.Array;
import java.sql.Time;
import java.util.*;
public class SamlingsTest {
	public static void main(String[] args) {
			HashSet<Integer> set = new HashSet<>();
			Vector<Integer> tab = new Vector<>();
			Vector<Integer> sokeTal = new Vector();
			Random tern = new Random();
			int antElement = 100000;
			int tall = 386;  
			
			for(int i = 0; i < 10000; i++)
			{
				sokeTal.add(tern.nextInt() % antElement);
			}

			for (int i = 0; i < antElement; i++)
			{ 
			   tall = (tall + 45713) % 10000; 
			   tab.add(tall);
			   set.add(tall);
			}
			
			tab.sort(null);
			
			int antalfunneITab = 0;
			int antalfunneISet = 0;
			long millis = System.nanoTime();
			for(int i = 0; i < 10000; i++)
			{
				if(set.contains(sokeTal.elementAt(i)))
					antalfunneISet++;
			}
			long tidTab =  System.nanoTime() - millis;
			millis = System.nanoTime();
			for(int i = 0; i < 10000; i++)
			{
				if(Collections.binarySearch(tab, sokeTal.elementAt(i)) > 0) 
					antalfunneITab++;
			}
			long tidSet = System.nanoTime() - millis;
			
			System.out.printf("Set tok %d nS og fant %d tal\n", tidSet / 1000, antalfunneISet);
			System.out.printf("Tab tok %d nS og fant %d tal\n", tidTab / 1000, antalfunneITab);
	}
}
