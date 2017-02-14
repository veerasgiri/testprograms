package test;

public class permutation {

	static int totalPermutationsAllowed=0;
	public static void main(String args[]) {
		permu(0, args[0]);
		System.out.println("Total Permutations allowed:"+totalPermutationsAllowed);

	}

	static void permu(int fixed, String s) {
		char[] chr = s.toCharArray();
		if (fixed == s.length()){
			System.out.println(s);
			totalPermutationsAllowed++;	
		}
		for (int i = fixed; i < s.length(); i++) {
			char c = chr[i];
			chr[i] = chr[fixed];
			chr[fixed] = c;
			permu(fixed + 1, new String(chr));
		}
		
		
		
	}
}