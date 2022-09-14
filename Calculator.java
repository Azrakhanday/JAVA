class Claculator{
    int x;
    int y;
    int sum;
    public int add(int m,int n)
{
    x=m;
    y=n;
    return x+y;
}
public int sub(int m,int n)
{
    x=m;
    y=n;
    return x-y;
}
}

class Calculatorchd extends Claculator{
    public int mul ( int m, int n){
    x=m;
    y=n;
    return x*y;
    }


public static void main (String args [] ){
    Calculatorchd obj;
    obj=new Calculatorchd();
    System.out.println(obj.add(10,20));
    System.out.println(obj.sub(20,10));
}
    
}
