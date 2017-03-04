// https://www.hackerrank.com/challenges/30-scope
	
Difference(int[] array){
    this.elements = array;
}

int computeDifference(){
    Arrays.sort(elements);
    maximumDifference = Math.abs( elements[0] - elements[elements.length-1]);
    return maximumDifference;
}
