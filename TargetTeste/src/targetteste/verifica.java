package targetteste;

public class verifica {
        
    public boolean verifica(int num) {
        int num1 = 0;
        int num2 = 1;

        while (num1 <= num) {
            if (num1 == num) {
                return true;
            }

            int proximo = num1 + num2;
            num1 = num2;
            num2 = proximo;
        }

        return false;
    }
}

