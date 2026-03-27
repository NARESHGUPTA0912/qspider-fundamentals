package Paterns;

public class pattern228To241 {
    
	public static void pattern228(int n){
		int mid=n;
		int left = mid;	int right = mid;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=2*n-1; j++){
				if (j == left || j == right)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
			}
			left--;		right++;
			System.out.println();
		}
	}
    
	public static void pattern229(int n){
		int mid=n;
		int left = mid;	int right = mid;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=2*n-1; j++){
				if (j == left || j == right || i == n)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
			}
			left--;		right++;
			System.out.println();
		}
	}
    
	public static void pattern230(int n){
		int mid=n;
		int left = mid;	int right = mid;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=2*n-1; j++){
				if (j == left || j == right || i == n || j == n)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
			}
			left--;		right++;
			System.out.println();
		}
	}

    public static void pattern231(int n) {
        int left = 1;           // left star position
        int right = 2 * n - 1;  // right star position
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= right; j++) {
                if (j == left || j == right)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            left++;    right--;
            System.out.println();
        }
    }

    public static void pattern232(int n) {
        int left = 1;           // left star position
        int right = 2 * n - 1;  // right star position
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= right; j++) {
                if (j == left || j == right || i==1)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            left++;    right--;
            System.out.println();
        }
    }

    public static void pattern233(int n) {
        int left = 1;           // left star position
        int right = 2 * n - 1;  // right star position
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= right; j++) {
                if (j == left || j == right || i==1 || j==n)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            left++;    right--;
            System.out.println();
        }
    }

    public static void pattern234(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int mid=n/2+1;
		int start=mid, 	end=mid;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=end;j++){
				if(j==start || j==end)
					System.out.print("* ");
				else
					System.out.print("  ");
		}
		if(i<mid){
			start--;		end++;
		}else{
			start++;		end--;
		}			
		System.out.println();
		}
	}

    public static void pattern235(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int mid=n/2+1;
		int start=mid, 	end=mid;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=end;j++){
				if(j==start || j==end)
					System.out.printf("%d ",i);
				else
					System.out.print("  ");
		}
		if(i<mid){
			start--;		end++;
		}else{
			start++;		end--;
		}			
		System.out.println();
		}
	}

    public static void pattern236(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int mid=n/2+1;  int num=1;
		int start=mid, 	end=mid;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=end;j++){
				if(j==start || j==end)
					System.out.printf("%d ",num);
				else
					System.out.print("  ");
		}
		if(i<mid){
			start--;	end++;    num++;
		}else{
			start++;	end--;    num--;
		}			
		System.out.println();
		}
	}

    public static void pattern237(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int mid=n/2+1;  char ch='A';
		int start=mid, 	end=mid;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=end;j++){
				if(j==start || j==end)
					System.out.printf("%c ",ch);
				else
					System.out.print("  ");
		}
        ch++;
		if(i<mid){
			start--;		end++;
		}else{
			start++;		end--;
		}			
		System.out.println();
		}
	}

    public static void pattern238(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int mid=n/2+1;  char ch='A';
		int start=mid, 	end=mid;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=end;j++){
				if(j==start || j==end)
					System.out.printf("%c ",ch);
				else
					System.out.print("  ");
		}
		if(i<mid){
			start--;		end++;      ch++;
		}else{
			start++;		end--;      ch--;
		}			
		System.out.println();
		}
	}

    public static void pattern239(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int mid=n/2+1;
		int start=mid, 	end=mid;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=end;j++){
				if(j==start || j==end || i==mid || j==mid)
					System.out.printf("* ");
				else
					System.out.print("  ");
		}
		if(i<mid){
			start--;		end++;
		}else{
			start++;		end--;
		}
		System.out.println();
		}
	}

    public static void pattern241(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int mid=n/2+1;
		int start=mid, 	end=mid;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j<=start || j>=end)
					System.out.printf("*  ");
				else
					System.out.print("   ");
		    }
		if(i<mid){
			start--;		end++;
		}else{
			start++;		end--;
		}
		System.out.println();
		}
	}

    public static void pattern240(int n){
		if(n%2==0){
			System.out.println("PAttern is NOT Possible!");
		return;
		}
		int mid=n/2+1;
		int start=mid-1, 	end=mid-1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j<=start || j>=end)
					System.out.printf("*  ");
				else
					System.out.print("   ");
		    }
		if(i<mid){
			start--;		end++;
		}else{
			start++;		end--;
		}
		System.out.println();
		}
	}

    public static void main(String[] args) {
        pattern240(9);
    }
}
