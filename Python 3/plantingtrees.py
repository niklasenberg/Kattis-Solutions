def run():
    n = int(input()) # Useless?
    line = input().split()
    trees = []
    for number in line:
        trees.append(int(number))

    trees.sort(reverse=True)

    day = 1
    earliest = trees[0] + 1
    for tree in trees:
        if earliest < tree + day:
            earliest = tree + day
        day += 1

    print(earliest+1)


if __name__ == '__main__':
    run()
