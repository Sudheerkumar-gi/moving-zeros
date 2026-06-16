class Moving {
    public static void movingNums(){
        int[] nums={2,1,0,2,0,1,0};
        int left=0,mid=0,right=nums.length-1;
        // using while loop for iteration 
        while (mid<=right) {
            switch (nums[mid]) {
                case 0:
                    swap(nums,mid,left);
                    mid++;
                    left++;                    
                    break;
                case 2:
                    swap(nums,mid,right);
                    right--;                    
                    break;
            
                default:
                    mid++;
                    break;
            }
        }
        for (int n : nums)
        System.out.print(n+" ");
        
}
        public static void swap(int[] a, int m, int r)
        {
            int t =a[m];
            a[m]=a[r];
            a[r]=t;
        }    

    public static void main(String[] args)
    {
        // calling movingNums method for moving Numbers 
        movingNums();
    }
}