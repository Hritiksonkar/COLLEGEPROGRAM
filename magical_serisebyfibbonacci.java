public static int fibonacci(int n){
    if (n<=0);
    return 0;


}
 elseif(n==1)
{
    return 1;
    
}
else
{
    return fibonacci(n-1)+fibonacci(n-2);
}
}
public static void printFibonacciSequnse(int n){
    for(int i=0;i<n;i++){
        System.out.println(fibonacci(i)+"");

    }
    System.out.println();

}

public static void main (String[]args){
    int n =10;
    printFibonacciSequnse(n);

}