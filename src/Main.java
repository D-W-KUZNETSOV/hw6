public class Main {
    public static void main(String[] args) {
        // задание №1
        for (int i = 1; i <= 10; i++) {
            System.out.println(+i);
        }

        // задание №2
        {
            for (int i = 10; i >= 1; i--) {
                System.out.println(+i);
            }

            //задание №3
            {
                for (int i = 0; i <= 17; i = i + 2) {
                    System.out.println(+i);

                    //Задание №4
                }
                for (int i = 10; i >= -10; i--) {
                    System.out.println(+i);
                }

                //задание №5
                for (int year = 1904; year <= 2096; year = year + 4) {
                    System.out.println(+year + " год является високосным");
                }

                //задача № 6
                for (int t = 7; t <= 98; t = t + 7) {
                    System.out.println(+t);

                    //задание №7
                    for (int e = 1; e <= 512; e = e * 2) {
                        System.out.println(+e);
                    }
                    //задание №8
                    int salary = 29000;
                    int total = 0;
                    for (int i = 1; i <= 12; i++) {
                        total = total + salary;
                        System.out.println("месяц " + i + " сумма накоплений равна " + total);
                    }
                }

                //задание №9
            }
            int salary = 29000;
            int total = 0;
            for (int i = 1; i <= 12; i++) {
                total = total + (total / 100);
                total = total + salary;
                System.out.println("месяц " + i + " сумма накоплений равна " + total);


            }

            //задание №10
            int result;
            for (int m = 1; m <= 10; m++) {
                result = m * 2;
                System.out.println(+m + "*2 =" + result);
            }


        }
    }
}