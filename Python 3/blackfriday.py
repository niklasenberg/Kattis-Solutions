def run():
    n = int(input())   # unused
    numbers = [int(x) for x in input().split()]

    count = dict.fromkeys(numbers, 0)
    for num in numbers:
        count[num] += 1

    max = 0
    for num in numbers:
        if count[num] == 1 and num > max:
            max = num

    if max != 0:
        print(numbers.index(max)+1)
    else:
        print('none')


if __name__ == '__main__':
    run()
