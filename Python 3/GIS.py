#  Greedily Increasing Subsequence

def run():
    n = int(input())

    maxnum = 0
    result = []
    for i in input().split():
        num = int(i)
        if num > maxnum:
            result.append(f'{i} ')
            maxnum = num
        else:
            n -= 1

    print(n)
    print(''.join(result))  # Crucial for O(N) total


if __name__ == '__main__':
    run()
