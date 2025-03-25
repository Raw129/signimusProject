public class Atask1 {

        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50}; // Example array


            int sum = 0;
            for (int num : arr) {
                sum += num;
            }

            // Calculate average
            double average = (double) sum / arr.length;


            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        }
    }


