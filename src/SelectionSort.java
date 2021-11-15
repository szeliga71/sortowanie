public class SelectionSort {
    public int liczbaS[];
    public double liczbyDouble[];
    public double[] liczbyFloat;
    public int[] literki;
    long wynik;

    public SelectionSort(int liczba[]) {
        liczbaS = new int[liczba.length];
        for (int i = 0; i < liczbaS.length; i++) {
            liczbaS[i] = liczba[i];
        }

        long start = System.nanoTime();
        selectionSortInt(liczbaS);
        long stop = System.nanoTime();
        wynik = (stop - start);
        System.out.println("Czas sortowania Selection tablicy int " + wynik);
        for (int i = 0; i < liczbaS.length; i++) {
            System.out.print(liczbaS[i] + " ");
        }
        System.out.println();

    }

    public SelectionSort(double liczba[]) {
        liczbyDouble = new double[liczba.length];
        for (int i = 0; i < liczbyDouble.length; i++) {
            liczbyDouble[i] = liczba[i];
        }

        long start = System.nanoTime();
        selectionSortDouble(liczbyDouble);
        long stop = System.nanoTime();
        wynik = (stop - start);
        System.out.println("Czas sortowania Selection tablicy double " + wynik);
        for (int i = 0; i < liczbyDouble.length; i++) {
            System.out.print(liczbyDouble[i] + " ");
        }
        System.out.println();
    }

    public SelectionSort(char liczba[]) {
        literki = new int[liczba.length];
        for (int i = 0; i < literki.length; i++) {
            literki[i] = liczba[i];
        }

        long start = System.nanoTime();
        selectionSortInt(literki);
        long stop = System.nanoTime();
        wynik = (stop - start);
        System.out.println("Czas sortowania Selection tablicy char " + wynik);
        for (int i = 0; i < literki.length; i++) {
            System.out.print((char) literki[i] + " ");
        }
        System.out.println();
    }

    public SelectionSort(float liczba[]) {
        liczbyFloat = new double[liczba.length];
        for (int i = 0; i < liczbyFloat.length; i++) {
            liczbyFloat[i] = liczba[i];
        }

        long start = System.nanoTime();
        selectionSortDouble(liczbyFloat);
        long stop = System.nanoTime();
        wynik = (stop - start);
        System.out.println("Czas sortowania Selection tablicy float " + wynik);
        for (int i = 0; i < liczbyFloat.length; i++) {
            System.out.print((float) liczbyFloat[i] + " ");
        }
        System.out.println();
    }


    public void selectionSortInt(int liczba[]) {


        for (int i = 0; i < liczba.length - 1; i++) {
            int pozMinimalna = i;

            for (int j = i + 1; j < liczba.length; j++)
                if (liczba[j] < liczba[pozMinimalna])
                    pozMinimalna = j;
            int temp = liczba[pozMinimalna];
            liczba[pozMinimalna] = liczba[i];
            liczba[i] = temp;


        }

    }

    public void selectionSortDouble(double liczba[]) {

        long start = System.nanoTime();
        for (int i = 0; i < liczba.length - 1; i++) {
            int pozMinimalna = i;

            for (int j = i + 1; j < liczba.length; j++)
                if (liczba[pozMinimalna] > liczba[j])
                    pozMinimalna = j;
            double temp = liczba[pozMinimalna];
            liczba[pozMinimalna] = liczba[i];
            liczba[i] = temp;


        }
    }
}








