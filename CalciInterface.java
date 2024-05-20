import java.util.Scanner;

interface calci{
  int add(int a,int b);
}

public class calciImpl implements claci{
    public int add(int a,int b){
        return a+b;
    }
}

class CalciDriver{
    Public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        calciImpl calci=new calciImpl();
        System.out.println(calci.add(a,b))
    }
}