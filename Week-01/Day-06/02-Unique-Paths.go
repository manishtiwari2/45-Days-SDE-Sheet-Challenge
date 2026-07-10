// Have to revisit, good qs
func uniquePaths(m int, n int) int{

    N := m + n - 2
    r := min(m-1, n-1)
    ans := 1.0

    for i := 1; i<=r; i++{
        ans = ans * float64(N-r+i)/float64(i)
    }
    return int(ans)
}

func min(a, b int) int {
    if a < b {
        return a
    }
    return b
}


// Have to watch video for this, good qs