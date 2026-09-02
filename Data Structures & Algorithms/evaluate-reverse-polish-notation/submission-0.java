class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> st = new Stack<>();
        for(int i =0;i<tokens.length;i++) {
            String c  = tokens[i];

            switch(c) {

                case  "+" : {int b = st.pop();
                            int a =st.pop();
                            st.push(a+b);
                            break;}

                case "-" :  {int b = st.pop();
                            int a = st.pop();
                            st.push(a-b);
                            break;}
                case "*" : { int b = st.pop();
                            int a = st.pop();
                            st.push(a*b);
                            break;}
                case "/" :  {int b = st.pop();
                            int a = st.pop();
                            st.push(a/b);
                            break;}
                default : st.push(Integer.parseInt(c));

                

            }


        }

        return st.pop();
    }
}
