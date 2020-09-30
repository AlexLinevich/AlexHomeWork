package HomeWork1;

public class Task1 {

    public static void main(String[] args) {

        // 1.2 Использовать ВСЕ возможные побитовые операции с числами 42 и 15.
        // 1.4 В комментариях к каждой операции написать двоичный код каждого
        // числа и результата операции.
        System.out.println("42 & 15 = " + (42 & 15));   //   00101010   42
                                                        // & 00001111   15
                                                        //   --------
                                                        //   00001010   10
        int number1 = 42;
        number1 &= 15;
        System.out.println("number1 &= 15: " + number1);

        System.out.println("42 | 15 = " + (42 | 15));   //   00101010   42
                                                        // | 00001111   15
                                                        //   --------
                                                        //   00101111   47
        int number2 = 42;
        number2 |= 15;
        System.out.println("number2 |= 15: " + number2);

        System.out.println("42 ^ 15 = " + (42 ^ 15));   //   00101010   42
                                                        // ^ 00001111   15
                                                        //   --------
                                                        //   00100101   37
        int number3 = 42;
        number3 ^= 15;
        System.out.println("number3 ^= 15: " + number3);

        System.out.println("42 >> 15 = " + (42 >> 15)); //   00101010   42
                                                        // >>15
                                                        //   00000000   0
        int number4 = 42;
        number4 >>= 15;
        System.out.println("number4 >>= 15: " + number4);

        System.out.println("42 << 15 = " + (42 << 15)); //   00101010   42
                                                        // <<15
                             //   00000000 00010101 00000000 00000000   1376256
        int number5 = 42;
        number5 <<= 15;
        System.out.println("number5 <<= 15: " + number5);

        System.out.println("42 >>> 15 = " + (42 >>> 15));//   00101010   42
                                                         //>>>15
                                                         //   00000000   0
        int number6 = 42;
        number6 >>>= 15;
        System.out.println("number6 >>>= 15: " + number6);

        System.out.println("~ 42 = " + (~ 42));         // ~ 00101010   42
                                                        //   --------
                                                        //   11010101  -43

        System.out.println("~ 15 = " + (~ 15));         // ~ 00001111   15
                                                        //   --------
                                                        //   11110000  -16
        System.out.println("-----------------------");

        // 1.2 Использовать ВСЕ возможные побитовые операции с числами -42 и -15.
        // 1.4 В комментариях к каждой операции написать двоичный код каждого
        // числа и результата операции.
        System.out.println("-42 & -15 = " + (-42 & -15));   //   11010110   -42
                                                            // & 11110001   -15
                                                            //   --------
                                                            //   11010000   -48
        int oddNumber1 = -42;
        oddNumber1 &= -15;
        System.out.println("oddNumber1 &= -15: " + oddNumber1);

        System.out.println("-42 | -15 = " + (-42 | -15));   //   11010110   -42
                                                            // | 11110001   -15
                                                            //   --------
                                                            //   11110111   -9
        int oddNumber2 = -42;
        oddNumber2 |= -15;
        System.out.println("oddNumber2 |= -15: " + oddNumber2);

        System.out.println("-42 ^ -15 = " + (-42 ^ -15));   //   11010110   -42
                                                            // ^ 11110001   -15
                                                            //   --------
                                                            //   00100111    39
        int oddNumber3 = -42;
        oddNumber3 ^= -15;
        System.out.println("oddNumber3 ^= -15: " + oddNumber3);

        System.out.println("-42 >> 17 (-15) = " + (-42 >> 17));   //   11010110   -42
                                                                  // >>17 (-15)
                                                                  //   11111111   -1
        int oddNumber4 = -42;
        oddNumber4 >>= -15;
        System.out.println("oddNumber4 >>= -15: " + oddNumber4);

        System.out.println("-42 << 17 (-15) = " + (-42 << 17));  //   11010110   -42
                                                                 // <<17 (-15)
                                      //   11111111 10101100 00000000 00000000   -5505024
        int oddNumber5 = -42;
        oddNumber5 <<= -15;
        System.out.println("oddNumber5 <<= -15: " + oddNumber5);

        System.out.println("-42 >>> 17 (-15) = " + (-42 >>> 17));//   11010110   -42
                                                                 //>>>17 (-15)
                                      //   00000000 00000000 10000000 00000000   32767
        int oddNumber6 = -42;
        oddNumber6 >>>= -15;
        System.out.println("oddNumber6 >>>= 15: " + oddNumber6);

        System.out.println("~ -42 = " + (~ -42));            // ~ 11010110   -42
                                                             //   --------
                                                             //   00101001    41

        System.out.println("~ -15 = " + (~ -15));            // ~ 11110001   -15
                                                             //   --------
                                                             //   00001110    14

        // 1.5 Попробуйте сделать побитовую операцию с числова 42.5
        // System.out.println("~ -42,5 = " + (~ -42,5)); - не компилируется.
        // Побитовые операции выполняются только с целочисленными типами данных.
    }
}
