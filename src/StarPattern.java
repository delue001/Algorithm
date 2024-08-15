import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args){
        StarPattern starPattern = new StarPattern();
        starPattern.star();
        starPattern.star1();
        starPattern.starInvert();
        starPattern.starFormation();
        starPattern.starFormInvert();
        starPattern.starDiamond();
        starPattern.halfStarDiamond();
       // starPattern.Symmetric();
        starPattern.symmetricVoid();
        starPattern.symmetricButterfly();
        starPattern.hollowStarPattern();
        starPattern.numberPattern();
    }
    public void star() {
        System.out.println("{1}");
        for (int i = 1; i <= 5; i++){
            for (int k = 1; k <=5; k++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void star1(){
        System.out.println("{2}");
        for (int j = 0; j<=5; j++){
            for (int k = 1; k<=j; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void starInvert(){
        System.out.println("{5}");
        for (int i = 5; i>=1; i--){
            for (int k =1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void starFormation(){
        System.out.println("{7}");
        for (int i = 1; i <= 6; i++){
            for (int k = 1; k <= 6-i; k++){
                System.out.print(" ");
            }
            for (int j =1; j <= 2 * i - 1; j++){
                System.out.print("*");     //STAR LOOP
            }
            System.out.println();
        }
        System.out.println();
    }
    public void starFormInvert(){
        System.out.println("{8}");
        for (int i = 5; i>=1;i--){
            for (int k = 1; k<= 5-i; k++){
                System.out.print(" ");
            }
            for (int j =1; j <= 2 * i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void starDiamond() {
        System.out.println("{9}");
        for (int i = 1; i<=5; i++){
            for (int k = 1; k<=5-i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =5; i>=1; i--){
            for (int k =1; k<=5-i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void halfStarDiamond(){
        System.out.println("{10}");
        for (int i = 1; i<=5; i++){
            for (int k = 1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 4; i>=1; i--){
            for (int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    /*public void Symmetric(){
        for (int i =1; i<=2 * 5-1; i++){
            int stars = 1;
            if (i > 5) stars = 2 * 5 - i;
            for (int j =1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();     // [10]
        }
    }*/
    public void symmetricVoid(){
        System.out.println("{19}");
        int space = 1;
        for (int i = 1; i<=6; i++){
            for (int j = 1; j<=6-i; j++){
                System.out.print("*");
            }
            for (int j = 1; j<space; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=6-i; j++){
                System.out.print("*");
            }
            space+=2;
            System.out.println();
        }
        int spaces = 2*5-2;
        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for (int j = 1; j<spaces; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            spaces-=2;
            System.out.println();
        }
    }
    public void symmetricButterfly(){
        System.out.println("{20} ");
        int space = 2*5-2;
        for (int i = 1; i<= 2*5-1; i++){
            int star = i;
            if (i>5) star = 2*5-i;
            for (int j = 1; j<=star; j++){
                System.out.print("*");
            }
            for (int j = 1; j<=space; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=star; j++){
                System.out.print("*");
            }
            System.out.println();
            if (i<5) space -=2;
            else
                space +=2;
        }
        System.out.println();
    }
    public void hollowStarPattern(){
        System.out.println("{21}");
        Scanner ob = new Scanner(System.in);
        int row;
        int column;
        System.out.println("Enter no. of rows:");
        row = ob.nextInt();
        System.out.println("Enter no. of column:");
        column = ob.nextInt();
        for (int i = 1; i<=row; i++){
            for (int j = 1; j<=column; j++){
                if (i == 1 || i==row || j==1 || j==column){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void numberPattern(){
        System.out.println("{22} ");
        for (int i = 0; i<=2*5-1; i++){
            for (int j = 0; j<=2*5-1; j++){
                int up = i;
                int down = j;
                int right =2*5-2-j;
                int left = 2*5-2-i;
                System.out.print(5- Math.min(Math.min(up,down), Math.min(left,right))+ " ");
            }
            System.out.println();
        }
    }
}