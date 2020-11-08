# 学习笔记

[递归模板](#递归模板)

#### 递归模板

```java
public void recursion(int level, int param) {
	// terminator
	if(level > MAX_LEVEL) {
		// process result
		return;
	}
	
	// process current logic
	process(level, param);
	
	// drill down
	recursion(level: level + 1, newParam);
	
	// restore current status
}
```

#### 分治模板
```java
public int divideConquer(Problem problem) {
    if (proble == null) {
        int res = processLastResult();
        return;
    }
    subProblem = splitProblem(problem);
    
    res0 = divideConquer(subProblem[0]);
    res1 = divideConquer(subProblem[1]);
    ......
    
    res = processResult(res0, res1);
    return res;
}
```

#### 周总结

本周都是递归相关的问题，不断调用自己的过程中，使用递归模板 + 特别要注意， drill down 以及 容易忽视的 restore的过程。

在国际站中，大神总结了所有的关于 组合相关的题目及解法，很类似，值得学习

https://leetcode.com/problems/permutations/discuss/18239/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partioning)


