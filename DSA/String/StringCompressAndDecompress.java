package String;

public class StringCompressAndDecompress {
    
    public static void printFreq(String s){
        int[] freq= new int[128];
        for(int i=0; i<s.length(); i++)
            freq[s.charAt(i)]++;
        for(int i=0; i<freq.length;i++)
            if(freq[i]>0)
                System.out.println((char) i + " is: " + freq[i]+" times.");
    }
    
    public static String compress(String s){
        if(s==null || s.length() == 0)
            return s;
        else if(s.length()==1)
            return s+1;
        int[] freq= new int[128];
        for(int i=0; i<s.length(); i++)
            freq[s.charAt(i)]++;
    
        String res = "";
        for(int i=0; i<freq.length;i++){
            if(freq[i]>0)
                // res = res + freq[i] + (char)i;
                res = res+(char)i + freq[i];
        }
        return res;
    }

    public static String compress2(String s){
        if(s==null || s.length() == 0)
            return s;
        else if(s.length()==1)
            return s+1;

        int count = 1;
        String res = "";
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i))
                count++;
            else{
                res = res + s.charAt(i-1) + count;
                count = 1;
            }
        }
        return res + s.charAt(s.length()-1)+count;
    }

    public static String compress3(String s){
        if(s==null || s.length() == 0)
            return s;
        else if(s.length()==1)
            return s+1;

        int count = 1;
        String res = "";
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i))
                count++;
            else{
                res += count + s.charAt(i-1)+count;
                count = 1;
            }
        }
        return res + count + s.charAt(s.length()-1);
    }


    // input: C3B2A4 ==> output: CCCBBAAAA   (only for even pos number)
    public static String decompress(String s){
        if(s==null || s.length()==0){
            return s;    
        }
        if(s.length()%2 != 0){
            return "Invalid String!";
        }
        String res="";
        for(int i=0; i<s.length(); i+=2){
            char c = s.charAt(i);
            int count = s.charAt(i+1)-'0';
            res += (c+"").repeat(count);
        }
        return res;
    }
    // input: 3C2B4A ==> output: CCCBBAAAA   (only for even pos number)
    public static String decompress2(String s){
        if(s==null || s.length()==0){
            return s;    
        }
        if(s.length()%2 != 0){
            return "Invalid String!";
        }
        String res="";
        for(int i=0; i<s.length(); i+=2){
            int count = s.charAt(i)-'0';
            char c = s.charAt(i+1);
            res += (c+"").repeat(count);
            // for(int j=1; j<=count; j++)
            //     res=res+c;
        }
        return res;
    }

    // input: C10B4A11 ==> output: CCCBBAAAA 
    public static String decompress3(String s){
        if(s==null || s.length()==0)
            return s;
        String res = "";
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            int count = 0, num=0;
            for(int j=1+1; j<s.length() && s.charAt(j)>48 && s.charAt(j)<57; j++){
                count++;
                num = 10*num+s.charAt(j)-48;
            }
            res += (c+"").repeat(num);
            i+=count;
        }
        return res;
    }
    

    public static void main(String[] args){
        System.out.println("String Compression: "+ decompress3("a12b4c7d11"));

        // char s = 'A';
        //  System.out.println(s*3);
    }
}
