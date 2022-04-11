def run():
    n = int(input())

    days = 0
    printers = 1
    while True:
        if printers >= n:
            days += 1
            break
        else:
            days += 1
            printers *= 2

    print(days)


if __name__ == '__main__':
    run()
