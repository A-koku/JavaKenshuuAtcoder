import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
class Main
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		String moziretu="",muda="";
		str=bfr.readLine();
		moziretu=str;
		str=bfr.readLine();
		muda=str;

		String suuzihosii[] = moziretu.split(",");
		// for(String display : suuzihosii){
		// 	System.out.println(display);
		// }
		//space exit
		if(muda.contains(" ")){
			int total = 0;
			muda = muda.replace(" ", "");
			for(int i = 0;i < suuzihosii.length;i++){
			int index = suuzihosii[i].indexOf("|");
			//System.out.println(suuzihosii[i].substring(index+1));
			total = total + Integer.parseInt(suuzihosii[i].substring(index+1));
			}
			System.out.println(total);
		//space not
		}else{
			int total = 0;
			Set set = new HashSet();
			for(int i = 0;i < suuzihosii.length;i++){
			int index = suuzihosii[i].indexOf("|");
			set.add(suuzihosii[i].substring(index+1));
			}
			for (Iterator<String> i = set.iterator(); i.hasNext();) {
				total = total + Integer.parseInt( i.next());
			}
			System.out.println(total);

		}
 
		
	}
}
