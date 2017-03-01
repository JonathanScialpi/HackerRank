// https://www.hackerrank.com/challenges/java-hashset
//Write your code here
HashSet<String> hs = new HashSet<>();
for(int x=0;x<pair_left.length;x++){
    hs.add(pair_left[x]+" "+pair_right[x]);
     System.out.println(hs.size());
}
