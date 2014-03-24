package sopadletras;

import java.awt.Font;
import java.util.Scanner;

public class sopa {

	public static void main(String[] args) {
		System.out.print("  ♪SOPA DE LETRAS♪");
		System.out.println();
		Scanner read = new Scanner(System.in); 
	    char sopa[][]=new char[10][10];//arreglos aprendidos en clase 
		sopa [0][0]='p';
		sopa [1][0]='r';
		sopa [2][0]='o';
		sopa [3][0]='g';
		sopa [4][0]='r';
		sopa [5][0]='a';
		sopa [6][0]='m';
		sopa [7][0]='a';
		sopa [8][0]='i';
		sopa [9][0]='j';
		sopa [0][1]='k';
		sopa [1][1]='l';
		sopa [2][1]='m';
		sopa [3][1]='n';
		sopa [4][1]='o';
		sopa [5][1]='p';
		sopa [6][1]='q';
		sopa [7][1]='r';
		sopa [8][1]='s';
		sopa [9][1]='t';
		sopa [0][2]='u';
		sopa [1][2]='v';
		sopa [2][2]='x';
		sopa [3][2]='y';
		sopa [4][2]='z';
		sopa [5][2]='a';
		sopa [6][2]='b';
		sopa [7][2]='c';
		sopa [8][2]='d';
		sopa [9][2]='e';
		sopa [0][3]='l';
		sopa [1][3]='f';
		sopa [2][3]='i';
		sopa [3][3]='n';
		sopa [4][3]='c';
		sopa [5][3]='a';
		sopa [6][3]='s';
		sopa [7][3]='a';
		sopa [8][3]='u';
		sopa [9][3]='t';
		sopa [0][4]='e';
		sopa [1][4]='p';
		sopa [2][4]='l';
		sopa [3][4]='u';
		sopa [4][4]='m';
		sopa [5][4]='a';
		sopa [6][4]='o';
		sopa [7][4]='a';
		sopa [8][4]='s';
		sopa [9][4]='i';
		sopa [0][5]='r';
		sopa [1][5]='e';
		sopa [2][5]='u';
		sopa [3][5]='t';
		sopa [4][5]='e';
		sopa [5][5]='r';
		sopa [6][5]='e';
		sopa [7][5]='y';
		sopa [8][5]='s';
		sopa [9][5]='i';
		sopa [0][6]='e';
		sopa [1][6]='e';
		sopa [2][6]='o';
		sopa [3][6]='n';
		sopa [4][6]='e';
		sopa [5][6]='d';
		sopa [6][6]='e';
		sopa [7][6]='y';
		sopa [8][6]='s';
		sopa [9][6]='i';
		sopa [0][7]='c';
		sopa [1][7]='e';
		sopa [2][7]='u';
		sopa [3][7]='t';
		sopa [4][7]='e';
		sopa [5][7]='c';
		sopa [6][7]='e';
		sopa [7][7]='y';
		sopa [8][7]='s';
		sopa [9][7]='e';
		sopa [0][8]='c';
		sopa [1][8]='e';
		sopa [2][8]='a';
		sopa [3][8]='t';
		sopa [4][8]='e';
		sopa [5][8]='d';
		sopa [6][8]='e';
		sopa [7][8]='y';
		sopa [8][8]='s';
		sopa [9][8]='i';
		sopa [0][9]='o';
		sopa [1][9]='m';
		sopa [2][9]='u';
		sopa [3][9]='t';
		sopa [4][9]='e';
		sopa [5][9]='m';
		sopa [6][9]='a';
		sopa [7][9]='s';
		sopa [8][9]='a';
		sopa [9][9]='i';
		
		for(int j=0; j<10;j++) // es un ciclo de repetir dentro de otro 
		{
			for(int i=0; i<10;i++)//es un ciclo de repetir dentro de otro 
			{
				System.out.print("❁"+sopa[i][j]+"");
				
			}
			System.out.println();
		}
		
		
        String correcto;
        Scanner deysi = new Scanner(System.in);
        
        int turno = 3;
        int palabrasencontradas = 0;
        System.out.println();
        System.out.println("****4 Turnos para adivinar****");
        while (turno > 0 && palabrasencontradas < 4)
        {
           
           System.out.println("Ingresar Palabra: ");
           correcto = deysi.next();
           correcto=correcto.toUpperCase();
        
            if (correcto.equals("CEUTEC")//palabras correctas de la sopa de letras 
               ||correcto.equals("DEYSI")//palabras correctas de la sopa de letras 
               || correcto.equals("CASA")//palabras correctas de la sopa de letras 
               || correcto.equals("FIN"))//palabras correctas de la sopa de letras 
            {
                palabrasencontradas++;
            }
            else
            {
                turno--;
            }                                              
        }   
        if (turno == 0)
        {
            System.out.println("Perdiste lo Lamento✖✖✖✖");//no adivino el juego
        }
        else
        {
            System.out.println("Ganastes Eres Bueno en Esto〠〠〠〠");// es inteligente....
            

			 
		return; 
	}
}


}
