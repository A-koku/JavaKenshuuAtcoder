import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
class Main1
{
	public static void main(String[] args)
	{
		// BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		// String str="";
		// String instr="";
		// str=bfr.readLine();
		// instr=str;
		Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        String instr=sc.nextLine();
		String[] itimozizutudainyuu = instr.split("", 0);
		for(String s : itimozizutudainyuu)
		{
            list.add(s);
        }

        // list.addAll(Arrays.asList(itimozizutudainyuu));

		String itimozime = itimozizutudainyuu[0];
		int hairetunonakgasa = itimozizutudainyuu.length;
		//System.out.println(hairetunonakgasa);

		String saigonoitimozi = itimozizutudainyuu[hairetunonakgasa-1];
		//System.out.println(saigonoitimozi);
		if(hairetunonakgasa<4){
			for(String s : itimozizutudainyuu)
			{
			System.out.print(s);
			}
		}else if(hairetunonakgasa%2 == 1)
		{
			
			int tyuuou1 = hairetunonakgasa/2;
			
			int tyuuou2 = tyuuou1 + 2;
            
            list.add(tyuuou1, itimozime);
            list.add(tyuuou2, saigonoitimozi);
         
            list.remove(0);
            list.remove(list.size()-1);
            for (String l : list) {
                System.out.print(l); 
            }

		}else if(hairetunonakgasa%2 == 0)
		{
			int tyuuou1 = hairetunonakgasa/2;
			int tyuuou2 = tyuuou1 + 1;
            list.add(tyuuou1, itimozime);
            list.add(tyuuou2, saigonoitimozi);
            list.remove(0);
            list.remove(list.size()-1);
            for (String l : list) {
                System.out.print(l);
            }			
		}
		System.out.println();

	}
}
		//javac -encoding UTF-8 Main.java
