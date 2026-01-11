
class Main {
    public static void main(String[] args) {
    for(int i=1; i<=5; i++){
        for(int j=1; j<=5-i; j++){
            System.out.print(" ");
        }
        for(int k=i; k>=1; k--){
            System.out.print(k);
        }
        for(int j=2; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
}

/*
    1
   212
  32123
 4321234
543212345
  */
