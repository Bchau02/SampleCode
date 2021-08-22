package firstcode;

    class Main {
        public static void main(String[] args) {
        int[] boo = {0, 1, 2, 3, 4};

        int[] nightclub = new int[100];
        for(int i = 0; i < 100; i++){
            nightclub[i] = i;
        }
        System.out.println("The number of even numbers in boo is:");
        System.out.println(countEvenNum(boo, 5));

        System.out.println("The number of even numbers in nightclub is:");
        System.out.println(countEvenNum(nightclub, 100));

    }

    private static int countEvenNum(int[] arr, int size){
        int count = 0;

        for(int i = 0; i < size; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
            else{

            }
        }

        return count;
    }
}

