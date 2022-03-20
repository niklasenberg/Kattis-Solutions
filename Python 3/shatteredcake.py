def run():
    width = int(input())
    number = int(input())

    area = 0

    for i in range(number):
        line = input()
        area += int(line[0]) * int(line[2])

    print(int(area / width))


if __name__ == '__main__':
    run()
