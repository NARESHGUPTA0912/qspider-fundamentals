package while2;

public class Program1_To_20 {

    static void sol1(){
        int i=1,sum=0;
        while(i<=100){
            sum=sum+i;
            i++;
        }System.out.println("Sum: "+sum);
    }
    static void sol2(){
        int i=1,sum=0;
        while(i<=100){
            if(i%2==0) sum=sum+i;
            i++;
        }System.out.println("Even Sum: "+sum);
    }
    static void sol3(){
        int i=1,sum=0;
        while(i<=100){
            if(i%2!=0) sum=sum+i;
            i++;
        }System.out.println("Odd Sum: "+sum);
    }
    static void sol4(){
        int i=1,sum=0;
        while(i<=100){
            sum=sum+(i*i);
            i++;
        }System.out.println("Square Sum: "+sum);
    }
    static void sol5(){
        int i=1,sum=0;
        while(i<=100) sum += (i*i*i++);
        System.out.println("Cube Sum: "+sum);
    }
    static void sol6(){
        int i=1,sum=0;
        while(i<=100){
            if(i%2==0) sum=sum+(i*i);
            i++;
        }System.out.println("Even Square Sum: "+sum);
    }
    static void sol7(){
        int i=1,sum=0;
        while(i<=100){
            if(i%2==0) sum=sum+(i*i*i);
            i++;
        }System.out.println("Even Cube Sum: "+sum);
    }
    static void sol8(){
        int i=1,sum=0;
        while(i<=100){
            if(i%2!=0) sum=sum+(i*i);
            i++;
        }System.out.println("Odd Square Sum: "+sum);
    }
    static void sol9(){
        int i=1,sum=0;
        while(i<=100){
            if(i%2!=0) sum=sum+(i*i*i);
            i++;
        }System.out.println("Odd Cube Sum: "+sum);
    }
    static void sol10(){
        int i=1,sum=0;
        while(i<=100){
            sum=sum+(i*(i+1));
            i++;
        }System.out.println("Series Sum: "+sum);
    }
    static void sol11(){
        int i=1; long sum=0;
        while(i<=100){
            sum += i * (i + 1) * (i + 1);
            i++;
        }System.out.println("Series Sum: "+sum);
    }
    static void sol12(){
        int i=1; long sum=0;
        while(i<=100){
            sum=sum+(i*i*(i+1));
            i++;
        }System.out.println("Series Sum: "+sum);
    }
    static void sol13(){
        int i=1;    double sum=0;
        while(i<=100){
            sum=sum+(1.0/i);
            i++;
        }System.out.println("Series Sum: "+sum);
    }
    static void sol14(){
        int i=2;    double sum=0;
        while(i<=100){
            sum=sum+(1.0/i);
            i=i+2;
        }System.out.println("Series Sum: "+sum);
    }
    static void sol15(){
        int i=1;    double sum=0;
        while(i<=100){
            sum=sum+(1.0/i);
            i=i+2;
        }System.out.println("Series Sum: "+sum);
    }
    static void sol16(){
        int i=1;    double sum=0;
        while(i<=100){
            sum=sum+(1.0/(i*i));
            i++;
        }System.out.println("Series Sum: "+sum);
    }
    static void sol17(){
        int i=1;    double sum=0;
        while(i<=100){
            sum=sum+(1.0/(i*i*i));
            i++;
        }System.out.println("Series Sum: "+sum);
    }
    static void sol18(){
        int i=1;    double sum=0;
        while(i<=100){
            sum=sum+(1.0/(i*(i+1)));
            i++;
        }System.out.println("Series Sum: "+sum);
    }
    static void sol19(){
        int n=15;
        int i=1; long fact=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println(n+"! = "+fact);
    }
    static void sol20(){
        int a=5, b=4;
        int i=1,result=1;
        while(i<=b){
            result*=a;
            i++;
        }
        System.out.println(a+"to the power "+b+" = "+result);
    }
    static void sol21(){
        int n=7;
        int i=1;
        while(i<=10){
            System.out.println(n+" x "+i+" = "+(n*i++));
        }
    }

    public static void main(String[] args) {
        sol19();
    }
}
