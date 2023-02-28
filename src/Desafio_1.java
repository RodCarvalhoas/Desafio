public class Desafio_1 {

	public static void main(String[] args) {

	  int n1 = 0;
	  int n2 = 1;
	  int n3 = 0;
	  int numTest = 11;
	  int[] x = new int[100];
	  
	  //System.out.print(n1 + ", " + n2);
	  x[0] = n1;
	  x[1] = n2;
	  
	  for(int i = 2; i< x.length; i++) {
		  n3 = n1 + n2;
		  x[i] = n3;
		  //System.out.print(", " + n3);
		  n1 = n2;
		  n2 = n3;
	  }
	  for(int num : x) {
		  if(num == numTest) {
			  System.out.println("Número " + numTest + " pertence a sequência");
		  }else {
			  System.out.println("Número " + numTest + " não pertence a sequência");
			  break;
		  }
	  }
	  
		
		
		
		
		
		
		
	   //DESAFIO 1
	  /*int indice = 13;
		int soma = 0;
		int k = 0;

		while (k < indice) {
			k += 1;
			soma += k;
		}
		System.out.println(soma); */
	
	}

}
