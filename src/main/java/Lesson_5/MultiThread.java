package Lesson_5;

public class MultiThread {
    static final int size = 10000000;
    static final int h = size/2;

    public static void main(String[] args) {
        float[] arr = new float[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }

        System.out.println("one thread:");
        noMutliThreading(arr);

        System.out.println("\nTwo threads:");
        withMultiThreading(arr);

    }

    static void noMutliThreading(float[] arr) {


        long a = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println(System.currentTimeMillis() - a);
    }

    static void withMultiThreading(float[] arr) {
        long a = System.currentTimeMillis();
        final float[] arr1 = new float[h];
        final float[] arr2 = new float[h];

        System.arraycopy(arr,0,arr1,0,h);
        System.arraycopy(arr,h,arr2,0,h);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < h; i++) {
                    arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < h; i++) {
                    arr2[i] = (float)(arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);

        System.out.println(System.currentTimeMillis() - a);
    }
}
