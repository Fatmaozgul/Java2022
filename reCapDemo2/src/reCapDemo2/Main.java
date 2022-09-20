package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		
	//double[] myList =new double[4]; ve
	// double[] myList = {1.2,1.3,4.3,5.6} aynı şeydir
     double[] myList  = {1.2,1.3,4.3,5.6};
     double total=0; 
    //en buyuk sayıyı bulalım
     double max = myList[0];
			
	for(double number:myList) {
		if(max<number){
			max = number;
		}
		total = total + number;
	System.out.println(number);
	}

    System.out.println(total);
    System.out.println("En büyük =" +max);
	}

}
 