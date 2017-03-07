// https://www.hackerrank.com/challenges/30-queues-stacks
public class Solution {
    // Write your code here.
    Stack<Character> myStack =  new Stack<>();
    Queue<Character> myQue = new LinkedList<>();
    void pushCharacter(char ch){
        myStack.push(ch);
    }
    void enqueueCharacter(char ch){
        myQue.add(ch);
    }
    char popCharacter(){
      char answer =  myStack.pop();
        return answer;
    }
    char dequeueCharacter(){
        char answer =myQue.poll();
        return answer;
    }
