public class swap {
    public static void main(String[] args) {
        int a=10,b=30;
        System.out.println("before swapping:"+a+" "+b);
        //locic-1: temporary variable t
        int t=a;
        a=b;
        b=t;
        System.out.println("after swapping:"+a+" "+b);
        //logic-2: add and subtract
        //a=30,b=10
        a=a+b;   //a=30+10=40
        b=a-b;   //b=40-10=30
        a=a-b;   //now a=40-30=10
        System.out.println("after swapping:"+a+" "+b);
        //logic-3:use * and /
        //in logic 3 values a and b should not be zero
        //a=10,b=30
        a=a*b;  //10*30=300
        b=a/b;  //300/30=10
        a=a/b;  //300/10=30
        System.out.println("after swapping:"+a+" "+b);
        //logic-4: use bitwise xor(^)
        //a=30,b=10
        a=a^b;  //a^b=30^10=20
        b=a^b;  //20^10=30
        a=a^b;  //20^30=10
        System.out.println("after swapping:"+a+" "+b);
        //logic-5: single statement
        //a=10,b=30
        b=a+b-(a=b); //calculation from right to left -->first a=b ie a=30 now b=(10+30)-30=10
        System.out.println("after swapping:"+a+" "+b);
    }
}
