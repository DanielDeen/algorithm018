# 学习笔记

#### Trie树的代码模板
```java
class Trie {
    private boolean isEnd;
    private Trie[] node;
    
    public Trie() {
        isEnd = false;
        node = new Trie[26];
    }

    public void insert(String word) {
        if (word == null || word.length() == 0) return;
        Trie currNode = node;
        char[] words = word.toCharArray();
        for(int i = 0; i < words.length; i++) {
          
        }
}
}
```

#### 单词搜索II的时间复杂度分析




#### 剪枝

> 降低复杂度
>


本周回顾

题目似乎没有使用对应的高级方法…… 需要加强训练


