package Others;
class CheckAlphabet
{
	public static void main(String[] args)
	{
		char c='b';
		if((c>='A' && c<='Z')||(c>='a' && c<='z'))
		{
			System.out.println(c+"is a alphabet");
		}
		else
		{
			System.out.println(c+"is not a alphabet");
		}
	}
}