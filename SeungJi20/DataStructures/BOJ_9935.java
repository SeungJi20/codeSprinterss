package SeungJi20.DataStructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9935 {
    public static void main(String[] args) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String bomb = br.readLine();
        int bombSize = bomb.length();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            stack.push(str.charAt(i));
            if(stack.size()>= bombSize){
                boolean flag = true;

                for(int j=0; j<bombSize; j++){
                    if(stack.get(stack.size()-bombSize+j)!= bomb.charAt(j)){
                        flag = false;
                        break;
                    }}
                    
                    if(flag){
                        for(int j=0; j<bombSize; j++){
                            stack.pop();
                        }
                    }
                }
            }
                    if(stack.isEmpty()){
                        System.out.println("FRULA");
                    }
                    else{
                        StringBuilder sb = new StringBuilder();
                        for(Character c : stack) sb.append(c);
                        System.out.println(sb);                    
                    }
                    }
                }
    
