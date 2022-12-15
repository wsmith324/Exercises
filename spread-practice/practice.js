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
    return [...new Set(args)];
}

console.log(onlyUniques(1,1,2,2,4,5, "hey", "hey"))

function combineAllArrays(...array) {
    let combined = [];
    for (let i=0; i<array.length; i++) {
        combined.push(...array[i]);
    }
    return combined;
}

console.log(combineAllArrays([1,2],[3,4],[5],[6]))

function sumAndSquare(...nums) {
    let sum = 0;
    for (let i=0; i<nums.length; i++) {
        sum+=(nums[i]**2);
    }
    return sum;
}

console.log(sumAndSquare(4,2))