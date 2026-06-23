def prefix(lst):
    length = len(lst)
    lst.insert(0, 0)
    for x in range(length):
        lst[x + 1] = lst[x] + lst[x + 1]
    return lst


n = int(input())
numbers = list(map(int, input().split()))
q = int(input())
pre = prefix(numbers)
for i in range(q):
    a, b = map(int, input().split())
    print(pre[b+1] - pre[a])