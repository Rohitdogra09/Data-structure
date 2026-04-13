public class insertionSort {
    public static void main(String[] args) {

        int nums[]={3,2,5,4,7};
        int size=nums.length;
        System.out.println("before sorting");
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println();


        for(int i=1;i<size;i++){
            int key=nums[i];
            int j=i-1;

            while (j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;

        }
        System.out.println("After sorting");

        for(int num:nums)
        System.out.print(num+" ");
    }
}
