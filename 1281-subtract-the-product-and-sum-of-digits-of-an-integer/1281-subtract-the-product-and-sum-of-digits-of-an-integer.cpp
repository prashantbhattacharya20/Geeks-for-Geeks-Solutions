class Solution {
public:
    int subtractProductAndSum(int n) {
        int temp, rem, sum = 0, product = 1, diff = 0;
        temp = n;

        while(temp != 0){
            rem = temp % 10;
            sum = sum + rem;
            product = product * rem;
            temp = temp / 10;
        }

        diff = product - sum;
       return diff;
    }
};