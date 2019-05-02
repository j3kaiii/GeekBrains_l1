package Lesson_2;

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

class Lesson2 {


    public static void main(String[] args) {
        String noErrorsMass[][] = {{"1","2","3","4"},
                                    {"5","6","7","8"},
                                    {"9","10","11","12"},
                                    {"13","14","15","16"}};

        String indexErrorMass[][] = {{"1","2","3","4","5"},
                                    {"6","7","8","9","10"}};

        String dataErrorMass[][] = {{"1","два","3","4"},
                                    {"5","6","7","8"},
                                    {"9","10","11","12"},
                                    {"13","14","15","16"}};

        String indexAndDataErrorMass[][] = {{"1","2","три","4","5"},
                                            {"6","7","8","9","10"}};

        try {
            System.out.println("Массив без ошибок");
            testMass(noErrorsMass);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        System.out.println();

        try {
            System.out.println("Массив c неверным размером");
            testMass(indexErrorMass);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        System.out.println();

        try {
            System.out.println("Массив с неверными данными");
            testMass(dataErrorMass);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        System.out.println();

        try {
            System.out.println("Все не правильно!!)");
            testMass(indexAndDataErrorMass);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Программа завершена.");

    }

    public static void testMass(String[][] mass) throws MyArraySizeException, MyArrayDataException{

        if (mass.length != 4 || mass[0].length != 4) throw new MyArraySizeException("неверный размер массива");

        int temp;
        int result = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    temp = Integer.parseInt(mass[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException("неверные данные в ячейке [" + i + "][" + j + "]");
                }
                result += temp;
            }
        }
        System.out.println("Сумма чисел в массиве = " + result);

    }
}
