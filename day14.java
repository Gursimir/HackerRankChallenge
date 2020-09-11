package HRC;

import java.util.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
	
    Difference(int[] a){
      this.elements=a;
    }

    int computeDifference(){
        for(int i=0;i<elements.length;i++){
            for(int j=i+1;j<elements.length;j++){
                int diff;
                diff = Math.abs(elements[j]-elements[i]);
                if(diff>maximumDifference){
                    maximumDifference=diff;
                }
            }
        }
        return maximumDifference;
    }
} 

public class day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}