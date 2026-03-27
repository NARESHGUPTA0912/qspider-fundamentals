package NumberPrograms;

public class Q1 {
    public static void printAndCountFactors(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("Total Factors: "+count);
    }
    
    public static void printAndCountFactors2(int n){
        System.out.println(1 + " "+n+" ");
        int count = 0;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("Total Factors: "+count);
    }
    
    public static void printAndCountFactors3(int n){
        System.out.println("1 "+n+" ");
        int count = 2;
        for(int i=2; i*i<=n; i++){
        // for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                int fact1 = i;
                int  fact2 = n/i;
                if(fact1!=fact2){
                    System.out.println(fact1+" "+fact2+" ");
                    count+=2;
                }else{
                    System.out.println(fact1+" ");
                    count++;
                }
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("Total Factors: "+count);
    }

    public static void printCountFactor(int n){
        if(n==1){
            System.out.print(1);
            System.out.print("Total Factors: "+1);
            return;
        }
        System.out.print(1+" "+n+" ");
        int count = 2;
        for(int i=2; i*i<=n; i++){
        // for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                int fact1 = i;
                int  fact2 = n/i;
                if(fact1!=fact2){
                    System.out.print(fact1+" "+fact2+" ");
                    count+=2;
                }else{  
                    System.out.print(fact2+" ");
                    count++;
                }
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("Total Factors: "+count);
    }

    public static void main(String[] args) {
        printAndCountFactors3(16);
    }
}
