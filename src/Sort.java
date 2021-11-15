
public class Sort {

    private int liczba[];
    private double liczbyDoubleH[];
    private float liczbyFloat[];
    private char literki[];



    public Sort(int liczba[],double liczbyDouble[],float liczbyFloat[],char literki[]){
        this.liczba=liczba;
        this.liczbyDoubleH =liczbyDouble;
        this.liczbyFloat=liczbyFloat;
        this.literki=literki;
sortInt(liczba);
sortDouble(liczbyDouble);
sortChar(literki);
sortFloat(liczbyFloat);

    }

    public static void sortInt(int[]numbers){
        long totalWynik=0;
        System.out.println();
        System.out.println("      TABLICE int     ");
        System.out.println();
        System.out.println();
        BubbleSort b1 = new BubbleSort(numbers);
        totalWynik=totalWynik+ b1.wynik;
        System.out.println();
        SelectionSort ss1=new SelectionSort(numbers);
        totalWynik=totalWynik+ ss1.wynik;
        System.out.println();
        InsertionSort is1=new InsertionSort(numbers);
        totalWynik=totalWynik+ is1.wynik;
        System.out.println();
        MergeSort ms1=new MergeSort(numbers);
        totalWynik=totalWynik+ ms1.wynik;
        System.out.println();
        QuickSort qs1=new QuickSort(numbers);
        totalWynik=totalWynik+ qs1.wynik;
        System.out.println();
        HeapSort h1=new HeapSort(numbers);
        totalWynik=totalWynik+ h1.wynik;
        System.out.println();
        BucketSort bs1=new BucketSort(numbers);
        totalWynik=totalWynik+ bs1.wynik;
        System.out.println();
        RadixSort rs1 = new RadixSort(numbers);
        totalWynik=totalWynik+ rs1.wynik;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Posortowanie tablicy int wszystkimi metodami wynosi  "+ totalWynik +"  milisekund");

    }
    public static void sortDouble(double[]numbers){
        long totalWynik=0;
        System.out.println();
        System.out.println("       TABLICE  double      ");
        System.out.println();
        System.out.println();
        BubbleSort b2=new BubbleSort(numbers);
        totalWynik=totalWynik+ b2.wynik;
        System.out.println();
        SelectionSort ss2=new SelectionSort(numbers);
        totalWynik=totalWynik+ ss2.wynik;
        System.out.println();
        InsertionSort is2=new InsertionSort(numbers);
        totalWynik=totalWynik+ is2.wynik;
        System.out.println();
        MergeSort ms2=new MergeSort(numbers);
        totalWynik=totalWynik+ ms2.wynik;
        System.out.println();
        QuickSort qs2=new QuickSort(numbers);
        totalWynik=totalWynik+ qs2.wynik;
        System.out.println();
        HeapSort h2=new HeapSort(numbers);
        totalWynik=totalWynik+ h2.wynik;
        System.out.println();
        BucketSort bs2=new BucketSort(numbers);
        totalWynik=totalWynik+ bs2.wynik;
        System.out.println();
        RadixSort rs2=new RadixSort(numbers);
        totalWynik=totalWynik+ rs2.wynik;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Posortowanie tablicy double wszystkimi metodami wynosi  "+ totalWynik +"  milisekund");
    }
    public static void sortChar(char[]numbers){
        long totalWynik=0;
        System.out.println();
        System.out.println("       TABLICE  char");
        System.out.println();
        System.out.println();
        BubbleSort b3=new BubbleSort(numbers);
        totalWynik=totalWynik+ b3.wynik;
        System.out.println();
        SelectionSort ss3=new SelectionSort(numbers);
        totalWynik=totalWynik+ ss3.wynik;
        System.out.println();
        InsertionSort is3=new InsertionSort(numbers);
        totalWynik=totalWynik+ is3.wynik;
        System.out.println();
        MergeSort ms3=new MergeSort(numbers);
        totalWynik=totalWynik+ ms3.wynik;
        System.out.println();
        QuickSort qs3=new QuickSort(numbers);
        totalWynik=totalWynik+ qs3.wynik;
        System.out.println();
        HeapSort h3=new HeapSort(numbers);
        totalWynik=totalWynik+ h3.wynik;
        System.out.println();
        BucketSort bs3=new BucketSort(numbers);
        totalWynik=totalWynik+ bs3.wynik;
        System.out.println();
        RadixSort rs3=new RadixSort(numbers);
        totalWynik=totalWynik+ rs3.wynik;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Posortowanie tablicy char wszystkimi metodami wynosi  "+ totalWynik +"  milisekund");
    }
    public static void sortFloat(float[]numbers){
        long totalWynik=0;
        System.out.println();
        System.out.println("       TABLICE float     ");
        System.out.println();
        System.out.println();
        BubbleSort b4=new BubbleSort(numbers);
        totalWynik=totalWynik+ b4.wynik;
        System.out.println();
        SelectionSort ss4 =new SelectionSort(numbers);
        totalWynik=totalWynik+ ss4.wynik;
        System.out.println();
        InsertionSort is4=new InsertionSort(numbers);
        totalWynik=totalWynik+ is4.wynik;
        System.out.println();
        MergeSort ms4=new MergeSort(numbers);
        totalWynik=totalWynik+ ms4.wynik;
        System.out.println();
        QuickSort qs4=new QuickSort(numbers);
        totalWynik=totalWynik+ qs4.wynik;
        System.out.println();
        HeapSort h4=new HeapSort(numbers);
        totalWynik=totalWynik+ h4.wynik;
        System.out.println();
        BucketSort bs4=new BucketSort(numbers);
        totalWynik=totalWynik+ bs4.wynik;
        System.out.println();
        RadixSort rs4=new RadixSort(numbers);
        totalWynik=totalWynik+ rs4.wynik;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Posortowanie tablicy float wszystkimi metodami wynosi  "+ totalWynik +"  milisekund");

    }



}