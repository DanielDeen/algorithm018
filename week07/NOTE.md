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


#### 剪枝

> 降低复杂度


