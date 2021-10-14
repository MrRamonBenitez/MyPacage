import java.util.Scanner;
class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0; int y = 0; int z = 0;                    // инициализация размерных переменных
        StringBuilder strN = new StringBuilder();           // инициализация строковой переменной
        while (sc.hasNext()) {
            strN.append(sc.nextLine()).append(" ");         // получение строки чисел через пробел
            x += 1;                                         // получение числа строк
        }
        String[] numA = strN.toString().split(" ");   // создание одномерного массива
        y = numA.length / x;                                // получение числа столбцов
        Integer [][] numAr = new Integer[x][y];             // инициализация двумерного массива
        for(int i = 0; i < x; i++) {                        // создание двумерного массива целых чисел
            for(int j = 0; j < y; j++) {
                numAr[i][j] = Integer.valueOf(numA[z]);
                z += 1;
            }
        }
    }
}
