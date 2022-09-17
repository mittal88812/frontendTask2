// let n = parseInt(prompt("Enter the number of terms: "))
let n = 10;

let n1 = 0, n2 = 1, nextTerm;
while(n1 <= n){
    console.log(n1);
    nextTerm = n1 + n2;
    n1 = n2;
    n2 = nextTerm;
}
