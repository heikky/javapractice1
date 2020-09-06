public class Loader {
    public static void main(String[]args){
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int i=0; i< arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        int i=0;
        sum=0;
        while (i<arr.length){
            sum += arr[i];
            i++;
        }
        System.out.println(sum);
        sum=0;
        i =0;
        do {
            sum += arr[i];
            i++;
        } while (i<arr.length);
        System.out.println(sum);
        System.out.println("\n");

        double a=0;
        double b=0;
        for(i=0; i<10; i++){
            a=1/(b+1);
            b++;
            System.out.println(a);
        }
        System.out.println("\n");

        int[]arr1= new int[10];
        for (i=0; i<arr1.length; i++){
            arr1[i] = (int) (Math.random() * 100);
        }
        for (i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
        System.out.println();
        int t=0;
        for (i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - i - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    t = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = t;
                }
            }
        }
        for (i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}

