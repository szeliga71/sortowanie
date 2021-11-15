public class QuickSort {

    private int liczbaQ[];
    private double liczbyDoubleQ[];
    private double[] liczbyFloatQ;
    private int[] literkiQ;
    long wynik;


    public QuickSort(int liczba[]){

        liczbaQ=new int[liczba.length];
        for(int i=0;i<liczbaQ.length;i++){
            liczbaQ[i]=liczba[i];}

        int index_left=0;
        int index_right=liczbaQ.length-1;

        long start=System.nanoTime();

        quickSortInt(liczbaQ,index_left,index_right);


      long stop=System.nanoTime();
     wynik=(stop-start);
        System.out.println("Czas sortowania Quick tablicy int "+ wynik);
        for(int i=0;i<liczbaQ.length;i++){
        System.out.print(liczbaQ[i]+" ");
    }
        System.out.println();

}
        public QuickSort(double liczba[]){
        liczbyDoubleQ=new double[liczba.length];
        for(int i=0;i<liczbyDoubleQ.length;i++){
            liczbyDoubleQ[i]=liczba[i];}


        int index_left=0;
        int index_right=liczbyDoubleQ.length-1;

        long start=System.nanoTime();

        quickSortDouble(liczbyDoubleQ,index_left,index_right);


        long stop=System.nanoTime();
         wynik=(stop-start);
        System.out.println("Czas sortowania Quick tablicy double "+ wynik);
        for(int i=0;i<liczbyDoubleQ.length;i++){
            System.out.print(liczbyDoubleQ[i]+" ");
        }
        System.out.println();

    }

    public QuickSort(char liczba[]){
        literkiQ=new int[liczba.length];
        for(int i=0;i<literkiQ.length;i++){
            literkiQ[i]=liczba[i];}

        int index_left=0;
        int index_right=literkiQ.length-1;

        long start=System.nanoTime();

        quickSortInt(literkiQ,index_left,index_right);


        long stop=System.nanoTime();
        wynik=(stop-start);
        System.out.println("Czas sortowania Quick tablicy char "+ wynik);
        for(int i=0;i<literkiQ.length;i++){
            System.out.print((char)literkiQ[i]+" ");
        }
        System.out.println();

    }


    public QuickSort(float liczba[]){
        liczbyFloatQ=new double[liczba.length];
        for(int i=0;i<liczbyFloatQ.length;i++){
            liczbyFloatQ[i]=liczba[i];}
        int index_left=0;
        int index_right=liczbyFloatQ.length-1;

        long start=System.nanoTime();

        quickSortDouble(liczbyFloatQ,index_left,index_right);


        long stop=System.nanoTime();
        wynik=(stop-start);
        System.out.println("Czas sortowania Quick tablicy float "+ wynik);
        for(int i=0;i<liczbyFloatQ.length;i++){
            System.out.print((float)liczbyFloatQ[i]+" ");
        }
        System.out.println();

    }


    public static void quickSortInt(int liczba[],int index_left,int index_right){

        int piwot= liczba[(index_right+index_left)/2];
        int i=index_left;
        int j=index_right;
        int temp;

        while(i<=j){
            while (liczba[i] < piwot)
                i++;
            while (liczba[j] > piwot)
                j--;
            if (i <= j) {
                temp = liczba[i];
                liczba[i] = liczba[j];
                liczba[j] = temp;
                i++;
                j--;
            }
        }

        if(j>index_left)
            quickSortInt(liczba,index_left,j);
        if(i<index_right)
            quickSortInt(liczba,i,index_right);

    }

    public static void quickSortDouble(double liczba[],int index_left,int index_right){
        double piwot= liczba[(index_right+index_left)/2];
        int i=index_left;
        int j=index_right;
        double temp;

        while(i<=j){
            while (liczba[i] < piwot)
                i++;
            while (liczba[j] > piwot)
                j--;
            if (i <= j) {
                temp = liczba[i];
                liczba[i] = liczba[j];
                liczba[j] = temp;
                i++;
                j--;
            }
        }

        if(j>index_left)
            quickSortDouble(liczba,index_left,j);
        if(i<index_right)
            quickSortDouble(liczba,i,index_right);

    }

}
