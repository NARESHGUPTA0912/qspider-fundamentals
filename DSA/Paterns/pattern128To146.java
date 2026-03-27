package Paterns;

public class pattern128To146 {

    public static void pattern128(int n){
        int mid = (n+1)/2;
        for(int i=1; i<=n; i++){
            if (i <= mid)
                for(int j=1; j<=i; j++)
                    System.out.print("* ");
            else
                for(int j=1; j<=n-i+1; j++)
                    System.out.print("* ");
            System.out.println();
        }
    }

    public static void pattern129(int n){
        int mid = (n+1)/2;
        for(int i=1; i<=n; i++){
            if (i <= mid){
                for(int j=1; j<=mid-i; j++) 
                    System.out.print("  ");
                for(int j=1; j<=i; j++)
                    System.out.print("* ");
            } else {
                    for(int j=1; j<=i-mid; j++)
                        System.out.print("  ");
                    for(int k=1; k<=n-i+1; k++)
                        System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
                    *
                * *
            * * *
        * * * * * * * * * * * * * * * * * *
            * * *
                * *
                    *
    */
    public static void pattern130_01(int n){
        int mid = (n+1)/2;
        for(int i=1; i<=n; i++){
            if (i <= mid){
                for(int j=1; j<=mid-i; j++) 
                    System.out.print("    ");
                for(int j=1; j<=i; j++)
                    System.out.print("* ");
                if(i==mid){
                    for(int k=n+n; k>=1; k--){
                        System.out.print("* ");
                    }
                }
            } else {
                    for(int j=1; j<=i-mid; j++)
                        System.out.print("    ");
                    for(int k=1; k<=n-i+1; k++)
                        System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern130(int n){
        int mid = (n+1)/2;
        for(int i=1; i<=n; i++){
            if (i <= mid){
                for(int j=1; j<=mid-i; j++) 
                    System.out.printf("  ");
                for(int j=1; j<=i; j++)
                    System.out.printf("*   ");
            } else {
                    for(int j=1; j<=i-mid; j++)
                        System.out.printf("  ");
                    for(int k=1; k<=n-i+1; k++)
                        System.out.printf("*   ");
            }
            System.out.println();
        }
    }



    public static void pattern130_2(int n){
        int mid = (n+1)/2;

        for(int i=1; i<=n; i++){
            int space = (i <= mid) ? mid - i : i - mid;
            int star  = (i <= mid) ? i : n - i + 1;

            for(int s=1; s<=space; s++)
                System.out.print("  ");

            for(int st=1; st<=star; st++)
                System.out.print("*   ");

            System.out.println();
        }
    }

    // simple and clean version
    public static void pattern130_3(int n){
		int star=1;	int space=n/2;	int mid=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int j=1;j<=star;j++)
				System.out.print("*   ");

		if(i<mid){
			star++;		space--;
		}else{
			star--;		space++;
		}
		System.out.println();
		}
	}

/*
   *
  ***
 *****
*******
 *****
  ***
   *

public static void diamond1(int n){
    int mid = (n+1)/2;

    // upper half
    for(int i=1; i<=mid; i++){
        for(int s=1; s<=mid-i; s++)
            System.out.print(" ");
        for(int st=1; st<=2*i-1; st++)
            System.out.print("*");
        System.out.println();
    }

    // lower half
    for(int i=mid-1; i>=1; i--){
        for(int s=1; s<=mid-i; s++)
            System.out.print(" ");
        for(int st=1; st<=2*i-1; st++)
            System.out.print("*");
        System.out.println();
    }
}
    */

    public static void pattern131(int n){
		int star=1;	int space=n/2;	int mid=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int j=1;j<=star;j++)
				System.out.printf("%-3d ",i);

		if(i<mid){
			star++;		space--;
		}else{
			star--;		space++;
		}
		System.out.println();
		}
	}

    public static void pattern132(int n){
		int star=1;	int space=n/2;	int mid=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int j=1;j<=star;j++)
				System.out.printf("%-3d ",(i%2));

		if(i<mid){
			star++;		space--;
		}else{
			star--;		space++;
		}
		System.out.println();
		}
	}

    public static void pattern133(int n){
		int star=1;	int space=n/2;	int mid=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int j=1;j<=star;j++)
				System.out.printf("%-3d ",j);

		if(i<mid){
			star++;		space--;
		}else{
			star--;		space++;
		}
		System.out.println();
		}
	}

    public static void pattern134(int n){
		int star=1;	int space=n/2;	int mid=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int j=1;j<=star;j++)
				System.out.printf("%-3d ",(j%2));

		if(i<mid){
			star++;		space--;
		}else{
			star--;		space++;
		}
		System.out.println();
		}
	}

    public static void pattern135(int n){
		int star=1;	int space=n/2;	
        int mid=n/2+1; int num = 1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int j=1;j<=star;j++)
				System.out.printf("%-3d ",num++);

		if(i<mid){
			star++;		space--;
		}else{
			star--;		space++;
		}
		System.out.println();
		}
	}
    public static void pattern136(int n){
		int star=1;	int space=n/2;	
        int mid=n/2+1; int num = mid*mid;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int j=1;j<=star;j++)
				System.out.printf("%-3d ",num--);

		if(i<mid){
			star++;		space--;
		}else{
			star--;		space++;
		}
		System.out.println();
		}
	}
    public static void pattern137(int n){
		int star=1;	int space=n/2;	
        int mid=n/2+1; int num = 1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int j=1;j<=star;j++)
				System.out.printf("%-3d ",num);

		if(i<mid){
			star++;		space--;     num++;
		}else{
			star--;		space++;     num--;
		}
		System.out.println();
		}
	}

    public static void pattern138(int n){
		int star=1;	int space=n/2;	
        int mid=n/2+1; int num = n;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int j=1;j<=star;j++)
				System.out.printf("%-3d ",num);
            num--;

            if(i<mid){
                star++;		space--;
            }else{
                star--;		space++;
            }
            System.out.println();
		}
	}

    public static void pattern139(int n){
		int star=1;	int space=n/2;
        int mid=n/2+1; int num = mid-1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int j=1;j<=star;j++)
				System.out.printf("%-3d ",num);

            if(i<mid){
                star++;		space--;    num--;
            }else{
                star--;		space++;    num++;
            }
            System.out.println();
		}
	}

    public static void pattern140(int n){
		int star=1;	int space=n/2;	
        int mid=n/2+1; int num = mid;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int j=1;j<=star;j++)
				System.out.printf("%-3d ",num);

            if(i<mid){
                star++;		space--;    num--;
            }else{
                star--;		space++;    num++;
            }
            System.out.println();
		}
	}

    public static void pattern141(int n){
		int star=1;	int space=n/2;
        int mid=n/2+1; char ch = (char) (64 + 1);
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int j=1;j<=star;j++)
				System.out.printf("%-3c ",ch);
            ch++;
            if(i<mid){
                star++;		space--;
            }else{
                star--;		space++;
            }
            System.out.println();
		}
	}

    public static void pattern142(int n){
		int star=1;	int space=n/2;
        int mid=n/2+1;
		for(int i=1;i<=n;i++){
            char ch = (char) (64 + 1);
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int j=1;j<=star;j++)
				System.out.printf("%-3c ",ch++);

            if(i<mid){
                star++;		space--;
            }else{
                star--;		space++;
            }
            System.out.println();
		}
	}

    public static void pattern143(int n){
		int star=1;	int space=n/2;
        int mid=n/2+1; char ch = (char) (64 + 1);
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int j=1;j<=star;j++)
				System.out.printf("%-3c ",ch);

            if(i<mid){
                star++;		space--;    ch++;
            }else{
                star--;		space++;    ch--;
            }
            System.out.println();
		}
	}

    public static void pattern144(int n){
		int star=1;	int space=n/2;
        int mid=n/2+1; char ch = (char) (64 + mid);
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int j=1;j<=star;j++)
				System.out.printf("%-3c ",ch);

            if(i<mid){
                star++;		space--;    ch--;
            }else{
                star--;		space++;    ch++;
            }
            System.out.println();
		}
	}

    public static void pattern145(int n){
		int star=1;	int space=n/2;
        int mid=n/2+1; char ch = (char) (64 + 1);
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int j=1;j<=star;j++)
				System.out.printf("%-3c ",ch++);

            if(i<mid){
                star++;		space--;
            }else{
                star--;		space++;
            }
            System.out.println();
		}
	}

    public static void pattern146(int n){
		int star=1;	int space=n/2;
        int mid=n/2+1; char ch = (char) (64 + (mid*mid));
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int j=1;j<=star;j++)
				System.out.printf("%-3c ",ch--);

            if(i<mid){
                star++;		space--;
            }else{
                star--;		space++;
            }
            System.out.println();
		}
	}

    public static void main(String[] args) {
        pattern146(7);
    }
}
