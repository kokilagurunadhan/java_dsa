class Solution {
    public void isPalindrome() {

        for (int n = 0; n <= 300; n++) {

            int i = n;
            int r = 0;
            int original = i;

            while (i > 0) {
                int d = i % 10;
                r = r * 10 + d;
                i /= 10;
            }

            if (r == original) {
                System.out.println(original);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.isPalindrome();
    }
}