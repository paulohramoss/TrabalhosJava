package primeiroProjeto;

public class Exaula {

	public static void main(String[] args) {
			
			int m1[][] = { {1, 2, 3, 4}, {5, 6} };
			int m2[][] = { {1, 2}, {8}, {4, 5, 6} };

			 int i, j;
			 for (i=0; i< m2.length; i++) {
			    System.out.printf("%da. linha: ", (i+1));
			 for (j=0; j<m2[i].length; j++) {
			       System.out.printf("%d ", m2[i][j]);
			    }
			    System.out.printf("\n");
			 }
		}
	}

