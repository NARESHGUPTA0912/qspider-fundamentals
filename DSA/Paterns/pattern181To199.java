package Paterns;

public class pattern181To199 {
    
    public static void pattern181(int n) {
        if(n%2==0){
        System.out.println("Please enter an odd number");
        return;
        }
        int mid=n/2;   int space=0;   int star=n;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("  ");
            for (int j = 1; j <= star; j++)
                System.out.print("* ");
            System.out.println();

            if (i <= mid) {
                space++;    star -= 2;
            } else {
                space--;    star += 2;
            }
        }
    }

    public static void pattern182(int n) {
        if(n%2==0){
        System.out.println("Please enter an odd number");
        return;
        }
        int mid=n/2;   int space=0;   int star=n;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("   ");
            for (int j = 1; j <= star; j++)
                System.out.printf("%-2d ",i);
            System.out.println();

            if (i <= mid) {
                space++;    star -= 2;
            } else {
                space--;    star += 2;
            }
        }
    }

    public static void pattern183(int n) {
        if(n%2==0){
        System.out.println("Please enter an odd number");
        return;
        }
        int mid=n/2;   int space=0;   int star=n;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("   ");
            for (int j = 1; j <= star; j++)
                System.out.printf("%-2d ",i%2);
            System.out.println();

            if (i <= mid) {
                space++;    star -= 2;
            } else {
                space--;    star += 2;
            }
        }
    }

    public static void pattern184(int n) {
        if(n%2==0){
        System.out.println("Please enter an odd number");
        return;
        }
        int mid=n/2;   int space=0;   int star=n;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("   ");
            for (int j = 1; j <= star; j++)
                System.out.printf("%-2d ",j);
            System.out.println();

            if (i <= mid) {
                space++;    star -= 2;
            } else {
                space--;    star += 2;
            }
        }
    }

    public static void pattern185(int n) {
        if(n%2==0){
        System.out.println("Please enter an odd number");
        return;
        }
        int mid=n/2;   int space=0;   int star=n;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("   ");
            for (int j = 1; j <= star; j++)
                System.out.printf("%-2d ",j%2);
            System.out.println();

            if (i <= mid) {
                space++;    star -= 2;
            } else {
                space--;    star += 2;
            }
        }
    }

    public static void pattern186(int n) {
        if(n%2==0){
        System.out.println("Please enter an odd number");
        return;
        }
        int mid=n/2;   int space=0;
        int star=n;   int num=1;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("   ");
            for (int j = 1; j <= star; j++)
                System.out.printf("%-2d ",num++);
            System.out.println();

            if (i <= mid) {
                space++;    star -= 2;
            } else {
                space--;    star += 2;
            }
        }
    }

    public static void pattern187(int n) {
        if(n%2==0){
        System.out.println("Please enter an odd number");
        return;
        }
        int mid=n/2;   int space=0;
        int star=n;   int num=(n*(n+1)/2)+mid;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("   ");
            for (int j = 1; j <= star; j++)
                System.out.printf("%-2d ",num--);
            System.out.println();

            if (i <= mid) {
                space++;    star -= 2;
            } else {
                space--;    star += 2;
            }
        }
    }

    public static void pattern188(int n) {
        if(n%2==0){
        System.out.println("Please enter an odd number");
        return;
        }
        int mid=n/2;   int space=0;
        int star=n;
        for (int i = 1; i <= n; i++) {
            int num=1;
            for (int s = 1; s <= space; s++)
                System.out.print("   ");
            for (int j = 1; j <= star; j++){
                System.out.printf("%-2d ",num);
                if(j<=star/2)
                    num++;
                else
                    num--;
            }
            System.out.println();
            if (i <= mid) {
                space++;    star -= 2;
            } else {
                space--;    star += 2;
            }
        }
    }

    public static void pattern189(int n) {
        if(n%2==0){
        System.out.println("Please enter an odd number");
        return;
        }
        int mid=n/2;   int space=0;
        int star=n;
        for (int i = 1; i <= n; i++) {
            int num=star/2;
            for (int s = 1; s <= space; s++)
                System.out.print("   ");
            for (int j = 1; j <= star; j++){
                System.out.printf("%-2d ",num);
                if(j<=star/2)
                    num--;
                else
                    num++;
            }
            System.out.println();

            if (i <= mid) {
                space++;    star -= 2;
            } else {
                space--;    star += 2;
            }
        }
    }

    public static void pattern190(int n) {
        if(n%2==0){
        System.out.println("Please enter an odd number");
        return;
        }
        int mid=n/2;   int space=0;
        int star=n;
        for (int i = 1; i <= n; i++) {
            int num=star/2 +1;
            for (int s = 1; s <= space; s++)
                System.out.print("   ");
            for (int j = 1; j <= star; j++){
                System.out.printf("%-2d ",num);
                if(j<=star/2)
                    num--;
                else
                    num++;
            }
            System.out.println();

            if (i <= mid) {
                space++;    star -= 2;
            } else {
                space--;    star += 2;
            }
        }
    }

    public static void pattern191(int n) {
        if(n%2==0){
        System.out.println("Please enter an odd number");
        return;
        }
        int mid=n/2;   int space=0;
        int star=n;    int num=1;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("   ");
            for (int j = 1; j <= star; j++)
                System.out.printf("%-2d ",num);
            System.out.println();
            if (i <= mid) {
                space++;    star -= 2;   num++;
            } else {
                space--;    star += 2;   num--;
            }
        }
    }

    public static void pattern192(int n) {
        if(n%2==0){
        System.out.println("Please enter an odd number");
        return;
        }
        int mid=n/2;   int space=0;
        int star=n;    int num=mid;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("   ");
            for (int j = 1; j <= star; j++)
                System.out.printf("%-2d ",num);
            System.out.println();
            if (i <= mid) {
                space++;    star -= 2;   num--;
            } else {
                space--;    star += 2;   num++;
            }
        }
    }

    public static void pattern193(int n) {
        if(n%2==0){
        System.out.println("Please enter an odd number");
        return;
        }
        int mid=n/2;   int space=0;
        int star=n;    int num=mid+1;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("   ");
            for (int j = 1; j <= star; j++)
                System.out.printf("%-2d ",num);
            System.out.println();
            if (i <= mid) {
                space++;    star -= 2;   num--;
            } else {
                space--;    star += 2;   num++;
            }
        }
    }

    public static void pattern194(int n) {
        if(n%2==0){
        System.out.println("Please enter an odd number");
        return;
        }
        int mid=n/2;   int space=0;
        int star=n;    int num=star;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("   ");
            for (int j = 1; j <= star; j++)
                System.out.printf("%-2d ",num);
            System.out.println();
            num--;
            if (i <= mid) {
                space++;    star -= 2;   //num--;
            } else {
                space--;    star += 2;   //num++;
            }
        }
    }

    public static void pattern195(int n) {
        if(n%2==0){
        System.out.println("Please enter an odd number");
        return;
        }
        int mid=n/2;   int space=0;
        int star=n;    
        for (int i = 1; i <= n; i++) {
            int num=star;
            for (int s = 1; s <= space; s++)
                System.out.print("   ");
            for (int j = 1; j <= star; j++)
                System.out.printf("%-2d ",num--);
            System.out.println();
            // num--;
            if (i <= mid) {
                space++;    star -= 2;   //num--;
            } else {
                space--;    star += 2;   //num++;
            }
        }
    }

    public static void pattern195_2(int n) {
        if(n%2==0){
        System.out.println("Please enter an odd number");
        return;
        }
        int mid=n/2;   int space=0;
        int star=n;    int num=1;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("   ");
            for (int j = 1; j <= star; j++)
                System.out.printf("%-2d ",num++);
            System.out.println();
            // num--;
            if (i <= mid) {
                space++;    star -= 2;   num=1;
            } else {
                space--;    star += 2;   num=1;
            }
        }
    }

    public static void pattern196(int n) {
        if(n%2==0){
        System.out.println("Please enter an odd number");
        return;
        }
        int mid=n/2;   int space=0;
        int star=n;   char alp='A';
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= space; s++)
                System.out.print("  ");
            for (int j = 1; j <= star; j++)
                System.out.printf("%c ",alp);
            System.out.println();
            alp++;
            if (i <= mid) {
                space++;    star -= 2;
            } else {
                space--;    star += 2;
            }
        }
    }

    public static void pattern197(int n) {
        if(n%2==0){
        System.out.println("Please enter an odd number");
        return;
        }
        int mid=n/2;   int space=0;
        int star=n;
        for (int i = 1; i <= n; i++) {
            char alp='A';
            for (int s = 1; s <= space; s++)
                System.out.print("  ");
            for (int j = 1; j <= star; j++)
                System.out.printf("%c ",alp++);
            System.out.println();
            if (i <= mid) {
                space++;    star -= 2;
            } else {
                space--;    star += 2;
            }
        }
    }
    
    public static void pattern198(int n) {
        if(n%2==0){
        System.out.println("Please enter an odd number");
        return;
        }
        int mid=n/2;   int space=0;
        int star=n;
        for (int i = 1; i <= n; i++) {
            char alp = 'A';
            for (int s = 1; s <= space; s++)
                System.out.print("  ");
            for (int j = 1; j <= star; j++){
                System.out.printf("%c ",alp);
                if(j<=star/2)
                    alp++;
                else
                    alp--;
            }
            System.out.println();
            if (i <= mid) {
                space++;    star -= 2;
            } else {
                space--;    star += 2;
            }
        }
    }
    
    public static void pattern199(int n) {
        if(n%2==0){
        System.out.println("Please enter an odd number");
        return;
        }
        int mid=n/2;   int space=0;
        int star=n;
        for (int i = 1; i <= n; i++) {
            char alp = (char) (64 + star/2 +1);
            for (int s = 1; s <= space; s++)
                System.out.print("  ");
            for (int j = 1; j <= star; j++){
                System.out.printf("%c ",alp);
                if(j<=star/2)
                    alp--;
                else
                    alp++;
            }
            System.out.println();
            if (i <= mid) {
                space++;    star -= 2;
            } else {
                space--;    star += 2;
            }
        }
    }
    public static void main(String[] args) {
        int n = 11; // Example odd number
        pattern199(n);
    }
}