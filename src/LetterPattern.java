public class LetterPattern {
    public void increasingLetter(){
        System.out.println(" {14}");

        for (int i = 1; i<=5; i++){
            for (char ar = 'A'; ar<'A' + i; ar++){
                System.out.print(ar+" ");
                //letter++;
            }
            System.out.println();
        }
    }
    public  void  reverseLetter(){
        System.out.println(" {15}");
        for (int i = 5; i>=1; i--){
            for (char ar = 'A'; ar < 'A'+i; ar++){
                System.out.print(ar + "");
            }
            System.out.println();
        }
    }
    public void alphaRamp(){
        System.out.println(" {16}");
        char ar = 'A';
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(ar+" ");
            }
            ar++;
            System.out.println();
        }
    }
    public void alphaHill(){
        System.out.println(" {17}");
        for (int i = 1; i <=6; i++){
            for (int j = 1; j<=6-i; j++){
                System.out.print(" ");
            }
            for (int j =1; j <=i; j++){
                System.out.print((char) ('A' + j-1) + "");
            }
            for (int j=i-1; j>=1; j--){
                System.out.print((char)('A' + j - 1) + "");
            }
            System.out.println();
        }
    }
    public void alphaTriangle(){
        System.out.println(" {18}");
        for (int i = 6; i >= 1; i--) {
            for (int j = i; j <= 6; j++) {
                System.out.print((char) ('A' + j - 1) + " ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print((char) ('A' + j - 1) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        LetterPattern letter = new LetterPattern();
        letter.increasingLetter();
        letter.reverseLetter();
        letter.alphaRamp();
        letter.alphaHill();
        letter.alphaTriangle();
    }
}
