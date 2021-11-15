public class HeapSort {
    public int liczbaH[];
    public double liczbyDoubleH[];
    public double[] liczbyFloatH;
    public int[] literkiH;
    long wynik;

    public HeapSort(int liczba[]) {


        liczbaH = new int[liczba.length];
        for (int i = 0; i < liczbaH.length; i++) {
            liczbaH[i] = liczba[i];
        }

        long start = System.nanoTime();
        heapSortInt(liczbaH);
        long stop = System.nanoTime();
        wynik = (stop - start);
        System.out.println("Czas sortowania HeapSort tablicy int " + wynik);
        for (int i = 0; i < liczbaH.length; i++) {
            System.out.print(liczbaH[i] + " ");

        }
        System.out.println();
    }

    public HeapSort(double liczba[]) {
        liczbyDoubleH = new double[liczba.length];
        for (int i = 0; i < liczbyDoubleH.length; i++) {
            liczbyDoubleH[i] = liczba[i];
        }


        long start = System.nanoTime();
        heapSortDouble(liczbyDoubleH);
        long stop = System.nanoTime();
        wynik = (stop - start);
        System.out.println("Czas sortowania HeapSort tablicy double " + wynik);
        for (int i = 0; i < liczbyDoubleH.length; i++) {
            System.out.print(liczbyDoubleH[i] + " ");

        }
        System.out.println();
    }


    public HeapSort(char liczba[]) {
        literkiH = new int[liczba.length];
        for (int i = 0; i < literkiH.length; i++) {
            literkiH[i] = liczba[i];
        }

        long start = System.nanoTime();
        heapSortInt(literkiH);
        long stop = System.nanoTime();
        wynik = (stop - start);
        System.out.println("Czas sortowania HeapSort tablicy char " + wynik);
        for (int i = 0; i < literkiH.length; i++) {
            System.out.print((char) literkiH[i] + " ");

        }
        System.out.println();
    }

    public HeapSort(float liczba[]) {
        liczbyFloatH = new double[liczba.length];
        for (int i = 0; i < liczbyFloatH.length; i++) {
            liczbyFloatH[i] = liczba[i];
        }


        long start = System.nanoTime();
        heapSortDouble(liczbyFloatH);
        long stop = System.nanoTime();
         wynik = (stop - start);
        System.out.println("Czas sortowania HeapSort tablicy float " + wynik);
        for (int i = 0; i < liczbyFloatH.length; i++) {
            System.out.print((float) liczbyFloatH[i] + " ");

        }
        System.out.println();
    }

    public static void heapSortInt(int[] liczba) {


        budowaSterty(liczba);
        for (int i = liczba.length - 1; i > 0; i--) {
            zamiana(liczba, 0, i);
            maxWstercie(liczba, 0, i - 1);
        }
    }


    public static void budowaSterty(int liczba[]) {
        for (int i = (liczba.length - 1) / 2; i >= 0; i--)
            maxWstercie(liczba, i, liczba.length - 1);
    }


    public static void maxWstercie(int liczba[], int i, int N) {
        int left = 2 * i;

        int right = 2 * i + 1;
        int max = i;
        if (left <= N && liczba[left] > liczba[i])
            max = left;
        if (right <= N && liczba[right] > liczba[max])
            max = right;
        if (max != i) {
            zamiana(liczba, i, max);
            maxWstercie(liczba, max, N);
        }
    }

    public static void zamiana(int liczba[], int i, int j) {
        int temp = liczba[i];
        liczba[i] = liczba[j];
        liczba[j] = temp;
    }

    public static void heapSortDouble(double[] liczba) {


        budowaSterty(liczba);
        for (int i = liczba.length - 1; i > 0; i--) {
            zamiana(liczba, 0, i);
            maxWstercie(liczba, 0, i - 1);
        }
    }


    public static void budowaSterty(double liczba[]) {
        for (int i = (liczba.length - 1) / 2; i >= 0; i--)
            maxWstercie(liczba, i, liczba.length - 1);
    }


    public static void maxWstercie(double liczba[], int i, int N) {
        int left = 2 * i;

        int right = 2 * i + 1;
        int max = i;
        if (left <= N && liczba[left] > liczba[i])
            max = left;
        if (right <= N && liczba[right] > liczba[max])
            max = right;
        if (max != i) {
            zamiana(liczba, i, max);
            maxWstercie(liczba, max, N);
        }
    }

    public static void zamiana(double liczba[], int i, int j) {
        double temp = liczba[i];
        liczba[i] = liczba[j];
        liczba[j] = temp;
    }


}

