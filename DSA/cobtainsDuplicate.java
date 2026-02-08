public class cobtainsDuplicate {
    /* 
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        // int [] nums = {1,2,3,5};
        // int[] nums = { 1, 2, 3, 1 };
        int n = nums.length;
        boolean res = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] != nums[j]) {
                    res = false;
                } else {
                    res = true;
                    break;
                }
            }

            break;

        }
        System.out.println(res);
    }
         */
        public static void main(String[] args) {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        int n = nums.length;
        boolean res = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    res = true;
                    break;
                }
            }
            if (res) break;
        }

        System.out.println(res);
    }

}
