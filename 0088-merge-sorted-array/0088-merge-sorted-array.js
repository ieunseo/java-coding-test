var merge = function(nums1, m, nums2, n) {
    let i = m - 1;  // nums1에서 유효한 마지막 인덱스
    let j = n - 1;  // nums2에서 유효한 마지막 인덱스
    let k = m + n - 1;  // nums1에서 결합 후 삽입할 위치

    // nums1과 nums2를 비교하여 큰 값을 nums1의 끝에 넣음
    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k] = nums1[i];
            i--;
        } else {
            nums1[k] = nums2[j];
            j--;
        }
        k--;
    }

    // nums2에 남은 값이 있으면 nums1에 복사
    while (j >= 0) {
        nums1[k] = nums2[j];
        j--;
        k--;
    }

};
