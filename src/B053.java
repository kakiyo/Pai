import java.util.Scanner;
public class B053 {
        public static void main(String[] args ) {
            Scanner sc = new Scanner(System.in);
            int H = sc.nextInt();
            int W = sc.nextInt();
            int [][] num = new int[H][W];
            for (int i = 0;i<H;i++){

                if (i<2) {
                    for (int j = 0; j < W; j++) {
                        if (j < 2) {
                            num[i][j] = sc.nextInt();
                        } else {
                            int sa = num[i][j - 1]-num[i][j - 2];
                            num[i][j] = num[i][j - 1] + sa;
                        }
                    }
                }


                else {
                    num[i][0] = num[i-1][0] + ( num[i-1][0]- num[i-2][0]);
                    for (int j = 1; j < W; j++) {
                            int sa = num[1][j]-num[0][j];
                            num[i][j] = num[i-1][j] + sa;

                    }
                }
            }

            for (int i = 0;i<H;i++){
                for (int j = 0;j<W;j++) {
                    if (j<W-1) {
                        System.out.print(num[i][j] + " ");
                    }
                    else {
                        System.out.print(num[i][j]);
                    }
                }
                System.out.println();
            }
        }
    }
