package Week01;
//* kullanarak döngüler ile diamond yapımı
public class Odev23 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 3; i < n; i++){
            for (int j = 1; j < n-i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-2; i >= 0; i--){
            for (int j = 1; j < n-i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

