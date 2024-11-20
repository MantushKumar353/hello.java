
import java.util.ArrayList;
import java.util.Scanner;

class hellow{
    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
       ArrayList<Integer>ans= finno(n, b);
        System.err.println(ans);
    }
    public static ArrayList<Integer>finno(int a, int b){
ArrayList<Integer>list=new ArrayList<>();
list.add(a);
list.add(b);
for(int i=0; i<5; i++){
int temp=a+b;
list.add(temp);
a=b;
b=temp;
}

return list;

    }
}