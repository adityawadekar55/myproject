import java.io.*;
import java.util.*;
public class difference_of_two_array{
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int[] a1 = new int[n1];
        for(int i=0;i<a1.length;i++){
            a1[i] = scn.nextInt();
        }
        int n2= scn.nextInt();
        int[] a2 = new int[n2];
        for(int i=0;i<a2.length;i++){
            a2[i] = scn.nextInt();
        }
        int[] diff = new int[n2];
        int c=0;

        int i = a1.length-1;
        int j = a2.length-1;
        int k = diff.length-1;

        while(k>=0){
            int d =0;
            int alv = i>=0? al[i]: 0;

            if(a2[j] +c >= alv){
                d= a2[j] +c - alv;
                c=0;
            }else{
                d= a2[j] +c +10 - alv;
                c= -1;
            }
            diff[k] = d;

            i--;
            j--;
            k--;
        }
        int idx = 0;
        while(idx<diff.length){
            if(diff[idx] = 0){
                idx++;
            }
            else{
                break;
            }
            while(idx<diff.length){
                Syatem.out.println(diff[idx]);
                idx++;   
            }
        }
    }
}