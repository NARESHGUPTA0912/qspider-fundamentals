package Paterns;

public class Level1Pattern1To12 {
    
    public static void solution1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void solution2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i%2 + " ");
            }
            System.out.println();
        }
    }

    public static void solution3(int n){
        for (int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void solution4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(j%2 + " ");
            }
            System.out.println();
        }
    }
    public static void solution5(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void solution6(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==2 || i==n || i==n-1 || j==1 || j==2 || j==n || j==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void solution7(int n){
        if(n%2==0){
			System.out.println("Pattern is NOT possible for Even Rows!");
		return;
		} 
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i+j==n+1 || i==j){
                    System.out.print("* ");
                } 
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void solution8(int n){
        if(n%2==0){
			System.out.println("Pattern is NOT possible for Even Rows!");
		return;
		}
        int mid = (n+1)/2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==mid || j==mid){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void solution9(int n){
        if(n%2==0){
			System.out.println("Pattern is NOT possible for Even Rows!");
		return;
		}
        int mid = (n+1)/2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                // if(i==mid || j==mid || i+j==n || i+j==n-1){
                if(i==mid || j==mid || i+j==n+1 || i==j || i==1 ||j==1 || i==n || j==n){ 
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void solution10(int n){
        if(n%2==0){
			System.out.println("Pattern is NOT possible for Even Rows!");
		return;
		}
        int mid = (n+1)/2; 
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==mid || j==mid || i+j==n+1 || i==j || i==1 ||j==1 || i==n || j==n) 
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++)
            System.out.println("**");
    }

    public static void solution11(int n){
        if(n%2==0){
			System.out.println("Pattern is NOT possible for Even Rows!");
		return;
		}
        int mid=(n+1)/2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==mid || j==mid){
                    System.out.print("* ");
                } else if (i==1 && j>mid || i==n && j<mid){
                    System.out.print("* ");
                } else if (j==1 && i<mid || j==n && i>mid){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // public static void solution11_1(int n){
    //     int mid=(n+1)/2;
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=n; j++){
    //             //if(i==mid || j==mid || i<=mid || j>=mid){
    //             //if(i==mid || j==mid || i<=mid ){
    //             if(i==mid || j==mid){
    //                 System.out.print("* ");
    //             } else if (i==1 && j<mid || i==n && j>mid){
    //                 System.out.print("* ");
    //             } else if (j==1 && i>mid || j==n && i<mid){
    //                 System.out.print("* ");
    //             } else {
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void solution11_2(int n){
    //     int mid=(n+1)/2;
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=n; j++){
    //             //if(i==mid || j==mid || i<=mid || j>=mid){
    //             //if(i==mid || j==mid || i<=mid ){
    //             if(i==mid || j==mid){
    //                 System.out.print("* ");
    //             } else if (i==1 && j>mid || i==n && j<mid){
    //                 System.out.print("* ");
    //             } else if (j==1 && i>mid || j==n && i<mid){
    //                 System.out.print("* ");
    //             } else {
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    public static void solution12(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("("+i+","+j+")\t");
            }
            System.out.println();
        }
    }

    // public static void solution12_2(int n){
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=n; j++){
    //             System.out.printf("(%d,%d)",i,j);
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String[] args) {
        solution10(11);
    }
}