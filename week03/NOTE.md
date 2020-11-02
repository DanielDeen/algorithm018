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

