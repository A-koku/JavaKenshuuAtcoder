import java.util.Scanner;
import java.util.List;
import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		//input
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String Cn[] = new String[N];
		for(int i = 0; i < N;i++){
			//cn[i] = sc.nextString();
			Cn[i] = sc.next();
		}
		Main mainClass = new Main();
		mainClass.answer(N,Cn);
	}

	//output Method
	void answer(int N,String[] Cn){
		Main mainClass = new Main();
		//Judge Foreced Finishe Judge
		int currentAggregate[]= new int[26];
		//int currentAggregate[] = {1,6,1};
		
		//Judge Foreced Finishe Judge
		if(mainClass.enRouteForcedFinishJudge(N,mainClass.firstCandidacy(currentAggregate),mainClass.secondCandidacy(currentAggregate),mainClass.currentallAggregate(currentAggregate))){
			//ForceFinish
			System.out.println("ForceFinish");
		}else{
			System.out.println("continue");
		}

	}

	//Judge Foreced Finishe Judge
	boolean enRouteForcedFinishJudge(int N,int First,int Second,int currentAggregated){
		System.out.println("N " + N + " First " + First + " Second " + Second + " currentAggregate " + currentAggregated  );
		if(First >= (N - currentAggregated + Second)){
			return true;
		}
		
		return false;
	}

	//First election Candidacy
	int firstCandidacy(int[] firstCandidacy){
		int firstArrayNumber = 0;
		for (int i = 0; i < firstCandidacy.length; i++) {
			if (firstCandidacy[i] > firstArrayNumber) {
				firstArrayNumber = firstCandidacy[i];
			}
		}
		//System.out.println("First" + firstArrayNumber);
		return firstArrayNumber;
	}

	//Second election Candidacy
	int secondCandidacy(int[] secondCandidacy){
		int kesitabasyo = 0;
		int firstArrayNumber = 0;
		int secondArrayNumber = 0;
		Main mainClass = new Main();
		firstArrayNumber = mainClass.firstCandidacy(secondCandidacy);
		//check double more
		if(mainClass.checkFirstDoubleMore(firstArrayNumber,secondCandidacy)){
			return firstArrayNumber;
		}else{
			//sameNumber = 0
			for(int i = 0; i < secondCandidacy.length; i++){
				if(secondCandidacy[i] == firstArrayNumber){
					secondCandidacy[i] = 0;
					kesitabasyo = i;
				}
			}
			for (int i = 0; i < secondCandidacy.length; i++) {
				if (secondCandidacy[i] > secondArrayNumber  ) {
					secondArrayNumber = secondCandidacy[i];
				}
			}
			secondCandidacy[kesitabasyo] = firstArrayNumber;

		}
		//System.out.println("Second" + secondArrayNumber);
		return secondArrayNumber;
	}


	//check double more
	boolean checkFirstDoubleMore(int firstArrayNumber,int[] secondCandidacy){
		int count = 0;
		for(int i = 0; i < secondCandidacy.length; i++){
			if(firstArrayNumber == secondCandidacy[i]){
				count++;
				if(count == 2){
					return true;
				}
			}
		}
		return false;
	}

	//currentallAggregate
	int currentallAggregate(int[] currentAggregated){
		int total = 0;
		for(int i = 0; i < currentAggregated.length; i++){
			System.out.println(currentAggregated[i]);
			total = total + currentAggregated[i];
		}
		return total;
	}

	
}
