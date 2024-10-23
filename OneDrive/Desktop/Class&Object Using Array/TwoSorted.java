import java.util.Arrays;

public class TwoSorted {
    public static void main(String[] args) {
        
        int a[] = {2,3,4,5,6};  
        int b[] = {1,8,7,4,2};  

        int c[] = new int[a.length + b.length];

        int a1=0;
        int b1=0;
        int c1=0;
        while(a1<a.length && b1<b.length){
            if(a[a1]<=b[b1]){
                c[c1]=a[a1];
                a1++;
                c1++;
            }else{
                c[c1]=b[b1];
                b1++;
                c1++;
            }
        }
        while(a1<a.length)
        {
            c[c1]=a[a1];
            a1++;
            c1++;
        }
        while(b1<b.length)
        {
            c[c1]=b[b1];
            b1++;
            c1++;
        }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }


    }

}
