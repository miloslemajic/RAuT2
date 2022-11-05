package domaci;

import java.util.Arrays;

public class Domaci04 {

	public static void main(String[] args) {

		//dom4
			String B="4,3,2,1;0,1,0;1,2,3,4";

			String[] red = B.split(";");

			//broj kolona
			int kolona = red[0].split(",").length;

			String[][] matrica = new String[red.length][kolona];

			for (int i = 0; i < red.length; i++) {
			    matrica[i] = red[i].split(",");
			}
			
			System.out.println(Arrays.deepToString(matrica));
			
			/*int [][] c = {{1,2,3},{4,5,6},{7,8,9}};
			System.out.println(Arrays.deepToString(c));*/
		}
	}


