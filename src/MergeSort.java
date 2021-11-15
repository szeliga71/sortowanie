public class MergeSort {
    public int liczbaM[];
    public double liczbyDouble[];
    public double[] liczbyFloat;
    public int[] literki;
    long wynik;


    public MergeSort(int liczba[]){


        liczbaM=new int[liczba.length];
        for(int i=0;i<liczbaM.length;i++){
            liczbaM[i]=liczba[i];}
        long start=System.nanoTime();
        mergeSortInt(liczbaM,0,liczbaM.length-1);
        long stop=System.nanoTime();
        wynik=(stop-start);
        System.out.println("Czas sortowania MergeSort tablicy int "+wynik);
        for(int i=0;i<liczbaM.length;i++){
            System.out.print(liczbaM[i]+" ");

    }
        System.out.println();
    }

    public MergeSort(double liczba[]){
        liczbyDouble=new double[liczba.length];
        for(int i=0;i<liczbyDouble.length;i++){
            liczbyDouble[i]=liczba[i];}
        long start=System.nanoTime();
        mergeSortDouble(liczbyDouble,0,liczbyDouble.length-1);
        long stop=System.nanoTime();
        wynik=(stop-start);
        System.out.println("Czas sortowania MergeSort tablicy double "+wynik);
        for(int i=0;i<liczbyDouble.length;i++){
            System.out.print(liczbyDouble[i]+" ");

        }
        System.out.println();
    }


    public MergeSort(char liczba[]){
        literki=new int[liczba.length];
        for(int i=0;i<literki.length;i++){
            literki[i]=liczba[i];}
        long start=System.nanoTime();
        mergeSortInt(literki,0,literki.length-1);
        long stop=System.nanoTime();
        wynik=(stop-start);
        System.out.println("Czas sortowania MergeSort tablicy char "+wynik);
        for(int i=0;i<literki.length;i++){
            System.out.print((char)literki[i]+" ");

        }
        System.out.println();
    }
    public MergeSort(float liczba[]){
        liczbyFloat=new double[liczba.length];
        for(int i=0;i<liczbyFloat.length;i++){
            liczbyFloat[i]=liczba[i];}

        long start=System.nanoTime();
        mergeSortDouble(liczbyFloat,0,liczbyFloat.length-1);
        long stop=System.nanoTime();
        wynik=(stop-start);
        System.out.println("Czas sortowania MergeSort tablicy float "+wynik);
        for(int i=0;i<liczbyFloat.length;i++){
            System.out.print((float)liczbyFloat[i]+" ");

        }
        System.out.println();
    }


    public static void merge(int[] liczba, int index_start, int ex_mid, int index_end) {
        int leftLength = ex_mid - index_start + 1;
        int rightLength = index_end - ex_mid;
        int leftIndex = 0;
        int rightIndex = 0;
        int newIndex;
        int[] tabLeft = new int[leftLength];
        int[] tabRight = new int[rightLength];


        for (int i = 0; i < leftLength; i++)
            tabLeft[i] = liczba[index_start + i];
        for (int j = 0; j < rightLength; j++)
            tabRight[j] = liczba[ex_mid + 1 + j];




        for (newIndex = index_start; leftIndex < leftLength && rightIndex < rightLength; newIndex++)
        {
            if (tabLeft[leftIndex] <= tabRight[rightIndex])
                liczba[newIndex] = tabLeft[leftIndex++];
            else
                liczba[newIndex] = tabRight[rightIndex++];
        }

        while (leftIndex < leftLength)
            liczba[newIndex++] = tabLeft[leftIndex++];


        while (rightIndex < rightLength)
            liczba[newIndex++] = tabRight[rightIndex++];}



    public static void mergeSortInt(int[] liczba,int index_start,int index_end){


        if (index_end > index_start) {
            int index_mid = (index_start + index_end) / 2;
            mergeSortInt(liczba, index_start, index_mid);
            mergeSortInt(liczba, index_mid + 1, index_end);
            merge(liczba, index_start, index_mid, index_end);
        }

        }

        public static void merge(double[] liczba, int index_start, int ex_mid, int index_end) {
            int leftLength = ex_mid - index_start + 1;
            int rightLength = index_end - ex_mid;
            int leftIndex = 0;
            int rightIndex = 0;
            int newIndex;
            double[] tabLeft = new double[leftLength];
            double[] tabRight = new double[rightLength];


            for (int i = 0; i < leftLength; i++)
                tabLeft[i] = liczba[index_start + i];
            for (int j = 0; j < rightLength; j++)
                tabRight[j] = liczba[ex_mid + 1 + j];




            for (newIndex = index_start; leftIndex < leftLength && rightIndex < rightLength; newIndex++)
            {
                if (tabLeft[leftIndex] <= tabRight[rightIndex])
                    liczba[newIndex] = tabLeft[leftIndex++];
                else
                    liczba[newIndex] = tabRight[rightIndex++];
            }

            while (leftIndex < leftLength)
                liczba[newIndex++] = tabLeft[leftIndex++];


            while (rightIndex < rightLength)
                liczba[newIndex++] = tabRight[rightIndex++];}



        public static void mergeSortDouble(double[] liczba,int index_start,int index_end){


            if (index_end > index_start) {
                int index_mid = (index_start + index_end) / 2;
                mergeSortDouble(liczba, index_start, index_mid);
                mergeSortDouble(liczba, index_mid + 1, index_end);
                merge(liczba, index_start, index_mid, index_end);
            }

        }

}
