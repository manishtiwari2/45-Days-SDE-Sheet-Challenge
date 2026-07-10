func reversePairs(nums []int) int {
	return mergeSort(nums, 0, len(nums)-1)
}

func mergeSort(nums []int, low, high int) int {

	if low >= high {
		return 0
	}

	mid := low + (high-low)/2

	count := 0

	count += mergeSort(nums, low, mid)
	count += mergeSort(nums, mid+1, high)

	count += countPairs(nums, low, mid, high)

	merge(nums, low, mid, high)

	return count
}

func countPairs(nums []int, low, mid, high int) int {

	right := mid + 1
	count := 0

	for i := low; i <= mid; i++ {

		for right <= high &&
			int64(nums[i]) > 2*int64(nums[right]) {

			right++
		}

		count += right - (mid + 1)
	}

	return count
}

func merge(nums []int, low, mid, high int) {

	temp := make([]int, 0, high-low+1)

	left := low
	right := mid + 1

	for left <= mid && right <= high {

		if nums[left] <= nums[right] {
			temp = append(temp, nums[left])
			left++
		} else {
			temp = append(temp, nums[right])
			right++
		}
	}

	for left <= mid {
		temp = append(temp, nums[left])
		left++
	}

	for right <= high {
		temp = append(temp, nums[right])
		right++
	}

	for i := low; i <= high; i++ {
		nums[i] = temp[i-low]
	}
}