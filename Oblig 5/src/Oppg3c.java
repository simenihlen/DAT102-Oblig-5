public class Oppg3c {
	public static void main(String[] args) {
		String abc = "ab";
		int  stringSum = 0;
		int strlen = abc.length();
		for(int i = 0; i < strlen; i++)
		{
			if(i == strlen - 1)
				stringSum += abc.charAt(strlen - 1);
			else
				stringSum +=  abc.charAt(i)*(Math.pow(31, (strlen-i-1)));
		}
		System.out.printf("String har sum %d og eg rekna meg fram til %d \n", abc.hashCode(), stringSum);
	}
}
