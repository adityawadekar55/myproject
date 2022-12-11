import java.util.*;
public class celebrity{
    public static void main(String[] args){
        int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer> st = new Stack <>();
    	for(int i =0; i<n;i++){
    	    st.push(i);
    	}
    	while(st.size() >=2){
    	    int i= st.pop();
    	    int j= st.pop();
    	    
    	    if(M[i][j] == 1){
    	        st.push(i);
    	    }
    	    else{
    	        st.push(j);
    	    }
    	}
    	int pot = st.pop();
    	for(int i=0;i<n;i++){
    	    if(i !=pot){
	        if(M[pot][i]==1 || M[i][pot]==0){
    	            return -1;
    	           
    	        }
    	    }
    	}
    	return pot;
    }
}