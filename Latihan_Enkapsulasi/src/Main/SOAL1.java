package Main;

class StopWatch {
    private long startTime;
    private long endTime;

    // Konstruktor tanpa argumen
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    // Metode untuk mengatur startTime ke waktu saat ini
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // Metode untuk menyetel endTime ke waktu saat ini
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // Metode untuk mengembalikan waktu yang telah berlalu dalam milidetik
    public long getElapsedTime() {
        return endTime - startTime;
    }
}

public class SOAL1 {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[100000];

        // Mengisi array dengan angka acak
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }

        StopWatch stopwatch = new StopWatch();

        // Memulai waktu
        stopwatch.start();

        // Memulai proses pengurutan
        selectionSort(arr);

        // Menghentikan waktu
        stopwatch.stop();

        // Mengambil waktu yang diperlukan untuk pengurutan
        long elapsedTime = stopwatch.getElapsedTime();
        System.out.println("Waktu yang diperlukan untuk pengurutan: " + elapsedTime + " milidetik");
    }
}
