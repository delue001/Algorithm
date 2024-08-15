public class NumberPattern {
    public void number(){
        System.out.println("{3}");
        for (int i =1; i<=5; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(" "+j);

            }
            System.out.println();
        }
    }
    public void number1(){
        System.out.println("{4}");
        for (int k = 1; k<=5; k++){
            for (int l = 1; l<=k; l++ ){
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println();

    }
    public void numberInverted(){
        System.out.println("{6}");
        for (int i = 5; i>=1; i--){
            for (int k = 1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
    public void binaryNumber(){
        System.out.println("{11}");
        for (int i =1; i<=5; i++){
            for (int j = 1; j<=i; j++){
                if (j % 2 == 0){   // checks if column j is even,prints 0 and odd prints1
                    System.out.print("0 ");
                }
                else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
    public void crownNumber(){
        System.out.println("{12}");
        int space = 2*5-1;
        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for (int j =1; j<=space; j++){
                System.out.print(" ");

            }

            for (int j =i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
    }
    public void increasingNumber(){
        System.out.println(" {13}");
        int number = 1;
        for (int i = 1; i<=15; i++){
            for (int j =1; j<=i; j++){
                System.out.print(number+" ");
                number = number+1;

            }
            System.out.println();
            if (number>=15)
                break;
        }
    }

    public static void main(String[] args){
        NumberPattern no1 = new NumberPattern();
        no1.number();
        no1.number1();
        no1.numberInverted();
        no1.binaryNumber();
        no1.crownNumber();
        no1.increasingNumber();
    }
}
