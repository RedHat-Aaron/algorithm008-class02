private List<String> getNext(String cur,Set<String> dict){
        List<String> res=new ArrayList<>();
        char[]chars=cur.toCharArray();
        //考虑每一位
        for(int i=0;i<chars.length;i++){
        char old=chars[i];
        //考虑变成其他所有的字母
        for(char c='a';c<='z';c++){
        if(c==old){
        continue;
        }
        chars[i]=c;
        String next=new String(chars);
        //判断 wordList 是否包含修改后的单词
        if(dict.contains(next)){
        res.add(next);
        }
        }
        chars[i]=old;
        }
        return res;
        }
