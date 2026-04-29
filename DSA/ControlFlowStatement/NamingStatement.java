package ControlFlowStatement;

class NamingStatement{
    public static void main(String[] args){
        System.out.println("-----------Program Starts--------");
        namingBreak();
        // namingContinue();
        System.out.println("-----------Program Ends--------");
    }

    public static void namingContinue(){
        int limit = 4;
        outer:
        for (int i = 1; i < limit; i++) {
            middle:
            for (int j = 1; j < limit; j++) {
                inner:
                for (int k = 1; k < limit; k++) {
                    if(k == 2) continue outer;
                    System.out.println(i + "-"  + j + "-" + k);
                }
                System.out.println("------------------------------");
            }
        }
    }
    
    public static void namingBreak(){
        int limit = 4;
        outer:
        for (int i = 1; i < limit; i++) {
            middle:
            for (int j = 1; j < limit; j++) {
                inner:
                for (int k = 1; k < limit; k++) {
                    if(k == 2) break outer;
                    System.out.println(i + "-"  + j + "-" + k);
                }
                System.out.println("------------------------------");
            }
        }
    }
}