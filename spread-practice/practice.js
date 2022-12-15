function sumNums(...numbers) {
    let sum = 0;
    for (let i=0; i<numbers.length; i++) {
        sum+=numbers[i];
    }
    return sum;
}

console.log(sumNums(1,2,3,4,5,1))

function addOnlyNums(...args) {
    let sum = 0;
    for (let i=0; i<args.length; i++) {
        if (typeof(args[i])=="number") {sum+=args[i];}
    }
    return sum;
}

console.log(addOnlyNums(1,2,3,"hi", 4, false))

function countTheArgs(...args) {
    return args.length;
}

console.log(countTheArgs('hi',3,4,5,6))

function combineTwoArrays(first, second) {
    return [...first, ...second];
}

console.log(combineTwoArrays([1,2,3], [4,5,'hi']))

function sumEveryOther(...nums) {
    let sum = 0;
    for (let i=0; i<nums.length; i++) {
        if (i%2==0) {sum+=nums[i];}
    }
    return sum;
}

console.log(sumEveryOther(1,2,3,4,5,6,1))

function onlyUniques(...args) {
    let set = new Set();
    for (let i=0; i<args.length; i++) {
        set.add(args[i]);
    }
    return [...set];
}

console.log(onlyUniques(1,1,2,2,4,5))