def radix_sort(arr):
    max_num = max(arr)
    digit = 1
    while max_num // digit > 0:
        buckets = [[] for _ in range(10)]
        for num in arr:
            bucket_index = (num // digit) % 10
            buckets[bucket_index].append(num)
        arr = [num for bucket in buckets for num in bucket]
        digit *= 10
    return arr
arr = list(map(int,input().split()))
print("sorted:",*radix_sort(arr))
