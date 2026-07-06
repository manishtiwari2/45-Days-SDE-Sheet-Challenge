class Solution {

    /**
     * @param String $s
     * @return Integer
     */
    function lengthOfLongestSubstring($s) {
        $map = [];

        $left = 0;
        $maxLen = 0;

        for($right = 0; $right<strlen($s); $right++){
            $char = $s[$right];

            if(isset($map[$char]) && $map[$char] >= $left){
                $left = $map[$char]+1;
            }
            $map[$char] = $right;
            $maxLen = max($maxLen, $right - $left + 1);
        }
        return $maxLen;
    }
}