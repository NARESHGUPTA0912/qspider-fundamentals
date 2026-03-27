package Paterns;

public class pattern147To180 {
    
    public static void pattern147(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	int mid=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int k=1;k<=star;k++)
				System.out.print("* ");

		if(i<mid){
			star+=2;		space--;
		}else{
			star-=2;		space++;
		}			
		System.out.println();
		}
	}
    public static void pattern148(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	int mid=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int k=1;k<=star;k++)
				System.out.print(i+" ");

		if(i<mid){
			star+=2;		space--;
		}else{
			star-=2;		space++;
		}			
		System.out.println();
		}
	}
    public static void pattern149(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	int mid=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int k=1;k<=star;k++)
				System.out.print(i%2 +" ");

		if(i<mid){
			star+=2;		space--;
		}else{
			star-=2;		space++;
		}			
		System.out.println();
		}
	}
    public static void pattern150(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	int mid=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int k=1;k<=star;k++)
				System.out.print(k+" ");

		if(i<mid){
			star+=2;		space--;
		}else{
			star-=2;		space++;
		}			
		System.out.println();
		}
	}
    public static void pattern151(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	int mid=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");

			for(int k=1;k<=star;k++)
				System.out.print(k%2 +" ");

		if(i<mid){
			star+=2;		space--;
		}else{
			star-=2;		space++;
		}			
		System.out.println();
		}
	}
    public static void pattern152(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1; int num=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++)
				System.out.printf(" %-2d",num++);

		if(i<mid){
			star+=2;		space--;
		}else{
			star-=2;		space++;
		}			
		System.out.println();
		}
	}
    public static void pattern153(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1; int num=(n*(n+1)/2)-(n/2);
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++)
				System.out.printf(" %-2d",num--);

		if(i<mid){
			star+=2;		space--;
		}else{
			star-=2;		space++;
		}			
		System.out.println();
		}
	}
    public static void pattern154(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1; int num=n;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++)
				System.out.printf(" %-2d",num);
            num--;
            if(i<mid){
                star+=2;		space--;
            }else{
                star-=2;		space++;
            }			
		System.out.println();
		}
	}
    public static void pattern155(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1; 
		for(int i=1;i<=n;i++){
            int num=star;
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++)
				System.out.printf(" %-2d",num--);
		if(i<mid){
			star+=2;		space--;
		}else{
			star-=2;		space++;
		}			
		System.out.println();
		}
	}
    public static void pattern156(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1; int num=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++)
				System.out.printf(" %-2d",num);

            if(i<mid){
                star+=2;		space--;    num++;
            }else{
                star-=2;		space++;    num--;
            }			
            System.out.println();
        }
	}

    public static void pattern157(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1; int num=n/2;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++)
				System.out.printf(" %-2d",num);

            if(i<mid){
                star+=2;		space--;    num--;
            }else{
                star-=2;		space++;    num++;
            }			
            System.out.println();
		}
	}

    public static void pattern158(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1; int num=(n/2)+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++)
				System.out.printf(" %-2d",num);

            if(i<mid){
                star+=2;		space--;    num--;
            }else{
                star-=2;		space++;    num++;
            }			
            System.out.println();
		}
	}

    public static void pattern159(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1; 
		for(int i=1;i<=n;i++){
            int num=1;
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++){
				System.out.printf(" %-2d",num);
                if(k<=(star/2))
                    num++;
                else
                    num--;
            }

            if(i<mid){
                star+=2;		space--;    //num--;
            }else{
                star-=2;		space++;    //num++;
            }			
            System.out.println();
		}
	}

    public static void pattern160(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1; 
		for(int i=1;i<=n;i++){
            int num=star/2;
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++){
				System.out.printf(" %-2d",num);
                if(k<=(star/2))
                    num--;
                else
                    num++;
            }

            if(i<mid){
                star+=2;		space--;    //num--;
            }else{
                star-=2;		space++;    //num++;
            }			
            System.out.println();
		}
	}

    public static void pattern161(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1;
		for(int i=1;i<=n;i++){
			int num=(star/2)+1;
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++){
				System.out.printf(" %-2d",num);
                if(k<=(star/2))
                    num--;
                else
                    num++;
            }

            if(i<mid){
                star+=2;		space--;    //num--;
            }else{
                star-=2;		space++;    //num++;
            }			
            System.out.println();
		}
	}

    public static void pattern162(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1; int num=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++){
                if(k== (star/2)+1)
                    System.out.printf(" 1 ");
                else
				    System.out.printf(" %-2d",num++);
            }    
            if(i<mid){
                star+=2;		space--;    //num--;
            }else{
                star-=2;		space++;    //num++;
            }			
            System.out.println();
		}
	}
    
    public static void pattern163(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1; int num=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++){
                if(k== (star/2)+1)
                    System.out.printf(" 0 ");
                else
				    System.out.printf(" %-2d",num++);
            }    
            if(i<mid){
                star+=2;		space--;    //num--;
            }else{
                star-=2;		space++;    //num++;
            }			
            System.out.println();
		}
	}
    
    public static void pattern164(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1; int num=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++){
                if(k== (star/2)+1 || i==mid)
                    System.out.printf(" 0 ");
                else
				    System.out.printf(" %-2d",num++);
            }    
            if(i<mid){
                star+=2;		space--;    //num--;
            }else{
                star-=2;		space++;    //num++;
            }			
            System.out.println();
		}
	}
    
    public static void pattern165(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1; int num=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++){
                if(k== (star/2)+1 || i==mid)
                    System.out.printf(" 1 ");
                else
				    System.out.printf(" %-2d",num++);
            }    
            if(i<mid){
                star+=2;		space--;    //num--;
            }else{
                star-=2;		space++;    //num++;
            }			
            System.out.println();
		}
	}
    
    public static void pattern166(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++){
                if(k== (star/2)+1 || i==mid)
                    System.out.printf(" 0 ");
                else
				    System.out.printf(" 1 ");
            }    
            if(i<mid){
                star+=2;		space--;    //num--;
            }else{
                star-=2;		space++;    //num++;
            }			
            System.out.println();
		}
	}
    
    public static void pattern167(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++){
                if(k== (star/2)+1 || i==mid)
                    System.out.printf(" 1 ");
                else
				    System.out.printf(" 0 ");
            }    
            if(i<mid){
                star+=2;		space--;    //num--;
            }else{
                star-=2;		space++;    //num++;
            }			
            System.out.println();
		}
	}
    
    public static void pattern168(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++){
                if(k== (star/2)+1 || i==mid)
                    System.out.printf(" @ ");
                else
				    System.out.printf(" * ");
            }    
            if(i<mid){
                star+=2;		space--;    //num--;
            }else{
                star-=2;		space++;    //num++;
            }			
            System.out.println();
		}
	}
    
    public static void pattern169(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++){
                if(k== (star/2)+1 || i==mid)
                    System.out.printf(" * ");
                else
				    System.out.printf(" @ ");
            }    
            if(i<mid){
                star+=2;		space--;    //num--;
            }else{
                star-=2;		space++;    //num++;
            }			
            System.out.println();
		}
	}
    
    public static void pattern170(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1; int num=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++){
                if(k== (star/2)+1 || i==mid)
                    System.out.printf(" @ ");
                else
				    System.out.printf(" %-2d",num++);
            }    
            if(i<mid){
                star+=2;		space--;    //num--;
            }else{
                star-=2;		space++;    //num++;
            }			
            System.out.println();
		}
	}
    public static void pattern171(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1; int num=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++){
                if(k== (star/2)+1 || i==mid)
                    System.out.printf(" * ");
                else
				    System.out.printf(" %-2d",num++);
            }    
            if(i<mid){
                star+=2;		space--;    //num--;
            }else{
                star-=2;		space++;    //num++;
            }			
            System.out.println();
		}
	}
    public static void pattern172(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int star=1;	int space=n/2;	
        int mid=n/2+1; int num=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("   ");

			for(int k=1;k<=star;k++){
                if(k== (star/2)+1 || i==mid)
                    System.out.printf(" @ ");
                else
				    System.out.printf(" %-2d",num++);
            }    
            if(i<mid){
                star+=2;		space--;    //num--;
            }else{
                star-=2;		space++;    //num++;
            }			
            System.out.println();
		}
	}

    public static void pattern173(int n){
        if(n%2 == 0){
            System.out.println("Pattern is Not Possible!");
        return;
        }
        int space = (n/2); int alp = 1;   int mid = (n+1)/2;
        char ch = (char) (64+1);
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++)
                System.out.print("   ");
            for(int k=1; k<=alp; k++){
                System.out.printf(" %c ",ch);
            } ch++;
            if(i<mid){
                space--;    alp+=2;
            }else{
                space++;    alp-=2;
            }
            System.out.println();
        }
    }
    

    public static void pattern174(int n){
        if(n%2 == 0){
            System.out.println("Pattern is Not Possible!");
        return;
        }
        int space = (n/2); int alp = 1;   int mid = (n+1)/2;
        for(int i=1; i<=n; i++){
            char ch = (char) (64+1);
            for(int j=1; j<=space; j++)
                System.out.print("   ");
            for(int k=1; k<=alp; k++){
                System.out.printf(" %c ",ch++);
            }
            if(i<mid){
                space--;    alp+=2;
            }else{
                space++;    alp-=2;
            }
            System.out.println();
        }
    }
    

    public static void pattern175(int n){
        if(n%2 == 0){
            System.out.println("Pattern is Not Possible!");
        return;
        }
        int space = (n/2); int alp = 1;   int mid = (n+1)/2;
        char ch = (char) (64+1);
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++)
                System.out.print("   ");
            for(int k=1; k<=alp; k++){
                System.out.printf(" %c ",ch++);
            }
            if(i<mid){
                space--;    alp+=2;
            }else{
                space++;    alp-=2;
            }
            System.out.println();
        }
    }

    public static void pattern176(int n){
        if(n%2 == 0){
            System.out.println("Pattern is Not Possible!");
        return;
        }
        int space = (n/2); int alp = 1;   int mid = (n+1)/2;
        char ch = (char) (64+(n*n)/2+1);
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++)
                System.out.print("   ");
            for(int k=1; k<=alp; k++){
                System.out.printf(" %c ",ch--);
            }
            if(i<mid){
                space--;    alp+=2;
            }else{
                space++;    alp-=2;
            }
            System.out.println();
        }
    }

    public static void pattern177(int n){
        if(n%2 == 0){
            System.out.println("Pattern is Not Possible!");
        return;
        }
        int space = (n/2); int alp = 1;   int mid = (n+1)/2;
        char ch = (char) (64+1);
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++)
                System.out.print("   ");
            for(int k=1; k<=alp; k++){
                System.out.printf(" %c ",ch);
            }
            if(i<mid){
                space--;    alp+=2;    ch++;
            }else{
                space++;    alp-=2;    ch--;
            }
            System.out.println();
        }
    }

    public static void pattern178(int n){
        if(n%2 == 0){
            System.out.println("Pattern is Not Possible!");
        return;
        }
        int space = (n/2); int alp = 1;   int mid = (n+1)/2;
        char ch = (char) (64+(mid));
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++)
                System.out.print("   ");
            for(int k=1; k<=alp; k++){
                System.out.printf(" %c ",ch);
            }
            if(i<mid){
                space--;    alp+=2;    ch--;
            }else{
                space++;    alp-=2;    ch++;
            }
            System.out.println();
        }
    }

    public static void pattern179(int n){
        if(n%2 == 0){
            System.out.println("Pattern is Not Possible!");
        return;
        }
        int space = (n/2); int alp = 1;   int mid = (n+1)/2;
        for(int i=1; i<=n; i++){
            char ch = (char) (64+1);
            for(int j=1; j<=space; j++)
                System.out.print("   ");
            for(int k=1; k<=alp; k++){
                System.out.printf(" %c ",ch);
                if (k < alp/2+1) ch++;
                else ch--;
            }
            if(i<mid){
                space--;    alp+=2;    //ch++;
            }else{
                space++;    alp-=2;    //ch--;
            }
            System.out.println();
        }
    }

    public static void pattern180(int n){
        if(n%2 == 0){
            System.out.println("Pattern is Not Possible!");
        return;
        }
        int space = (n/2); int alp = 1;   int mid = (n+1)/2;
        for(int i=1; i<=n; i++){
            char ch = (char) (64+(alp/2)+1);
            for(int j=1; j<=space; j++)
                System.out.print("   ");
            for(int k=1; k<=alp; k++){
                System.out.printf(" %c ",ch);
                if (k < alp/2+1) ch--;
                else ch++;
            }
            if(i<mid){
                space--;    alp+=2;    //ch++;
            }else{
                space++;    alp-=2;    //ch--;
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        pattern180(7);
    }
    
}
