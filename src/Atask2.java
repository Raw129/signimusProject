public class Atask2 {

        public static void main(String[] args) {
            int[] arr = {10, 20, 5, 40, 15};


            int max = arr[0];
            int min = arr[0];


            for (int num : arr) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }


            System.out.println("Maximum Value: " + max);
            System.out.println("Minimum Value: " + min);
        }
    }


