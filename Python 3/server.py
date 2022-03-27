def run():
    line = input().split()
    t = int(line[1])

    numbers = input().split()

    count = 0
    for number in numbers:
        if t - int(number) >= 0:
            count += 1

        t -= int(number)

    print(count)


if __name__ == '__main__':
    run()
