import java.util.Scanner;

class Main {

  // Initializing How The Factorial Functions For Later//
  public int factorial(int i) {
    if (i == 0)
      return 1;
    return i * factorial(i - 1);
  }

  // Initializing How The Sqare Variable Functions For The Perfect Squares Later
  // //
  static boolean checkPerfectSquare(double x) {
    double Square = Math.sqrt(x);
    return ((Square - Math.floor(Square)) == 0);
  }

  // Main Code //
  public static void main(String[] args) {

    // Scanners & Variables //
    Scanner input = new Scanner(System.in);
    byte i;
    byte k;
    byte b;
    byte rowNumb;
    byte[][] arrayMulti = new byte[10][10];
    boolean[] arrayA = { true, true, false, false };
    boolean[] arrayB = { true, false, true, false };
    boolean[] arrayAND = new boolean[4];
    boolean[] arrayOR = new boolean[4];
    byte[][] arrayModA = new byte[10][10];
    byte[] arrayModB = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    Main gfg = new Main();

    // Input, Starting the Loop //
    System.out.println(
        "What would you like you use? \nA. Addition Table \nB. Multiplication Table \nC. Boolean And Table \nD. Boolean Or Table \nE. Modulus Table \nF. Pascal's Triangle \nG. Exit");
    char tableSelect = input.next().charAt(0);
    char capsTableSelect = Character.toUpperCase(tableSelect);

    while (capsTableSelect != 'G') {

      // Addition Table //
      switch (capsTableSelect) {
        case ('A'):
          System.out.println("\033[H\033[2J");
          System.out.flush();
          System.out.println("Addition Table: ");
          System.out.println("|---------------------------------------|");
          for (i = 1; i < 101; i++) {
            if (i < 10) {
              System.out.print("| " + i + " ");
            } else if (i % 10 == 0 && i == 100) {
              System.out.println("|" + i + "|");
            } else if (i % 10 == 0) {
              System.out.println("|" + i + " |");
            } else if (i > 10) {
              System.out.print("|" + i + " ");
            }
          }
          System.out.println("|---------------------------------------|");
          System.out.println(
              "What would you like you use? \nA. Addition Table \nB. Multiplication Table \nC. Boolean And Table \nD. Boolean Or Table \nE. Modulus Table \nF. Pascal's Triangle \nG. Exit");
          tableSelect = input.next().charAt(0);
          capsTableSelect = Character.toUpperCase(tableSelect);
          break;

        // Multiplication Table //
        case ('B'):
          System.out.println("\033[H\033[2J");
          System.out.flush();
          System.out.println("Multiplication Table: ");
          System.out.println("|---------------------------------------|");
          for (i = 0; i < 10; i++) {
            for (k = 0; k < 10; k++) {
              arrayMulti[i][k] = (byte) ((i + 1) * (k + 1));
            }
          }
          for (i = 0; i < 10; i++) {
            for (k = 0; k < 10; k++) {
              if (checkPerfectSquare(arrayMulti[i][k]) && arrayMulti[i][k] < 10) {
                System.out.print("|  " + "\033[31m" + arrayMulti[i][k] + "\033[0m");
              } else if (arrayMulti[i][k] == 100) {
                System.out.print("|" + "\033[31m" + arrayMulti[i][k] + "\033[0m");
              } else if (checkPerfectSquare(arrayMulti[i][k]) && arrayMulti[i][k] > 10) {
                System.out.print("| " + "\033[31m" + arrayMulti[i][k] + "\033[0m");
              } else if (arrayMulti[i][k] < 10) {
                System.out.print("|  " + arrayMulti[i][k] + "");
              } else if (k == 10) {
                System.out.print("| " + arrayMulti[i][k] + "|");
              } else if (arrayMulti[i][k] >= 10) {
                System.out.print("| " + arrayMulti[i][k]);
              }
            }
            System.out.println("|");
          }
          System.out.println("|---------------------------------------|");
          System.out.println(
              "What would you like you use? \nA. Addition Table \nB. Multiplication Table \nC. Boolean And Table \nD. Boolean Or Table \nE. Modulus Table \nF. Pascal's Triangle \nG. Exit");
          tableSelect = input.next().charAt(0);
          capsTableSelect = Character.toUpperCase(tableSelect);
          break;

        // Boolean And Table //
        case ('C'):
          System.out.println("\033[H\033[2J");
          System.out.flush();
          System.out.println("Boolean And Table: ");
          System.out.println("|---------------------------------------|");
          System.out.println("| Condition One | Condition Two |  AND  |");
          for (i = 0; i < 4; i++) {
            if (arrayA[i] == false || arrayB[i] == false) {
              arrayAND[i] = false;
            } else if (arrayA[i] == true && arrayB[i] == true) {
              arrayAND[i] = true;
            }
            if (arrayA[i] == true) {
              System.out.print("|    " + arrayA[i] + "       | ");
            } else if (arrayA[i] == false) {
              System.out.print("|    " + arrayA[i] + "      | ");
            }
            if (arrayB[i] == true) {
              System.out.print("    " + arrayB[i] + "      |");
            } else if (arrayB[i] == false) {
              System.out.print("    " + arrayB[i] + "     |");
            }
            if (arrayAND[i] == true) {
              System.out.println("  " + arrayAND[i] + " |");
            } else if (arrayAND[i] == false) {
              System.out.println(" " + arrayAND[i] + " |");
            }
          }
          System.out.println("|---------------------------------------|");
          System.out.println(
              "What would you like you use? \nA. Addition Table \nB. Multiplication Table \nC. Boolean And Table \nD. Boolean Or Table \nE. Modulus Table \nF. Pascal's Triangle \nG. Exit");
          tableSelect = input.next().charAt(0);
          capsTableSelect = Character.toUpperCase(tableSelect);
          break;

        // Boolean Or Table //
        case ('D'):
          System.out.println("\033[H\033[2J");
          System.out.flush();
          System.out.println("Boolean Or Table: ");
          System.out.println("|---------------------------------------|");
          System.out.println("| Condition One | Condition Two |   OR  |");
          for (i = 0; i < 4; i++) {
            if (arrayA[i] == false && arrayB[i] == false) {
              arrayOR[i] = false;
            } else if (arrayA[i] == true || arrayB[i] == true) {
              arrayOR[i] = true;
            }
            if (arrayA[i] == true) {
              System.out.print("|    " + arrayA[i] + "       | ");
            } else if (arrayA[i] == false) {
              System.out.print("|    " + arrayA[i] + "      | ");
            }
            if (arrayB[i] == true) {
              System.out.print("    " + arrayB[i] + "      |");
            } else if (arrayB[i] == false) {
              System.out.print("    " + arrayB[i] + "     |");
            }
            if (arrayOR[i] == true) {
              System.out.println("  " + arrayOR[i] + " |");
            } else if (arrayOR[i] == false) {
              System.out.println(" " + arrayOR[i] + " |");
            }
          }
          System.out.println("|---------------------------------------|");
          System.out.println(
              "What would you like you use? \nA. Addition Table \nB. Multiplication Table \nC. Boolean And Table \nD. Boolean Or Table \nE. Modulus Table \nF. Pascal's Triangle \nG. Exit");
          tableSelect = input.next().charAt(0);
          capsTableSelect = Character.toUpperCase(tableSelect);
          break;

        // Modular Table //
        case ('E'):
          System.out.println("\033[H\033[2J");
          System.out.flush();
          System.out.println("Modular Table: ");
          System.out.println("|---------------------------------------|");
          b = 0;
          for (i = 0; i < 10; i++) {
            for (k = 0; k < 10; k++) {
              arrayModA[i][k] = arrayModB[b];
              b++;
              if (b > 9) {
                b = 0;
              }
            }
            b++;
          }
          for (i = 0; i < 10; i++) {
            for (k = 0; k < 10; k++) {
              if (arrayModA[i][k] < 10) {
                System.out.print("|  " + arrayModA[i][k] + "");
              } else if (arrayModA[i][k] >= 10) {
                System.out.print("| " + arrayModA[i][k]);
              }
            }
            System.out.println("|");
          }
          System.out.println("|---------------------------------------|");
          System.out.println(
              "What would you like you use? \nA. Addition Table \nB. Multiplication Table \nC. Boolean And Table A \nD. Boolean Or Table \nE. Modulus Table \nF. Pascal's Triangle \nG. Exit");
          tableSelect = input.next().charAt(0);
          capsTableSelect = Character.toUpperCase(tableSelect);
          break;

        // Pascal's Triangle //
        case ('F'):
          System.out.println("How many lines do you want in the triangle?");
          rowNumb = input.nextByte();
          System.out.println("\033[H\033[2J");
          System.out.flush();
          System.out.println("Pascal's Triangle: ");
          for (i = 0; i <= rowNumb - 1; i++) {
            for (k = 0; k <= rowNumb - i; k++) {
              System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {
              System.out.print(" " + gfg.factorial(i) / (gfg.factorial(i - k) * gfg.factorial(k)));
            }
            System.out.println();
          }
          System.out.println(
              "What would you like you use? \nA. Addition Table \nB. Multiplication Table \nC. Boolean And Table A \nD. Boolean Or Table \nE. Modulus Table \nF. Pascal's Triangle \nG. Exit");
          tableSelect = input.next().charAt(0);
          capsTableSelect = Character.toUpperCase(tableSelect);
          break;

        // For Letters Entered That Aren't An Option //
        default:
          System.out.println("Not an availible option, pick again.");
          System.out.println(
              "What would you like you use? \nA. Addition Table \nB. Multiplication Table \nC. Boolean And Table A \nD. Boolean Or Table \nE. Modulus Table \nF. Pascal's Triangle \nG. Exit");
          tableSelect = input.next().charAt(0);
          capsTableSelect = Character.toUpperCase(tableSelect);
      }
    }
  }
}