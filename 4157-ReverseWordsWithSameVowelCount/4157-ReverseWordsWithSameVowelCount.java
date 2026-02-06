// Last updated: 2/6/2026, 2:22:24 PM
class Solution {
    private int vowelCount(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    private void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public String reverseWords(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();

     ;   int i = 0;
        StringBuilder word = new StringBuilder();
        while (i < n && arr[i] != ' ') {
            word.append(arr[i++]);
        }

        int firstVowels = vowelCount(word.toString());
        i++; 

        int start = i;
        word.setLength(0);

        while (i < n) {
            if (arr[i] != ' ') {
                word.append(arr[i++]);
            } else {
                if (vowelCount(word.toString()) == firstVowels) {
                    reverse(arr, start, i - 1);
                }
                word.setLength(0);
                i++;
                start = i;
            }
        }

        if (vowelCount(word.toString()) == firstVowels) {
            reverse(arr, start, i - 1);
        }

        return new String(arr);
    }
}