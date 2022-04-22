def run():
    line = input().split()

    a = int(line[0])
    b = int(line[1])
    c = int(line[2])
    n = int(line[3])

    print('YES') if a > 0 and b > 0 and c > 0 and a + b + c >= n >= 3 else print('NO')


if __name__ == '__main__':
    run()
