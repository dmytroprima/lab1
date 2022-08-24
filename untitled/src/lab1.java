import java.util.Scanner;
class Digit {
    int value;
    int num;
    Digit(int value, int num){
        this.value=value;
        this.num=num;
    }
    void SetInfo(){
        System.out.print("Число під номером " + this.num + ": "+ this.value);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Digit digitA = new Digit(1, 1);
        Digit digitB = new Digit(3, 2);
        System.out.print("Введіть порядковий номер потрібного числа: ");
        int N = scanner.nextInt();
        if(N==0){
            System.out.print("Немає числа з таким порядковим номером");
            return;
        }
        else if (N==1){
            digitA.SetInfo();
            return;
        }
        int locvar;
        while(N!= digitB.num){
            locvar = digitB.value;
            digitB.num++;
            digitB.value += digitA.value;
            digitA.num++;
            digitA.value = locvar;
        }
        digitB.SetInfo();
    }
}