package DP;

public class LongestCommentSubsequence {
	public static void main(String[] args) {
		String s1 = "ABCDAF";
		String s2 = "ACBCF";
		char x[] = s1.toCharArray();
		char y[] = s2.toCharArray();
		int m = x.length;
		int n = y.length;
		int length = lcs(x, y, m, n);
		System.out.println(length);
	}

	private static int lcs(char[] x, char[] y, int m, int n) {
		int l[][] = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					l[i][j] = 0;
				else if (x[i - 1] == y[j - 1])
					l[i][j] = 1 + l[i - 1][j - 1];
				else if (x[i - 1] != y[j - 1])
					l[i][j] = max(l[i][j - 1], l[i - 1][j]);
			}
		}
		return l[m][n];
	}

	private static int max(int i, int j) {
		return (i > j) ? i : j;
	}
}
