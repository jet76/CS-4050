def recurse(num, sum, out):
    if sum > n:
        return
    else:
        sum += num
    if sum == n:
        print(out + str(num))
        return
    else:
        out += str(num) + " + "
    for i in range(num, n + 1):
        recurse(i, sum, out)

n = int(input("Enter a positive integer: "))
for i in range(1, n + 1):
    recurse(i, 0, "")