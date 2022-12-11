import java.io.*;
import java.util.*;
public class largest_area_histogram{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int[] hist = new int[n];
        


        int[] rb = new int[hist.length];
        Stack<Integer> st = new Stack<>();
        st.push(hist.length-1);
        rb[hist.length -1 ] = hist.length;
        
        for(int i =hist.length -2; i>=0 ; i++){
            while(st.size()> 0 && hist[i]<hist[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                rb[i] = hist.length;
            }else{
                rb[i] = st.peek();
            }
        }
        
        
        
        int[] lb = new int[hist.length];
        st = new Stack<>();
        st.push(0);
        lb[0] =-1;
        
        for(int i =1;i<hist.length ; i++){
            while(st.size()>0 && hist[i] < hist[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                rb[i] = hist.length;
            }else{
                rb[i] = st.peek();
            }
            
        }
        
        int maxArea=0;
        for(int i= 0; i<hist.length ; i++){
            int width = rb[i] - lb[i]-1;
            int area = width * hist[i];
            if(area > maxArea){
                maxArea = area;
            }
        }
        System.out.println(maxArea);
    }
}