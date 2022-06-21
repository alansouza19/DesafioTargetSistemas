package desafiotargetsistemas.fibonacci;

public class SequenciaFibonacci {

	public static void main(String[] args) {
		
	
<<<<<<< HEAD
		 	int n1 = 1;
		 	int n2 = 0;
		 	int verificadorDeFibonnaci = 13;
=======
		int n1 = 1;
	     	int n2 = 0;
	     	int verificadorDeFibonnaci = 13;
>>>>>>> aba86afe8352541440ebd6cddba6960d66215320
	     
	     
	        System.out.println(n2);
	        System.out.println(n1);
	        
	        for(int i = 0; i < 10; i++){
	            n1 = n1 + n2;
	            n2 = n1 - n2;
	            System.out.println(n1);
	         
	         int fibo = n1;
	         if(verificadorDeFibonnaci == fibo) {
	        	 System.out.println(verificadorDeFibonnaci + " é um número Fibonnaci!");
	         }
	           
<<<<<<< HEAD
	     }
=======
	      }
>>>>>>> aba86afe8352541440ebd6cddba6960d66215320
	}

}
