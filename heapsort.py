def heap(arr, n, i):
    larg = i
    l = 2 * i + 1 
    r = 2 * i + 2

    if l< n and arr[i] < arr[l]:
        larg = l
 
    if r < n and arr[larg] < arr[r]:
        larg = r
 
    if larg != i:
        arr[i], arr[larg] = arr[larg], arr[i]
        heap(arr, n, larg)
 
def heap_sort(arr):
    n = len(arr)

    for i in range(n // 2 - 1, -1, -1):
        heap(arr, n, i)
 
    for i in range(n-1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]
        heap(arr, i, 0)

arr=list(map(int,input().split()))
heap_sort(arr)
print("sorted arr:",*arr)
