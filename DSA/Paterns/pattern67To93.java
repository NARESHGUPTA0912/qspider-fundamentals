package Paterns;

public class pattern67To93 {

    public static void pattern67(int n){
        int space = n-1, star = 1;
        for(int i=1; i<=n; i++){
            // int num = star;
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=star; k++){
                System.out.print("* ");
            }
            star+=2;
            space--;
            System.out.println();
        }
    }

    public static void pattern68(int n){
        int space = n-1, star = 1;
        for(int i=1; i<=n; i++){
            // int num = star;
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=star; k++){
                System.out.print(i+" ");
            }
            star+=2;
            space--;
            System.out.println();
        }
    }
    public static void pattern69(int n){
        int space = n-1, star = 1;
        for(int i=1; i<=n; i++){
            // int num = star;
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=star; k++){
                System.out.print(i%2+" ");
            }
            star+=2;
            space--;
            System.out.println();
        }
    }
    public static void pattern70(int n){
        int space = n-1, star = 1;
        int num = n;
        for(int i=1; i<=n; i++){
            // int num = star;
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=star; k++){
                System.out.print(num+" ");
            }
            num--;
            star+=2;
            space--;
            System.out.println();
        }
    }
    public static void pattern71(int n){
        int space = n-1, star = 1;
        for(int i=1; i<=n; i++){
            // int num = star;
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=star; k++){
                System.out.print(k+" ");
            }
            star+=2;
            space--;
            System.out.println();
        }
    }
    public static void pattern72(int n){
        int space = n-1, star = 1;
        for(int i=1; i<=n; i++){
            // int num = star;
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=star; k++){
                System.out.print(k%2+" ");
            }
            star+=2;
            space--;
            System.out.println();
        }
    }
    public static void pattern73(int n){
        int space = n-1, star = 1;
        int num = 1;
        for(int i=1; i<=n; i++){
            // int num = star;
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=star; k++){
                System.out.print(num+" ");
                num-- ;
            }
            num = 2*i+1;
            star+=2;
            space--;
            System.out.println();
        }
    }

    public static void pattern74(int n){
        int space = n-1, star = 1;
        int num = 1;
        for(int i=1; i<=n; i++){
            // int num = star;
            for(int j=1; j<=space; j++){
                System.out.print(" \t");
            }
            for(int k=1; k<=star; k++){
                System.out.printf("%d\t",num);
                num++;
            }
            star+=2;
            space--;
            System.out.println();
        }
    }

    public static void pattern75(int n){
        int space = n-1, star = 1;
        int num = n*n;
        for(int i=1; i<=n; i++){
            // int num = star;
            for(int j=1; j<=space; j++){
                System.out.print(" \t");
            }
            for(int k=1; k<=star; k++){
                System.out.printf("%d\t",num);
                num--;
            }
            star+=2;
            space--;
            System.out.println();
        }
    }

    public static void pattern76(int n){
        int space = n - 1, star = 1;
        for(int i = 1; i <= n; i++){
            int num = 1;
            int mid = (star / 2) + 1; // correct mid for each row
            // print spaces
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }
            // print pattern
            for(int k = 1; k <= star; k++){
                System.out.print(num + "\t");
                if(k < mid)   // increasing part
                    num++;
                else          // decreasing part
                    num--;
            }
            star += 2;
            space--;
            System.out.println();
        }
    }


    public static void pattern76_2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print("    ");    // spaces
            for (int j = 1; j <= i; j++) System.out.print(j + "   ");       // ascending
            for (int j = i - 1; j >= 1; j--) System.out.print(j + "   ");   // descending
            System.out.println();
        }
    }

    public static void pattern77(int n){
        int space = n - 1, star = 1;

        for(int i = 1; i <= n; i++){
            int num = n;
            int mid = (star / 2) + 1; // correct mid for each row
            // print spaces
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }
            // print pattern
            for(int k = 1; k <= star; k++){
                System.out.print(num + "\t");
                if(k < mid)   // decreasing part
                    num--;
                else          // increasing part
                    num++;
            }
            star += 2;
            space--;
            System.out.println();
        }
    }

    public static void pattern78(int n){
        int space = n - 1, star = 1;

        for(int i = 1; i <= n; i++){
            int num = n - i + 1;
            int mid = (star / 2) + 1; // correct mid for each row
            // print spaces
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }
            // print pattern
            for(int k = 1; k <= star; k++){
                System.out.print(num + "\t");
                if(k < mid)   // increasing part
                    num++;
                else          // decreasing part
                    num--;
            }
            star += 2;
            space--;
            System.out.println();
        }
    }

    public static void pattern79_2(int n) {
    for (int i = 1; i <= n; i++) {
        for (int s = 1; s <= n - i; s++) System.out.print("\t");  // spaces
        for (int j = i; j >= 1; j--) System.out.print(j + "\t");    // descending numbers: i → 1
        for (int j = 2; j <= i; j++) System.out.print(j + "\t");    // ascending numbers: 2 → i
        System.out.println();
    }
}


   public static void pattern79(int n){
        int space = n - 1, star = 1;

        for(int i = 1; i <= n; i++){
            // starting number is i (for descending part)
            int num = i;
            int mid = (star / 2) + 1;   // midpoint based on star count
            // print spaces
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }
            // print pattern
            for(int k = 1; k <= star; k++){
                System.out.print(num + "\t");
                if(k < mid)
                    num--;     // descending till mid
                else
                    num++;     // ascending after mid
            }
            star += 2;
            space--;
            System.out.println();
        }
    }
   public static void pattern80(int n){
        int space = n - 1, star = 1;

        for(int i = 1; i <= n; i++){
            // starting number is i (for descending part)
            int num = i-1;
            int mid = (star / 2) + 1 ;   // midpoint based on star count
            // print spaces
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }
            // print pattern
            for(int k = 1; k <= star; k++){
                System.out.print(num + "\t");
                if(k < mid)
                    num--;     // descending till mid
                else
                    num++;     // ascending after mid
            }
            star += 2;
            space--;
            System.out.println();
        }
    }

    public static void pattern81(int n){
        int space = n - 1, star = 1;

        for(int i = 1; i <= n; i++){
            int num = i;
            int mid = (star / 2) + 1; // correct mid for each row
            // print spaces
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }
            // print pattern
            for(int k = 1; k <= star; k++){
                System.out.print(num + "\t");
                if(k < mid)   // increasing part
                    num++;
                else          // decreasing part
                    num--;
            }
            star += 2;
            space--;
            System.out.println();
        }
    }

    public static void pattern82(int n) {
        int space = n - 1; int star  = 1;
        int num   = 1;   // starting number for current row
        for (int i = 1; i <= n; i++) {
            int mid   = (star / 2) + 1;  // midpoint index in the row
            int start = num;             // starting (left-most) number for this row
            // print leading tabs for centering
            for (int s = 1; s <= space; s++) {
                System.out.print("\t");
            }
            // print palindrome: ascend to peak, then descend
            int val = start;
            for (int k = 1; k <= star; k++) {
                System.out.print(val + "\t");
                if (k < mid) val++;   // before midpoint → increase
                else          val--;  // at/after midpoint → decrease
            }
            // update starting number for next row:
            // nextStart = currentStart + (star + 1) / 2
            num   += (star + 1) / 2;
            star  += 2;
            space--;
            System.out.println();
        }
    }

    public static void pattern83(int n) {
        int num = 1;          // continuous number (should start from 1)
        int space = n - 1;  int star = 1;
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int s = 1; s <= space; s++) {
                System.out.print("\t");
            }
            // LEFT side numbers → (i - 1) numbers
            for (int k = 1; k < i; k++) {
                System.out.print(num++ + "\t");
            }
            // MIDDLE zero
            System.out.print("0\t");
            // RIGHT side numbers → (i - 1) numbers
            for (int k = 1; k < i; k++)
                System.out.print(num++ + "\t");
            space--;  star += 2;
            System.out.println();
        }
    }

    public static void pattern84(int n) {
        int num = 1;          // continuous number (should start from 1)
        int space = n - 1;  int star = 1;
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int s = 1; s <= space; s++) {
                System.out.print("\t");
            }
            // LEFT side numbers → (i - 1) numbers
            for (int k = 1; k < i; k++) {
                System.out.print(num++ + "\t");
            }
            // MIDDLE zero
            System.out.print("1\t");
            // RIGHT side numbers → (i - 1) numbers
            for (int k = 1; k < i; k++)
                System.out.print(num++ + "\t");
            space--;  star += 2;
            System.out.println();
        }
    }

    public static void pattern85(int n){
        int space = n-1, star = 1;
        char alp = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++) System.out.print(" \t");
            for(int k=1; k<=star; k++)  System.out.printf("%c\t",alp++);
            star+=2;  space--;
            System.out.println();
        }
    }

    public static void pattern86(int n){
        int space = n-1, star = 1;
        char alp = 'Y';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++) System.out.print(" \t");
            for(int k=1; k<=star; k++)  System.out.printf("%c\t",alp--);
            star+=2;  space--;
            System.out.println();
        }
    }

    public static void pattern87(int n){
        int space = n-1, star = 1;
        char alp = 'A'; // ASCII value of A is 65
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++) System.out.print(" \t");
            for(int k=1; k<=star; k++)  System.out.printf("%c\t",alp);
            star+=2;  space--;  alp++;
            System.out.println();
        }
    }

    public static void pattern88(int n){
        int space = n-1, star = 1;
        for(int i=1; i<=n; i++){
            char alp = 'A'; // ASCII value of A is 65
            for(int j=1; j<=space; j++) System.out.print(" \t");
            for(int k=1; k<=star; k++)  System.out.printf("%c\t",alp++);
            star+=2;  space--;
            System.out.println();
        }
    }

    public static void pattern89(int n){
        int space = n-1, star = 1;
        char alp = (char) (64+n); // ASCII value of A is 65
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++) System.out.print(" \t");
            for(int k=1; k<=star; k++)  System.out.printf("%c\t",alp);
            star+=2;  space--;  alp--;
            System.out.println();
        }
    }

    public static void pattern90(int n){
        int space = n-1, star = 1;
        for(int i=1; i<=n; i++){
            char alp = (char) (64+(2*i-1)); // ASCII value of A is 65
            for(int j=1; j<=space; j++) System.out.print(" \t");
            for(int k=1; k<=star; k++)  System.out.printf("%c\t",alp--);
            star+=2;  space--;
            System.out.println();
        }
    }

    public static void pattern91(int n){
        int space = n - 1, star = 1;
        for(int i = 1; i <= n; i++){
             char alp = 'A';
            int mid = (star / 2) + 1; // correct mid for each row
            for(int j = 1; j <= space; j++) //space
                System.out.print("\t");
            for(int k = 1; k <= star; k++){
                System.out.print(alp + "\t");
                if(k < mid) alp++;
                else alp--; 
            }
            star += 2;  space--;
            System.out.println();
        }
    }

    public static void pattern92(int n){
        int space = n - 1, star = 1;
        for(int i = 1; i <= n; i++){
            char alp = (char) (64 + i);
            int mid = (star / 2) + 1; // correct mid for each row
            for(int j = 1; j <= space; j++) //space
                System.out.print("\t");
            for(int k = 1; k <= star; k++){
                System.out.print(alp + "\t");
                if(k < mid) alp++;
                else alp--; 
            }
            star += 2;  space--;
            System.out.println();
        }
    }

    public static void pattern93(int n){
        int space = n - 1, star = 1;
        for(int i = 1; i <= n; i++){
            char alp = (char) (64 + i);
            int mid = (star / 2) + 1; // correct mid for each row
            for(int j = 1; j <= space; j++) //space
                System.out.print("\t");
            for(int k = 1; k <= star; k++){
                System.out.print(alp + "\t");
                if(k < mid) alp--;
                else alp++; 
            }
            star += 2;  space--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern93(5);
    }
}
