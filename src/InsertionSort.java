public class InsertionSort {
    public int liczbaI[];
    public double liczbyDouble[];
    public double[] liczbyFloat;
    public int[] literki;
    long wynik;

    public InsertionSort(int liczba[]){
        liczbaI=new int[liczba.length];
        for(int i=0;i<liczbaI.length;i++){
            liczbaI[i]=liczba[i];}
        long start=System.nanoTime();
        insertSortInt(liczbaI);
        long stop=System.nanoTime();
        wynik=(stop-start);
        System.out.println("Czas sortowania InsertionSort tablicy int "+wynik);
        for(int i=0;i<liczbaI.length;i++){
            System.out.print(liczbaI[i]+" ");
        }
        System.out.println();
    }


    public InsertionSort(double liczba[]){
        liczbyDouble=new double[liczba.length];
        for(int i=0;i<liczbyDouble.length;i++){
            liczbyDouble[i]=liczba[i];}
        long start=System.nanoTime();
        insertSortDouble(liczbyDouble);
        long stop=System.nanoTime();
        wynik=(stop-start);
        System.out.println("Czas sortowania InsertionSort tablicy double "+wynik);
        for(int i=0;i<liczbyDouble.length;i++){
            System.out.print(liczbyDouble[i]+" ");
        }
        System.out.println();
    }
    public InsertionSort(char liczba[]){
        literki=new int[liczba.length];
        for(int i=0;i<literki.length;i++){
            literki[i]=liczba[i];}
        long start=System.nanoTime();
        insertSortInt(literki);
        long stop=System.nanoTime();
        wynik=(stop-start);
        System.out.println("Czas sortowania InsertionSort tablicy char "+wynik);
        for(int i=0;i<literki.length;i++){
            System.out.print((char)literki[i]+" ");
        }
        System.out.println();

    }
    public InsertionSort(float liczba[]){
        liczbyFloat=new double[liczba.length];
        for(int i=0;i<liczbyFloat.length;i++){
            liczbyFloat[i]=liczba[i];}
        long start=System.nanoTime();
        insertSortDouble(liczbyFloat);
        long stop=System.nanoTime();
        wynik=(stop-start);
        System.out.println("Czas sortowania InsertionSort tablicy float "+wynik);
        for(int i=0;i<liczbyFloat.length;i++){
            System.out.print((float)liczbyFloat[i]+" ");
        }
        System.out.println();
    }




    public void insertSortInt(int liczba[]) {

        for (int i = liczba.length - 2; i >= 0; i--) {
            int val = liczba[i];
            int k = i + 1;
            while ((k < liczba.length) && (val > liczba[k])) {
                liczba[k - 1] = liczba[k];
                k++;
            }
            liczba[k - 1] = val;
        }
    }


    public void insertSortDouble(double liczba[]){
        long start=System.nanoTime();
        for(int i=liczba.length-2;i>=0;i--){
            double val=liczba[i];
            int k=i+1;
            while((k<liczba.length)&&(val>liczba[k]))
            {
                liczba[k-1]=liczba[k];
                k++;
            }
            liczba[k-1]=val;

    }
    }

}
