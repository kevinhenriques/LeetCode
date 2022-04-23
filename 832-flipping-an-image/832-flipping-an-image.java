class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       int[][] reverse = new int[image.length][image[0].length];

        for (int i = 0; i < image.length; i++) {
            for (int j = image[0].length - 1; j >= 0; j--) {
                reverse[i][reverse[i].length - 1 - j] = (image[i][j] == 0) ? 1 : 0;
            }
        }

        return reverse;
    }
}