def run():
    n = int(input())
    count = 0
    print(establishPlank(n, count))


def establishPlank(n, count):
    if n == 0:
        return count + 1
    if n >= 1:
        count = establishPlank(n-1, count)
    if n >= 2:
        count = establishPlank(n-2, count)
    if n >= 3:
        count = establishPlank(n-3, count)

    return count


if __name__ == '__main__':
    run()
