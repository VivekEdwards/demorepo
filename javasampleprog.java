import java.io.*;
class javasampleprog
{
	public static void main(String arg[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter you name:");
		String name = br.readLine();
		System.out.println("Hello!! "+name+" Welcome to GitHub and this prog written in java");
	}
}
