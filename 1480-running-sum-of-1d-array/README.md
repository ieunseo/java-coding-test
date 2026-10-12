<h2><a href="https://leetcode.com/problems/running-sum-of-1d-array">1480. Running Sum of 1d Array</a></h2><h3>Easy</h3><hr><p>Given an array <code>nums</code>. We define a running sum of an array as&nbsp;<code>runningSum[i] = sum(nums[0]&hellip;nums[i])</code>.</p>

<p>Return the running sum of <code>nums</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3,4]
<strong>Output:</strong> [1,3,6,10]
<strong>Explanation:</strong> Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,1,1,1,1]
<strong>Output:</strong> [1,2,3,4,5]
<strong>Explanation:</strong> Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,1,2,10,1]
<strong>Output:</strong> [3,4,6,16,17]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 1000</code></li>
	<li><code>-10^6&nbsp;&lt;= nums[i] &lt;=&nbsp;10^6</code></li>
</ul>



<hr>
한국어 번역
<hr>

## 문제 요약

배열 `nums`가 주어집니다.
배열의 누적합(running sum)은 `runningSum[i] = nums[0] + nums[1] + ... + nums[i]`로 정의합니다.
`nums`의 누적합 배열을 반환해야 합니다.

---

### 예시 1

```
입력: nums = [1,2,3,4]
출력: [1,3,6,10]
설명: [1, 1+2, 1+2+3, 1+2+3+4]
```

---

### 예시 2

```
입력: nums = [1,1,1,1,1]
출력: [1,2,3,4,5]
설명: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1]
```

---

### 예시 3

```
입력: nums = [3,1,2,10,1]
출력: [3,4,6,16,17]
```

---

### 제약 조건

* `1 <= nums.length <= 1000`
* `-10^6 <= nums[i] <= 10^6`
