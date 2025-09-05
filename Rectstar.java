// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Rectstar {
    public static void main(String[] args) {
        int n=5, m=4;
        for(int i =1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1||j==1||j==m||i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            
            }    
            System.out.println();
        }
    }
}
