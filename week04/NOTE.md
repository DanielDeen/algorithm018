# 学习笔记

#### DFS代码模板

```java
// 递归写法
public List<List<Integer>> levelOrder(TreeNode Root) {
  List<List<Integer>> res = new ArrayList<>();
  if (root == null) return res;
  travel(root, 0, res);
  return res;
}

public void travel(TreeNode root, int level, List<List<Interger>> res) {
  if (res.size() == level) {
      res.add(new ArrayList<>());
      return;
  }
  
  res.get(level).add(root.val);
  if(root.left != null) {
    travel(root.left, level+1, res);
  }
  if (root.right != null) {
    travel(root.right, level+1, res);
  }
}

// 非递归写法


```

#### BFS代码模板

```java
public List<List<Integer>> levelOrder(TreeNode root) {
  List<List<Integet>> res = new ArrayList<>();
  if(root == null) return res;
  Queue<TreeNode> nodes = new LinkedList<>();
  nodes.add(root);
  while(!nodes.isEmpty()) {
    int size = nodes.size();
    List<Integer> result = new ArrayList<>();
    
    for (int i = 0; i < size; i++) {
      TreeNode node  = nodes.poll();
      result.add(node.val);
      if (node.left != null) {
        nodes.add(node.left);
      }
      if (node.right != null) {
        nodes.add(node.right);
      }
    }
    res.add(result);
  }
  
  return res;
}
```

#### 二分法查找半有序数组中间无序的地方

思路与方法：

```java
public class Solution {
  
}
```

本周总结

五毒给我的感觉还是代码能力提升了不少，算法能力还需要加强，希望自己每天的题量还得提升。

