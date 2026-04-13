class SelectionSort {
    public static void main(String[] args) {

        int nums[] = {3, 2, 4, 7, 6, 5};
        int size = nums.length;
        int temp;
        int min;

        System.out.println("Before Sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < size - 1; i++) {
            min = i;

            for (int j = i + 1; j < size; j++) {
                if (nums[min] > nums[j]) {
                    min = j;
                }
            }

            //  swap only once per pass
            temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }

        System.out.println("After Sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
