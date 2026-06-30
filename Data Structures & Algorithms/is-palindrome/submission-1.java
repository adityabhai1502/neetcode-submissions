class Solution {
    public boolean isPalindrome(String s) {
 
    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    char[] arr = s.toCharArray();
    int left = 0, right = arr.length - 1;

    while (left < right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }

    String reversed = new String(arr);
    if(s.equals(reversed)){
        return true;
    }
    else return false;

    }

}
