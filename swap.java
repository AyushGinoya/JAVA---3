

class swap{
	static void swapValuesUsingThirdVariable(int m, int n)
	{

		int temp = m;
		m = n;
		n = temp;
		System.out.println("m=" + m
						+ "\n"+"n=" + n);
	}

	public static void main(String[] args)
	{
		int m = 9, n = 5;
		swapValuesUsingThirdVariable(m, n);
	}
}
